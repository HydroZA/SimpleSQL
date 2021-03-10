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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'show'", "'all'", "'in'", "'create'", "'new'", "'database'", "'table'", "'with'", "'columns'", "'('", "')'", "'type'", "'add'", "'entry'", "'to'", "'\"'", "'string'", "'int'", "'double'", "'date'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
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

                if ( (LA1_0==11||LA1_0==14||LA1_0==23) ) {
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
    // InternalSimpleSQL.g:108:1: ruleStatement returns [EObject current=null] : (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SELECT_0 = null;

        EObject this_CREATE_DB_1 = null;

        EObject this_CREATE_TABLE_2 = null;

        EObject this_INSERT_3 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:114:2: ( (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT ) )
            // InternalSimpleSQL.g:115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT )
            {
            // InternalSimpleSQL.g:115:2: (this_SELECT_0= ruleSELECT | this_CREATE_DB_1= ruleCREATE_DB | this_CREATE_TABLE_2= ruleCREATE_TABLE | this_INSERT_3= ruleINSERT )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==15) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==16) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==17) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

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
            case 23:
                {
                alt2=4;
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
    // InternalSimpleSQL.g:155:1: entryRuleSELECT returns [EObject current=null] : iv_ruleSELECT= ruleSELECT EOF ;
    public final EObject entryRuleSELECT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSELECT = null;


        try {
            // InternalSimpleSQL.g:155:47: (iv_ruleSELECT= ruleSELECT EOF )
            // InternalSimpleSQL.g:156:2: iv_ruleSELECT= ruleSELECT EOF
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
    // InternalSimpleSQL.g:162:1: ruleSELECT returns [EObject current=null] : (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSELECT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_table_4_0=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:168:2: ( (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:169:2: (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:169:2: (otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) ) )
            // InternalSimpleSQL.g:170:3: otherlv_0= 'show' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' ) otherlv_3= 'in' ( (lv_table_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSELECTAccess().getShowKeyword_0());
            		
            // InternalSimpleSQL.g:174:3: ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= 'all' )
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
                    // InternalSimpleSQL.g:175:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalSimpleSQL.g:175:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSimpleSQL.g:176:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSimpleSQL.g:176:5: (lv_name_1_0= RULE_ID )
                    // InternalSimpleSQL.g:177:6: lv_name_1_0= RULE_ID
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
                    // InternalSimpleSQL.g:194:4: otherlv_2= 'all'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSELECTAccess().getAllKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSELECTAccess().getInKeyword_2());
            		
            // InternalSimpleSQL.g:203:3: ( (lv_table_4_0= RULE_ID ) )
            // InternalSimpleSQL.g:204:4: (lv_table_4_0= RULE_ID )
            {
            // InternalSimpleSQL.g:204:4: (lv_table_4_0= RULE_ID )
            // InternalSimpleSQL.g:205:5: lv_table_4_0= RULE_ID
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


    // $ANTLR start "entryRuleCREATE_DB"
    // InternalSimpleSQL.g:225:1: entryRuleCREATE_DB returns [EObject current=null] : iv_ruleCREATE_DB= ruleCREATE_DB EOF ;
    public final EObject entryRuleCREATE_DB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE_DB = null;


        try {
            // InternalSimpleSQL.g:225:50: (iv_ruleCREATE_DB= ruleCREATE_DB EOF )
            // InternalSimpleSQL.g:226:2: iv_ruleCREATE_DB= ruleCREATE_DB EOF
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
    // InternalSimpleSQL.g:232:1: ruleCREATE_DB returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCREATE_DB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:238:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalSimpleSQL.g:239:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalSimpleSQL.g:239:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalSimpleSQL.g:240:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'database' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCREATE_DBAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCREATE_DBAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2());
            		
            // InternalSimpleSQL.g:252:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:253:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:253:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:254:5: lv_name_3_0= RULE_ID
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
    // InternalSimpleSQL.g:274:1: entryRuleCREATE_TABLE returns [EObject current=null] : iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF ;
    public final EObject entryRuleCREATE_TABLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCREATE_TABLE = null;


        try {
            // InternalSimpleSQL.g:274:53: (iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF )
            // InternalSimpleSQL.g:275:2: iv_ruleCREATE_TABLE= ruleCREATE_TABLE EOF
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
    // InternalSimpleSQL.g:281:1: ruleCREATE_TABLE returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) ;
    public final EObject ruleCREATE_TABLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_dbName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columns_9_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:287:2: ( (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' ) )
            // InternalSimpleSQL.g:288:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            {
            // InternalSimpleSQL.g:288:2: (otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')' )
            // InternalSimpleSQL.g:289:3: otherlv_0= 'create' otherlv_1= 'new' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'in' ( (lv_dbName_5_0= RULE_ID ) ) otherlv_6= 'with' otherlv_7= 'columns' otherlv_8= '(' ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+ otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2());
            		
            // InternalSimpleSQL.g:301:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSimpleSQL.g:302:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSimpleSQL.g:302:4: (lv_name_3_0= RULE_ID )
            // InternalSimpleSQL.g:303:5: lv_name_3_0= RULE_ID
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
            		
            // InternalSimpleSQL.g:323:3: ( (lv_dbName_5_0= RULE_ID ) )
            // InternalSimpleSQL.g:324:4: (lv_dbName_5_0= RULE_ID )
            {
            // InternalSimpleSQL.g:324:4: (lv_dbName_5_0= RULE_ID )
            // InternalSimpleSQL.g:325:5: lv_dbName_5_0= RULE_ID
            {
            lv_dbName_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_dbName_5_0, grammarAccess.getCREATE_TABLEAccess().getDbNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCREATE_TABLERule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbName",
            						lv_dbName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSimpleSQL.g:353:3: ( (lv_columns_9_0= ruleCOLUMN_DEF ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleSQL.g:354:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    {
            	    // InternalSimpleSQL.g:354:4: (lv_columns_9_0= ruleCOLUMN_DEF )
            	    // InternalSimpleSQL.g:355:5: lv_columns_9_0= ruleCOLUMN_DEF
            	    {

            	    					newCompositeNode(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSimpleSQL.g:380:1: entryRuleCOLUMN_DEF returns [EObject current=null] : iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF ;
    public final EObject entryRuleCOLUMN_DEF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLUMN_DEF = null;


        try {
            // InternalSimpleSQL.g:380:51: (iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF )
            // InternalSimpleSQL.g:381:2: iv_ruleCOLUMN_DEF= ruleCOLUMN_DEF EOF
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
    // InternalSimpleSQL.g:387:1: ruleCOLUMN_DEF returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) ) ;
    public final EObject ruleCOLUMN_DEF() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:393:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) ) )
            // InternalSimpleSQL.g:394:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) )
            {
            // InternalSimpleSQL.g:394:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) ) )
            // InternalSimpleSQL.g:395:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'type' ( (lv_type_3_0= ruleTYPE ) )
            {
            // InternalSimpleSQL.g:395:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleSQL.g:396:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleSQL.g:396:4: (lv_name_0_0= RULE_ID )
            // InternalSimpleSQL.g:397:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2());
            		
            // InternalSimpleSQL.g:421:3: ( (lv_type_3_0= ruleTYPE ) )
            // InternalSimpleSQL.g:422:4: (lv_type_3_0= ruleTYPE )
            {
            // InternalSimpleSQL.g:422:4: (lv_type_3_0= ruleTYPE )
            // InternalSimpleSQL.g:423:5: lv_type_3_0= ruleTYPE
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
    // InternalSimpleSQL.g:444:1: entryRuleINSERT returns [EObject current=null] : iv_ruleINSERT= ruleINSERT EOF ;
    public final EObject entryRuleINSERT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSERT = null;


        try {
            // InternalSimpleSQL.g:444:47: (iv_ruleINSERT= ruleINSERT EOF )
            // InternalSimpleSQL.g:445:2: iv_ruleINSERT= ruleINSERT EOF
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
    // InternalSimpleSQL.g:451:1: ruleINSERT returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'columns' ( (lv_data_6_0= ruleInsert_List ) )+ ) ;
    public final EObject ruleINSERT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_data_6_0 = null;



        	enterRule();

        try {
            // InternalSimpleSQL.g:457:2: ( (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'columns' ( (lv_data_6_0= ruleInsert_List ) )+ ) )
            // InternalSimpleSQL.g:458:2: (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'columns' ( (lv_data_6_0= ruleInsert_List ) )+ )
            {
            // InternalSimpleSQL.g:458:2: (otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'columns' ( (lv_data_6_0= ruleInsert_List ) )+ )
            // InternalSimpleSQL.g:459:3: otherlv_0= 'add' otherlv_1= 'entry' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'columns' ( (lv_data_6_0= ruleInsert_List ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getINSERTAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getINSERTAccess().getEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getINSERTAccess().getToKeyword_2());
            		
            // InternalSimpleSQL.g:471:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleSQL.g:472:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleSQL.g:472:4: (otherlv_3= RULE_ID )
            // InternalSimpleSQL.g:473:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINSERTRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getINSERTAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getINSERTAccess().getColumnsKeyword_5());
            		
            // InternalSimpleSQL.g:492:3: ( (lv_data_6_0= ruleInsert_List ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleSQL.g:493:4: (lv_data_6_0= ruleInsert_List )
            	    {
            	    // InternalSimpleSQL.g:493:4: (lv_data_6_0= ruleInsert_List )
            	    // InternalSimpleSQL.g:494:5: lv_data_6_0= ruleInsert_List
            	    {

            	    					newCompositeNode(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_data_6_0=ruleInsert_List();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getINSERTRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_6_0,
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
    // InternalSimpleSQL.g:515:1: entryRuleInsert_List returns [EObject current=null] : iv_ruleInsert_List= ruleInsert_List EOF ;
    public final EObject entryRuleInsert_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert_List = null;


        try {
            // InternalSimpleSQL.g:515:52: (iv_ruleInsert_List= ruleInsert_List EOF )
            // InternalSimpleSQL.g:516:2: iv_ruleInsert_List= ruleInsert_List EOF
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
    // InternalSimpleSQL.g:522:1: ruleInsert_List returns [EObject current=null] : (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= '\"' ) ;
    public final EObject ruleInsert_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_data_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:528:2: ( (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= '\"' ) )
            // InternalSimpleSQL.g:529:2: (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= '\"' )
            {
            // InternalSimpleSQL.g:529:2: (otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= '\"' )
            // InternalSimpleSQL.g:530:3: otherlv_0= '\"' ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0());
            		
            // InternalSimpleSQL.g:534:3: ( (lv_data_1_0= RULE_STRING ) )
            // InternalSimpleSQL.g:535:4: (lv_data_1_0= RULE_STRING )
            {
            // InternalSimpleSQL.g:535:4: (lv_data_1_0= RULE_STRING )
            // InternalSimpleSQL.g:536:5: lv_data_1_0= RULE_STRING
            {
            lv_data_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_data_1_0, grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_2());
            		

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
    // InternalSimpleSQL.g:560:1: ruleTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) ) ;
    public final Enumerator ruleTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSimpleSQL.g:566:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) ) )
            // InternalSimpleSQL.g:567:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) )
            {
            // InternalSimpleSQL.g:567:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'date' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSimpleSQL.g:568:3: (enumLiteral_0= 'string' )
                    {
                    // InternalSimpleSQL.g:568:3: (enumLiteral_0= 'string' )
                    // InternalSimpleSQL.g:569:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:576:3: (enumLiteral_1= 'int' )
                    {
                    // InternalSimpleSQL.g:576:3: (enumLiteral_1= 'int' )
                    // InternalSimpleSQL.g:577:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:584:3: (enumLiteral_2= 'double' )
                    {
                    // InternalSimpleSQL.g:584:3: (enumLiteral_2= 'double' )
                    // InternalSimpleSQL.g:585:4: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:592:3: (enumLiteral_3= 'date' )
                    {
                    // InternalSimpleSQL.g:592:3: (enumLiteral_3= 'date' )
                    // InternalSimpleSQL.g:593:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000804802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});

}