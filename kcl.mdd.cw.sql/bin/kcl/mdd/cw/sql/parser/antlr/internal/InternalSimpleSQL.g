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
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getDbCREATE_DBParserRuleCall_0_0());
				}
				lv_db_0_0=ruleCREATE_DB
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"db",
						lv_db_0_0,
						"kcl.mdd.cw.sql.SimpleSQL.CREATE_DB");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"statements",
						lv_statements_1_0,
						"kcl.mdd.cw.sql.SimpleSQL.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
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
			newCompositeNode(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_1());
		}
		this_CREATE_TABLE_1=ruleCREATE_TABLE
		{
			$current = $this_CREATE_TABLE_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getINSERTParserRuleCall_2());
		}
		this_INSERT_2=ruleINSERT
		{
			$current = $this_INSERT_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getDELETEParserRuleCall_3());
		}
		this_DELETE_3=ruleDELETE
		{
			$current = $this_DELETE_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getUPDATEParserRuleCall_4());
		}
		this_UPDATE_4=ruleUPDATE
		{
			$current = $this_UPDATE_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGROUPBY
entryRuleGROUPBY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGROUPBYRule()); }
	iv_ruleGROUPBY=ruleGROUPBY
	{ $current=$iv_ruleGROUPBY.current; }
	EOF;

// Rule GROUPBY
ruleGROUPBY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='select'
		{
			newLeafNode(otherlv_0, grammarAccess.getGROUPBYAccess().getSelectKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getGROUPBYAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGROUPBYRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getGROUPBYAccess().getColsCOLUMN_DEFCrossReference_2_0());
				}
			)
		)+
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getGROUPBYAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4='from'
		{
			newLeafNode(otherlv_4, grammarAccess.getGROUPBYAccess().getFromKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGROUPBYRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getGROUPBYAccess().getTableCREATE_TABLECrossReference_5_0());
				}
			)
		)
		(
			otherlv_6='where'
			{
				newLeafNode(otherlv_6, grammarAccess.getGROUPBYAccess().getWhereKeyword_6_0());
			}
			otherlv_7='order'
			{
				newLeafNode(otherlv_7, grammarAccess.getGROUPBYAccess().getOrderKeyword_6_1());
			}
			otherlv_8='by'
			{
				newLeafNode(otherlv_8, grammarAccess.getGROUPBYAccess().getByKeyword_6_2());
			}
			otherlv_9='('
			{
				newLeafNode(otherlv_9, grammarAccess.getGROUPBYAccess().getLeftParenthesisKeyword_6_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGROUPBYRule());
						}
					}
					otherlv_10=RULE_ID
					{
						newLeafNode(otherlv_10, grammarAccess.getGROUPBYAccess().getColsCOLUMN_DEFCrossReference_6_4_0());
					}
				)
			)+
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getGROUPBYAccess().getRightParenthesisKeyword_6_5());
			}
		)
	)
;

// Entry rule entryRuleORDERBY
entryRuleORDERBY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getORDERBYRule()); }
	iv_ruleORDERBY=ruleORDERBY
	{ $current=$iv_ruleORDERBY.current; }
	EOF;

// Rule ORDERBY
ruleORDERBY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='order'
		{
			newLeafNode(otherlv_0, grammarAccess.getORDERBYAccess().getOrderKeyword_0());
		}
		otherlv_1='by'
		{
			newLeafNode(otherlv_1, grammarAccess.getORDERBYAccess().getByKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getORDERBYRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getORDERBYAccess().getColCOLUMN_DEFCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getORDERBYAccess().getTypeORDEREnumRuleCall_3_0());
				}
				lv_type_3_0=ruleORDER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getORDERBYRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"kcl.mdd.cw.sql.SimpleSQL.ORDER");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWHERE
entryRuleWHERE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWHERERule()); }
	iv_ruleWHERE=ruleWHERE
	{ $current=$iv_ruleWHERE.current; }
	EOF;

// Rule WHERE
ruleWHERE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='where'
		{
			newLeafNode(otherlv_0, grammarAccess.getWHEREAccess().getWhereKeyword_0());
		}
		(
			(
				lv_column_1_0=RULE_ID
				{
					newLeafNode(lv_column_1_0, grammarAccess.getWHEREAccess().getColumnIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWHERERule());
					}
					setWithLastConsumed(
						$current,
						"column",
						lv_column_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getWHEREAccess().getIsKeyword_2());
		}
		(
			(
				lv_expected_3_0=RULE_STRING
				{
					newLeafNode(lv_expected_3_0, grammarAccess.getWHEREAccess().getExpectedSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWHERERule());
					}
					setWithLastConsumed(
						$current,
						"expected",
						lv_expected_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleINNERJOIN
entryRuleINNERJOIN returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getINNERJOINRule()); }
	iv_ruleINNERJOIN=ruleINNERJOIN
	{ $current=$iv_ruleINNERJOIN.current; }
	EOF;

// Rule INNERJOIN
ruleINNERJOIN returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='inner'
		{
			newLeafNode(otherlv_0, grammarAccess.getINNERJOINAccess().getInnerKeyword_0());
		}
		otherlv_1='join'
		{
			newLeafNode(otherlv_1, grammarAccess.getINNERJOINAccess().getJoinKeyword_1());
		}
		otherlv_2='on'
		{
			newLeafNode(otherlv_2, grammarAccess.getINNERJOINAccess().getOnKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getINNERJOINRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getINNERJOINAccess().getColsCOLUMN_DEFCrossReference_3_0());
				}
			)
		)
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
		(
			(
				{
					newCompositeNode(grammarAccess.getSELECTAccess().getWhereWHEREParserRuleCall_4_0());
				}
				lv_where_5_0=ruleWHERE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSELECTRule());
					}
					set(
						$current,
						"where",
						lv_where_5_0,
						"kcl.mdd.cw.sql.SimpleSQL.WHERE");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSELECTAccess().getGbGROUPBYParserRuleCall_5_0());
				}
				lv_gb_6_0=ruleGROUPBY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSELECTRule());
					}
					set(
						$current,
						"gb",
						lv_gb_6_0,
						"kcl.mdd.cw.sql.SimpleSQL.GROUPBY");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSELECTAccess().getObORDERBYParserRuleCall_6_0());
				}
				lv_ob_7_0=ruleORDERBY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSELECTRule());
					}
					set(
						$current,
						"ob",
						lv_ob_7_0,
						"kcl.mdd.cw.sql.SimpleSQL.ORDERBY");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSELECTAccess().getIjINNERJOINParserRuleCall_7_0());
				}
				lv_ij_8_0=ruleINNERJOIN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSELECTRule());
					}
					set(
						$current,
						"ij",
						lv_ij_8_0,
						"kcl.mdd.cw.sql.SimpleSQL.INNERJOIN");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleUPDATE
