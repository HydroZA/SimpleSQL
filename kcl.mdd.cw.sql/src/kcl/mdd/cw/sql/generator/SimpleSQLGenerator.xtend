/*
 * generated by Xtext 2.20.0
 */
package kcl.mdd.cw.sql.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import kcl.mdd.cw.sql.simpleSQL.Model
import kcl.mdd.cw.sql.simpleSQL.Statement
import kcl.mdd.cw.sql.simpleSQL.*

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
		resource.URI.appendFileExtension('sql').lastSegment
	}
	
	def String doGenerate(Model m) '''
		«FOR s : m.statements»
			«generate(s)»
			\n
		«ENDFOR»
	'''
	
	
	dispatch def generate(INSERT ct)
	{
		return ""
	}
	
	dispatch def generate(DELETE ct)
	{
		return ""
	}
	
	dispatch def generate(UPDATE ct)
	{
		return '''
			UPDATE «ct.table»
			SET «FOR col : ct.cols SEPARATOR ','»
				«col.name»
				«ENDFOR»
			
		'''
	}
	
	
	dispatch def generate(SELECT ct)
	{
		return '''
		SELECT «ct.name == 'all' ? '*' : ct.name»
		FROM «ct.table»
		'''
	}
	
	
	dispatch def generate(CREATE_TABLE ct)
	{
		return '''
		CREATE TABLE «ct.name» (
		«FOR col : ct.columns SEPARATOR ','»
			«col.name» «col.type == 'string' ? 'VARCHAR(255)' : col.type»
		«ENDFOR»
		)
		'''
	}
	
	dispatch def generate(CREATE_DB cd)
	{
		return "CREATE DATABASE " + cd.name
	}	
}
