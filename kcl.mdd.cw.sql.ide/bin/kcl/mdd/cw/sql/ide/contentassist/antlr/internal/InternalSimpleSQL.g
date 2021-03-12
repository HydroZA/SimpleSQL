/*
 * generated by Xtext 2.20.0
 */
grammar InternalSimpleSQL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package kcl.mdd.cw.sql.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package kcl.mdd.cw.sql.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import kcl.mdd.cw.sql.services.SimpleSQLGrammarAccess;

}
@parser::members {
	private SimpleSQLGrammarAccess grammarAccess;

	public void setGrammarAccess(SimpleSQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getStatementsAssignment()); }
		(rule__Model__StatementsAssignment)*
		{ after(grammarAccess.getModelAccess().getStatementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSELECT
entryRuleSELECT
:
{ before(grammarAccess.getSELECTRule()); }
	 ruleSELECT
{ after(grammarAccess.getSELECTRule()); } 
	 EOF 
;

// Rule SELECT
ruleSELECT 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSELECTAccess().getGroup()); }
		(rule__SELECT__Group__0)
		{ after(grammarAccess.getSELECTAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCREATE_DB
entryRuleCREATE_DB
:
{ before(grammarAccess.getCREATE_DBRule()); }
	 ruleCREATE_DB
{ after(grammarAccess.getCREATE_DBRule()); } 
	 EOF 
;

// Rule CREATE_DB
ruleCREATE_DB 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCREATE_DBAccess().getGroup()); }
		(rule__CREATE_DB__Group__0)
		{ after(grammarAccess.getCREATE_DBAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCREATE_TABLE
entryRuleCREATE_TABLE
:
{ before(grammarAccess.getCREATE_TABLERule()); }
	 ruleCREATE_TABLE
{ after(grammarAccess.getCREATE_TABLERule()); } 
	 EOF 
;

// Rule CREATE_TABLE
ruleCREATE_TABLE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCREATE_TABLEAccess().getGroup()); }
		(rule__CREATE_TABLE__Group__0)
		{ after(grammarAccess.getCREATE_TABLEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCOLUMN_DEF
entryRuleCOLUMN_DEF
:
{ before(grammarAccess.getCOLUMN_DEFRule()); }
	 ruleCOLUMN_DEF
{ after(grammarAccess.getCOLUMN_DEFRule()); } 
	 EOF 
;

// Rule COLUMN_DEF
ruleCOLUMN_DEF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCOLUMN_DEFAccess().getGroup()); }
		(rule__COLUMN_DEF__Group__0)
		{ after(grammarAccess.getCOLUMN_DEFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINSERT
entryRuleINSERT
:
{ before(grammarAccess.getINSERTRule()); }
	 ruleINSERT
{ after(grammarAccess.getINSERTRule()); } 
	 EOF 
;

// Rule INSERT
ruleINSERT 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINSERTAccess().getGroup()); }
		(rule__INSERT__Group__0)
		{ after(grammarAccess.getINSERTAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInsert_List
entryRuleInsert_List
:
{ before(grammarAccess.getInsert_ListRule()); }
	 ruleInsert_List
{ after(grammarAccess.getInsert_ListRule()); } 
	 EOF 
;

// Rule Insert_List
ruleInsert_List 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInsert_ListAccess().getGroup()); }
		(rule__Insert_List__Group__0)
		{ after(grammarAccess.getInsert_ListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TYPE
ruleTYPE
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTYPEAccess().getAlternatives()); }
		(rule__TYPE__Alternatives)
		{ after(grammarAccess.getTYPEAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getSELECTParserRuleCall_0()); }
		ruleSELECT
		{ after(grammarAccess.getStatementAccess().getSELECTParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getCREATE_DBParserRuleCall_1()); }
		ruleCREATE_DB
		{ after(grammarAccess.getStatementAccess().getCREATE_DBParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_2()); }
		ruleCREATE_TABLE
		{ after(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3()); }
		ruleINSERT
		{ after(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSELECTAccess().getNameAssignment_1_0()); }
		(rule__SELECT__NameAssignment_1_0)
		{ after(grammarAccess.getSELECTAccess().getNameAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSELECTAccess().getAllKeyword_1_1()); }
		'all'
		{ after(grammarAccess.getSELECTAccess().getAllKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TYPE__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); }
		('string')
		{ after(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); }
		('int')
		{ after(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); }
		('double')
		{ after(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3()); }
		('date')
		{ after(grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SELECT__Group__0__Impl
	rule__SELECT__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSELECTAccess().getShowKeyword_0()); }
	'show'
	{ after(grammarAccess.getSELECTAccess().getShowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SELECT__Group__1__Impl
	rule__SELECT__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSELECTAccess().getAlternatives_1()); }
	(rule__SELECT__Alternatives_1)
	{ after(grammarAccess.getSELECTAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SELECT__Group__2__Impl
	rule__SELECT__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSELECTAccess().getInKeyword_2()); }
	'in'
	{ after(grammarAccess.getSELECTAccess().getInKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SELECT__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSELECTAccess().getTableAssignment_3()); }
	(rule__SELECT__TableAssignment_3)
	{ after(grammarAccess.getSELECTAccess().getTableAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CREATE_DB__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_DB__Group__0__Impl
	rule__CREATE_DB__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_DBAccess().getCreateKeyword_0()); }
	'create'
	{ after(grammarAccess.getCREATE_DBAccess().getCreateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_DB__Group__1__Impl
	rule__CREATE_DB__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_DBAccess().getNewKeyword_1()); }
	'new'
	{ after(grammarAccess.getCREATE_DBAccess().getNewKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_DB__Group__2__Impl
	rule__CREATE_DB__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2()); }
	'database'
	{ after(grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_DB__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_DBAccess().getNameAssignment_3()); }
	(rule__CREATE_DB__NameAssignment_3)
	{ after(grammarAccess.getCREATE_DBAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CREATE_TABLE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__0__Impl
	rule__CREATE_TABLE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0()); }
	'create'
	{ after(grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__1__Impl
	rule__CREATE_TABLE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1()); }
	'new'
	{ after(grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__2__Impl
	rule__CREATE_TABLE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2()); }
	'table'
	{ after(grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__3__Impl
	rule__CREATE_TABLE__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getNameAssignment_3()); }
	(rule__CREATE_TABLE__NameAssignment_3)
	{ after(grammarAccess.getCREATE_TABLEAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__4__Impl
	rule__CREATE_TABLE__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getInKeyword_4()); }
	'in'
	{ after(grammarAccess.getCREATE_TABLEAccess().getInKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__5__Impl
	rule__CREATE_TABLE__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getDbNameAssignment_5()); }
	(rule__CREATE_TABLE__DbNameAssignment_5)
	{ after(grammarAccess.getCREATE_TABLEAccess().getDbNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__6__Impl
	rule__CREATE_TABLE__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6()); }
	'with'
	{ after(grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__7__Impl
	rule__CREATE_TABLE__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7()); }
	'columns'
	{ after(grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__8__Impl
	rule__CREATE_TABLE__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8()); }
	'('
	{ after(grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__9__Impl
	rule__CREATE_TABLE__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); }
		(rule__CREATE_TABLE__ColumnsAssignment_9)
		{ after(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); }
	)
	(
		{ before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); }
		(rule__CREATE_TABLE__ColumnsAssignment_9)*
		{ after(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CREATE_TABLE__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10()); }
	')'
	{ after(grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__COLUMN_DEF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__COLUMN_DEF__Group__0__Impl
	rule__COLUMN_DEF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCOLUMN_DEFAccess().getNameAssignment_0()); }
	(rule__COLUMN_DEF__NameAssignment_0)
	{ after(grammarAccess.getCOLUMN_DEFAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__COLUMN_DEF__Group__1__Impl
	rule__COLUMN_DEF__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1()); }
	'with'
	{ after(grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__COLUMN_DEF__Group__2__Impl
	rule__COLUMN_DEF__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__COLUMN_DEF__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCOLUMN_DEFAccess().getTypeAssignment_3()); }
	(rule__COLUMN_DEF__TypeAssignment_3)
	{ after(grammarAccess.getCOLUMN_DEFAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__INSERT__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__0__Impl
	rule__INSERT__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINSERTAccess().getAddKeyword_0()); }
	'add'
	{ after(grammarAccess.getINSERTAccess().getAddKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__1__Impl
	rule__INSERT__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINSERTAccess().getEntryKeyword_1()); }
	'entry'
	{ after(grammarAccess.getINSERTAccess().getEntryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__2__Impl
	rule__INSERT__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINSERTAccess().getToKeyword_2()); }
	'to'
	{ after(grammarAccess.getINSERTAccess().getToKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__3__Impl
	rule__INSERT__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINSERTAccess().getTableAssignment_3()); }
	(rule__INSERT__TableAssignment_3)
	{ after(grammarAccess.getINSERTAccess().getTableAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__4__Impl
	rule__INSERT__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINSERTAccess().getWithKeyword_4()); }
	'with'
	{ after(grammarAccess.getINSERTAccess().getWithKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__5__Impl
	rule__INSERT__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINSERTAccess().getColumnsKeyword_5()); }
	'columns'
	{ after(grammarAccess.getINSERTAccess().getColumnsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INSERT__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getINSERTAccess().getDataAssignment_6()); }
		(rule__INSERT__DataAssignment_6)
		{ after(grammarAccess.getINSERTAccess().getDataAssignment_6()); }
	)
	(
		{ before(grammarAccess.getINSERTAccess().getDataAssignment_6()); }
		(rule__INSERT__DataAssignment_6)*
		{ after(grammarAccess.getINSERTAccess().getDataAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Insert_List__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Insert_List__Group__0__Impl
	rule__Insert_List__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Insert_List__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0()); }
	'"'
	{ after(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Insert_List__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Insert_List__Group__1__Impl
	rule__Insert_List__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Insert_List__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInsert_ListAccess().getDataAssignment_1()); }
	(rule__Insert_List__DataAssignment_1)
	{ after(grammarAccess.getInsert_ListAccess().getDataAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Insert_List__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Insert_List__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Insert_List__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_2()); }
	'"'
	{ after(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__StatementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); }
		ruleStatement
		{ after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__NameAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSELECTAccess().getNameIDTerminalRuleCall_1_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSELECTAccess().getNameIDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SELECT__TableAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSELECTAccess().getTableIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getSELECTAccess().getTableIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_DB__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCREATE_DBAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getCREATE_DBAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCREATE_TABLEAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getCREATE_TABLEAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__DbNameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCREATE_TABLEAccess().getDbNameIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getCREATE_TABLEAccess().getDbNameIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CREATE_TABLE__ColumnsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0()); }
		ruleCOLUMN_DEF
		{ after(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCOLUMN_DEFAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getCOLUMN_DEFAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__COLUMN_DEF__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCOLUMN_DEFAccess().getTypeTYPEEnumRuleCall_3_0()); }
		ruleTYPE
		{ after(grammarAccess.getCOLUMN_DEFAccess().getTypeTYPEEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__TableAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0()); }
		(
			{ before(grammarAccess.getINSERTAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getINSERTAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__INSERT__DataAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_6_0()); }
		ruleInsert_List
		{ after(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Insert_List__DataAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;