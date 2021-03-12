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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'order'", "'by'", "'where'", "'to'", "'table'", "'in'", "'columns'", "'('", "')'", "'inner'", "'join'", "'on'", "'show'", "'all'", "'update'", "'entry'", "'with'", "'data'", "'delete'", "'create'", "'new'", "'database'", "'type'", "'add'", "'\"'", "'string'", "'int'", "'double'", "'date'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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

                if ( (LA1_0==11||LA1_0==13||LA1_0==20||LA1_0==23||LA1_0==25||(LA1_0>=29 && LA1_0<=30)||LA1_0==34) ) {
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
    // InternalSimpleSQL.g:108:1: ruleStatement returns [EObject current=null] : (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE | this_INNERJOIN_6= ruleINNERJOIN | this_WHERE_7= ruleWHERE | this_ORDERBY_8= ruleORDERBY ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SELECT_0 = null;

        EObject this_CREATE_DB_1 = null;

        EObject this_CREATE_TABLE_2 = null;

        EObject this_INSERT_3 = null;

        EObject this_DELETE_4 = null;

        EObject this_UPDATE_5 = null;

        EObject this_INNERJOIN_6 = null;

        EObject this_WHERE_7 = null;

        EObject this_ORDERBY_8 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:114:2: ( (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE | this_INNERJOIN_6= ruleINNERJOIN | this_WHERE_7= ruleWHERE | this_ORDERBY_8= ruleORDERBY ) )
            // InternalSimpleSQL.g:115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE | this_INNERJOIN_6= ruleINNERJOIN | this_WHERE_7= ruleWHERE | this_ORDERBY_8= ruleORDERBY )
            {
            // InternalSimpleSQL.g:115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE | this_INNERJOIN_6= ruleINNERJOIN | this_WHERE_7= ruleWHERE | this_ORDERBY_8= ruleORDERBY )
            int alt2=9;
            alt2 = dfa2.predict(input);
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
                case 7 :
                    // InternalSimpleSQL.g:170:3: this_INNERJOIN_6= ruleINNERJOIN
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getINNERJOINParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_INNERJOIN_6=ruleINNERJOIN();

                    state._fsp--;


                    			current = this_INNERJOIN_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSimpleSQL.g:179:3: this_WHERE_7= ruleWHERE
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWHEREParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_WHERE_7=ruleWHERE();

                    state._fsp--;


                    			current = this_WHERE_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSimpleSQL.g:188:3: this_ORDERBY_8= ruleORDERBY
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getORDERBYParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORDERBY_8=ruleORDERBY();

                    state._fsp--;


                    			current = this_ORDERBY_8;
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


    // $ANTLR start "entryRuleORDERBY"
    // InternalSimpleSQL.g:200:1: entryRuleORDERBY returns [EObject current=null] : iv_ruleORDERBY= ruleORDERBY EOF ;
    public final EObject entryRuleORDERBY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORDERBY = null;


        try {
            // InternalSimpleSQL.g:200:48: (iv_ruleORDERBY= ruleORDERBY EOF )
            // InternalSimpleSQL.g:201:2: iv_ruleORDERBY= ruleORDERBY EOF
            {
             newCompositeNode(grammarAccess.getORDERBYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORDERBY=ruleORDERBY();

            state._fsp--;

             current =iv_ruleORDERBY; 
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
    // $ANTLR end "entryRuleORDERBY"


    // $ANTLR start "ruleORDERBY"
    // InternalSimpleSQL.g:207:1: ruleORDERBY returns [EObject current=null] : (otherlv_0= 'order' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'where' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleORDERBY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:213:2: ( (otherlv_0= 'order' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'where' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:214:2: (otherlv_0= 'order' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'where' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:214:2: (otherlv_0= 'order' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'where' ( (otherlv_4= RULE_ID ) ) )
            // InternalSimpleSQL.g:215:3: otherlv_0= 'order' otherlv_1= 'by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'where' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getORDERBYAccess().getOrderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getORDERBYAccess().getByKeyword_1());
            		
            // InternalSimpleSQL.g:223:3: ( (otherlv_2= RULE_ID ) )
            // InternalSimpleSQL.g:224:4: (otherlv_2= RULE_ID )
            {
            // InternalSimpleSQL.g:224:4: (otherlv_2= RULE_ID )
            // InternalSimpleSQL.g:225:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getORDERBYRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getORDERBYAccess().getTableCREATE_TABLECrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getORDERBYAccess().getWhereKeyword_3());
            		
            // InternalSimpleSQL.g:240:3: ( (otherlv_4= RULE_ID ) )
            // InternalSimpleSQL.g:241:4: (otherlv_4= RULE_ID )
            {
            // InternalSimpleSQL.g:241:4: (otherlv_4= RULE_ID )
            // InternalSimpleSQL.g:242:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getORDERBYRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getORDERBYAccess().getColCOLUMN_DEFCrossReference_4_0());
            				

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
    // $ANTLR end "ruleORDERBY"


    // $ANTLR start "entryRuleWHERE"
    // InternalSimpleSQL.g:257:1: entryRuleWHERE returns [EObject current=null] : iv_ruleWHERE= ruleWHERE EOF ;
    public final EObject entryRuleWHERE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWHERE = null;


        try {
            // InternalSimpleSQL.g:257:46: (iv_ruleWHERE= ruleWHERE EOF )
            // InternalSimpleSQL.g:258:2: iv_ruleWHERE= ruleWHERE EOF
            {
             newCompositeNode(grammarAccess.getWHERERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWHERE=ruleWHERE();

            state._fsp--;

             current =iv_ruleWHERE; 
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
    // $ANTLR end "entryRuleWHERE"


    // $ANTLR start "ruleWHERE"
    // InternalSimpleSQL.g:264:1: ruleWHERE returns [EObject current=null] : (otherlv_0= 'where' otherlv_1= 'to' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'where' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) ;
    public final EObject ruleWHERE() throws RecognitionException {
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
            // InternalSimpleSQL.g:270:2: ( (otherlv_0= 'where' otherlv_1= 'to' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'where' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) )
            // InternalSimpleSQL.g:271:2: (otherlv_0= 'where' otherlv_1= 'to' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'where' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            {
            // InternalSimpleSQL.g:271:2: (otherlv_0= 'where' otherlv_1= 'to' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'where' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            // InternalSimpleSQL.g:272:3: otherlv_0= 'where' otherlv_1= 'to' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'where' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWHEREAccess().getWhereKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWHEREAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWHEREAccess().getTableKeyword_2());
            		
            // InternalSimpleSQL.g:284:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:285:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:285:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:286:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getWHEREAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWHERERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getWHEREAccess().getInKeyword_4());
            		
            // InternalSimpleSQL.g:306:3: ( (otherlv_5= RULE_ID ) )
            // InternalSimpleSQL.g:307:4: (otherlv_5= RULE_ID )
            {
            // InternalSimpleSQL.g:307:4: (otherlv_5= RULE_ID )
            // InternalSimpleSQL.g:308:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWHERERule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_5, grammarAccess.getWHEREAccess().getDbCREATE_DBCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getWHEREAccess().getWhereKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getWHEREAccess().getColumnsKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getWHEREAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSimpleSQL.g:331:3: ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleSQL.g:332:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    {
            	    // InternalSimpleSQL.g:332:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    // InternalSimpleSQL.g:333:5: lv_columns_9_0= ruleCOLUMN_DEF
            	    {

            	    					newCompositeNode(grammarAccess.getWHEREAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_columns_9_0=ruleCOLUMN_DEF();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWHERERule());
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWHEREAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleWHERE"


    // $ANTLR start "entryRuleINNERJOIN"
    // InternalSimpleSQL.g:358:1: entryRuleINNERJOIN returns [EObject current=null] : iv_ruleINNERJOIN= ruleINNERJOIN EOF ;
    public final EObject entryRuleINNERJOIN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINNERJOIN = null;


        try {
            // InternalSimpleSQL.g:358:50: (iv_ruleINNERJOIN= ruleINNERJOIN EOF )
            // InternalSimpleSQL.g:359:2: iv_ruleINNERJOIN= ruleINNERJOIN EOF
            {
             newCompositeNode(grammarAccess.getINNERJOINRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINNERJOIN=ruleINNERJOIN();

            state._fsp--;

             current =iv_ruleINNERJOIN; 
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
    // $ANTLR end "entryRuleINNERJOIN"


    // $ANTLR start "ruleINNERJOIN"
    // InternalSimpleSQL.g:365:1: ruleINNERJOIN returns [EObject current=null] : (otherlv_0= 'inner' otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ) ;
    public final EObject ruleINNERJOIN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:371:2: ( (otherlv_0= 'inner' otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ) )
            // InternalSimpleSQL.g:372:2: (otherlv_0= 'inner' otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' )
            {
            // InternalSimpleSQL.g:372:2: (otherlv_0= 'inner' otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' )
            // InternalSimpleSQL.g:373:3: otherlv_0= 'inner' otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getINNERJOINAccess().getInnerKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getINNERJOINAccess().getJoinKeyword_1());
            		
            // InternalSimpleSQL.g:381:3: ( (otherlv_2= RULE_ID ) )
            // InternalSimpleSQL.g:382:4: (otherlv_2= RULE_ID )
            {
            // InternalSimpleSQL.g:382:4: (otherlv_2= RULE_ID )
            // InternalSimpleSQL.g:383:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINNERJOINRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getINNERJOINAccess().getTableCREATE_TABLECrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getINNERJOINAccess().getOnKeyword_3());
            		

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
    // $ANTLR end "ruleINNERJOIN"


    // $ANTLR start "entryRuleSELECT"
    // InternalSimpleSQL.g:402:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalSimpleSQL.g:402:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalSimpleSQL.g:403:2: iv_ruleSELECT= ruleSELECT EOF
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
    // InternalSimpleSQL.g:409:1: ruleSELECT returns [EObject current=null] : (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_table_4_0=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:415:2: ( (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:416:2: (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:416:2: (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) )
            // InternalSimpleSQL.g:417:3: otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getShowKeyword_0());
            		
            // InternalSimpleSQL.g:421:3: ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimpleSQL.g:422:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalSimpleSQL.g:422:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSimpleSQL.g:423:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSimpleSQL.g:423:5: (lv_name_1_0= RULE_ID )
                    // InternalSimpleSQL.g:424:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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
                    // InternalSimpleSQL.g:441:4: otherlv_2= 'all'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getAllKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getInKeyword_2());
            		
            // InternalSimpleSQL.g:450:3: ( (lv_table_4_0= RULE_ID ) )
            // InternalSimpleSQL.g:451:4: (lv_table_4_0= RULE_ID )
            {
            // InternalSimpleSQL.g:451:4: (lv_table_4_0= RULE_ID )
            // InternalSimpleSQL.g:452:5: lv_table_4_0= RULE_ID
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
    // InternalSimpleSQL.g:472:1: entryRuleUPDATE returns [EObject current=null] : iv_ruleUPDATE= ruleUPDATE EOF ;
    public final EObject entryRuleUPDATE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUPDATE = null;


        try {
            // InternalSimpleSQL.g:472:47: (iv_ruleUPDATE= ruleUPDATE EOF )
            // InternalSimpleSQL.g:473:2: iv_ruleUPDATE= ruleUPDATE EOF
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
    // InternalSimpleSQL.g:479:1: ruleUPDATE returns [EObject current=null] : (otherlv_0= 'update' otherlv_1= 'entry' otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'on' otherlv_5= 'columns' otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' otherlv_9= 'with' otherlv_10= 'data' otherlv_11= '(' ( (lv_data_12_0= ruleInsert_List ) )+ otherlv_13= ')' ) ;
    public final EObject ruleUPDATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_data_12_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:485:2: ( (otherlv_0= 'update' otherlv_1= 'entry' otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'on' otherlv_5= 'columns' otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' otherlv_9= 'with' otherlv_10= 'data' otherlv_11= '(' ( (lv_data_12_0= ruleInsert_List ) )+ otherlv_13= ')' ) )
            // InternalSimpleSQL.g:486:2: (otherlv_0= 'update' otherlv_1= 'entry' otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'on' otherlv_5= 'columns' otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' otherlv_9= 'with' otherlv_10= 'data' otherlv_11= '(' ( (lv_data_12_0= ruleInsert_List ) )+ otherlv_13= ')' )
            {
            // InternalSimpleSQL.g:486:2: (otherlv_0= 'update' otherlv_1= 'entry' otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'on' otherlv_5= 'columns' otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' otherlv_9= 'with' otherlv_10= 'data' otherlv_11= '(' ( (lv_data_12_0= ruleInsert_List ) )+ otherlv_13= ')' )
            // InternalSimpleSQL.g:487:3: otherlv_0= 'update' otherlv_1= 'entry' otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'on' otherlv_5= 'columns' otherlv_6= '(' ( (otherlv_7= RULE_ID ) )+ otherlv_8= ')' otherlv_9= 'with' otherlv_10= 'data' otherlv_11= '(' ( (lv_data_12_0= ruleInsert_List ) )+ otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getUPDATEAccess().getUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUPDATEAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUPDATEAccess().getInKeyword_2());
            		
            // InternalSimpleSQL.g:499:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:500:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:500:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:501:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPDATERule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getUPDATEAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getUPDATEAccess().getOnKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getUPDATEAccess().getColumnsKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimpleSQL.g:524:3: ( (otherlv_7= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleSQL.g:525:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalSimpleSQL.g:525:4: (otherlv_7= RULE_ID )
            	    // InternalSimpleSQL.g:526:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUPDATERule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getUPDATEAccess().getColsCOLUMN_DEFCrossReference_7_0());
            	    				

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

            otherlv_8=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getUPDATEAccess().getWithKeyword_9());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getUPDATEAccess().getDataKeyword_10());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_11());
            		
            // InternalSimpleSQL.g:553:3: ( (lv_data_12_0= ruleInsert_List ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT||LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleSQL.g:554:4: (lv_data_12_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:554:4: (lv_data_12_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:555:5: lv_data_12_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getUPDATEAccess().getDataInsert_ListParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_data_12_0=ruleInsert_List();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUPDATERule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_12_0,
            	    						"kcl.mdd.cw.sql.SimpleSQL.Insert_List");
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

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_13());
            		

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
    // InternalSimpleSQL.g:580:1: entryRuleDELETE returns [EObject current=null] : iv_ruleDELETE= ruleDELETE EOF ;
    public final EObject entryRuleDELETE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDELETE = null;


        try {
            // InternalSimpleSQL.g:580:47: (iv_ruleDELETE= ruleDELETE EOF )
            // InternalSimpleSQL.g:581:2: iv_ruleDELETE= ruleDELETE EOF
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
    // InternalSimpleSQL.g:587:1: ruleDELETE returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) ;
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
            // InternalSimpleSQL.g:593:2: ( (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) )
            // InternalSimpleSQL.g:594:2: (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            {
            // InternalSimpleSQL.g:594:2: (otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            // InternalSimpleSQL.g:595:3: otherlv_0= 'delete' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDELETEAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDELETEAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDELETEAccess().getToKeyword_2());
            		
            // InternalSimpleSQL.g:607:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:608:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:608:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:609:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDELETERule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getDELETEAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getDELETEAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDELETEAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getDELETEAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimpleSQL.g:632:3: ( (lv_data_7_0= ruleInsert_List ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleSQL.g:633:4: (lv_data_7_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:633:4: (lv_data_7_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:634:5: lv_data_7_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getDELETEAccess().getDataInsert_ListParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalSimpleSQL.g:659:1: entryRuleCREATE_DB returns [EObject current=null] : iv_ruleCREATE_DB= ruleCREATE_DB EOF ;
    public final EObject entryRuleCREATE_DB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE_DB = null;


        try {
            // InternalSimpleSQL.g:659:50: (iv_ruleCREATE_DB= ruleCREATE_DB EOF )
            // InternalSimpleSQL.g:660:2: iv_ruleCREATE_DB= ruleCREATE_DB EOF
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
    // InternalSimpleSQL.g:666:1: ruleCREATE_DB returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCREATE_DB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:672:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:673:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:673:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSimpleSQL.g:674:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCREATE_DBAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCREATE_DBAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2());
            		
            // InternalSimpleSQL.g:686:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:687:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:687:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:688:5: lv_name_3_0= RULE_ID
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
    // InternalSimpleSQL.g:708:1: entryRuleCREATE_TABLE returns [EObject current=null] : iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF ;
    public final EObject entryRuleCREATE_TABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE_TABLE = null;


        try {
            // InternalSimpleSQL.g:708:53: (iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF )
            // InternalSimpleSQL.g:709:2: iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF
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
    // InternalSimpleSQL.g:715:1: ruleCREATE_TABLE returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) ;
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
            // InternalSimpleSQL.g:721:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) )
            // InternalSimpleSQL.g:722:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            {
            // InternalSimpleSQL.g:722:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            // InternalSimpleSQL.g:723:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2());
            		
            // InternalSimpleSQL.g:735:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:736:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:736:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:737:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getCREATE_TABLEAccess().getInKeyword_4());
            		
            // InternalSimpleSQL.g:757:3: ( (otherlv_5= RULE_ID ) )
            // InternalSimpleSQL.g:758:4: (otherlv_5= RULE_ID )
            {
            // InternalSimpleSQL.g:758:4: (otherlv_5= RULE_ID )
            // InternalSimpleSQL.g:759:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCREATE_TABLERule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_5, grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSimpleSQL.g:782:3: ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleSQL.g:783:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    {
            	    // InternalSimpleSQL.g:783:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    // InternalSimpleSQL.g:784:5: lv_columns_9_0= ruleCOLUMN_DEF
            	    {

            	    					newCompositeNode(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalSimpleSQL.g:809:1: entryRuleCOLUMN_DEF returns [EObject current=null] : iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF ;
    public final EObject entryRuleCOLUMN_DEF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLUMN_DEF = null;


        try {
            // InternalSimpleSQL.g:809:51: (iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF )
            // InternalSimpleSQL.g:810:2: iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF
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
    // InternalSimpleSQL.g:816:1: ruleCOLUMN_DEF returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) ) ;
    public final EObject ruleCOLUMN_DEF() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:822:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) ) )
            // InternalSimpleSQL.g:823:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) )
            {
            // InternalSimpleSQL.g:823:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) )
            // InternalSimpleSQL.g:824:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) )
            {
            // InternalSimpleSQL.g:824:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleSQL.g:825:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleSQL.g:825:4: (lv_name_0_0= RULE_ID )
            // InternalSimpleSQL.g:826:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2());
            		
            // InternalSimpleSQL.g:850:3: ( (lv_type_3_0= ruleTYPE ) )
            // InternalSimpleSQL.g:851:4: (lv_type_3_0= ruleTYPE )
            {
            // InternalSimpleSQL.g:851:4: (lv_type_3_0= ruleTYPE )
            // InternalSimpleSQL.g:852:5: lv_type_3_0= ruleTYPE
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
    // InternalSimpleSQL.g:873:1: entryRuleINSERT returns [EObject current=null] : iv_ruleINSERT= ruleINSERT EOF ;
    public final EObject entryRuleINSERT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT = null;


        try {
            // InternalSimpleSQL.g:873:47: (iv_ruleINSERT= ruleINSERT EOF )
            // InternalSimpleSQL.g:874:2: iv_ruleINSERT= ruleINSERT EOF
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
    // InternalSimpleSQL.g:880:1: ruleINSERT returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) ;
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
            // InternalSimpleSQL.g:886:2: ( (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' ) )
            // InternalSimpleSQL.g:887:2: (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            {
            // InternalSimpleSQL.g:887:2: (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')' )
            // InternalSimpleSQL.g:888:3: otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'data' otherlv_6= '(' ( (lv_data_7_0= ruleInsert_List ) )+ otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getINSERTAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getINSERTAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getINSERTAccess().getToKeyword_2());
            		
            // InternalSimpleSQL.g:900:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:901:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:901:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:902:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINSERTRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getINSERTAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getINSERTAccess().getDataKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_6());
            		
            // InternalSimpleSQL.g:925:3: ( (lv_data_7_0= ruleInsert_List ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleSQL.g:926:4: (lv_data_7_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:926:4: (lv_data_7_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:927:5: lv_data_7_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalSimpleSQL.g:952:1: entryRuleInsert_List returns [EObject current=null] : iv_ruleInsert_List= ruleInsert_List EOF ;
    public final EObject entryRuleInsert_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert_List = null;


        try {
            // InternalSimpleSQL.g:952:52: (iv_ruleInsert_List= ruleInsert_List EOF )
            // InternalSimpleSQL.g:953:2: iv_ruleInsert_List= ruleInsert_List EOF
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
    // InternalSimpleSQL.g:959:1: ruleInsert_List returns [EObject current=null] : ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) ) ;
    public final EObject ruleInsert_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_1_0=null;
        Token this_INT_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:965:2: ( ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) ) )
            // InternalSimpleSQL.g:966:2: ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) )
            {
            // InternalSimpleSQL.g:966:2: ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) ) | (this_INT_2= RULE_INT otherlv_3= '\"' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimpleSQL.g:967:3: (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) )
                    {
                    // InternalSimpleSQL.g:967:3: (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) )
                    // InternalSimpleSQL.g:968:4: otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0_0());
                    			
                    // InternalSimpleSQL.g:972:4: ( (lv_data_1_0= RULE_STRING ) )
                    // InternalSimpleSQL.g:973:5: (lv_data_1_0= RULE_STRING )
                    {
                    // InternalSimpleSQL.g:973:5: (lv_data_1_0= RULE_STRING )
                    // InternalSimpleSQL.g:974:6: lv_data_1_0= RULE_STRING
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
                    // InternalSimpleSQL.g:992:3: (this_INT_2= RULE_INT otherlv_3= '\"' )
                    {
                    // InternalSimpleSQL.g:992:3: (this_INT_2= RULE_INT otherlv_3= '\"' )
                    // InternalSimpleSQL.g:993:4: this_INT_2= RULE_INT otherlv_3= '\"'
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				newLeafNode(this_INT_2, grammarAccess.getInsert_ListAccess().getINTTerminalRuleCall_1_0());
                    			
                    otherlv_3=(Token)match(input,35,FOLLOW_2); 

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
    // InternalSimpleSQL.g:1006:1: ruleTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) ) ;
    public final Enumerator ruleTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:1012:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) ) )
            // InternalSimpleSQL.g:1013:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) )
            {
            // InternalSimpleSQL.g:1013:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSimpleSQL.g:1014:3: (enumLiteral_0= 'string' )
                    {
                    // InternalSimpleSQL.g:1014:3: (enumLiteral_0= 'string' )
                    // InternalSimpleSQL.g:1015:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:1022:3: (enumLiteral_1= 'int' )
                    {
                    // InternalSimpleSQL.g:1022:3: (enumLiteral_1= 'int' )
                    // InternalSimpleSQL.g:1023:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:1030:3: (enumLiteral_2= 'double' )
                    {
                    // InternalSimpleSQL.g:1030:3: (enumLiteral_2= 'double' )
                    // InternalSimpleSQL.g:1031:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:1038:3: (enumLiteral_3= 'date' )
                    {
                    // InternalSimpleSQL.g:1038:3: (enumLiteral_3= 'date' )
                    // InternalSimpleSQL.g:1039:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\13\1\uffff\1\37\6\uffff\1\17\2\uffff";
    static final String dfa_3s = "\1\42\1\uffff\1\37\6\uffff\1\40\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\3\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\1\uffff\1\7\6\uffff\1\6\2\uffff\1\1\1\uffff\1\5\3\uffff\1\4\1\2\3\uffff\1\3",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\20\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT | this_DELETE_4= ruleDELETE | this_UPDATE_5= ruleUPDATE | this_INNERJOIN_6= ruleINNERJOIN | this_WHERE_7= ruleWHERE | this_ORDERBY_8= ruleORDERBY )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000462902802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800080040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});

}