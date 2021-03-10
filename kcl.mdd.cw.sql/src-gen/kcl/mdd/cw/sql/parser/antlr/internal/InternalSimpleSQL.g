/*
 * generated by Xtext 2.20.0
 */
grammar InternalSimpleSQL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package kcl.mdd.cw.sql.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package kcl.mdd.cw.sql.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import kcl.mdd.cw.sql.services.SimpleSQLGrammarAccess;

}

@parser::members {

 	private SimpleSQLGrammarAccess grammarAccess;

    public InternalSimpleSQLParser(TokenStream input, SimpleSQLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SimpleSQLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"kcl.mdd.cw.sql.SimpleSQL.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getSELECTParserRuleCall_0());
		}
		this_SELECT_0=ruleSELECT
		{
			$current = $this_SELECT_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getCREATE_DBParserRuleCall_1());
		}
		this_CREATE_DB_1=ruleCREATE_DB
		{
			$current = $this_CREATE_DB_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_2());
		}
		this_CREATE_TABLE_2=ruleCREATE_TABLE
		{
			$current = $this_CREATE_TABLE_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3());
		}
		this_INSERT_3=ruleINSERT
		{
			$current = $this_INSERT_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSELECT
entryRuleSELECT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSELECTRule()); }
	iv_ruleSELECT=ruleSELECT
	{ $current=$iv_ruleSELECT.current; }
	EOF;

// Rule SELECT
ruleSELECT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='show'
		{
			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getShowKeyword_0());
		}
		(
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getSELECTAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSELECTRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			otherlv_2='all'
			{
				newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getAllKeyword_1_1());
			}
		)
		otherlv_3='in'
		{
			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getInKeyword_2());
		}
		(
			(
				lv_table_4_0=RULE_ID
				{
					newLeafNode(lv_table_4_0, grammarAccess.getSELECTAccess().getTableIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSELECTRule());
					}
					setWithLastConsumed(
						$current,
						"table",
						lv_table_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCREATE_DB
entryRuleCREATE_DB returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCREATE_DBRule()); }
	iv_ruleCREATE_DB=ruleCREATE_DB
	{ $current=$iv_ruleCREATE_DB.current; }
	EOF;

// Rule CREATE_DB
ruleCREATE_DB returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='create'
		{
			newLeafNode(otherlv_0, grammarAccess.getCREATE_DBAccess().getCreateKeyword_0());
		}
		otherlv_1='new'
		{
			newLeafNode(otherlv_1, grammarAccess.getCREATE_DBAccess().getNewKeyword_1());
		}
		otherlv_2='database'
		{
			newLeafNode(otherlv_2, grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getCREATE_DBAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCREATE_DBRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCREATE_TABLE
entryRuleCREATE_TABLE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCREATE_TABLERule()); }
	iv_ruleCREATE_TABLE=ruleCREATE_TABLE
	{ $current=$iv_ruleCREATE_TABLE.current; }
	EOF;

// Rule CREATE_TABLE
ruleCREATE_TABLE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='create'
		{
			newLeafNode(otherlv_0, grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0());
		}
		otherlv_1='new'
		{
			newLeafNode(otherlv_1, grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1());
		}
		otherlv_2='table'
		{
			newLeafNode(otherlv_2, grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getCREATE_TABLEAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCREATE_TABLERule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getCREATE_TABLEAccess().getInKeyword_4());
		}
		(
			(
				lv_dbName_5_0=RULE_ID
				{
					newLeafNode(lv_dbName_5_0, grammarAccess.getCREATE_TABLEAccess().getDbNameIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCREATE_TABLERule());
					}
					setWithLastConsumed(
						$current,
						"dbName",
						lv_dbName_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6='with'
		{
			newLeafNode(otherlv_6, grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6());
		}
		otherlv_7='columns'
		{
			newLeafNode(otherlv_7, grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7());
		}
		otherlv_8='('
		{
			newLeafNode(otherlv_8, grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0());
				}
				lv_columns_9_0=ruleCOLUMN_DEF
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCREATE_TABLERule());
					}
					add(
						$current,
						"columns",
						lv_columns_9_0,
						"kcl.mdd.cw.sql.SimpleSQL.COLUMN_DEF");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10());
		}
	)
;

// Entry rule entryRuleCOLUMN_DEF
entryRuleCOLUMN_DEF returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCOLUMN_DEFRule()); }
	iv_ruleCOLUMN_DEF=ruleCOLUMN_DEF
	{ $current=$iv_ruleCOLUMN_DEF.current; }
	EOF;

// Rule COLUMN_DEF
ruleCOLUMN_DEF returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCOLUMN_DEFAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCOLUMN_DEFRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='with'
		{
			newLeafNode(otherlv_1, grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCOLUMN_DEFAccess().getTypeTYPEEnumRuleCall_3_0());
				}
				lv_type_3_0=ruleTYPE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCOLUMN_DEFRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"kcl.mdd.cw.sql.SimpleSQL.TYPE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleINSERT
entryRuleINSERT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getINSERTRule()); }
	iv_ruleINSERT=ruleINSERT
	{ $current=$iv_ruleINSERT.current; }
	EOF;

// Rule INSERT
ruleINSERT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getINSERTAccess().getAddKeyword_0());
		}
		otherlv_1='entry'
		{
			newLeafNode(otherlv_1, grammarAccess.getINSERTAccess().getEntryKeyword_1());
		}
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getINSERTAccess().getToKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getINSERTRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0());
				}
			)
		)
		otherlv_4='with'
		{
			newLeafNode(otherlv_4, grammarAccess.getINSERTAccess().getWithKeyword_4());
		}
		otherlv_5='columns'
		{
			newLeafNode(otherlv_5, grammarAccess.getINSERTAccess().getColumnsKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_6_0());
				}
				lv_data_6_0=ruleInsert_List
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getINSERTRule());
					}
					add(
						$current,
						"data",
						lv_data_6_0,
						"kcl.mdd.cw.sql.SimpleSQL.Insert_List");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleInsert_List
entryRuleInsert_List returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsert_ListRule()); }
	iv_ruleInsert_List=ruleInsert_List
	{ $current=$iv_ruleInsert_List.current; }
	EOF;

// Rule Insert_List
ruleInsert_List returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='"'
		{
			newLeafNode(otherlv_0, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0());
		}
		(
			(
				lv_data_1_0=RULE_STRING
				{
					newLeafNode(lv_data_1_0, grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInsert_ListRule());
					}
					setWithLastConsumed(
						$current,
						"data",
						lv_data_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='"'
		{
			newLeafNode(otherlv_2, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_2());
		}
	)
;

// Rule TYPE
ruleTYPE returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='string'
			{
				$current = grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='int'
			{
				$current = grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='double'
			{
				$current = grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='date'
			{
				$current = grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
