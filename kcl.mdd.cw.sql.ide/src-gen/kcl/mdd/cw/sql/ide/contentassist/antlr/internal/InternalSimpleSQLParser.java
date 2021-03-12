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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'all'", "'string'", "'int'", "'double'", "'date'", "'show'", "'in'", "'Update'", "'entry'", "'to'", "'with'", "'data'", "'('", "')'", "'delete'", "'create'", "'new'", "'database'", "'table'", "'columns'", "'type'", "'add'", "'\"'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleModel"
    // InternalSimpleSQL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:54:1: ( ruleModel EOF )
            // InternalSimpleSQL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimpleSQL.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalSimpleSQL.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalSimpleSQL.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalSimpleSQL.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalSimpleSQL.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18||(LA1_0>=25 && LA1_0<=26)||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleSQL.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalSimpleSQL.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:79:1: ( ruleStatement EOF )
            // InternalSimpleSQL.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSimpleSQL.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalSimpleSQL.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalSimpleSQL.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalSimpleSQL.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalSimpleSQL.g:94:3: ( rule__Statement__Alternatives )
            // InternalSimpleSQL.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSELECT"
    // InternalSimpleSQL.g:103:1: entryRuleSELECT : ruleSELECT EOF ;
    public final void entryRuleSELECT() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:104:1: ( ruleSELECT EOF )
            // InternalSimpleSQL.g:105:1: ruleSELECT EOF
            {
             before(grammarAccess.getSELECTRule()); 
            pushFollow(FOLLOW_1);
            ruleSELECT();

            state._fsp--;

             after(grammarAccess.getSELECTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSELECT"


    // $ANTLR start "ruleSELECT"
    // InternalSimpleSQL.g:112:1: ruleSELECT : ( ( rule__SELECT__Group__0 ) ) ;
    public final void ruleSELECT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:116:2: ( ( ( rule__SELECT__Group__0 ) ) )
            // InternalSimpleSQL.g:117:2: ( ( rule__SELECT__Group__0 ) )
            {
            // InternalSimpleSQL.g:117:2: ( ( rule__SELECT__Group__0 ) )
            // InternalSimpleSQL.g:118:3: ( rule__SELECT__Group__0 )
            {
             before(grammarAccess.getSELECTAccess().getGroup()); 
            // InternalSimpleSQL.g:119:3: ( rule__SELECT__Group__0 )
            // InternalSimpleSQL.g:119:4: rule__SELECT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSELECT"


    // $ANTLR start "entryRuleUPDATE"
    // InternalSimpleSQL.g:128:1: entryRuleUPDATE : ruleUPDATE EOF ;
    public final void entryRuleUPDATE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:129:1: ( ruleUPDATE EOF )
            // InternalSimpleSQL.g:130:1: ruleUPDATE EOF
            {
             before(grammarAccess.getUPDATERule()); 
            pushFollow(FOLLOW_1);
            ruleUPDATE();

            state._fsp--;

             after(grammarAccess.getUPDATERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUPDATE"


    // $ANTLR start "ruleUPDATE"
    // InternalSimpleSQL.g:137:1: ruleUPDATE : ( ( rule__UPDATE__Group__0 ) ) ;
    public final void ruleUPDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:141:2: ( ( ( rule__UPDATE__Group__0 ) ) )
            // InternalSimpleSQL.g:142:2: ( ( rule__UPDATE__Group__0 ) )
            {
            // InternalSimpleSQL.g:142:2: ( ( rule__UPDATE__Group__0 ) )
            // InternalSimpleSQL.g:143:3: ( rule__UPDATE__Group__0 )
            {
             before(grammarAccess.getUPDATEAccess().getGroup()); 
            // InternalSimpleSQL.g:144:3: ( rule__UPDATE__Group__0 )
            // InternalSimpleSQL.g:144:4: rule__UPDATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUPDATEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUPDATE"


    // $ANTLR start "entryRuleDELETE"
    // InternalSimpleSQL.g:153:1: entryRuleDELETE : ruleDELETE EOF ;
    public final void entryRuleDELETE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:154:1: ( ruleDELETE EOF )
            // InternalSimpleSQL.g:155:1: ruleDELETE EOF
            {
             before(grammarAccess.getDELETERule()); 
            pushFollow(FOLLOW_1);
            ruleDELETE();

            state._fsp--;

             after(grammarAccess.getDELETERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDELETE"


    // $ANTLR start "ruleDELETE"
    // InternalSimpleSQL.g:162:1: ruleDELETE : ( ( rule__DELETE__Group__0 ) ) ;
    public final void ruleDELETE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:166:2: ( ( ( rule__DELETE__Group__0 ) ) )
            // InternalSimpleSQL.g:167:2: ( ( rule__DELETE__Group__0 ) )
            {
            // InternalSimpleSQL.g:167:2: ( ( rule__DELETE__Group__0 ) )
            // InternalSimpleSQL.g:168:3: ( rule__DELETE__Group__0 )
            {
             before(grammarAccess.getDELETEAccess().getGroup()); 
            // InternalSimpleSQL.g:169:3: ( rule__DELETE__Group__0 )
            // InternalSimpleSQL.g:169:4: rule__DELETE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DELETE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDELETEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDELETE"


    // $ANTLR start "entryRuleCREATE_DB"
    // InternalSimpleSQL.g:178:1: entryRuleCREATE_DB : ruleCREATE_DB EOF ;
    public final void entryRuleCREATE_DB() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:179:1: ( ruleCREATE_DB EOF )
            // InternalSimpleSQL.g:180:1: ruleCREATE_DB EOF
            {
             before(grammarAccess.getCREATE_DBRule()); 
            pushFollow(FOLLOW_1);
            ruleCREATE_DB();

            state._fsp--;

             after(grammarAccess.getCREATE_DBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCREATE_DB"


    // $ANTLR start "ruleCREATE_DB"
    // InternalSimpleSQL.g:187:1: ruleCREATE_DB : ( ( rule__CREATE_DB__Group__0 ) ) ;
    public final void ruleCREATE_DB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:191:2: ( ( ( rule__CREATE_DB__Group__0 ) ) )
            // InternalSimpleSQL.g:192:2: ( ( rule__CREATE_DB__Group__0 ) )
            {
            // InternalSimpleSQL.g:192:2: ( ( rule__CREATE_DB__Group__0 ) )
            // InternalSimpleSQL.g:193:3: ( rule__CREATE_DB__Group__0 )
            {
             before(grammarAccess.getCREATE_DBAccess().getGroup()); 
            // InternalSimpleSQL.g:194:3: ( rule__CREATE_DB__Group__0 )
            // InternalSimpleSQL.g:194:4: rule__CREATE_DB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_DB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_DBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCREATE_DB"


    // $ANTLR start "entryRuleCREATE_TABLE"
    // InternalSimpleSQL.g:203:1: entryRuleCREATE_TABLE : ruleCREATE_TABLE EOF ;
    public final void entryRuleCREATE_TABLE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:204:1: ( ruleCREATE_TABLE EOF )
            // InternalSimpleSQL.g:205:1: ruleCREATE_TABLE EOF
            {
             before(grammarAccess.getCREATE_TABLERule()); 
            pushFollow(FOLLOW_1);
            ruleCREATE_TABLE();

            state._fsp--;

             after(grammarAccess.getCREATE_TABLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCREATE_TABLE"


    // $ANTLR start "ruleCREATE_TABLE"
    // InternalSimpleSQL.g:212:1: ruleCREATE_TABLE : ( ( rule__CREATE_TABLE__Group__0 ) ) ;
    public final void ruleCREATE_TABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:216:2: ( ( ( rule__CREATE_TABLE__Group__0 ) ) )
            // InternalSimpleSQL.g:217:2: ( ( rule__CREATE_TABLE__Group__0 ) )
            {
            // InternalSimpleSQL.g:217:2: ( ( rule__CREATE_TABLE__Group__0 ) )
            // InternalSimpleSQL.g:218:3: ( rule__CREATE_TABLE__Group__0 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getGroup()); 
            // InternalSimpleSQL.g:219:3: ( rule__CREATE_TABLE__Group__0 )
            // InternalSimpleSQL.g:219:4: rule__CREATE_TABLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCREATE_TABLE"


    // $ANTLR start "entryRuleCOLUMN_DEF"
    // InternalSimpleSQL.g:228:1: entryRuleCOLUMN_DEF : ruleCOLUMN_DEF EOF ;
    public final void entryRuleCOLUMN_DEF() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:229:1: ( ruleCOLUMN_DEF EOF )
            // InternalSimpleSQL.g:230:1: ruleCOLUMN_DEF EOF
            {
             before(grammarAccess.getCOLUMN_DEFRule()); 
            pushFollow(FOLLOW_1);
            ruleCOLUMN_DEF();

            state._fsp--;

             after(grammarAccess.getCOLUMN_DEFRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLUMN_DEF"


    // $ANTLR start "ruleCOLUMN_DEF"
    // InternalSimpleSQL.g:237:1: ruleCOLUMN_DEF : ( ( rule__COLUMN_DEF__Group__0 ) ) ;
    public final void ruleCOLUMN_DEF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:241:2: ( ( ( rule__COLUMN_DEF__Group__0 ) ) )
            // InternalSimpleSQL.g:242:2: ( ( rule__COLUMN_DEF__Group__0 ) )
            {
            // InternalSimpleSQL.g:242:2: ( ( rule__COLUMN_DEF__Group__0 ) )
            // InternalSimpleSQL.g:243:3: ( rule__COLUMN_DEF__Group__0 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getGroup()); 
            // InternalSimpleSQL.g:244:3: ( rule__COLUMN_DEF__Group__0 )
            // InternalSimpleSQL.g:244:4: rule__COLUMN_DEF__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOLUMN_DEFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLUMN_DEF"


    // $ANTLR start "entryRuleINSERT"
    // InternalSimpleSQL.g:253:1: entryRuleINSERT : ruleINSERT EOF ;
    public final void entryRuleINSERT() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:254:1: ( ruleINSERT EOF )
            // InternalSimpleSQL.g:255:1: ruleINSERT EOF
            {
             before(grammarAccess.getINSERTRule()); 
            pushFollow(FOLLOW_1);
            ruleINSERT();

            state._fsp--;

             after(grammarAccess.getINSERTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINSERT"


    // $ANTLR start "ruleINSERT"
    // InternalSimpleSQL.g:262:1: ruleINSERT : ( ( rule__INSERT__Group__0 ) ) ;
    public final void ruleINSERT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:266:2: ( ( ( rule__INSERT__Group__0 ) ) )
            // InternalSimpleSQL.g:267:2: ( ( rule__INSERT__Group__0 ) )
            {
            // InternalSimpleSQL.g:267:2: ( ( rule__INSERT__Group__0 ) )
            // InternalSimpleSQL.g:268:3: ( rule__INSERT__Group__0 )
            {
             before(grammarAccess.getINSERTAccess().getGroup()); 
            // InternalSimpleSQL.g:269:3: ( rule__INSERT__Group__0 )
            // InternalSimpleSQL.g:269:4: rule__INSERT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINSERTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINSERT"


    // $ANTLR start "entryRuleInsert_List"
    // InternalSimpleSQL.g:278:1: entryRuleInsert_List : ruleInsert_List EOF ;
    public final void entryRuleInsert_List() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:279:1: ( ruleInsert_List EOF )
            // InternalSimpleSQL.g:280:1: ruleInsert_List EOF
            {
             before(grammarAccess.getInsert_ListRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert_List();

            state._fsp--;

             after(grammarAccess.getInsert_ListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsert_List"


    // $ANTLR start "ruleInsert_List"
    // InternalSimpleSQL.g:287:1: ruleInsert_List : ( ( rule__Insert_List__Alternatives ) ) ;
    public final void ruleInsert_List() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:291:2: ( ( ( rule__Insert_List__Alternatives ) ) )
            // InternalSimpleSQL.g:292:2: ( ( rule__Insert_List__Alternatives ) )
            {
            // InternalSimpleSQL.g:292:2: ( ( rule__Insert_List__Alternatives ) )
            // InternalSimpleSQL.g:293:3: ( rule__Insert_List__Alternatives )
            {
             before(grammarAccess.getInsert_ListAccess().getAlternatives()); 
            // InternalSimpleSQL.g:294:3: ( rule__Insert_List__Alternatives )
            // InternalSimpleSQL.g:294:4: rule__Insert_List__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInsert_ListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert_List"


    // $ANTLR start "ruleTYPE"
    // InternalSimpleSQL.g:303:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:307:1: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalSimpleSQL.g:308:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalSimpleSQL.g:308:2: ( ( rule__TYPE__Alternatives ) )
            // InternalSimpleSQL.g:309:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalSimpleSQL.g:310:3: ( rule__TYPE__Alternatives )
            // InternalSimpleSQL.g:310:4: rule__TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalSimpleSQL.g:318:1: rule__Statement__Alternatives : ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) | ( ruleDELETE ) | ( ruleUPDATE ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:322:1: ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) | ( ruleDELETE ) | ( ruleUPDATE ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==27) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==28) ) {
                        alt2=2;
                    }
                    else if ( (LA2_6==29) ) {
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
            case 32:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 18:
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
                    // InternalSimpleSQL.g:323:2: ( ruleSELECT )
                    {
                    // InternalSimpleSQL.g:323:2: ( ruleSELECT )
                    // InternalSimpleSQL.g:324:3: ruleSELECT
                    {
                     before(grammarAccess.getStatementAccess().getSELECTParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSELECT();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSELECTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:329:2: ( ruleCREATE_DB )
                    {
                    // InternalSimpleSQL.g:329:2: ( ruleCREATE_DB )
                    // InternalSimpleSQL.g:330:3: ruleCREATE_DB
                    {
                     before(grammarAccess.getStatementAccess().getCREATE_DBParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCREATE_DB();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCREATE_DBParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:335:2: ( ruleCREATE_TABLE )
                    {
                    // InternalSimpleSQL.g:335:2: ( ruleCREATE_TABLE )
                    // InternalSimpleSQL.g:336:3: ruleCREATE_TABLE
                    {
                     before(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCREATE_TABLE();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCREATE_TABLEParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:341:2: ( ruleINSERT )
                    {
                    // InternalSimpleSQL.g:341:2: ( ruleINSERT )
                    // InternalSimpleSQL.g:342:3: ruleINSERT
                    {
                     before(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleINSERT();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleSQL.g:347:2: ( ruleDELETE )
                    {
                    // InternalSimpleSQL.g:347:2: ( ruleDELETE )
                    // InternalSimpleSQL.g:348:3: ruleDELETE
                    {
                     before(grammarAccess.getStatementAccess().getDELETEParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDELETE();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDELETEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleSQL.g:353:2: ( ruleUPDATE )
                    {
                    // InternalSimpleSQL.g:353:2: ( ruleUPDATE )
                    // InternalSimpleSQL.g:354:3: ruleUPDATE
                    {
                     before(grammarAccess.getStatementAccess().getUPDATEParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleUPDATE();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUPDATEParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__SELECT__Alternatives_1"
    // InternalSimpleSQL.g:363:1: rule__SELECT__Alternatives_1 : ( ( ( rule__SELECT__NameAssignment_1_0 ) ) | ( 'all' ) );
    public final void rule__SELECT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:367:1: ( ( ( rule__SELECT__NameAssignment_1_0 ) ) | ( 'all' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimpleSQL.g:368:2: ( ( rule__SELECT__NameAssignment_1_0 ) )
                    {
                    // InternalSimpleSQL.g:368:2: ( ( rule__SELECT__NameAssignment_1_0 ) )
                    // InternalSimpleSQL.g:369:3: ( rule__SELECT__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getSELECTAccess().getNameAssignment_1_0()); 
                    // InternalSimpleSQL.g:370:3: ( rule__SELECT__NameAssignment_1_0 )
                    // InternalSimpleSQL.g:370:4: rule__SELECT__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SELECT__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSELECTAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:374:2: ( 'all' )
                    {
                    // InternalSimpleSQL.g:374:2: ( 'all' )
                    // InternalSimpleSQL.g:375:3: 'all'
                    {
                     before(grammarAccess.getSELECTAccess().getAllKeyword_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSELECTAccess().getAllKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Alternatives_1"


    // $ANTLR start "rule__Insert_List__Alternatives"
    // InternalSimpleSQL.g:384:1: rule__Insert_List__Alternatives : ( ( ( rule__Insert_List__Group_0__0 ) ) | ( ( rule__Insert_List__Group_1__0 ) ) );
    public final void rule__Insert_List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:388:1: ( ( ( rule__Insert_List__Group_0__0 ) ) | ( ( rule__Insert_List__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimpleSQL.g:389:2: ( ( rule__Insert_List__Group_0__0 ) )
                    {
                    // InternalSimpleSQL.g:389:2: ( ( rule__Insert_List__Group_0__0 ) )
                    // InternalSimpleSQL.g:390:3: ( rule__Insert_List__Group_0__0 )
                    {
                     before(grammarAccess.getInsert_ListAccess().getGroup_0()); 
                    // InternalSimpleSQL.g:391:3: ( rule__Insert_List__Group_0__0 )
                    // InternalSimpleSQL.g:391:4: rule__Insert_List__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert_List__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInsert_ListAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:395:2: ( ( rule__Insert_List__Group_1__0 ) )
                    {
                    // InternalSimpleSQL.g:395:2: ( ( rule__Insert_List__Group_1__0 ) )
                    // InternalSimpleSQL.g:396:3: ( rule__Insert_List__Group_1__0 )
                    {
                     before(grammarAccess.getInsert_ListAccess().getGroup_1()); 
                    // InternalSimpleSQL.g:397:3: ( rule__Insert_List__Group_1__0 )
                    // InternalSimpleSQL.g:397:4: rule__Insert_List__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert_List__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInsert_ListAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Alternatives"


    // $ANTLR start "rule__TYPE__Alternatives"
    // InternalSimpleSQL.g:405:1: rule__TYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:409:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSimpleSQL.g:410:2: ( ( 'string' ) )
                    {
                    // InternalSimpleSQL.g:410:2: ( ( 'string' ) )
                    // InternalSimpleSQL.g:411:3: ( 'string' )
                    {
                     before(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSimpleSQL.g:412:3: ( 'string' )
                    // InternalSimpleSQL.g:412:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:416:2: ( ( 'int' ) )
                    {
                    // InternalSimpleSQL.g:416:2: ( ( 'int' ) )
                    // InternalSimpleSQL.g:417:3: ( 'int' )
                    {
                     before(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSimpleSQL.g:418:3: ( 'int' )
                    // InternalSimpleSQL.g:418:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:422:2: ( ( 'double' ) )
                    {
                    // InternalSimpleSQL.g:422:2: ( ( 'double' ) )
                    // InternalSimpleSQL.g:423:3: ( 'double' )
                    {
                     before(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // InternalSimpleSQL.g:424:3: ( 'double' )
                    // InternalSimpleSQL.g:424:4: 'double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:428:2: ( ( 'date' ) )
                    {
                    // InternalSimpleSQL.g:428:2: ( ( 'date' ) )
                    // InternalSimpleSQL.g:429:3: ( 'date' )
                    {
                     before(grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalSimpleSQL.g:430:3: ( 'date' )
                    // InternalSimpleSQL.g:430:4: 'date'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE__Alternatives"


    // $ANTLR start "rule__SELECT__Group__0"
    // InternalSimpleSQL.g:438:1: rule__SELECT__Group__0 : rule__SELECT__Group__0__Impl rule__SELECT__Group__1 ;
    public final void rule__SELECT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:442:1: ( rule__SELECT__Group__0__Impl rule__SELECT__Group__1 )
            // InternalSimpleSQL.g:443:2: rule__SELECT__Group__0__Impl rule__SELECT__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SELECT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__0"


    // $ANTLR start "rule__SELECT__Group__0__Impl"
    // InternalSimpleSQL.g:450:1: rule__SELECT__Group__0__Impl : ( 'show' ) ;
    public final void rule__SELECT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:454:1: ( ( 'show' ) )
            // InternalSimpleSQL.g:455:1: ( 'show' )
            {
            // InternalSimpleSQL.g:455:1: ( 'show' )
            // InternalSimpleSQL.g:456:2: 'show'
            {
             before(grammarAccess.getSELECTAccess().getShowKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getShowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__0__Impl"


    // $ANTLR start "rule__SELECT__Group__1"
    // InternalSimpleSQL.g:465:1: rule__SELECT__Group__1 : rule__SELECT__Group__1__Impl rule__SELECT__Group__2 ;
    public final void rule__SELECT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:469:1: ( rule__SELECT__Group__1__Impl rule__SELECT__Group__2 )
            // InternalSimpleSQL.g:470:2: rule__SELECT__Group__1__Impl rule__SELECT__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SELECT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__1"


    // $ANTLR start "rule__SELECT__Group__1__Impl"
    // InternalSimpleSQL.g:477:1: rule__SELECT__Group__1__Impl : ( ( rule__SELECT__Alternatives_1 ) ) ;
    public final void rule__SELECT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:481:1: ( ( ( rule__SELECT__Alternatives_1 ) ) )
            // InternalSimpleSQL.g:482:1: ( ( rule__SELECT__Alternatives_1 ) )
            {
            // InternalSimpleSQL.g:482:1: ( ( rule__SELECT__Alternatives_1 ) )
            // InternalSimpleSQL.g:483:2: ( rule__SELECT__Alternatives_1 )
            {
             before(grammarAccess.getSELECTAccess().getAlternatives_1()); 
            // InternalSimpleSQL.g:484:2: ( rule__SELECT__Alternatives_1 )
            // InternalSimpleSQL.g:484:3: rule__SELECT__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__1__Impl"


    // $ANTLR start "rule__SELECT__Group__2"
    // InternalSimpleSQL.g:492:1: rule__SELECT__Group__2 : rule__SELECT__Group__2__Impl rule__SELECT__Group__3 ;
    public final void rule__SELECT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:496:1: ( rule__SELECT__Group__2__Impl rule__SELECT__Group__3 )
            // InternalSimpleSQL.g:497:2: rule__SELECT__Group__2__Impl rule__SELECT__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SELECT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SELECT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__2"


    // $ANTLR start "rule__SELECT__Group__2__Impl"
    // InternalSimpleSQL.g:504:1: rule__SELECT__Group__2__Impl : ( 'in' ) ;
    public final void rule__SELECT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:508:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:509:1: ( 'in' )
            {
            // InternalSimpleSQL.g:509:1: ( 'in' )
            // InternalSimpleSQL.g:510:2: 'in'
            {
             before(grammarAccess.getSELECTAccess().getInKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__2__Impl"


    // $ANTLR start "rule__SELECT__Group__3"
    // InternalSimpleSQL.g:519:1: rule__SELECT__Group__3 : rule__SELECT__Group__3__Impl ;
    public final void rule__SELECT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:523:1: ( rule__SELECT__Group__3__Impl )
            // InternalSimpleSQL.g:524:2: rule__SELECT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__3"


    // $ANTLR start "rule__SELECT__Group__3__Impl"
    // InternalSimpleSQL.g:530:1: rule__SELECT__Group__3__Impl : ( ( rule__SELECT__TableAssignment_3 ) ) ;
    public final void rule__SELECT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:534:1: ( ( ( rule__SELECT__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:535:1: ( ( rule__SELECT__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:535:1: ( ( rule__SELECT__TableAssignment_3 ) )
            // InternalSimpleSQL.g:536:2: ( rule__SELECT__TableAssignment_3 )
            {
             before(grammarAccess.getSELECTAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:537:2: ( rule__SELECT__TableAssignment_3 )
            // InternalSimpleSQL.g:537:3: rule__SELECT__TableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SELECT__TableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSELECTAccess().getTableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__Group__3__Impl"


    // $ANTLR start "rule__UPDATE__Group__0"
    // InternalSimpleSQL.g:546:1: rule__UPDATE__Group__0 : rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1 ;
    public final void rule__UPDATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:550:1: ( rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1 )
            // InternalSimpleSQL.g:551:2: rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__UPDATE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__0"


    // $ANTLR start "rule__UPDATE__Group__0__Impl"
    // InternalSimpleSQL.g:558:1: rule__UPDATE__Group__0__Impl : ( 'Update' ) ;
    public final void rule__UPDATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:562:1: ( ( 'Update' ) )
            // InternalSimpleSQL.g:563:1: ( 'Update' )
            {
            // InternalSimpleSQL.g:563:1: ( 'Update' )
            // InternalSimpleSQL.g:564:2: 'Update'
            {
             before(grammarAccess.getUPDATEAccess().getUpdateKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getUpdateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__0__Impl"


    // $ANTLR start "rule__UPDATE__Group__1"
    // InternalSimpleSQL.g:573:1: rule__UPDATE__Group__1 : rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2 ;
    public final void rule__UPDATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:577:1: ( rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2 )
            // InternalSimpleSQL.g:578:2: rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__UPDATE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__1"


    // $ANTLR start "rule__UPDATE__Group__1__Impl"
    // InternalSimpleSQL.g:585:1: rule__UPDATE__Group__1__Impl : ( 'entry' ) ;
    public final void rule__UPDATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:589:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:590:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:590:1: ( 'entry' )
            // InternalSimpleSQL.g:591:2: 'entry'
            {
             before(grammarAccess.getUPDATEAccess().getEntryKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getEntryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__1__Impl"


    // $ANTLR start "rule__UPDATE__Group__2"
    // InternalSimpleSQL.g:600:1: rule__UPDATE__Group__2 : rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3 ;
    public final void rule__UPDATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:604:1: ( rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3 )
            // InternalSimpleSQL.g:605:2: rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__UPDATE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__2"


    // $ANTLR start "rule__UPDATE__Group__2__Impl"
    // InternalSimpleSQL.g:612:1: rule__UPDATE__Group__2__Impl : ( 'to' ) ;
    public final void rule__UPDATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:616:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:617:1: ( 'to' )
            {
            // InternalSimpleSQL.g:617:1: ( 'to' )
            // InternalSimpleSQL.g:618:2: 'to'
            {
             before(grammarAccess.getUPDATEAccess().getToKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__2__Impl"


    // $ANTLR start "rule__UPDATE__Group__3"
    // InternalSimpleSQL.g:627:1: rule__UPDATE__Group__3 : rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4 ;
    public final void rule__UPDATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:631:1: ( rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4 )
            // InternalSimpleSQL.g:632:2: rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__UPDATE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__3"


    // $ANTLR start "rule__UPDATE__Group__3__Impl"
    // InternalSimpleSQL.g:639:1: rule__UPDATE__Group__3__Impl : ( ( rule__UPDATE__TableAssignment_3 ) ) ;
    public final void rule__UPDATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:643:1: ( ( ( rule__UPDATE__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:644:1: ( ( rule__UPDATE__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:644:1: ( ( rule__UPDATE__TableAssignment_3 ) )
            // InternalSimpleSQL.g:645:2: ( rule__UPDATE__TableAssignment_3 )
            {
             before(grammarAccess.getUPDATEAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:646:2: ( rule__UPDATE__TableAssignment_3 )
            // InternalSimpleSQL.g:646:3: rule__UPDATE__TableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__TableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUPDATEAccess().getTableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__3__Impl"


    // $ANTLR start "rule__UPDATE__Group__4"
    // InternalSimpleSQL.g:654:1: rule__UPDATE__Group__4 : rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5 ;
    public final void rule__UPDATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:658:1: ( rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5 )
            // InternalSimpleSQL.g:659:2: rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__UPDATE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__4"


    // $ANTLR start "rule__UPDATE__Group__4__Impl"
    // InternalSimpleSQL.g:666:1: rule__UPDATE__Group__4__Impl : ( 'with' ) ;
    public final void rule__UPDATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:670:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:671:1: ( 'with' )
            {
            // InternalSimpleSQL.g:671:1: ( 'with' )
            // InternalSimpleSQL.g:672:2: 'with'
            {
             before(grammarAccess.getUPDATEAccess().getWithKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__4__Impl"


    // $ANTLR start "rule__UPDATE__Group__5"
    // InternalSimpleSQL.g:681:1: rule__UPDATE__Group__5 : rule__UPDATE__Group__5__Impl rule__UPDATE__Group__6 ;
    public final void rule__UPDATE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:685:1: ( rule__UPDATE__Group__5__Impl rule__UPDATE__Group__6 )
            // InternalSimpleSQL.g:686:2: rule__UPDATE__Group__5__Impl rule__UPDATE__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__UPDATE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__5"


    // $ANTLR start "rule__UPDATE__Group__5__Impl"
    // InternalSimpleSQL.g:693:1: rule__UPDATE__Group__5__Impl : ( 'data' ) ;
    public final void rule__UPDATE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:697:1: ( ( 'data' ) )
            // InternalSimpleSQL.g:698:1: ( 'data' )
            {
            // InternalSimpleSQL.g:698:1: ( 'data' )
            // InternalSimpleSQL.g:699:2: 'data'
            {
             before(grammarAccess.getUPDATEAccess().getDataKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getDataKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__5__Impl"


    // $ANTLR start "rule__UPDATE__Group__6"
    // InternalSimpleSQL.g:708:1: rule__UPDATE__Group__6 : rule__UPDATE__Group__6__Impl rule__UPDATE__Group__7 ;
    public final void rule__UPDATE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:712:1: ( rule__UPDATE__Group__6__Impl rule__UPDATE__Group__7 )
            // InternalSimpleSQL.g:713:2: rule__UPDATE__Group__6__Impl rule__UPDATE__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__6"


    // $ANTLR start "rule__UPDATE__Group__6__Impl"
    // InternalSimpleSQL.g:720:1: rule__UPDATE__Group__6__Impl : ( '(' ) ;
    public final void rule__UPDATE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:724:1: ( ( '(' ) )
            // InternalSimpleSQL.g:725:1: ( '(' )
            {
            // InternalSimpleSQL.g:725:1: ( '(' )
            // InternalSimpleSQL.g:726:2: '('
            {
             before(grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__6__Impl"


    // $ANTLR start "rule__UPDATE__Group__7"
    // InternalSimpleSQL.g:735:1: rule__UPDATE__Group__7 : rule__UPDATE__Group__7__Impl rule__UPDATE__Group__8 ;
    public final void rule__UPDATE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:739:1: ( rule__UPDATE__Group__7__Impl rule__UPDATE__Group__8 )
            // InternalSimpleSQL.g:740:2: rule__UPDATE__Group__7__Impl rule__UPDATE__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__UPDATE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__7"


    // $ANTLR start "rule__UPDATE__Group__7__Impl"
    // InternalSimpleSQL.g:747:1: rule__UPDATE__Group__7__Impl : ( ( ( rule__UPDATE__DataAssignment_7 ) ) ( ( rule__UPDATE__DataAssignment_7 )* ) ) ;
    public final void rule__UPDATE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:751:1: ( ( ( ( rule__UPDATE__DataAssignment_7 ) ) ( ( rule__UPDATE__DataAssignment_7 )* ) ) )
            // InternalSimpleSQL.g:752:1: ( ( ( rule__UPDATE__DataAssignment_7 ) ) ( ( rule__UPDATE__DataAssignment_7 )* ) )
            {
            // InternalSimpleSQL.g:752:1: ( ( ( rule__UPDATE__DataAssignment_7 ) ) ( ( rule__UPDATE__DataAssignment_7 )* ) )
            // InternalSimpleSQL.g:753:2: ( ( rule__UPDATE__DataAssignment_7 ) ) ( ( rule__UPDATE__DataAssignment_7 )* )
            {
            // InternalSimpleSQL.g:753:2: ( ( rule__UPDATE__DataAssignment_7 ) )
            // InternalSimpleSQL.g:754:3: ( rule__UPDATE__DataAssignment_7 )
            {
             before(grammarAccess.getUPDATEAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:755:3: ( rule__UPDATE__DataAssignment_7 )
            // InternalSimpleSQL.g:755:4: rule__UPDATE__DataAssignment_7
            {
            pushFollow(FOLLOW_14);
            rule__UPDATE__DataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUPDATEAccess().getDataAssignment_7()); 

            }

            // InternalSimpleSQL.g:758:2: ( ( rule__UPDATE__DataAssignment_7 )* )
            // InternalSimpleSQL.g:759:3: ( rule__UPDATE__DataAssignment_7 )*
            {
             before(grammarAccess.getUPDATEAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:760:3: ( rule__UPDATE__DataAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleSQL.g:760:4: rule__UPDATE__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__UPDATE__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUPDATEAccess().getDataAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__7__Impl"


    // $ANTLR start "rule__UPDATE__Group__8"
    // InternalSimpleSQL.g:769:1: rule__UPDATE__Group__8 : rule__UPDATE__Group__8__Impl ;
    public final void rule__UPDATE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:773:1: ( rule__UPDATE__Group__8__Impl )
            // InternalSimpleSQL.g:774:2: rule__UPDATE__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__8"


    // $ANTLR start "rule__UPDATE__Group__8__Impl"
    // InternalSimpleSQL.g:780:1: rule__UPDATE__Group__8__Impl : ( ')' ) ;
    public final void rule__UPDATE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:784:1: ( ( ')' ) )
            // InternalSimpleSQL.g:785:1: ( ')' )
            {
            // InternalSimpleSQL.g:785:1: ( ')' )
            // InternalSimpleSQL.g:786:2: ')'
            {
             before(grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__Group__8__Impl"


    // $ANTLR start "rule__DELETE__Group__0"
    // InternalSimpleSQL.g:796:1: rule__DELETE__Group__0 : rule__DELETE__Group__0__Impl rule__DELETE__Group__1 ;
    public final void rule__DELETE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:800:1: ( rule__DELETE__Group__0__Impl rule__DELETE__Group__1 )
            // InternalSimpleSQL.g:801:2: rule__DELETE__Group__0__Impl rule__DELETE__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DELETE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__0"


    // $ANTLR start "rule__DELETE__Group__0__Impl"
    // InternalSimpleSQL.g:808:1: rule__DELETE__Group__0__Impl : ( 'delete' ) ;
    public final void rule__DELETE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:812:1: ( ( 'delete' ) )
            // InternalSimpleSQL.g:813:1: ( 'delete' )
            {
            // InternalSimpleSQL.g:813:1: ( 'delete' )
            // InternalSimpleSQL.g:814:2: 'delete'
            {
             before(grammarAccess.getDELETEAccess().getDeleteKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__0__Impl"


    // $ANTLR start "rule__DELETE__Group__1"
    // InternalSimpleSQL.g:823:1: rule__DELETE__Group__1 : rule__DELETE__Group__1__Impl rule__DELETE__Group__2 ;
    public final void rule__DELETE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:827:1: ( rule__DELETE__Group__1__Impl rule__DELETE__Group__2 )
            // InternalSimpleSQL.g:828:2: rule__DELETE__Group__1__Impl rule__DELETE__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DELETE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__1"


    // $ANTLR start "rule__DELETE__Group__1__Impl"
    // InternalSimpleSQL.g:835:1: rule__DELETE__Group__1__Impl : ( 'entry' ) ;
    public final void rule__DELETE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:839:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:840:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:840:1: ( 'entry' )
            // InternalSimpleSQL.g:841:2: 'entry'
            {
             before(grammarAccess.getDELETEAccess().getEntryKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getEntryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__1__Impl"


    // $ANTLR start "rule__DELETE__Group__2"
    // InternalSimpleSQL.g:850:1: rule__DELETE__Group__2 : rule__DELETE__Group__2__Impl rule__DELETE__Group__3 ;
    public final void rule__DELETE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:854:1: ( rule__DELETE__Group__2__Impl rule__DELETE__Group__3 )
            // InternalSimpleSQL.g:855:2: rule__DELETE__Group__2__Impl rule__DELETE__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DELETE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__2"


    // $ANTLR start "rule__DELETE__Group__2__Impl"
    // InternalSimpleSQL.g:862:1: rule__DELETE__Group__2__Impl : ( 'to' ) ;
    public final void rule__DELETE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:866:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:867:1: ( 'to' )
            {
            // InternalSimpleSQL.g:867:1: ( 'to' )
            // InternalSimpleSQL.g:868:2: 'to'
            {
             before(grammarAccess.getDELETEAccess().getToKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__2__Impl"


    // $ANTLR start "rule__DELETE__Group__3"
    // InternalSimpleSQL.g:877:1: rule__DELETE__Group__3 : rule__DELETE__Group__3__Impl rule__DELETE__Group__4 ;
    public final void rule__DELETE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:881:1: ( rule__DELETE__Group__3__Impl rule__DELETE__Group__4 )
            // InternalSimpleSQL.g:882:2: rule__DELETE__Group__3__Impl rule__DELETE__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DELETE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__3"


    // $ANTLR start "rule__DELETE__Group__3__Impl"
    // InternalSimpleSQL.g:889:1: rule__DELETE__Group__3__Impl : ( ( rule__DELETE__TableAssignment_3 ) ) ;
    public final void rule__DELETE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:893:1: ( ( ( rule__DELETE__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:894:1: ( ( rule__DELETE__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:894:1: ( ( rule__DELETE__TableAssignment_3 ) )
            // InternalSimpleSQL.g:895:2: ( rule__DELETE__TableAssignment_3 )
            {
             before(grammarAccess.getDELETEAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:896:2: ( rule__DELETE__TableAssignment_3 )
            // InternalSimpleSQL.g:896:3: rule__DELETE__TableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DELETE__TableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDELETEAccess().getTableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__3__Impl"


    // $ANTLR start "rule__DELETE__Group__4"
    // InternalSimpleSQL.g:904:1: rule__DELETE__Group__4 : rule__DELETE__Group__4__Impl rule__DELETE__Group__5 ;
    public final void rule__DELETE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:908:1: ( rule__DELETE__Group__4__Impl rule__DELETE__Group__5 )
            // InternalSimpleSQL.g:909:2: rule__DELETE__Group__4__Impl rule__DELETE__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__DELETE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__4"


    // $ANTLR start "rule__DELETE__Group__4__Impl"
    // InternalSimpleSQL.g:916:1: rule__DELETE__Group__4__Impl : ( 'with' ) ;
    public final void rule__DELETE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:920:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:921:1: ( 'with' )
            {
            // InternalSimpleSQL.g:921:1: ( 'with' )
            // InternalSimpleSQL.g:922:2: 'with'
            {
             before(grammarAccess.getDELETEAccess().getWithKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__4__Impl"


    // $ANTLR start "rule__DELETE__Group__5"
    // InternalSimpleSQL.g:931:1: rule__DELETE__Group__5 : rule__DELETE__Group__5__Impl rule__DELETE__Group__6 ;
    public final void rule__DELETE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:935:1: ( rule__DELETE__Group__5__Impl rule__DELETE__Group__6 )
            // InternalSimpleSQL.g:936:2: rule__DELETE__Group__5__Impl rule__DELETE__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__DELETE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__5"


    // $ANTLR start "rule__DELETE__Group__5__Impl"
    // InternalSimpleSQL.g:943:1: rule__DELETE__Group__5__Impl : ( 'data' ) ;
    public final void rule__DELETE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:947:1: ( ( 'data' ) )
            // InternalSimpleSQL.g:948:1: ( 'data' )
            {
            // InternalSimpleSQL.g:948:1: ( 'data' )
            // InternalSimpleSQL.g:949:2: 'data'
            {
             before(grammarAccess.getDELETEAccess().getDataKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getDataKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__5__Impl"


    // $ANTLR start "rule__DELETE__Group__6"
    // InternalSimpleSQL.g:958:1: rule__DELETE__Group__6 : rule__DELETE__Group__6__Impl rule__DELETE__Group__7 ;
    public final void rule__DELETE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:962:1: ( rule__DELETE__Group__6__Impl rule__DELETE__Group__7 )
            // InternalSimpleSQL.g:963:2: rule__DELETE__Group__6__Impl rule__DELETE__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__DELETE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__6"


    // $ANTLR start "rule__DELETE__Group__6__Impl"
    // InternalSimpleSQL.g:970:1: rule__DELETE__Group__6__Impl : ( '(' ) ;
    public final void rule__DELETE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:974:1: ( ( '(' ) )
            // InternalSimpleSQL.g:975:1: ( '(' )
            {
            // InternalSimpleSQL.g:975:1: ( '(' )
            // InternalSimpleSQL.g:976:2: '('
            {
             before(grammarAccess.getDELETEAccess().getLeftParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__6__Impl"


    // $ANTLR start "rule__DELETE__Group__7"
    // InternalSimpleSQL.g:985:1: rule__DELETE__Group__7 : rule__DELETE__Group__7__Impl rule__DELETE__Group__8 ;
    public final void rule__DELETE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:989:1: ( rule__DELETE__Group__7__Impl rule__DELETE__Group__8 )
            // InternalSimpleSQL.g:990:2: rule__DELETE__Group__7__Impl rule__DELETE__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__DELETE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DELETE__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__7"


    // $ANTLR start "rule__DELETE__Group__7__Impl"
    // InternalSimpleSQL.g:997:1: rule__DELETE__Group__7__Impl : ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) ) ;
    public final void rule__DELETE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1001:1: ( ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) ) )
            // InternalSimpleSQL.g:1002:1: ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) )
            {
            // InternalSimpleSQL.g:1002:1: ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) )
            // InternalSimpleSQL.g:1003:2: ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* )
            {
            // InternalSimpleSQL.g:1003:2: ( ( rule__DELETE__DataAssignment_7 ) )
            // InternalSimpleSQL.g:1004:3: ( rule__DELETE__DataAssignment_7 )
            {
             before(grammarAccess.getDELETEAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:1005:3: ( rule__DELETE__DataAssignment_7 )
            // InternalSimpleSQL.g:1005:4: rule__DELETE__DataAssignment_7
            {
            pushFollow(FOLLOW_14);
            rule__DELETE__DataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDELETEAccess().getDataAssignment_7()); 

            }

            // InternalSimpleSQL.g:1008:2: ( ( rule__DELETE__DataAssignment_7 )* )
            // InternalSimpleSQL.g:1009:3: ( rule__DELETE__DataAssignment_7 )*
            {
             before(grammarAccess.getDELETEAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:1010:3: ( rule__DELETE__DataAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleSQL.g:1010:4: rule__DELETE__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DELETE__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDELETEAccess().getDataAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__7__Impl"


    // $ANTLR start "rule__DELETE__Group__8"
    // InternalSimpleSQL.g:1019:1: rule__DELETE__Group__8 : rule__DELETE__Group__8__Impl ;
    public final void rule__DELETE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1023:1: ( rule__DELETE__Group__8__Impl )
            // InternalSimpleSQL.g:1024:2: rule__DELETE__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DELETE__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__8"


    // $ANTLR start "rule__DELETE__Group__8__Impl"
    // InternalSimpleSQL.g:1030:1: rule__DELETE__Group__8__Impl : ( ')' ) ;
    public final void rule__DELETE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1034:1: ( ( ')' ) )
            // InternalSimpleSQL.g:1035:1: ( ')' )
            {
            // InternalSimpleSQL.g:1035:1: ( ')' )
            // InternalSimpleSQL.g:1036:2: ')'
            {
             before(grammarAccess.getDELETEAccess().getRightParenthesisKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__Group__8__Impl"


    // $ANTLR start "rule__CREATE_DB__Group__0"
    // InternalSimpleSQL.g:1046:1: rule__CREATE_DB__Group__0 : rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1 ;
    public final void rule__CREATE_DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1050:1: ( rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1 )
            // InternalSimpleSQL.g:1051:2: rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CREATE_DB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_DB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__0"


    // $ANTLR start "rule__CREATE_DB__Group__0__Impl"
    // InternalSimpleSQL.g:1058:1: rule__CREATE_DB__Group__0__Impl : ( 'create' ) ;
    public final void rule__CREATE_DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1062:1: ( ( 'create' ) )
            // InternalSimpleSQL.g:1063:1: ( 'create' )
            {
            // InternalSimpleSQL.g:1063:1: ( 'create' )
            // InternalSimpleSQL.g:1064:2: 'create'
            {
             before(grammarAccess.getCREATE_DBAccess().getCreateKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCREATE_DBAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__0__Impl"


    // $ANTLR start "rule__CREATE_DB__Group__1"
    // InternalSimpleSQL.g:1073:1: rule__CREATE_DB__Group__1 : rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2 ;
    public final void rule__CREATE_DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1077:1: ( rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2 )
            // InternalSimpleSQL.g:1078:2: rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CREATE_DB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_DB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__1"


    // $ANTLR start "rule__CREATE_DB__Group__1__Impl"
    // InternalSimpleSQL.g:1085:1: rule__CREATE_DB__Group__1__Impl : ( 'new' ) ;
    public final void rule__CREATE_DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1089:1: ( ( 'new' ) )
            // InternalSimpleSQL.g:1090:1: ( 'new' )
            {
            // InternalSimpleSQL.g:1090:1: ( 'new' )
            // InternalSimpleSQL.g:1091:2: 'new'
            {
             before(grammarAccess.getCREATE_DBAccess().getNewKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCREATE_DBAccess().getNewKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__1__Impl"


    // $ANTLR start "rule__CREATE_DB__Group__2"
    // InternalSimpleSQL.g:1100:1: rule__CREATE_DB__Group__2 : rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3 ;
    public final void rule__CREATE_DB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1104:1: ( rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3 )
            // InternalSimpleSQL.g:1105:2: rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CREATE_DB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_DB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__2"


    // $ANTLR start "rule__CREATE_DB__Group__2__Impl"
    // InternalSimpleSQL.g:1112:1: rule__CREATE_DB__Group__2__Impl : ( 'database' ) ;
    public final void rule__CREATE_DB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1116:1: ( ( 'database' ) )
            // InternalSimpleSQL.g:1117:1: ( 'database' )
            {
            // InternalSimpleSQL.g:1117:1: ( 'database' )
            // InternalSimpleSQL.g:1118:2: 'database'
            {
             before(grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__2__Impl"


    // $ANTLR start "rule__CREATE_DB__Group__3"
    // InternalSimpleSQL.g:1127:1: rule__CREATE_DB__Group__3 : rule__CREATE_DB__Group__3__Impl ;
    public final void rule__CREATE_DB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1131:1: ( rule__CREATE_DB__Group__3__Impl )
            // InternalSimpleSQL.g:1132:2: rule__CREATE_DB__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_DB__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__3"


    // $ANTLR start "rule__CREATE_DB__Group__3__Impl"
    // InternalSimpleSQL.g:1138:1: rule__CREATE_DB__Group__3__Impl : ( ( rule__CREATE_DB__NameAssignment_3 ) ) ;
    public final void rule__CREATE_DB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1142:1: ( ( ( rule__CREATE_DB__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:1143:1: ( ( rule__CREATE_DB__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1143:1: ( ( rule__CREATE_DB__NameAssignment_3 ) )
            // InternalSimpleSQL.g:1144:2: ( rule__CREATE_DB__NameAssignment_3 )
            {
             before(grammarAccess.getCREATE_DBAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:1145:2: ( rule__CREATE_DB__NameAssignment_3 )
            // InternalSimpleSQL.g:1145:3: rule__CREATE_DB__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_DB__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_DBAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__Group__3__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__0"
    // InternalSimpleSQL.g:1154:1: rule__CREATE_TABLE__Group__0 : rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1 ;
    public final void rule__CREATE_TABLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1158:1: ( rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1 )
            // InternalSimpleSQL.g:1159:2: rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CREATE_TABLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__0"


    // $ANTLR start "rule__CREATE_TABLE__Group__0__Impl"
    // InternalSimpleSQL.g:1166:1: rule__CREATE_TABLE__Group__0__Impl : ( 'create' ) ;
    public final void rule__CREATE_TABLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1170:1: ( ( 'create' ) )
            // InternalSimpleSQL.g:1171:1: ( 'create' )
            {
            // InternalSimpleSQL.g:1171:1: ( 'create' )
            // InternalSimpleSQL.g:1172:2: 'create'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__0__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__1"
    // InternalSimpleSQL.g:1181:1: rule__CREATE_TABLE__Group__1 : rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2 ;
    public final void rule__CREATE_TABLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1185:1: ( rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2 )
            // InternalSimpleSQL.g:1186:2: rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CREATE_TABLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__1"


    // $ANTLR start "rule__CREATE_TABLE__Group__1__Impl"
    // InternalSimpleSQL.g:1193:1: rule__CREATE_TABLE__Group__1__Impl : ( 'new' ) ;
    public final void rule__CREATE_TABLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1197:1: ( ( 'new' ) )
            // InternalSimpleSQL.g:1198:1: ( 'new' )
            {
            // InternalSimpleSQL.g:1198:1: ( 'new' )
            // InternalSimpleSQL.g:1199:2: 'new'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__1__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__2"
    // InternalSimpleSQL.g:1208:1: rule__CREATE_TABLE__Group__2 : rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3 ;
    public final void rule__CREATE_TABLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1212:1: ( rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3 )
            // InternalSimpleSQL.g:1213:2: rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CREATE_TABLE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__2"


    // $ANTLR start "rule__CREATE_TABLE__Group__2__Impl"
    // InternalSimpleSQL.g:1220:1: rule__CREATE_TABLE__Group__2__Impl : ( 'table' ) ;
    public final void rule__CREATE_TABLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1224:1: ( ( 'table' ) )
            // InternalSimpleSQL.g:1225:1: ( 'table' )
            {
            // InternalSimpleSQL.g:1225:1: ( 'table' )
            // InternalSimpleSQL.g:1226:2: 'table'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__2__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__3"
    // InternalSimpleSQL.g:1235:1: rule__CREATE_TABLE__Group__3 : rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4 ;
    public final void rule__CREATE_TABLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1239:1: ( rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4 )
            // InternalSimpleSQL.g:1240:2: rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CREATE_TABLE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__3"


    // $ANTLR start "rule__CREATE_TABLE__Group__3__Impl"
    // InternalSimpleSQL.g:1247:1: rule__CREATE_TABLE__Group__3__Impl : ( ( rule__CREATE_TABLE__NameAssignment_3 ) ) ;
    public final void rule__CREATE_TABLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1251:1: ( ( ( rule__CREATE_TABLE__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:1252:1: ( ( rule__CREATE_TABLE__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1252:1: ( ( rule__CREATE_TABLE__NameAssignment_3 ) )
            // InternalSimpleSQL.g:1253:2: ( rule__CREATE_TABLE__NameAssignment_3 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:1254:2: ( rule__CREATE_TABLE__NameAssignment_3 )
            // InternalSimpleSQL.g:1254:3: rule__CREATE_TABLE__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__3__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__4"
    // InternalSimpleSQL.g:1262:1: rule__CREATE_TABLE__Group__4 : rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5 ;
    public final void rule__CREATE_TABLE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1266:1: ( rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5 )
            // InternalSimpleSQL.g:1267:2: rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CREATE_TABLE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__4"


    // $ANTLR start "rule__CREATE_TABLE__Group__4__Impl"
    // InternalSimpleSQL.g:1274:1: rule__CREATE_TABLE__Group__4__Impl : ( 'in' ) ;
    public final void rule__CREATE_TABLE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1278:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:1279:1: ( 'in' )
            {
            // InternalSimpleSQL.g:1279:1: ( 'in' )
            // InternalSimpleSQL.g:1280:2: 'in'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getInKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__4__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__5"
    // InternalSimpleSQL.g:1289:1: rule__CREATE_TABLE__Group__5 : rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6 ;
    public final void rule__CREATE_TABLE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1293:1: ( rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6 )
            // InternalSimpleSQL.g:1294:2: rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__CREATE_TABLE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__5"


    // $ANTLR start "rule__CREATE_TABLE__Group__5__Impl"
    // InternalSimpleSQL.g:1301:1: rule__CREATE_TABLE__Group__5__Impl : ( ( rule__CREATE_TABLE__DbAssignment_5 ) ) ;
    public final void rule__CREATE_TABLE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1305:1: ( ( ( rule__CREATE_TABLE__DbAssignment_5 ) ) )
            // InternalSimpleSQL.g:1306:1: ( ( rule__CREATE_TABLE__DbAssignment_5 ) )
            {
            // InternalSimpleSQL.g:1306:1: ( ( rule__CREATE_TABLE__DbAssignment_5 ) )
            // InternalSimpleSQL.g:1307:2: ( rule__CREATE_TABLE__DbAssignment_5 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbAssignment_5()); 
            // InternalSimpleSQL.g:1308:2: ( rule__CREATE_TABLE__DbAssignment_5 )
            // InternalSimpleSQL.g:1308:3: rule__CREATE_TABLE__DbAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__DbAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getDbAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__5__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__6"
    // InternalSimpleSQL.g:1316:1: rule__CREATE_TABLE__Group__6 : rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7 ;
    public final void rule__CREATE_TABLE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1320:1: ( rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7 )
            // InternalSimpleSQL.g:1321:2: rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__CREATE_TABLE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__6"


    // $ANTLR start "rule__CREATE_TABLE__Group__6__Impl"
    // InternalSimpleSQL.g:1328:1: rule__CREATE_TABLE__Group__6__Impl : ( 'with' ) ;
    public final void rule__CREATE_TABLE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1332:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:1333:1: ( 'with' )
            {
            // InternalSimpleSQL.g:1333:1: ( 'with' )
            // InternalSimpleSQL.g:1334:2: 'with'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__6__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__7"
    // InternalSimpleSQL.g:1343:1: rule__CREATE_TABLE__Group__7 : rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8 ;
    public final void rule__CREATE_TABLE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1347:1: ( rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8 )
            // InternalSimpleSQL.g:1348:2: rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__CREATE_TABLE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__7"


    // $ANTLR start "rule__CREATE_TABLE__Group__7__Impl"
    // InternalSimpleSQL.g:1355:1: rule__CREATE_TABLE__Group__7__Impl : ( 'columns' ) ;
    public final void rule__CREATE_TABLE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1359:1: ( ( 'columns' ) )
            // InternalSimpleSQL.g:1360:1: ( 'columns' )
            {
            // InternalSimpleSQL.g:1360:1: ( 'columns' )
            // InternalSimpleSQL.g:1361:2: 'columns'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__7__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__8"
    // InternalSimpleSQL.g:1370:1: rule__CREATE_TABLE__Group__8 : rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9 ;
    public final void rule__CREATE_TABLE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1374:1: ( rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9 )
            // InternalSimpleSQL.g:1375:2: rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__CREATE_TABLE__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__8"


    // $ANTLR start "rule__CREATE_TABLE__Group__8__Impl"
    // InternalSimpleSQL.g:1382:1: rule__CREATE_TABLE__Group__8__Impl : ( '(' ) ;
    public final void rule__CREATE_TABLE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1386:1: ( ( '(' ) )
            // InternalSimpleSQL.g:1387:1: ( '(' )
            {
            // InternalSimpleSQL.g:1387:1: ( '(' )
            // InternalSimpleSQL.g:1388:2: '('
            {
             before(grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__8__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__9"
    // InternalSimpleSQL.g:1397:1: rule__CREATE_TABLE__Group__9 : rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10 ;
    public final void rule__CREATE_TABLE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1401:1: ( rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10 )
            // InternalSimpleSQL.g:1402:2: rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__CREATE_TABLE__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__9"


    // $ANTLR start "rule__CREATE_TABLE__Group__9__Impl"
    // InternalSimpleSQL.g:1409:1: rule__CREATE_TABLE__Group__9__Impl : ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) ) ;
    public final void rule__CREATE_TABLE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1413:1: ( ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) ) )
            // InternalSimpleSQL.g:1414:1: ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) )
            {
            // InternalSimpleSQL.g:1414:1: ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) )
            // InternalSimpleSQL.g:1415:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* )
            {
            // InternalSimpleSQL.g:1415:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) )
            // InternalSimpleSQL.g:1416:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:1417:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )
            // InternalSimpleSQL.g:1417:4: rule__CREATE_TABLE__ColumnsAssignment_9
            {
            pushFollow(FOLLOW_19);
            rule__CREATE_TABLE__ColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 

            }

            // InternalSimpleSQL.g:1420:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* )
            // InternalSimpleSQL.g:1421:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )*
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:1422:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleSQL.g:1422:4: rule__CREATE_TABLE__ColumnsAssignment_9
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__CREATE_TABLE__ColumnsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__9__Impl"


    // $ANTLR start "rule__CREATE_TABLE__Group__10"
    // InternalSimpleSQL.g:1431:1: rule__CREATE_TABLE__Group__10 : rule__CREATE_TABLE__Group__10__Impl ;
    public final void rule__CREATE_TABLE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1435:1: ( rule__CREATE_TABLE__Group__10__Impl )
            // InternalSimpleSQL.g:1436:2: rule__CREATE_TABLE__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__10"


    // $ANTLR start "rule__CREATE_TABLE__Group__10__Impl"
    // InternalSimpleSQL.g:1442:1: rule__CREATE_TABLE__Group__10__Impl : ( ')' ) ;
    public final void rule__CREATE_TABLE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1446:1: ( ( ')' ) )
            // InternalSimpleSQL.g:1447:1: ( ')' )
            {
            // InternalSimpleSQL.g:1447:1: ( ')' )
            // InternalSimpleSQL.g:1448:2: ')'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__Group__10__Impl"


    // $ANTLR start "rule__COLUMN_DEF__Group__0"
    // InternalSimpleSQL.g:1458:1: rule__COLUMN_DEF__Group__0 : rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1 ;
    public final void rule__COLUMN_DEF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1462:1: ( rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1 )
            // InternalSimpleSQL.g:1463:2: rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__COLUMN_DEF__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__0"


    // $ANTLR start "rule__COLUMN_DEF__Group__0__Impl"
    // InternalSimpleSQL.g:1470:1: rule__COLUMN_DEF__Group__0__Impl : ( ( rule__COLUMN_DEF__NameAssignment_0 ) ) ;
    public final void rule__COLUMN_DEF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1474:1: ( ( ( rule__COLUMN_DEF__NameAssignment_0 ) ) )
            // InternalSimpleSQL.g:1475:1: ( ( rule__COLUMN_DEF__NameAssignment_0 ) )
            {
            // InternalSimpleSQL.g:1475:1: ( ( rule__COLUMN_DEF__NameAssignment_0 ) )
            // InternalSimpleSQL.g:1476:2: ( rule__COLUMN_DEF__NameAssignment_0 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getNameAssignment_0()); 
            // InternalSimpleSQL.g:1477:2: ( rule__COLUMN_DEF__NameAssignment_0 )
            // InternalSimpleSQL.g:1477:3: rule__COLUMN_DEF__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCOLUMN_DEFAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__0__Impl"


    // $ANTLR start "rule__COLUMN_DEF__Group__1"
    // InternalSimpleSQL.g:1485:1: rule__COLUMN_DEF__Group__1 : rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2 ;
    public final void rule__COLUMN_DEF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1489:1: ( rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2 )
            // InternalSimpleSQL.g:1490:2: rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__COLUMN_DEF__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__1"


    // $ANTLR start "rule__COLUMN_DEF__Group__1__Impl"
    // InternalSimpleSQL.g:1497:1: rule__COLUMN_DEF__Group__1__Impl : ( 'with' ) ;
    public final void rule__COLUMN_DEF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1501:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:1502:1: ( 'with' )
            {
            // InternalSimpleSQL.g:1502:1: ( 'with' )
            // InternalSimpleSQL.g:1503:2: 'with'
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__1__Impl"


    // $ANTLR start "rule__COLUMN_DEF__Group__2"
    // InternalSimpleSQL.g:1512:1: rule__COLUMN_DEF__Group__2 : rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3 ;
    public final void rule__COLUMN_DEF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1516:1: ( rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3 )
            // InternalSimpleSQL.g:1517:2: rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__COLUMN_DEF__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__2"


    // $ANTLR start "rule__COLUMN_DEF__Group__2__Impl"
    // InternalSimpleSQL.g:1524:1: rule__COLUMN_DEF__Group__2__Impl : ( 'type' ) ;
    public final void rule__COLUMN_DEF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1528:1: ( ( 'type' ) )
            // InternalSimpleSQL.g:1529:1: ( 'type' )
            {
            // InternalSimpleSQL.g:1529:1: ( 'type' )
            // InternalSimpleSQL.g:1530:2: 'type'
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__2__Impl"


    // $ANTLR start "rule__COLUMN_DEF__Group__3"
    // InternalSimpleSQL.g:1539:1: rule__COLUMN_DEF__Group__3 : rule__COLUMN_DEF__Group__3__Impl ;
    public final void rule__COLUMN_DEF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1543:1: ( rule__COLUMN_DEF__Group__3__Impl )
            // InternalSimpleSQL.g:1544:2: rule__COLUMN_DEF__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__3"


    // $ANTLR start "rule__COLUMN_DEF__Group__3__Impl"
    // InternalSimpleSQL.g:1550:1: rule__COLUMN_DEF__Group__3__Impl : ( ( rule__COLUMN_DEF__TypeAssignment_3 ) ) ;
    public final void rule__COLUMN_DEF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1554:1: ( ( ( rule__COLUMN_DEF__TypeAssignment_3 ) ) )
            // InternalSimpleSQL.g:1555:1: ( ( rule__COLUMN_DEF__TypeAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1555:1: ( ( rule__COLUMN_DEF__TypeAssignment_3 ) )
            // InternalSimpleSQL.g:1556:2: ( rule__COLUMN_DEF__TypeAssignment_3 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeAssignment_3()); 
            // InternalSimpleSQL.g:1557:2: ( rule__COLUMN_DEF__TypeAssignment_3 )
            // InternalSimpleSQL.g:1557:3: rule__COLUMN_DEF__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__COLUMN_DEF__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCOLUMN_DEFAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__Group__3__Impl"


    // $ANTLR start "rule__INSERT__Group__0"
    // InternalSimpleSQL.g:1566:1: rule__INSERT__Group__0 : rule__INSERT__Group__0__Impl rule__INSERT__Group__1 ;
    public final void rule__INSERT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1570:1: ( rule__INSERT__Group__0__Impl rule__INSERT__Group__1 )
            // InternalSimpleSQL.g:1571:2: rule__INSERT__Group__0__Impl rule__INSERT__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__INSERT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__0"


    // $ANTLR start "rule__INSERT__Group__0__Impl"
    // InternalSimpleSQL.g:1578:1: rule__INSERT__Group__0__Impl : ( 'add' ) ;
    public final void rule__INSERT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1582:1: ( ( 'add' ) )
            // InternalSimpleSQL.g:1583:1: ( 'add' )
            {
            // InternalSimpleSQL.g:1583:1: ( 'add' )
            // InternalSimpleSQL.g:1584:2: 'add'
            {
             before(grammarAccess.getINSERTAccess().getAddKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__0__Impl"


    // $ANTLR start "rule__INSERT__Group__1"
    // InternalSimpleSQL.g:1593:1: rule__INSERT__Group__1 : rule__INSERT__Group__1__Impl rule__INSERT__Group__2 ;
    public final void rule__INSERT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1597:1: ( rule__INSERT__Group__1__Impl rule__INSERT__Group__2 )
            // InternalSimpleSQL.g:1598:2: rule__INSERT__Group__1__Impl rule__INSERT__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__INSERT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__1"


    // $ANTLR start "rule__INSERT__Group__1__Impl"
    // InternalSimpleSQL.g:1605:1: rule__INSERT__Group__1__Impl : ( 'entry' ) ;
    public final void rule__INSERT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1609:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:1610:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:1610:1: ( 'entry' )
            // InternalSimpleSQL.g:1611:2: 'entry'
            {
             before(grammarAccess.getINSERTAccess().getEntryKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getEntryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__1__Impl"


    // $ANTLR start "rule__INSERT__Group__2"
    // InternalSimpleSQL.g:1620:1: rule__INSERT__Group__2 : rule__INSERT__Group__2__Impl rule__INSERT__Group__3 ;
    public final void rule__INSERT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1624:1: ( rule__INSERT__Group__2__Impl rule__INSERT__Group__3 )
            // InternalSimpleSQL.g:1625:2: rule__INSERT__Group__2__Impl rule__INSERT__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__INSERT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__2"


    // $ANTLR start "rule__INSERT__Group__2__Impl"
    // InternalSimpleSQL.g:1632:1: rule__INSERT__Group__2__Impl : ( 'to' ) ;
    public final void rule__INSERT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1636:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:1637:1: ( 'to' )
            {
            // InternalSimpleSQL.g:1637:1: ( 'to' )
            // InternalSimpleSQL.g:1638:2: 'to'
            {
             before(grammarAccess.getINSERTAccess().getToKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__2__Impl"


    // $ANTLR start "rule__INSERT__Group__3"
    // InternalSimpleSQL.g:1647:1: rule__INSERT__Group__3 : rule__INSERT__Group__3__Impl rule__INSERT__Group__4 ;
    public final void rule__INSERT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1651:1: ( rule__INSERT__Group__3__Impl rule__INSERT__Group__4 )
            // InternalSimpleSQL.g:1652:2: rule__INSERT__Group__3__Impl rule__INSERT__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__INSERT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__3"


    // $ANTLR start "rule__INSERT__Group__3__Impl"
    // InternalSimpleSQL.g:1659:1: rule__INSERT__Group__3__Impl : ( ( rule__INSERT__TableAssignment_3 ) ) ;
    public final void rule__INSERT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1663:1: ( ( ( rule__INSERT__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:1664:1: ( ( rule__INSERT__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1664:1: ( ( rule__INSERT__TableAssignment_3 ) )
            // InternalSimpleSQL.g:1665:2: ( rule__INSERT__TableAssignment_3 )
            {
             before(grammarAccess.getINSERTAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:1666:2: ( rule__INSERT__TableAssignment_3 )
            // InternalSimpleSQL.g:1666:3: rule__INSERT__TableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__TableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getINSERTAccess().getTableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__3__Impl"


    // $ANTLR start "rule__INSERT__Group__4"
    // InternalSimpleSQL.g:1674:1: rule__INSERT__Group__4 : rule__INSERT__Group__4__Impl rule__INSERT__Group__5 ;
    public final void rule__INSERT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1678:1: ( rule__INSERT__Group__4__Impl rule__INSERT__Group__5 )
            // InternalSimpleSQL.g:1679:2: rule__INSERT__Group__4__Impl rule__INSERT__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__INSERT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__4"


    // $ANTLR start "rule__INSERT__Group__4__Impl"
    // InternalSimpleSQL.g:1686:1: rule__INSERT__Group__4__Impl : ( 'with' ) ;
    public final void rule__INSERT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1690:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:1691:1: ( 'with' )
            {
            // InternalSimpleSQL.g:1691:1: ( 'with' )
            // InternalSimpleSQL.g:1692:2: 'with'
            {
             before(grammarAccess.getINSERTAccess().getWithKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__4__Impl"


    // $ANTLR start "rule__INSERT__Group__5"
    // InternalSimpleSQL.g:1701:1: rule__INSERT__Group__5 : rule__INSERT__Group__5__Impl rule__INSERT__Group__6 ;
    public final void rule__INSERT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1705:1: ( rule__INSERT__Group__5__Impl rule__INSERT__Group__6 )
            // InternalSimpleSQL.g:1706:2: rule__INSERT__Group__5__Impl rule__INSERT__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__INSERT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__5"


    // $ANTLR start "rule__INSERT__Group__5__Impl"
    // InternalSimpleSQL.g:1713:1: rule__INSERT__Group__5__Impl : ( 'data' ) ;
    public final void rule__INSERT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1717:1: ( ( 'data' ) )
            // InternalSimpleSQL.g:1718:1: ( 'data' )
            {
            // InternalSimpleSQL.g:1718:1: ( 'data' )
            // InternalSimpleSQL.g:1719:2: 'data'
            {
             before(grammarAccess.getINSERTAccess().getDataKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getDataKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__5__Impl"


    // $ANTLR start "rule__INSERT__Group__6"
    // InternalSimpleSQL.g:1728:1: rule__INSERT__Group__6 : rule__INSERT__Group__6__Impl rule__INSERT__Group__7 ;
    public final void rule__INSERT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1732:1: ( rule__INSERT__Group__6__Impl rule__INSERT__Group__7 )
            // InternalSimpleSQL.g:1733:2: rule__INSERT__Group__6__Impl rule__INSERT__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__INSERT__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__6"


    // $ANTLR start "rule__INSERT__Group__6__Impl"
    // InternalSimpleSQL.g:1740:1: rule__INSERT__Group__6__Impl : ( '(' ) ;
    public final void rule__INSERT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1744:1: ( ( '(' ) )
            // InternalSimpleSQL.g:1745:1: ( '(' )
            {
            // InternalSimpleSQL.g:1745:1: ( '(' )
            // InternalSimpleSQL.g:1746:2: '('
            {
             before(grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__6__Impl"


    // $ANTLR start "rule__INSERT__Group__7"
    // InternalSimpleSQL.g:1755:1: rule__INSERT__Group__7 : rule__INSERT__Group__7__Impl rule__INSERT__Group__8 ;
    public final void rule__INSERT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1759:1: ( rule__INSERT__Group__7__Impl rule__INSERT__Group__8 )
            // InternalSimpleSQL.g:1760:2: rule__INSERT__Group__7__Impl rule__INSERT__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__INSERT__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSERT__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__7"


    // $ANTLR start "rule__INSERT__Group__7__Impl"
    // InternalSimpleSQL.g:1767:1: rule__INSERT__Group__7__Impl : ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) ) ;
    public final void rule__INSERT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1771:1: ( ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) ) )
            // InternalSimpleSQL.g:1772:1: ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) )
            {
            // InternalSimpleSQL.g:1772:1: ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) )
            // InternalSimpleSQL.g:1773:2: ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* )
            {
            // InternalSimpleSQL.g:1773:2: ( ( rule__INSERT__DataAssignment_7 ) )
            // InternalSimpleSQL.g:1774:3: ( rule__INSERT__DataAssignment_7 )
            {
             before(grammarAccess.getINSERTAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:1775:3: ( rule__INSERT__DataAssignment_7 )
            // InternalSimpleSQL.g:1775:4: rule__INSERT__DataAssignment_7
            {
            pushFollow(FOLLOW_14);
            rule__INSERT__DataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getINSERTAccess().getDataAssignment_7()); 

            }

            // InternalSimpleSQL.g:1778:2: ( ( rule__INSERT__DataAssignment_7 )* )
            // InternalSimpleSQL.g:1779:3: ( rule__INSERT__DataAssignment_7 )*
            {
             before(grammarAccess.getINSERTAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:1780:3: ( rule__INSERT__DataAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleSQL.g:1780:4: rule__INSERT__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__INSERT__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getINSERTAccess().getDataAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__7__Impl"


    // $ANTLR start "rule__INSERT__Group__8"
    // InternalSimpleSQL.g:1789:1: rule__INSERT__Group__8 : rule__INSERT__Group__8__Impl ;
    public final void rule__INSERT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1793:1: ( rule__INSERT__Group__8__Impl )
            // InternalSimpleSQL.g:1794:2: rule__INSERT__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__8"


    // $ANTLR start "rule__INSERT__Group__8__Impl"
    // InternalSimpleSQL.g:1800:1: rule__INSERT__Group__8__Impl : ( ')' ) ;
    public final void rule__INSERT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1804:1: ( ( ')' ) )
            // InternalSimpleSQL.g:1805:1: ( ')' )
            {
            // InternalSimpleSQL.g:1805:1: ( ')' )
            // InternalSimpleSQL.g:1806:2: ')'
            {
             before(grammarAccess.getINSERTAccess().getRightParenthesisKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__Group__8__Impl"


    // $ANTLR start "rule__Insert_List__Group_0__0"
    // InternalSimpleSQL.g:1816:1: rule__Insert_List__Group_0__0 : rule__Insert_List__Group_0__0__Impl rule__Insert_List__Group_0__1 ;
    public final void rule__Insert_List__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1820:1: ( rule__Insert_List__Group_0__0__Impl rule__Insert_List__Group_0__1 )
            // InternalSimpleSQL.g:1821:2: rule__Insert_List__Group_0__0__Impl rule__Insert_List__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Insert_List__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert_List__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_0__0"


    // $ANTLR start "rule__Insert_List__Group_0__0__Impl"
    // InternalSimpleSQL.g:1828:1: rule__Insert_List__Group_0__0__Impl : ( '\"' ) ;
    public final void rule__Insert_List__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1832:1: ( ( '\"' ) )
            // InternalSimpleSQL.g:1833:1: ( '\"' )
            {
            // InternalSimpleSQL.g:1833:1: ( '\"' )
            // InternalSimpleSQL.g:1834:2: '\"'
            {
             before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_0__0__Impl"


    // $ANTLR start "rule__Insert_List__Group_0__1"
    // InternalSimpleSQL.g:1843:1: rule__Insert_List__Group_0__1 : rule__Insert_List__Group_0__1__Impl ;
    public final void rule__Insert_List__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1847:1: ( rule__Insert_List__Group_0__1__Impl )
            // InternalSimpleSQL.g:1848:2: rule__Insert_List__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_0__1"


    // $ANTLR start "rule__Insert_List__Group_0__1__Impl"
    // InternalSimpleSQL.g:1854:1: rule__Insert_List__Group_0__1__Impl : ( ( rule__Insert_List__DataAssignment_0_1 ) ) ;
    public final void rule__Insert_List__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1858:1: ( ( ( rule__Insert_List__DataAssignment_0_1 ) ) )
            // InternalSimpleSQL.g:1859:1: ( ( rule__Insert_List__DataAssignment_0_1 ) )
            {
            // InternalSimpleSQL.g:1859:1: ( ( rule__Insert_List__DataAssignment_0_1 ) )
            // InternalSimpleSQL.g:1860:2: ( rule__Insert_List__DataAssignment_0_1 )
            {
             before(grammarAccess.getInsert_ListAccess().getDataAssignment_0_1()); 
            // InternalSimpleSQL.g:1861:2: ( rule__Insert_List__DataAssignment_0_1 )
            // InternalSimpleSQL.g:1861:3: rule__Insert_List__DataAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__DataAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInsert_ListAccess().getDataAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_0__1__Impl"


    // $ANTLR start "rule__Insert_List__Group_1__0"
    // InternalSimpleSQL.g:1870:1: rule__Insert_List__Group_1__0 : rule__Insert_List__Group_1__0__Impl rule__Insert_List__Group_1__1 ;
    public final void rule__Insert_List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1874:1: ( rule__Insert_List__Group_1__0__Impl rule__Insert_List__Group_1__1 )
            // InternalSimpleSQL.g:1875:2: rule__Insert_List__Group_1__0__Impl rule__Insert_List__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Insert_List__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert_List__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_1__0"


    // $ANTLR start "rule__Insert_List__Group_1__0__Impl"
    // InternalSimpleSQL.g:1882:1: rule__Insert_List__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Insert_List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1886:1: ( ( RULE_INT ) )
            // InternalSimpleSQL.g:1887:1: ( RULE_INT )
            {
            // InternalSimpleSQL.g:1887:1: ( RULE_INT )
            // InternalSimpleSQL.g:1888:2: RULE_INT
            {
             before(grammarAccess.getInsert_ListAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_1__0__Impl"


    // $ANTLR start "rule__Insert_List__Group_1__1"
    // InternalSimpleSQL.g:1897:1: rule__Insert_List__Group_1__1 : rule__Insert_List__Group_1__1__Impl ;
    public final void rule__Insert_List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1901:1: ( rule__Insert_List__Group_1__1__Impl )
            // InternalSimpleSQL.g:1902:2: rule__Insert_List__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_1__1"


    // $ANTLR start "rule__Insert_List__Group_1__1__Impl"
    // InternalSimpleSQL.g:1908:1: rule__Insert_List__Group_1__1__Impl : ( '\"' ) ;
    public final void rule__Insert_List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1912:1: ( ( '\"' ) )
            // InternalSimpleSQL.g:1913:1: ( '\"' )
            {
            // InternalSimpleSQL.g:1913:1: ( '\"' )
            // InternalSimpleSQL.g:1914:2: '\"'
            {
             before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__Group_1__1__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSimpleSQL.g:1924:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1928:1: ( ( ruleStatement ) )
            // InternalSimpleSQL.g:1929:2: ( ruleStatement )
            {
            // InternalSimpleSQL.g:1929:2: ( ruleStatement )
            // InternalSimpleSQL.g:1930:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__SELECT__NameAssignment_1_0"
    // InternalSimpleSQL.g:1939:1: rule__SELECT__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__SELECT__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1943:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1944:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1944:2: ( RULE_ID )
            // InternalSimpleSQL.g:1945:3: RULE_ID
            {
             before(grammarAccess.getSELECTAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__NameAssignment_1_0"


    // $ANTLR start "rule__SELECT__TableAssignment_3"
    // InternalSimpleSQL.g:1954:1: rule__SELECT__TableAssignment_3 : ( RULE_ID ) ;
    public final void rule__SELECT__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1958:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1959:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1959:2: ( RULE_ID )
            // InternalSimpleSQL.g:1960:3: RULE_ID
            {
             before(grammarAccess.getSELECTAccess().getTableIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSELECTAccess().getTableIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SELECT__TableAssignment_3"


    // $ANTLR start "rule__UPDATE__TableAssignment_3"
    // InternalSimpleSQL.g:1969:1: rule__UPDATE__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UPDATE__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1973:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:1974:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:1974:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1975:3: ( RULE_ID )
            {
             before(grammarAccess.getUPDATEAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:1976:3: ( RULE_ID )
            // InternalSimpleSQL.g:1977:4: RULE_ID
            {
             before(grammarAccess.getUPDATEAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUPDATEAccess().getTableCREATE_TABLECrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__TableAssignment_3"


    // $ANTLR start "rule__UPDATE__DataAssignment_7"
    // InternalSimpleSQL.g:1988:1: rule__UPDATE__DataAssignment_7 : ( ruleInsert_List ) ;
    public final void rule__UPDATE__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1992:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:1993:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:1993:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:1994:3: ruleInsert_List
            {
             before(grammarAccess.getUPDATEAccess().getDataInsert_ListParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInsert_List();

            state._fsp--;

             after(grammarAccess.getUPDATEAccess().getDataInsert_ListParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UPDATE__DataAssignment_7"


    // $ANTLR start "rule__DELETE__TableAssignment_3"
    // InternalSimpleSQL.g:2003:1: rule__DELETE__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DELETE__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2007:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2008:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2008:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2009:3: ( RULE_ID )
            {
             before(grammarAccess.getDELETEAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:2010:3: ( RULE_ID )
            // InternalSimpleSQL.g:2011:4: RULE_ID
            {
             before(grammarAccess.getDELETEAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDELETEAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDELETEAccess().getTableCREATE_TABLECrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__TableAssignment_3"


    // $ANTLR start "rule__DELETE__DataAssignment_7"
    // InternalSimpleSQL.g:2022:1: rule__DELETE__DataAssignment_7 : ( ruleInsert_List ) ;
    public final void rule__DELETE__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2026:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:2027:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:2027:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:2028:3: ruleInsert_List
            {
             before(grammarAccess.getDELETEAccess().getDataInsert_ListParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInsert_List();

            state._fsp--;

             after(grammarAccess.getDELETEAccess().getDataInsert_ListParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DELETE__DataAssignment_7"


    // $ANTLR start "rule__CREATE_DB__NameAssignment_3"
    // InternalSimpleSQL.g:2037:1: rule__CREATE_DB__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CREATE_DB__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2041:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2042:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2042:2: ( RULE_ID )
            // InternalSimpleSQL.g:2043:3: RULE_ID
            {
             before(grammarAccess.getCREATE_DBAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCREATE_DBAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_DB__NameAssignment_3"


    // $ANTLR start "rule__CREATE_TABLE__NameAssignment_3"
    // InternalSimpleSQL.g:2052:1: rule__CREATE_TABLE__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CREATE_TABLE__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2056:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2057:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2057:2: ( RULE_ID )
            // InternalSimpleSQL.g:2058:3: RULE_ID
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__NameAssignment_3"


    // $ANTLR start "rule__CREATE_TABLE__DbAssignment_5"
    // InternalSimpleSQL.g:2067:1: rule__CREATE_TABLE__DbAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CREATE_TABLE__DbAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2071:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2072:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2072:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2073:3: ( RULE_ID )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBCrossReference_5_0()); 
            // InternalSimpleSQL.g:2074:3: ( RULE_ID )
            // InternalSimpleSQL.g:2075:4: RULE_ID
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__DbAssignment_5"


    // $ANTLR start "rule__CREATE_TABLE__ColumnsAssignment_9"
    // InternalSimpleSQL.g:2086:1: rule__CREATE_TABLE__ColumnsAssignment_9 : ( ruleCOLUMN_DEF ) ;
    public final void rule__CREATE_TABLE__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2090:1: ( ( ruleCOLUMN_DEF ) )
            // InternalSimpleSQL.g:2091:2: ( ruleCOLUMN_DEF )
            {
            // InternalSimpleSQL.g:2091:2: ( ruleCOLUMN_DEF )
            // InternalSimpleSQL.g:2092:3: ruleCOLUMN_DEF
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLUMN_DEF();

            state._fsp--;

             after(grammarAccess.getCREATE_TABLEAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CREATE_TABLE__ColumnsAssignment_9"


    // $ANTLR start "rule__COLUMN_DEF__NameAssignment_0"
    // InternalSimpleSQL.g:2101:1: rule__COLUMN_DEF__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__COLUMN_DEF__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2105:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2106:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2106:2: ( RULE_ID )
            // InternalSimpleSQL.g:2107:3: RULE_ID
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCOLUMN_DEFAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__NameAssignment_0"


    // $ANTLR start "rule__COLUMN_DEF__TypeAssignment_3"
    // InternalSimpleSQL.g:2116:1: rule__COLUMN_DEF__TypeAssignment_3 : ( ruleTYPE ) ;
    public final void rule__COLUMN_DEF__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2120:1: ( ( ruleTYPE ) )
            // InternalSimpleSQL.g:2121:2: ( ruleTYPE )
            {
            // InternalSimpleSQL.g:2121:2: ( ruleTYPE )
            // InternalSimpleSQL.g:2122:3: ruleTYPE
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeTYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getCOLUMN_DEFAccess().getTypeTYPEEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLUMN_DEF__TypeAssignment_3"


    // $ANTLR start "rule__INSERT__TableAssignment_3"
    // InternalSimpleSQL.g:2131:1: rule__INSERT__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__INSERT__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2135:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2136:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2136:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2137:3: ( RULE_ID )
            {
             before(grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:2138:3: ( RULE_ID )
            // InternalSimpleSQL.g:2139:4: RULE_ID
            {
             before(grammarAccess.getINSERTAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getTableCREATE_TABLEIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__TableAssignment_3"


    // $ANTLR start "rule__INSERT__DataAssignment_7"
    // InternalSimpleSQL.g:2150:1: rule__INSERT__DataAssignment_7 : ( ruleInsert_List ) ;
    public final void rule__INSERT__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2154:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:2155:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:2155:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:2156:3: ruleInsert_List
            {
             before(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInsert_List();

            state._fsp--;

             after(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSERT__DataAssignment_7"


    // $ANTLR start "rule__Insert_List__DataAssignment_0_1"
    // InternalSimpleSQL.g:2165:1: rule__Insert_List__DataAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Insert_List__DataAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2169:1: ( ( RULE_STRING ) )
            // InternalSimpleSQL.g:2170:2: ( RULE_STRING )
            {
            // InternalSimpleSQL.g:2170:2: ( RULE_STRING )
            // InternalSimpleSQL.g:2171:3: RULE_STRING
            {
             before(grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert_List__DataAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000106050002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});

}