entryRuleUPDATE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUPDATERule()); }
	iv_ruleUPDATE=ruleUPDATE
	{ $current=$iv_ruleUPDATE.current; }
	EOF;

// Rule UPDATE
ruleUPDATE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='update'
		{
			newLeafNode(otherlv_0, grammarAccess.getUPDATEAccess().getUpdateKeyword_0());
		}
		otherlv_1='entry'
		{
			newLeafNode(otherlv_1, grammarAccess.getUPDATEAccess().getEntryKeyword_1());
		}
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getUPDATEAccess().getInKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUPDATERule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getUPDATEAccess().getTableCREATE_TABLECrossReference_3_0());
				}
			)
		)
		otherlv_4='on'
		{
			newLeafNode(otherlv_4, grammarAccess.getUPDATEAccess().getOnKeyword_4());
		}
		otherlv_5='columns'
		{
			newLeafNode(otherlv_5, grammarAccess.getUPDATEAccess().getColumnsKeyword_5());
		}
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUPDATERule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getUPDATEAccess().getColsCOLUMN_DEFCrossReference_7_0());
				}
			)
		)+
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_8());
		}
		otherlv_9='with'
		{
			newLeafNode(otherlv_9, grammarAccess.getUPDATEAccess().getWithKeyword_9());
		}
		otherlv_10='data'
		{
			newLeafNode(otherlv_10, grammarAccess.getUPDATEAccess().getDataKeyword_10());
		}
		otherlv_11='('
		{
			newLeafNode(otherlv_11, grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_11());
		}
		(
			(
				lv_data_12_0=RULE_STRING
				{
					newLeafNode(lv_data_12_0, grammarAccess.getUPDATEAccess().getDataSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUPDATERule());
					}
					addWithLastConsumed(
						$current,
						"data",
						lv_data_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)+
		otherlv_13=')'
		{
			newLeafNode(otherlv_13, grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_13());
		}
	)
;

// Entry rule entryRuleDELETE
entryRuleDELETE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDELETERule()); }
	iv_ruleDELETE=ruleDELETE
	{ $current=$iv_ruleDELETE.current; }
	EOF;

// Rule DELETE
ruleDELETE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='delete'
		{
			newLeafNode(otherlv_0, grammarAccess.getDELETEAccess().getDeleteKeyword_0());
		}
		otherlv_1='from'
		{
			newLeafNode(otherlv_1, grammarAccess.getDELETEAccess().getFromKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDELETERule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getDELETEAccess().getTableCREATE_TABLECrossReference_2_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDELETEAccess().getWhereWHEREParserRuleCall_3_0());
				}
				lv_where_3_0=ruleWHERE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDELETERule());
					}
					set(
						$current,
						"where",
						lv_where_3_0,
						"kcl.mdd.cw.sql.SimpleSQL.WHERE");
					afterParserOrEnumRuleCall();
				}
			)
		)?
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
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCREATE_TABLERule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBCrossReference_5_0());
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
		otherlv_5='data'
		{
			newLeafNode(otherlv_5, grammarAccess.getINSERTAccess().getDataKeyword_5());
		}
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_6());
		}
		(
			(
				lv_data_7_0=RULE_STRING
				{
					newLeafNode(lv_data_7_0, grammarAccess.getINSERTAccess().getDataSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getINSERTRule());
					}
					addWithLastConsumed(
						$current,
						"data",
						lv_data_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)+
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getINSERTAccess().getRightParenthesisKeyword_8());
		}
	)
;

// Rule ORDER
ruleORDER returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='asc'
			{
				$current = grammarAccess.getORDERAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getORDERAccess().getAscEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='desc'
			{
				$current = grammarAccess.getORDERAccess().getDescEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getORDERAccess().getDescEnumLiteralDeclaration_1());
			}
		)
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
			enumLiteral_2='decimal'
			{
				$current = grammarAccess.getTYPEAccess().getDecimalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getDecimalEnumLiteralDeclaration_2());
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
