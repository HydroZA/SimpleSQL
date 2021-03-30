/*
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.generator

import kcl.mdd.cw.sql.simpleSQL.CREATE_DB
import kcl.mdd.cw.sql.simpleSQL.CREATE_TABLE
import kcl.mdd.cw.sql.simpleSQL.DELETE
import kcl.mdd.cw.sql.simpleSQL.INSERT
import kcl.mdd.cw.sql.simpleSQL.Model
import kcl.mdd.cw.sql.simpleSQL.SELECT
import kcl.mdd.cw.sql.simpleSQL.TYPE
import kcl.mdd.cw.sql.simpleSQL.UPDATE
import kcl.mdd.cw.sql.simpleSQL.ORDERBY
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SimpleSQLGenerator extends AbstractGenerator 
{

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
		val model = resource.contents.head as Model
		fsa.generateFile(deriveTargetFileNameFor(model, resource),
			model.doGenerate)
	}
		
	def deriveTargetFileNameFor(Model model, Resource resource) 
	{
		resource.URI.appendFileExtension('sh').lastSegment
	}
	
	def String doGenerate(Model m) '''
	#!/bin/bash
	sqlite3 «m.db.name».db
		«FOR s : m.statements»
			«generate(s)»
		«ENDFOR»
	'''
	
	// TODO: All values will have quotation marks, can we make it so only strings have quotation marks?
	dispatch def generate(INSERT ct)
	{
		return '''
		INSERT INTO «ct.table.name» VALUES (
		«FOR data : ct.data SEPARATOR ','»
			"«data»"
		«ENDFOR»
		);
		'''
	}
	
	
	// TODO: Update to allow only deleting single rows
	dispatch def generate(DELETE ct)
	{
		return '''
		DELETE FROM «ct.table»
		'''
	}
	
	dispatch def generate(UPDATE ct)
	{
		return '''
			UPDATE «ct.table»
			SET «FOR col : ct.cols SEPARATOR ','»
				«col.name»
				«ENDFOR»
			;
		'''
	}
	
	
	dispatch def generate(SELECT ct)
	{
		return '''
		SELECT «ct.name == 'all' ? '*' : ct.name»
		FROM «ct.table»
		«if (ct.where !== null)»
		;
		'''
	}
	
	
	dispatch def generate(CREATE_TABLE ct)
	{
		return '''
		CREATE TABLE «ct.name» (
		«FOR col : ct.columns SEPARATOR ','»
			«col.name» «convertToSQLType(col.type)»
		«ENDFOR»
		);
		'''
	}
	
	dispatch def generate(CREATE_DB cd)
	{
		return '''CREATE DATABASE «cd.name»;'''
	}	
	
	def String convertToSQLType(TYPE s)
	{
		switch s 
		{
			case TYPE.STRING : "VARCHAR(255)"
			case TYPE.INT : "INTEGER"
			case TYPE.DECIMAL : "DECIMAL"
		}
	}
}
