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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'show'", "'all'", "'in'", "'Update'", "'entry'", "'to'", "'with'", "'data'", "'('", "')'", "'delete'", "'create'", "'new'", "'database'", "'table'", "'columns'", "'type'", "'add'", "'\"'", "'string'", "'int'", "'double'", "'date'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimpleSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleSQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleSQL.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalSimpleSQL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSimpleSQL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSimpleSQL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimpleSQL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalSimpleSQL.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalSimpleSQL.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=21 && LA1_0<=22)||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleSQL.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalSimpleSQL.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalSimpleSQL.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"kcl.mdd.cw.sql.SimpleSQL.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalSimpleSQL.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSimpleSQL.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSimpleSQL.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSimpleSQL.g:108:1: ruleStatement returns [EObject current=null] : (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SELECT_0 = null;

        EObject this_CREATE_DB_1 = null;

        EObject this_CREATE_TABLE_2 = null;

        EObject this_INSERT_3 = null;

        EObject this_DELETE_4 = null;

        EObject this_UPDATE_5 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:114:2: ( (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE ) )
            // InternalSimpleSQL.g:115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE )
            {
            // InternalSimpleSQL.g:115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==23) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==24) ) {
                        alt2=2;
                    }
                    else if ( (LA2_6==25) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 14:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimpleSQL.g:116:3: this_SELECT_0= ruleSELECT
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSELECTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SELECT_0=ruleSELECT();

                    state._fsp--;


                    			current = this_SELECT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:125:3: this_CREATE_DB_1= ruleCREATE_DB
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCREATE_DBParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CREATE_DB_1=ruleCREATE_DB();

                    state._fsp--;


                    			current = this_CREATE_DB_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:134:3: this_CREATE_TABLE_2= ruleCREATE_TABLE
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CREATE_TABLE_2=ruleCREATE_TABLE();

                    state._fsp--;


                    			current = this_CREATE_TABLE_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:143:3: this_INSERT_3= ruleINSERT
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_INSERT_3=ruleINSERT();

                    state._fsp--;


                    			current = this_INSERT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSimpleSQL.g:152:3: this_DELETE_4= ruleDELETE
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDELETEParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DELETE_4=ruleDELETE();

                    state._fsp--;


                    			current = this_DELETE_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSimpleSQL.g:161:3: this_UPDATE_5= ruleUPDATE
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUPDATEParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_UPDATE_5=ruleUPDATE();

                    state._fsp--;


                    			current = this_UPDATE_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSELECT"
    // InternalSimpleSQL.g:173:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalSimpleSQL.g:173:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalSimpleSQL.g:174:2: iv_ruleSELECT= ruleSELECT EOF
            {
             newCompositeNode(grammarAccess.getSELECTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSELECT=ruleSELECT();

            state._fsp--;

             current =iv_ruleSELECT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSELECT"


    // $ANTLR start "ruleSELECT"
    // InternalSimpleSQL.g:180:1: ruleSELECT returns [EObject current=null] : (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_table_4_0=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:186:2: ( (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:187:2: (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:187:2: (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) )
            // InternalSimpleSQL.g:188:3: otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getShowKeyword_0());
            		
            // InternalSimpleSQL.g:192:3: ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimpleSQL.g:193:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalSimpleSQL.g:193:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSimpleSQL.g:194:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSimpleSQL.g:194:5: (lv_name_1_0= RULE_ID )
                    // InternalSimpleSQL.g:195:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSELECTAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSELECTRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:212:4: otherlv_2= 'all'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getAllKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getInKeyword_2());
            		
            // InternalSimpleSQL.g:221:3: ( (lv_table_4_0= RULE_ID ) )
            // InternalSimpleSQL.g:222:4: (lv_table_4_0= RULE_ID )
            {
            // InternalSimpleSQL.g:222:4: (lv_table_4_0= RULE_ID )
            // InternalSimpleSQL.g:223:5: lv_table_4_0= RULE_ID
            {
            lv_table_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_table_4_0, grammarAccess.getSELECTAccess().getTableIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSELECTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleUPDATE"
    // InternalSimpleSQL.g:243:1: entryRuleUPDATE returns [EObject current=null] : iv_ruleUPDATE= ruleUPDATE EOF ;
    public final EObject entryRuleUPDATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUPDATE = null;


        try {
            // InternalSimpleSQL.g:243:47: (iv_ruleUPDATE= ruleUPDATE EOF )
            // InternalSimpleSQL.g:244:2: iv_ruleUPDATE= ruleUPDATE EOF
            {
             newCompositeNode(grammarAccess.getUPDATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUPDATE=ruleUPDATE();

            state._fsp--;

             current =iv_ruleUPDATE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUPDATE"


    // $ANTLR start "ruleUPDATE"
    // InternalSimpleSQL.g:250:1: ruleUPDATE returns [EObject current=null] : (otherlv_0= 'Update' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) ;
    public final EObject ruleUPDATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_data_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:256:2: ( (otherlv_0= 'Update' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) )
            // InternalSimpleSQL.g:257:2: (otherlv_0= 'Update' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            {
            // InternalSimpleSQL.g:257:2: (otherlv_0= 'Update' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            // InternalSimpleSQL.g:258:3: otherlv_0= 'Update' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUPDATEAccess().getUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUPDATEAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUPDATEAccess().getToKeyword_2());
            		
            // InternalSimpleSQL.g:270:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:271:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:271:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:272:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPDATERule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getUPDATEAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getUPDATEAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getUPDATEAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimpleSQL.g:295:3: ( (lv_data_7_0= ruleInsert_List ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleSQL.g:296:4: (lv_data_7_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:296:4: (lv_data_7_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:297:5: lv_data_7_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getUPDATEAccess().getDataInsert_ListParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_data_7_0=ruleInsert_List();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUPDATERule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_7_0,
            	    						"kcl.mdd.cw.sql.SimpleSQL.Insert_List");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUPDATE"


    // $ANTLR start "entryRuleDELETE"
    // InternalSimpleSQL.g:322:1: entryRuleDELETE returns [EObject current=null] : iv_ruleDELETE= ruleDELETE EOF ;
    public final EObject entryRuleDELETE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETE = null;


        try {
            // InternalSimpleSQL.g:322:47: (iv_ruleDELETE= ruleDELETE EOF )
            // InternalSimpleSQL.g:323:2: iv_ruleDELETE= ruleDELETE EOF
            {
             newCompositeNode(grammarAccess.getDELETERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDELETE=ruleDELETE();

            state._fsp--;

             current =iv_ruleDELETE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDELETE"


    // $ANTLR start "ruleDELETE"
    // InternalSimpleSQL.g:329:1: ruleDELETE returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) ;
    public final EObject ruleDELETE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_data_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:335:2: ( (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) )
            // InternalSimpleSQL.g:336:2: (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            {
            // InternalSimpleSQL.g:336:2: (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            // InternalSimpleSQL.g:337:3: otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDELETEAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDELETEAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDELETEAccess().getToKeyword_2());
            		
            // InternalSimpleSQL.g:349:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:350:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:350:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:351:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDELETERule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getDELETEAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDELETEAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDELETEAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getDELETEAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimpleSQL.g:374:3: ( (lv_data_7_0= ruleInsert_List ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT||LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleSQL.g:375:4: (lv_data_7_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:375:4: (lv_data_7_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:376:5: lv_data_7_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getDELETEAccess().getDataInsert_ListParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_data_7_0=ruleInsert_List();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDELETERule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_7_0,
            	    						"kcl.mdd.cw.sql.SimpleSQL.Insert_List");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDELETEAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDELETE"


    // $ANTLR start "entryRuleCREATE_DB"
    // InternalSimpleSQL.g:401:1: entryRuleCREATE_DB returns [EObject current=null] : iv_ruleCREATE_DB= ruleCREATE_DB EOF ;
    public final EObject entryRuleCREATE_DB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE_DB = null;


        try {
            // InternalSimpleSQL.g:401:50: (iv_ruleCREATE_DB= ruleCREATE_DB EOF )
            // InternalSimpleSQL.g:402:2: iv_ruleCREATE_DB= ruleCREATE_DB EOF
            {
             newCompositeNode(grammarAccess.getCREATE_DBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCREATE_DB=ruleCREATE_DB();

            state._fsp--;

             current =iv_ruleCREATE_DB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCREATE_DB"


    // $ANTLR start "ruleCREATE_DB"
    // InternalSimpleSQL.g:408:1: ruleCREATE_DB returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCREATE_DB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:414:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:415:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:415:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSimpleSQL.g:416:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCREATE_DBAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCREATE_DBAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2());
            		
            // InternalSimpleSQL.g:428:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:429:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:429:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:430:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCREATE_DBAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCREATE_DBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCREATE_DB"


    // $ANTLR start "entryRuleCREATE_TABLE"
    // InternalSimpleSQL.g:450:1: entryRuleCREATE_TABLE returns [EObject current=null] : iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF ;
    public final EObject entryRuleCREATE_TABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE_TABLE = null;


        try {
            // InternalSimpleSQL.g:450:53: (iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF )
            // InternalSimpleSQL.g:451:2: iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF
            {
             newCompositeNode(grammarAccess.getCREATE_TABLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCREATE_TABLE=ruleCREATE_TABLE();

            state._fsp--;

             current =iv_ruleCREATE_TABLE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCREATE_TABLE"


    // $ANTLR start "ruleCREATE_TABLE"
    // InternalSimpleSQL.g:457:1: ruleCREATE_TABLE returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) ;
    public final EObject ruleCREATE_TABLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columns_9_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:463:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) )
            // InternalSimpleSQL.g:464:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            {
            // InternalSimpleSQL.g:464:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            // InternalSimpleSQL.g:465:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2());
            		
            // InternalSimpleSQL.g:477:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:478:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:478:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:479:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCREATE_TABLEAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCREATE_TABLERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCREATE_TABLEAccess().getInKeyword_4());
            		
            // InternalSimpleSQL.g:499:3: ( (otherlv_5= RULE_ID ) )
            // InternalSimpleSQL.g:500:4: (otherlv_5= RULE_ID )
            {
            // InternalSimpleSQL.g:500:4: (otherlv_5= RULE_ID )
            // InternalSimpleSQL.g:501:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCREATE_TABLERule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSimpleSQL.g:524:3: ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleSQL.g:525:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    {
            	    // InternalSimpleSQL.g:525:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    // InternalSimpleSQL.g:526:5: lv_columns_9_0= ruleCOLUMN_DEF
            	    {

            	    					newCompositeNode(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_columns_9_0=ruleCOLUMN_DEF();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCREATE_TABLERule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_9_0,
            	    						"kcl.mdd.cw.sql.SimpleSQL.COLUMN_DEF");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCREATE_TABLE"


    // $ANTLR start "entryRuleCOLUMN_DEF"
    // InternalSimpleSQL.g:551:1: entryRuleCOLUMN_DEF returns [EObject current=null] : iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF ;
    public final EObject entryRuleCOLUMN_DEF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLUMN_DEF = null;


        try {
            // InternalSimpleSQL.g:551:51: (iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF )
            // InternalSimpleSQL.g:552:2: iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF
            {
             newCompositeNode(grammarAccess.getCOLUMN_DEFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOLUMN_DEF=ruleCOLUMN_DEF();

            state._fsp--;

             current =iv_ruleCOLUMN_DEF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLUMN_DEF"


    // $ANTLR start "ruleCOLUMN_DEF"
    // InternalSimpleSQL.g:558:1: ruleCOLUMN_DEF returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) ) ;
    public final EObject ruleCOLUMN_DEF() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:564:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) ) )
            // InternalSimpleSQL.g:565:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) )
            {
            // InternalSimpleSQL.g:565:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) )
            // InternalSimpleSQL.g:566:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) )
            {
            // InternalSimpleSQL.g:566:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleSQL.g:567:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleSQL.g:567:4: (lv_name_0_0= RULE_ID )
            // InternalSimpleSQL.g:568:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCOLUMN_DEFAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOLUMN_DEFRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2());
            		
            // InternalSimpleSQL.g:592:3: ( (lv_type_3_0= ruleTYPE ) )
            // InternalSimpleSQL.g:593:4: (lv_type_3_0= ruleTYPE )
            {
            // InternalSimpleSQL.g:593:4: (lv_type_3_0= ruleTYPE )
            // InternalSimpleSQL.g:594:5: lv_type_3_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getCOLUMN_DEFAccess().getTypeTYPEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCOLUMN_DEFRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"kcl.mdd.cw.sql.SimpleSQL.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLUMN_DEF"


    // $ANTLR start "entryRuleINSERT"
    // InternalSimpleSQL.g:615:1: entryRuleINSERT returns [EObject current=null] : iv_ruleINSERT= ruleINSERT EOF ;
    public final EObject entryRuleINSERT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT = null;


        try {
            // InternalSimpleSQL.g:615:47: (iv_ruleINSERT= ruleINSERT EOF )
            // InternalSimpleSQL.g:616:2: iv_ruleINSERT= ruleINSERT EOF
            {
             newCompositeNode(grammarAccess.getINSERTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSERT=ruleINSERT();

            state._fsp--;

             current =iv_ruleINSERT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSERT"


    // $ANTLR start "ruleINSERT"
    // InternalSimpleSQL.g:622:1: ruleINSERT returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) ;
    public final EObject ruleINSERT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_data_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:628:2: ( (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) )
            // InternalSimpleSQL.g:629:2: (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            {
            // InternalSimpleSQL.g:629:2: (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            // InternalSimpleSQL.g:630:3: otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getINSERTAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getINSERTAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getINSERTAccess().getToKeyword_2());
            		
            // InternalSimpleSQL.g:642:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:643:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:643:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:644:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINSERTRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getINSERTAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getINSERTAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimpleSQL.g:667:3: ( (lv_data_7_0= ruleInsert_List ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleSQL.g:668:4: (lv_data_7_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:668:4: (lv_data_7_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:669:5: lv_data_7_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_data_7_0=ruleInsert_List();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getINSERTRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_7_0,
            	    						"kcl.mdd.cw.sql.SimpleSQL.Insert_List");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getINSERTAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSERT"


    // $ANTLR start "entryRuleInsert_List"
    // InternalSimpleSQL.g:694:1: entryRuleInsert_List returns [EObject current=null] : iv_ruleInsert_List= ruleInsert_List EOF ;
    public final EObject entryRuleInsert_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert_List = null;


        try {
            // InternalSimpleSQL.g:694:52: (iv_ruleInsert_List= ruleInsert_List EOF )
            // InternalSimpleSQL.g:695:2: iv_ruleInsert_List= ruleInsert_List EOF
            {
             newCompositeNode(grammarAccess.getInsert_ListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert_List=ruleInsert_List();

            state._fsp--;

             current =iv_ruleInsert_List; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert_List"


    // $ANTLR start "ruleInsert_List"
    // InternalSimpleSQL.g:701:1: ruleInsert_List returns [EObject current=null] : ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) ) ;
    public final EObject ruleInsert_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_1_0=null;
        Token this_INT_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:707:2: ( ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) ) )
            // InternalSimpleSQL.g:708:2: ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) )
            {
            // InternalSimpleSQL.g:708:2: ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpleSQL.g:709:3: (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) )
                    {
                    // InternalSimpleSQL.g:709:3: (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) )
                    // InternalSimpleSQL.g:710:4: otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0_0());
                    			
                    // InternalSimpleSQL.g:714:4: ( (lv_data_1_0= RULE_STRING ) )
                    // InternalSimpleSQL.g:715:5: (lv_data_1_0= RULE_STRING )
                    {
                    // InternalSimpleSQL.g:715:5: (lv_data_1_0= RULE_STRING )
                    // InternalSimpleSQL.g:716:6: lv_data_1_0= RULE_STRING
                    {
                    lv_data_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_data_1_0, grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsert_ListRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"data",
                    							lv_data_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:734:3: (this_INT_2= RULE_INT otherlv_3= '\"' )
                    {
                    // InternalSimpleSQL.g:734:3: (this_INT_2= RULE_INT otherlv_3= '\"' )
                    // InternalSimpleSQL.g:735:4: this_INT_2= RULE_INT otherlv_3= '\"'
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_22); 

                    				newLeafNode(this_INT_2, grammarAccess.getInsert_ListAccess().getINTTerminalRuleCall_1_0());
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert_List"


    // $ANTLR start "ruleTYPE"
    // InternalSimpleSQL.g:748:1: ruleTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) ) ;
    public final Enumerator ruleTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:754:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) ) )
            // InternalSimpleSQL.g:755:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) )
            {
            // InternalSimpleSQL.g:755:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSimpleSQL.g:756:3: (enumLiteral_0= 'string' )
                    {
                    // InternalSimpleSQL.g:756:3: (enumLiteral_0= 'string' )
                    // InternalSimpleSQL.g:757:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:764:3: (enumLiteral_1= 'int' )
                    {
                    // InternalSimpleSQL.g:764:3: (enumLiteral_1= 'int' )
                    // InternalSimpleSQL.g:765:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:772:3: (enumLiteral_2= 'double' )
                    {
                    // InternalSimpleSQL.g:772:3: (enumLiteral_2= 'double' )
                    // InternalSimpleSQL.g:773:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:780:3: (enumLiteral_3= 'date' )
                    {
                    // InternalSimpleSQL.g:780:3: (enumLiteral_3= 'date' )
                    // InternalSimpleSQL.g:781:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010604802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020100040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}