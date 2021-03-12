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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'all'", "'string'", "'int'", "'double'", "'date'", "'order'", "'by'", "'where'", "'to'", "'table'", "'in'", "'columns'", "'('", "')'", "'inner'", "'join'", "'on'", "'show'", "'update'", "'entry'", "'with'", "'data'", "'delete'", "'create'", "'new'", "'database'", "'type'", "'add'", "'\"'"
    };
    public static final int RULE_STRING=6;
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

                if ( (LA1_0==16||LA1_0==18||LA1_0==25||(LA1_0>=28 && LA1_0<=29)||(LA1_0>=33 && LA1_0<=34)||LA1_0==38) ) {
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


    // $ANTLR start "entryRuleORDERBY"
    // InternalSimpleSQL.g:103:1: entryRuleORDERBY : ruleORDERBY EOF ;
    public final void entryRuleORDERBY() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:104:1: ( ruleORDERBY EOF )
            // InternalSimpleSQL.g:105:1: ruleORDERBY EOF
            {
             before(grammarAccess.getORDERBYRule()); 
            pushFollow(FOLLOW_1);
            ruleORDERBY();

            state._fsp--;

             after(grammarAccess.getORDERBYRule()); 
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
    // $ANTLR end "entryRuleORDERBY"


    // $ANTLR start "ruleORDERBY"
    // InternalSimpleSQL.g:112:1: ruleORDERBY : ( ( rule__ORDERBY__Group__0 ) ) ;
    public final void ruleORDERBY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:116:2: ( ( ( rule__ORDERBY__Group__0 ) ) )
            // InternalSimpleSQL.g:117:2: ( ( rule__ORDERBY__Group__0 ) )
            {
            // InternalSimpleSQL.g:117:2: ( ( rule__ORDERBY__Group__0 ) )
            // InternalSimpleSQL.g:118:3: ( rule__ORDERBY__Group__0 )
            {
             before(grammarAccess.getORDERBYAccess().getGroup()); 
            // InternalSimpleSQL.g:119:3: ( rule__ORDERBY__Group__0 )
            // InternalSimpleSQL.g:119:4: rule__ORDERBY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ORDERBY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORDERBYAccess().getGroup()); 

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
    // $ANTLR end "ruleORDERBY"


    // $ANTLR start "entryRuleWHERE"
    // InternalSimpleSQL.g:128:1: entryRuleWHERE : ruleWHERE EOF ;
    public final void entryRuleWHERE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:129:1: ( ruleWHERE EOF )
            // InternalSimpleSQL.g:130:1: ruleWHERE EOF
            {
             before(grammarAccess.getWHERERule()); 
            pushFollow(FOLLOW_1);
            ruleWHERE();

            state._fsp--;

             after(grammarAccess.getWHERERule()); 
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
    // $ANTLR end "entryRuleWHERE"


    // $ANTLR start "ruleWHERE"
    // InternalSimpleSQL.g:137:1: ruleWHERE : ( ( rule__WHERE__Group__0 ) ) ;
    public final void ruleWHERE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:141:2: ( ( ( rule__WHERE__Group__0 ) ) )
            // InternalSimpleSQL.g:142:2: ( ( rule__WHERE__Group__0 ) )
            {
            // InternalSimpleSQL.g:142:2: ( ( rule__WHERE__Group__0 ) )
            // InternalSimpleSQL.g:143:3: ( rule__WHERE__Group__0 )
            {
             before(grammarAccess.getWHEREAccess().getGroup()); 
            // InternalSimpleSQL.g:144:3: ( rule__WHERE__Group__0 )
            // InternalSimpleSQL.g:144:4: rule__WHERE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWHEREAccess().getGroup()); 

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
    // $ANTLR end "ruleWHERE"


    // $ANTLR start "entryRuleINNERJOIN"
    // InternalSimpleSQL.g:153:1: entryRuleINNERJOIN : ruleINNERJOIN EOF ;
    public final void entryRuleINNERJOIN() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:154:1: ( ruleINNERJOIN EOF )
            // InternalSimpleSQL.g:155:1: ruleINNERJOIN EOF
            {
             before(grammarAccess.getINNERJOINRule()); 
            pushFollow(FOLLOW_1);
            ruleINNERJOIN();

            state._fsp--;

             after(grammarAccess.getINNERJOINRule()); 
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
    // $ANTLR end "entryRuleINNERJOIN"


    // $ANTLR start "ruleINNERJOIN"
    // InternalSimpleSQL.g:162:1: ruleINNERJOIN : ( ( rule__INNERJOIN__Group__0 ) ) ;
    public final void ruleINNERJOIN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:166:2: ( ( ( rule__INNERJOIN__Group__0 ) ) )
            // InternalSimpleSQL.g:167:2: ( ( rule__INNERJOIN__Group__0 ) )
            {
            // InternalSimpleSQL.g:167:2: ( ( rule__INNERJOIN__Group__0 ) )
            // InternalSimpleSQL.g:168:3: ( rule__INNERJOIN__Group__0 )
            {
             before(grammarAccess.getINNERJOINAccess().getGroup()); 
            // InternalSimpleSQL.g:169:3: ( rule__INNERJOIN__Group__0 )
            // InternalSimpleSQL.g:169:4: rule__INNERJOIN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INNERJOIN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINNERJOINAccess().getGroup()); 

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
    // $ANTLR end "ruleINNERJOIN"


    // $ANTLR start "entryRuleSELECT"
    // InternalSimpleSQL.g:178:1: entryRuleSELECT : ruleSELECT EOF ;
    public final void entryRuleSELECT() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:179:1: ( ruleSELECT EOF )
            // InternalSimpleSQL.g:180:1: ruleSELECT EOF
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
    // InternalSimpleSQL.g:187:1: ruleSELECT : ( ( rule__SELECT__Group__0 ) ) ;
    public final void ruleSELECT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:191:2: ( ( ( rule__SELECT__Group__0 ) ) )
            // InternalSimpleSQL.g:192:2: ( ( rule__SELECT__Group__0 ) )
            {
            // InternalSimpleSQL.g:192:2: ( ( rule__SELECT__Group__0 ) )
            // InternalSimpleSQL.g:193:3: ( rule__SELECT__Group__0 )
            {
             before(grammarAccess.getSELECTAccess().getGroup()); 
            // InternalSimpleSQL.g:194:3: ( rule__SELECT__Group__0 )
            // InternalSimpleSQL.g:194:4: rule__SELECT__Group__0
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
    // InternalSimpleSQL.g:203:1: entryRuleUPDATE : ruleUPDATE EOF ;
    public final void entryRuleUPDATE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:204:1: ( ruleUPDATE EOF )
            // InternalSimpleSQL.g:205:1: ruleUPDATE EOF
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
    // InternalSimpleSQL.g:212:1: ruleUPDATE : ( ( rule__UPDATE__Group__0 ) ) ;
    public final void ruleUPDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:216:2: ( ( ( rule__UPDATE__Group__0 ) ) )
            // InternalSimpleSQL.g:217:2: ( ( rule__UPDATE__Group__0 ) )
            {
            // InternalSimpleSQL.g:217:2: ( ( rule__UPDATE__Group__0 ) )
            // InternalSimpleSQL.g:218:3: ( rule__UPDATE__Group__0 )
            {
             before(grammarAccess.getUPDATEAccess().getGroup()); 
            // InternalSimpleSQL.g:219:3: ( rule__UPDATE__Group__0 )
            // InternalSimpleSQL.g:219:4: rule__UPDATE__Group__0
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
    // InternalSimpleSQL.g:228:1: entryRuleDELETE : ruleDELETE EOF ;
    public final void entryRuleDELETE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:229:1: ( ruleDELETE EOF )
            // InternalSimpleSQL.g:230:1: ruleDELETE EOF
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
    // InternalSimpleSQL.g:237:1: ruleDELETE : ( ( rule__DELETE__Group__0 ) ) ;
    public final void ruleDELETE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:241:2: ( ( ( rule__DELETE__Group__0 ) ) )
            // InternalSimpleSQL.g:242:2: ( ( rule__DELETE__Group__0 ) )
            {
            // InternalSimpleSQL.g:242:2: ( ( rule__DELETE__Group__0 ) )
            // InternalSimpleSQL.g:243:3: ( rule__DELETE__Group__0 )
            {
             before(grammarAccess.getDELETEAccess().getGroup()); 
            // InternalSimpleSQL.g:244:3: ( rule__DELETE__Group__0 )
            // InternalSimpleSQL.g:244:4: rule__DELETE__Group__0
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
    // InternalSimpleSQL.g:253:1: entryRuleCREATE_DB : ruleCREATE_DB EOF ;
    public final void entryRuleCREATE_DB() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:254:1: ( ruleCREATE_DB EOF )
            // InternalSimpleSQL.g:255:1: ruleCREATE_DB EOF
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
    // InternalSimpleSQL.g:262:1: ruleCREATE_DB : ( ( rule__CREATE_DB__Group__0 ) ) ;
    public final void ruleCREATE_DB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:266:2: ( ( ( rule__CREATE_DB__Group__0 ) ) )
            // InternalSimpleSQL.g:267:2: ( ( rule__CREATE_DB__Group__0 ) )
            {
            // InternalSimpleSQL.g:267:2: ( ( rule__CREATE_DB__Group__0 ) )
            // InternalSimpleSQL.g:268:3: ( rule__CREATE_DB__Group__0 )
            {
             before(grammarAccess.getCREATE_DBAccess().getGroup()); 
            // InternalSimpleSQL.g:269:3: ( rule__CREATE_DB__Group__0 )
            // InternalSimpleSQL.g:269:4: rule__CREATE_DB__Group__0
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
    // InternalSimpleSQL.g:278:1: entryRuleCREATE_TABLE : ruleCREATE_TABLE EOF ;
    public final void entryRuleCREATE_TABLE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:279:1: ( ruleCREATE_TABLE EOF )
            // InternalSimpleSQL.g:280:1: ruleCREATE_TABLE EOF
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
    // InternalSimpleSQL.g:287:1: ruleCREATE_TABLE : ( ( rule__CREATE_TABLE__Group__0 ) ) ;
    public final void ruleCREATE_TABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:291:2: ( ( ( rule__CREATE_TABLE__Group__0 ) ) )
            // InternalSimpleSQL.g:292:2: ( ( rule__CREATE_TABLE__Group__0 ) )
            {
            // InternalSimpleSQL.g:292:2: ( ( rule__CREATE_TABLE__Group__0 ) )
            // InternalSimpleSQL.g:293:3: ( rule__CREATE_TABLE__Group__0 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getGroup()); 
            // InternalSimpleSQL.g:294:3: ( rule__CREATE_TABLE__Group__0 )
            // InternalSimpleSQL.g:294:4: rule__CREATE_TABLE__Group__0
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
    // InternalSimpleSQL.g:303:1: entryRuleCOLUMN_DEF : ruleCOLUMN_DEF EOF ;
    public final void entryRuleCOLUMN_DEF() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:304:1: ( ruleCOLUMN_DEF EOF )
            // InternalSimpleSQL.g:305:1: ruleCOLUMN_DEF EOF
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
    // InternalSimpleSQL.g:312:1: ruleCOLUMN_DEF : ( ( rule__COLUMN_DEF__Group__0 ) ) ;
    public final void ruleCOLUMN_DEF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:316:2: ( ( ( rule__COLUMN_DEF__Group__0 ) ) )
            // InternalSimpleSQL.g:317:2: ( ( rule__COLUMN_DEF__Group__0 ) )
            {
            // InternalSimpleSQL.g:317:2: ( ( rule__COLUMN_DEF__Group__0 ) )
            // InternalSimpleSQL.g:318:3: ( rule__COLUMN_DEF__Group__0 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getGroup()); 
            // InternalSimpleSQL.g:319:3: ( rule__COLUMN_DEF__Group__0 )
            // InternalSimpleSQL.g:319:4: rule__COLUMN_DEF__Group__0
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
    // InternalSimpleSQL.g:328:1: entryRuleINSERT : ruleINSERT EOF ;
    public final void entryRuleINSERT() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:329:1: ( ruleINSERT EOF )
            // InternalSimpleSQL.g:330:1: ruleINSERT EOF
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
    // InternalSimpleSQL.g:337:1: ruleINSERT : ( ( rule__INSERT__Group__0 ) ) ;
    public final void ruleINSERT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:341:2: ( ( ( rule__INSERT__Group__0 ) ) )
            // InternalSimpleSQL.g:342:2: ( ( rule__INSERT__Group__0 ) )
            {
            // InternalSimpleSQL.g:342:2: ( ( rule__INSERT__Group__0 ) )
            // InternalSimpleSQL.g:343:3: ( rule__INSERT__Group__0 )
            {
             before(grammarAccess.getINSERTAccess().getGroup()); 
            // InternalSimpleSQL.g:344:3: ( rule__INSERT__Group__0 )
            // InternalSimpleSQL.g:344:4: rule__INSERT__Group__0
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
    // InternalSimpleSQL.g:353:1: entryRuleInsert_List : ruleInsert_List EOF ;
    public final void entryRuleInsert_List() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:354:1: ( ruleInsert_List EOF )
            // InternalSimpleSQL.g:355:1: ruleInsert_List EOF
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
    // InternalSimpleSQL.g:362:1: ruleInsert_List : ( ( rule__Insert_List__Alternatives ) ) ;
    public final void ruleInsert_List() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:366:2: ( ( ( rule__Insert_List__Alternatives ) ) )
            // InternalSimpleSQL.g:367:2: ( ( rule__Insert_List__Alternatives ) )
            {
            // InternalSimpleSQL.g:367:2: ( ( rule__Insert_List__Alternatives ) )
            // InternalSimpleSQL.g:368:3: ( rule__Insert_List__Alternatives )
            {
             before(grammarAccess.getInsert_ListAccess().getAlternatives()); 
            // InternalSimpleSQL.g:369:3: ( rule__Insert_List__Alternatives )
            // InternalSimpleSQL.g:369:4: rule__Insert_List__Alternatives
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
    // InternalSimpleSQL.g:378:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:382:1: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalSimpleSQL.g:383:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalSimpleSQL.g:383:2: ( ( rule__TYPE__Alternatives ) )
            // InternalSimpleSQL.g:384:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalSimpleSQL.g:385:3: ( rule__TYPE__Alternatives )
            // InternalSimpleSQL.g:385:4: rule__TYPE__Alternatives
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
    // InternalSimpleSQL.g:393:1: rule__Statement__Alternatives : ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) | ( ruleDELETE ) | ( ruleUPDATE ) | ( ruleINNERJOIN ) | ( ruleWHERE ) | ( ruleORDERBY ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:397:1: ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) | ( ruleDELETE ) | ( ruleUPDATE ) | ( ruleINNERJOIN ) | ( ruleWHERE ) | ( ruleORDERBY ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSimpleSQL.g:398:2: ( ruleSELECT )
                    {
                    // InternalSimpleSQL.g:398:2: ( ruleSELECT )
                    // InternalSimpleSQL.g:399:3: ruleSELECT
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
                    // InternalSimpleSQL.g:404:2: ( ruleCREATE_DB )
                    {
                    // InternalSimpleSQL.g:404:2: ( ruleCREATE_DB )
                    // InternalSimpleSQL.g:405:3: ruleCREATE_DB
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
                    // InternalSimpleSQL.g:410:2: ( ruleCREATE_TABLE )
                    {
                    // InternalSimpleSQL.g:410:2: ( ruleCREATE_TABLE )
                    // InternalSimpleSQL.g:411:3: ruleCREATE_TABLE
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
                    // InternalSimpleSQL.g:416:2: ( ruleINSERT )
                    {
                    // InternalSimpleSQL.g:416:2: ( ruleINSERT )
                    // InternalSimpleSQL.g:417:3: ruleINSERT
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
                    // InternalSimpleSQL.g:422:2: ( ruleDELETE )
                    {
                    // InternalSimpleSQL.g:422:2: ( ruleDELETE )
                    // InternalSimpleSQL.g:423:3: ruleDELETE
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
                    // InternalSimpleSQL.g:428:2: ( ruleUPDATE )
                    {
                    // InternalSimpleSQL.g:428:2: ( ruleUPDATE )
                    // InternalSimpleSQL.g:429:3: ruleUPDATE
                    {
                     before(grammarAccess.getStatementAccess().getUPDATEParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleUPDATE();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUPDATEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleSQL.g:434:2: ( ruleINNERJOIN )
                    {
                    // InternalSimpleSQL.g:434:2: ( ruleINNERJOIN )
                    // InternalSimpleSQL.g:435:3: ruleINNERJOIN
                    {
                     before(grammarAccess.getStatementAccess().getINNERJOINParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleINNERJOIN();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getINNERJOINParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleSQL.g:440:2: ( ruleWHERE )
                    {
                    // InternalSimpleSQL.g:440:2: ( ruleWHERE )
                    // InternalSimpleSQL.g:441:3: ruleWHERE
                    {
                     before(grammarAccess.getStatementAccess().getWHEREParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleWHERE();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWHEREParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSimpleSQL.g:446:2: ( ruleORDERBY )
                    {
                    // InternalSimpleSQL.g:446:2: ( ruleORDERBY )
                    // InternalSimpleSQL.g:447:3: ruleORDERBY
                    {
                     before(grammarAccess.getStatementAccess().getORDERBYParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleORDERBY();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getORDERBYParserRuleCall_8()); 

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
    // InternalSimpleSQL.g:456:1: rule__SELECT__Alternatives_1 : ( ( ( rule__SELECT__NameAssignment_1_0 ) ) | ( 'all' ) );
    public final void rule__SELECT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:460:1: ( ( ( rule__SELECT__NameAssignment_1_0 ) ) | ( 'all' ) )
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
                    // InternalSimpleSQL.g:461:2: ( ( rule__SELECT__NameAssignment_1_0 ) )
                    {
                    // InternalSimpleSQL.g:461:2: ( ( rule__SELECT__NameAssignment_1_0 ) )
                    // InternalSimpleSQL.g:462:3: ( rule__SELECT__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getSELECTAccess().getNameAssignment_1_0()); 
                    // InternalSimpleSQL.g:463:3: ( rule__SELECT__NameAssignment_1_0 )
                    // InternalSimpleSQL.g:463:4: rule__SELECT__NameAssignment_1_0
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
                    // InternalSimpleSQL.g:467:2: ( 'all' )
                    {
                    // InternalSimpleSQL.g:467:2: ( 'all' )
                    // InternalSimpleSQL.g:468:3: 'all'
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
    // InternalSimpleSQL.g:477:1: rule__Insert_List__Alternatives : ( ( ( rule__Insert_List__Group_0__0 ) ) | ( ( rule__Insert_List__Group_1__0 ) ) );
    public final void rule__Insert_List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:481:1: ( ( ( rule__Insert_List__Group_0__0 ) ) | ( ( rule__Insert_List__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
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
                    // InternalSimpleSQL.g:482:2: ( ( rule__Insert_List__Group_0__0 ) )
                    {
                    // InternalSimpleSQL.g:482:2: ( ( rule__Insert_List__Group_0__0 ) )
                    // InternalSimpleSQL.g:483:3: ( rule__Insert_List__Group_0__0 )
                    {
                     before(grammarAccess.getInsert_ListAccess().getGroup_0()); 
                    // InternalSimpleSQL.g:484:3: ( rule__Insert_List__Group_0__0 )
                    // InternalSimpleSQL.g:484:4: rule__Insert_List__Group_0__0
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
                    // InternalSimpleSQL.g:488:2: ( ( rule__Insert_List__Group_1__0 ) )
                    {
                    // InternalSimpleSQL.g:488:2: ( ( rule__Insert_List__Group_1__0 ) )
                    // InternalSimpleSQL.g:489:3: ( rule__Insert_List__Group_1__0 )
                    {
                     before(grammarAccess.getInsert_ListAccess().getGroup_1()); 
                    // InternalSimpleSQL.g:490:3: ( rule__Insert_List__Group_1__0 )
                    // InternalSimpleSQL.g:490:4: rule__Insert_List__Group_1__0
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
    // InternalSimpleSQL.g:498:1: rule__TYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:502:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
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
                    // InternalSimpleSQL.g:503:2: ( ( 'string' ) )
                    {
                    // InternalSimpleSQL.g:503:2: ( ( 'string' ) )
                    // InternalSimpleSQL.g:504:3: ( 'string' )
                    {
                     before(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSimpleSQL.g:505:3: ( 'string' )
                    // InternalSimpleSQL.g:505:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:509:2: ( ( 'int' ) )
                    {
                    // InternalSimpleSQL.g:509:2: ( ( 'int' ) )
                    // InternalSimpleSQL.g:510:3: ( 'int' )
                    {
                     before(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSimpleSQL.g:511:3: ( 'int' )
                    // InternalSimpleSQL.g:511:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:515:2: ( ( 'double' ) )
                    {
                    // InternalSimpleSQL.g:515:2: ( ( 'double' ) )
                    // InternalSimpleSQL.g:516:3: ( 'double' )
                    {
                     before(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // InternalSimpleSQL.g:517:3: ( 'double' )
                    // InternalSimpleSQL.g:517:4: 'double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:521:2: ( ( 'date' ) )
                    {
                    // InternalSimpleSQL.g:521:2: ( ( 'date' ) )
                    // InternalSimpleSQL.g:522:3: ( 'date' )
                    {
                     before(grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalSimpleSQL.g:523:3: ( 'date' )
                    // InternalSimpleSQL.g:523:4: 'date'
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


    // $ANTLR start "rule__ORDERBY__Group__0"
    // InternalSimpleSQL.g:531:1: rule__ORDERBY__Group__0 : rule__ORDERBY__Group__0__Impl rule__ORDERBY__Group__1 ;
    public final void rule__ORDERBY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:535:1: ( rule__ORDERBY__Group__0__Impl rule__ORDERBY__Group__1 )
            // InternalSimpleSQL.g:536:2: rule__ORDERBY__Group__0__Impl rule__ORDERBY__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ORDERBY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORDERBY__Group__1();

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
    // $ANTLR end "rule__ORDERBY__Group__0"


    // $ANTLR start "rule__ORDERBY__Group__0__Impl"
    // InternalSimpleSQL.g:543:1: rule__ORDERBY__Group__0__Impl : ( 'order' ) ;
    public final void rule__ORDERBY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:547:1: ( ( 'order' ) )
            // InternalSimpleSQL.g:548:1: ( 'order' )
            {
            // InternalSimpleSQL.g:548:1: ( 'order' )
            // InternalSimpleSQL.g:549:2: 'order'
            {
             before(grammarAccess.getORDERBYAccess().getOrderKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getORDERBYAccess().getOrderKeyword_0()); 

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
    // $ANTLR end "rule__ORDERBY__Group__0__Impl"


    // $ANTLR start "rule__ORDERBY__Group__1"
    // InternalSimpleSQL.g:558:1: rule__ORDERBY__Group__1 : rule__ORDERBY__Group__1__Impl rule__ORDERBY__Group__2 ;
    public final void rule__ORDERBY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:562:1: ( rule__ORDERBY__Group__1__Impl rule__ORDERBY__Group__2 )
            // InternalSimpleSQL.g:563:2: rule__ORDERBY__Group__1__Impl rule__ORDERBY__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ORDERBY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORDERBY__Group__2();

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
    // $ANTLR end "rule__ORDERBY__Group__1"


    // $ANTLR start "rule__ORDERBY__Group__1__Impl"
    // InternalSimpleSQL.g:570:1: rule__ORDERBY__Group__1__Impl : ( 'by' ) ;
    public final void rule__ORDERBY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:574:1: ( ( 'by' ) )
            // InternalSimpleSQL.g:575:1: ( 'by' )
            {
            // InternalSimpleSQL.g:575:1: ( 'by' )
            // InternalSimpleSQL.g:576:2: 'by'
            {
             before(grammarAccess.getORDERBYAccess().getByKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getORDERBYAccess().getByKeyword_1()); 

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
    // $ANTLR end "rule__ORDERBY__Group__1__Impl"


    // $ANTLR start "rule__ORDERBY__Group__2"
    // InternalSimpleSQL.g:585:1: rule__ORDERBY__Group__2 : rule__ORDERBY__Group__2__Impl rule__ORDERBY__Group__3 ;
    public final void rule__ORDERBY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:589:1: ( rule__ORDERBY__Group__2__Impl rule__ORDERBY__Group__3 )
            // InternalSimpleSQL.g:590:2: rule__ORDERBY__Group__2__Impl rule__ORDERBY__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ORDERBY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORDERBY__Group__3();

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
    // $ANTLR end "rule__ORDERBY__Group__2"


    // $ANTLR start "rule__ORDERBY__Group__2__Impl"
    // InternalSimpleSQL.g:597:1: rule__ORDERBY__Group__2__Impl : ( ( rule__ORDERBY__TableAssignment_2 ) ) ;
    public final void rule__ORDERBY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:601:1: ( ( ( rule__ORDERBY__TableAssignment_2 ) ) )
            // InternalSimpleSQL.g:602:1: ( ( rule__ORDERBY__TableAssignment_2 ) )
            {
            // InternalSimpleSQL.g:602:1: ( ( rule__ORDERBY__TableAssignment_2 ) )
            // InternalSimpleSQL.g:603:2: ( rule__ORDERBY__TableAssignment_2 )
            {
             before(grammarAccess.getORDERBYAccess().getTableAssignment_2()); 
            // InternalSimpleSQL.g:604:2: ( rule__ORDERBY__TableAssignment_2 )
            // InternalSimpleSQL.g:604:3: rule__ORDERBY__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ORDERBY__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getORDERBYAccess().getTableAssignment_2()); 

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
    // $ANTLR end "rule__ORDERBY__Group__2__Impl"


    // $ANTLR start "rule__ORDERBY__Group__3"
    // InternalSimpleSQL.g:612:1: rule__ORDERBY__Group__3 : rule__ORDERBY__Group__3__Impl rule__ORDERBY__Group__4 ;
    public final void rule__ORDERBY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:616:1: ( rule__ORDERBY__Group__3__Impl rule__ORDERBY__Group__4 )
            // InternalSimpleSQL.g:617:2: rule__ORDERBY__Group__3__Impl rule__ORDERBY__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ORDERBY__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORDERBY__Group__4();

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
    // $ANTLR end "rule__ORDERBY__Group__3"


    // $ANTLR start "rule__ORDERBY__Group__3__Impl"
    // InternalSimpleSQL.g:624:1: rule__ORDERBY__Group__3__Impl : ( 'where' ) ;
    public final void rule__ORDERBY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:628:1: ( ( 'where' ) )
            // InternalSimpleSQL.g:629:1: ( 'where' )
            {
            // InternalSimpleSQL.g:629:1: ( 'where' )
            // InternalSimpleSQL.g:630:2: 'where'
            {
             before(grammarAccess.getORDERBYAccess().getWhereKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getORDERBYAccess().getWhereKeyword_3()); 

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
    // $ANTLR end "rule__ORDERBY__Group__3__Impl"


    // $ANTLR start "rule__ORDERBY__Group__4"
    // InternalSimpleSQL.g:639:1: rule__ORDERBY__Group__4 : rule__ORDERBY__Group__4__Impl ;
    public final void rule__ORDERBY__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:643:1: ( rule__ORDERBY__Group__4__Impl )
            // InternalSimpleSQL.g:644:2: rule__ORDERBY__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORDERBY__Group__4__Impl();

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
    // $ANTLR end "rule__ORDERBY__Group__4"


    // $ANTLR start "rule__ORDERBY__Group__4__Impl"
    // InternalSimpleSQL.g:650:1: rule__ORDERBY__Group__4__Impl : ( ( rule__ORDERBY__ColAssignment_4 ) ) ;
    public final void rule__ORDERBY__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:654:1: ( ( ( rule__ORDERBY__ColAssignment_4 ) ) )
            // InternalSimpleSQL.g:655:1: ( ( rule__ORDERBY__ColAssignment_4 ) )
            {
            // InternalSimpleSQL.g:655:1: ( ( rule__ORDERBY__ColAssignment_4 ) )
            // InternalSimpleSQL.g:656:2: ( rule__ORDERBY__ColAssignment_4 )
            {
             before(grammarAccess.getORDERBYAccess().getColAssignment_4()); 
            // InternalSimpleSQL.g:657:2: ( rule__ORDERBY__ColAssignment_4 )
            // InternalSimpleSQL.g:657:3: rule__ORDERBY__ColAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ORDERBY__ColAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getORDERBYAccess().getColAssignment_4()); 

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
    // $ANTLR end "rule__ORDERBY__Group__4__Impl"


    // $ANTLR start "rule__WHERE__Group__0"
    // InternalSimpleSQL.g:666:1: rule__WHERE__Group__0 : rule__WHERE__Group__0__Impl rule__WHERE__Group__1 ;
    public final void rule__WHERE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:670:1: ( rule__WHERE__Group__0__Impl rule__WHERE__Group__1 )
            // InternalSimpleSQL.g:671:2: rule__WHERE__Group__0__Impl rule__WHERE__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__WHERE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__1();

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
    // $ANTLR end "rule__WHERE__Group__0"


    // $ANTLR start "rule__WHERE__Group__0__Impl"
    // InternalSimpleSQL.g:678:1: rule__WHERE__Group__0__Impl : ( 'where' ) ;
    public final void rule__WHERE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:682:1: ( ( 'where' ) )
            // InternalSimpleSQL.g:683:1: ( 'where' )
            {
            // InternalSimpleSQL.g:683:1: ( 'where' )
            // InternalSimpleSQL.g:684:2: 'where'
            {
             before(grammarAccess.getWHEREAccess().getWhereKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getWhereKeyword_0()); 

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
    // $ANTLR end "rule__WHERE__Group__0__Impl"


    // $ANTLR start "rule__WHERE__Group__1"
    // InternalSimpleSQL.g:693:1: rule__WHERE__Group__1 : rule__WHERE__Group__1__Impl rule__WHERE__Group__2 ;
    public final void rule__WHERE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:697:1: ( rule__WHERE__Group__1__Impl rule__WHERE__Group__2 )
            // InternalSimpleSQL.g:698:2: rule__WHERE__Group__1__Impl rule__WHERE__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__WHERE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__2();

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
    // $ANTLR end "rule__WHERE__Group__1"


    // $ANTLR start "rule__WHERE__Group__1__Impl"
    // InternalSimpleSQL.g:705:1: rule__WHERE__Group__1__Impl : ( 'to' ) ;
    public final void rule__WHERE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:709:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:710:1: ( 'to' )
            {
            // InternalSimpleSQL.g:710:1: ( 'to' )
            // InternalSimpleSQL.g:711:2: 'to'
            {
             before(grammarAccess.getWHEREAccess().getToKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getToKeyword_1()); 

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
    // $ANTLR end "rule__WHERE__Group__1__Impl"


    // $ANTLR start "rule__WHERE__Group__2"
    // InternalSimpleSQL.g:720:1: rule__WHERE__Group__2 : rule__WHERE__Group__2__Impl rule__WHERE__Group__3 ;
    public final void rule__WHERE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:724:1: ( rule__WHERE__Group__2__Impl rule__WHERE__Group__3 )
            // InternalSimpleSQL.g:725:2: rule__WHERE__Group__2__Impl rule__WHERE__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WHERE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__3();

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
    // $ANTLR end "rule__WHERE__Group__2"


    // $ANTLR start "rule__WHERE__Group__2__Impl"
    // InternalSimpleSQL.g:732:1: rule__WHERE__Group__2__Impl : ( 'table' ) ;
    public final void rule__WHERE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:736:1: ( ( 'table' ) )
            // InternalSimpleSQL.g:737:1: ( 'table' )
            {
            // InternalSimpleSQL.g:737:1: ( 'table' )
            // InternalSimpleSQL.g:738:2: 'table'
            {
             before(grammarAccess.getWHEREAccess().getTableKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getTableKeyword_2()); 

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
    // $ANTLR end "rule__WHERE__Group__2__Impl"


    // $ANTLR start "rule__WHERE__Group__3"
    // InternalSimpleSQL.g:747:1: rule__WHERE__Group__3 : rule__WHERE__Group__3__Impl rule__WHERE__Group__4 ;
    public final void rule__WHERE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:751:1: ( rule__WHERE__Group__3__Impl rule__WHERE__Group__4 )
            // InternalSimpleSQL.g:752:2: rule__WHERE__Group__3__Impl rule__WHERE__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__WHERE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__4();

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
    // $ANTLR end "rule__WHERE__Group__3"


    // $ANTLR start "rule__WHERE__Group__3__Impl"
    // InternalSimpleSQL.g:759:1: rule__WHERE__Group__3__Impl : ( ( rule__WHERE__NameAssignment_3 ) ) ;
    public final void rule__WHERE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:763:1: ( ( ( rule__WHERE__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:764:1: ( ( rule__WHERE__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:764:1: ( ( rule__WHERE__NameAssignment_3 ) )
            // InternalSimpleSQL.g:765:2: ( rule__WHERE__NameAssignment_3 )
            {
             before(grammarAccess.getWHEREAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:766:2: ( rule__WHERE__NameAssignment_3 )
            // InternalSimpleSQL.g:766:3: rule__WHERE__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWHEREAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__WHERE__Group__3__Impl"


    // $ANTLR start "rule__WHERE__Group__4"
    // InternalSimpleSQL.g:774:1: rule__WHERE__Group__4 : rule__WHERE__Group__4__Impl rule__WHERE__Group__5 ;
    public final void rule__WHERE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:778:1: ( rule__WHERE__Group__4__Impl rule__WHERE__Group__5 )
            // InternalSimpleSQL.g:779:2: rule__WHERE__Group__4__Impl rule__WHERE__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__WHERE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__5();

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
    // $ANTLR end "rule__WHERE__Group__4"


    // $ANTLR start "rule__WHERE__Group__4__Impl"
    // InternalSimpleSQL.g:786:1: rule__WHERE__Group__4__Impl : ( 'in' ) ;
    public final void rule__WHERE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:790:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:791:1: ( 'in' )
            {
            // InternalSimpleSQL.g:791:1: ( 'in' )
            // InternalSimpleSQL.g:792:2: 'in'
            {
             before(grammarAccess.getWHEREAccess().getInKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__WHERE__Group__4__Impl"


    // $ANTLR start "rule__WHERE__Group__5"
    // InternalSimpleSQL.g:801:1: rule__WHERE__Group__5 : rule__WHERE__Group__5__Impl rule__WHERE__Group__6 ;
    public final void rule__WHERE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:805:1: ( rule__WHERE__Group__5__Impl rule__WHERE__Group__6 )
            // InternalSimpleSQL.g:806:2: rule__WHERE__Group__5__Impl rule__WHERE__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__WHERE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__6();

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
    // $ANTLR end "rule__WHERE__Group__5"


    // $ANTLR start "rule__WHERE__Group__5__Impl"
    // InternalSimpleSQL.g:813:1: rule__WHERE__Group__5__Impl : ( ( rule__WHERE__DbAssignment_5 ) ) ;
    public final void rule__WHERE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:817:1: ( ( ( rule__WHERE__DbAssignment_5 ) ) )
            // InternalSimpleSQL.g:818:1: ( ( rule__WHERE__DbAssignment_5 ) )
            {
            // InternalSimpleSQL.g:818:1: ( ( rule__WHERE__DbAssignment_5 ) )
            // InternalSimpleSQL.g:819:2: ( rule__WHERE__DbAssignment_5 )
            {
             before(grammarAccess.getWHEREAccess().getDbAssignment_5()); 
            // InternalSimpleSQL.g:820:2: ( rule__WHERE__DbAssignment_5 )
            // InternalSimpleSQL.g:820:3: rule__WHERE__DbAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__DbAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWHEREAccess().getDbAssignment_5()); 

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
    // $ANTLR end "rule__WHERE__Group__5__Impl"


    // $ANTLR start "rule__WHERE__Group__6"
    // InternalSimpleSQL.g:828:1: rule__WHERE__Group__6 : rule__WHERE__Group__6__Impl rule__WHERE__Group__7 ;
    public final void rule__WHERE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:832:1: ( rule__WHERE__Group__6__Impl rule__WHERE__Group__7 )
            // InternalSimpleSQL.g:833:2: rule__WHERE__Group__6__Impl rule__WHERE__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__WHERE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__7();

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
    // $ANTLR end "rule__WHERE__Group__6"


    // $ANTLR start "rule__WHERE__Group__6__Impl"
    // InternalSimpleSQL.g:840:1: rule__WHERE__Group__6__Impl : ( 'where' ) ;
    public final void rule__WHERE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:844:1: ( ( 'where' ) )
            // InternalSimpleSQL.g:845:1: ( 'where' )
            {
            // InternalSimpleSQL.g:845:1: ( 'where' )
            // InternalSimpleSQL.g:846:2: 'where'
            {
             before(grammarAccess.getWHEREAccess().getWhereKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getWhereKeyword_6()); 

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
    // $ANTLR end "rule__WHERE__Group__6__Impl"


    // $ANTLR start "rule__WHERE__Group__7"
    // InternalSimpleSQL.g:855:1: rule__WHERE__Group__7 : rule__WHERE__Group__7__Impl rule__WHERE__Group__8 ;
    public final void rule__WHERE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:859:1: ( rule__WHERE__Group__7__Impl rule__WHERE__Group__8 )
            // InternalSimpleSQL.g:860:2: rule__WHERE__Group__7__Impl rule__WHERE__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__WHERE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__8();

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
    // $ANTLR end "rule__WHERE__Group__7"


    // $ANTLR start "rule__WHERE__Group__7__Impl"
    // InternalSimpleSQL.g:867:1: rule__WHERE__Group__7__Impl : ( 'columns' ) ;
    public final void rule__WHERE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:871:1: ( ( 'columns' ) )
            // InternalSimpleSQL.g:872:1: ( 'columns' )
            {
            // InternalSimpleSQL.g:872:1: ( 'columns' )
            // InternalSimpleSQL.g:873:2: 'columns'
            {
             before(grammarAccess.getWHEREAccess().getColumnsKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getColumnsKeyword_7()); 

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
    // $ANTLR end "rule__WHERE__Group__7__Impl"


    // $ANTLR start "rule__WHERE__Group__8"
    // InternalSimpleSQL.g:882:1: rule__WHERE__Group__8 : rule__WHERE__Group__8__Impl rule__WHERE__Group__9 ;
    public final void rule__WHERE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:886:1: ( rule__WHERE__Group__8__Impl rule__WHERE__Group__9 )
            // InternalSimpleSQL.g:887:2: rule__WHERE__Group__8__Impl rule__WHERE__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__WHERE__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__9();

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
    // $ANTLR end "rule__WHERE__Group__8"


    // $ANTLR start "rule__WHERE__Group__8__Impl"
    // InternalSimpleSQL.g:894:1: rule__WHERE__Group__8__Impl : ( '(' ) ;
    public final void rule__WHERE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:898:1: ( ( '(' ) )
            // InternalSimpleSQL.g:899:1: ( '(' )
            {
            // InternalSimpleSQL.g:899:1: ( '(' )
            // InternalSimpleSQL.g:900:2: '('
            {
             before(grammarAccess.getWHEREAccess().getLeftParenthesisKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getLeftParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__WHERE__Group__8__Impl"


    // $ANTLR start "rule__WHERE__Group__9"
    // InternalSimpleSQL.g:909:1: rule__WHERE__Group__9 : rule__WHERE__Group__9__Impl rule__WHERE__Group__10 ;
    public final void rule__WHERE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:913:1: ( rule__WHERE__Group__9__Impl rule__WHERE__Group__10 )
            // InternalSimpleSQL.g:914:2: rule__WHERE__Group__9__Impl rule__WHERE__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__WHERE__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WHERE__Group__10();

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
    // $ANTLR end "rule__WHERE__Group__9"


    // $ANTLR start "rule__WHERE__Group__9__Impl"
    // InternalSimpleSQL.g:921:1: rule__WHERE__Group__9__Impl : ( ( ( rule__WHERE__ColumnsAssignment_9 ) ) ( ( rule__WHERE__ColumnsAssignment_9 )* ) ) ;
    public final void rule__WHERE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:925:1: ( ( ( ( rule__WHERE__ColumnsAssignment_9 ) ) ( ( rule__WHERE__ColumnsAssignment_9 )* ) ) )
            // InternalSimpleSQL.g:926:1: ( ( ( rule__WHERE__ColumnsAssignment_9 ) ) ( ( rule__WHERE__ColumnsAssignment_9 )* ) )
            {
            // InternalSimpleSQL.g:926:1: ( ( ( rule__WHERE__ColumnsAssignment_9 ) ) ( ( rule__WHERE__ColumnsAssignment_9 )* ) )
            // InternalSimpleSQL.g:927:2: ( ( rule__WHERE__ColumnsAssignment_9 ) ) ( ( rule__WHERE__ColumnsAssignment_9 )* )
            {
            // InternalSimpleSQL.g:927:2: ( ( rule__WHERE__ColumnsAssignment_9 ) )
            // InternalSimpleSQL.g:928:3: ( rule__WHERE__ColumnsAssignment_9 )
            {
             before(grammarAccess.getWHEREAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:929:3: ( rule__WHERE__ColumnsAssignment_9 )
            // InternalSimpleSQL.g:929:4: rule__WHERE__ColumnsAssignment_9
            {
            pushFollow(FOLLOW_13);
            rule__WHERE__ColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getWHEREAccess().getColumnsAssignment_9()); 

            }

            // InternalSimpleSQL.g:932:2: ( ( rule__WHERE__ColumnsAssignment_9 )* )
            // InternalSimpleSQL.g:933:3: ( rule__WHERE__ColumnsAssignment_9 )*
            {
             before(grammarAccess.getWHEREAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:934:3: ( rule__WHERE__ColumnsAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleSQL.g:934:4: rule__WHERE__ColumnsAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WHERE__ColumnsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWHEREAccess().getColumnsAssignment_9()); 

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
    // $ANTLR end "rule__WHERE__Group__9__Impl"


    // $ANTLR start "rule__WHERE__Group__10"
    // InternalSimpleSQL.g:943:1: rule__WHERE__Group__10 : rule__WHERE__Group__10__Impl ;
    public final void rule__WHERE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:947:1: ( rule__WHERE__Group__10__Impl )
            // InternalSimpleSQL.g:948:2: rule__WHERE__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WHERE__Group__10__Impl();

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
    // $ANTLR end "rule__WHERE__Group__10"


    // $ANTLR start "rule__WHERE__Group__10__Impl"
    // InternalSimpleSQL.g:954:1: rule__WHERE__Group__10__Impl : ( ')' ) ;
    public final void rule__WHERE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:958:1: ( ( ')' ) )
            // InternalSimpleSQL.g:959:1: ( ')' )
            {
            // InternalSimpleSQL.g:959:1: ( ')' )
            // InternalSimpleSQL.g:960:2: ')'
            {
             before(grammarAccess.getWHEREAccess().getRightParenthesisKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__WHERE__Group__10__Impl"


    // $ANTLR start "rule__INNERJOIN__Group__0"
    // InternalSimpleSQL.g:970:1: rule__INNERJOIN__Group__0 : rule__INNERJOIN__Group__0__Impl rule__INNERJOIN__Group__1 ;
    public final void rule__INNERJOIN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:974:1: ( rule__INNERJOIN__Group__0__Impl rule__INNERJOIN__Group__1 )
            // InternalSimpleSQL.g:975:2: rule__INNERJOIN__Group__0__Impl rule__INNERJOIN__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__INNERJOIN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INNERJOIN__Group__1();

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
    // $ANTLR end "rule__INNERJOIN__Group__0"


    // $ANTLR start "rule__INNERJOIN__Group__0__Impl"
    // InternalSimpleSQL.g:982:1: rule__INNERJOIN__Group__0__Impl : ( 'inner' ) ;
    public final void rule__INNERJOIN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:986:1: ( ( 'inner' ) )
            // InternalSimpleSQL.g:987:1: ( 'inner' )
            {
            // InternalSimpleSQL.g:987:1: ( 'inner' )
            // InternalSimpleSQL.g:988:2: 'inner'
            {
             before(grammarAccess.getINNERJOINAccess().getInnerKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getINNERJOINAccess().getInnerKeyword_0()); 

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
    // $ANTLR end "rule__INNERJOIN__Group__0__Impl"


    // $ANTLR start "rule__INNERJOIN__Group__1"
    // InternalSimpleSQL.g:997:1: rule__INNERJOIN__Group__1 : rule__INNERJOIN__Group__1__Impl rule__INNERJOIN__Group__2 ;
    public final void rule__INNERJOIN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1001:1: ( rule__INNERJOIN__Group__1__Impl rule__INNERJOIN__Group__2 )
            // InternalSimpleSQL.g:1002:2: rule__INNERJOIN__Group__1__Impl rule__INNERJOIN__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__INNERJOIN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INNERJOIN__Group__2();

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
    // $ANTLR end "rule__INNERJOIN__Group__1"


    // $ANTLR start "rule__INNERJOIN__Group__1__Impl"
    // InternalSimpleSQL.g:1009:1: rule__INNERJOIN__Group__1__Impl : ( 'join' ) ;
    public final void rule__INNERJOIN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1013:1: ( ( 'join' ) )
            // InternalSimpleSQL.g:1014:1: ( 'join' )
            {
            // InternalSimpleSQL.g:1014:1: ( 'join' )
            // InternalSimpleSQL.g:1015:2: 'join'
            {
             before(grammarAccess.getINNERJOINAccess().getJoinKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getINNERJOINAccess().getJoinKeyword_1()); 

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
    // $ANTLR end "rule__INNERJOIN__Group__1__Impl"


    // $ANTLR start "rule__INNERJOIN__Group__2"
    // InternalSimpleSQL.g:1024:1: rule__INNERJOIN__Group__2 : rule__INNERJOIN__Group__2__Impl rule__INNERJOIN__Group__3 ;
    public final void rule__INNERJOIN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1028:1: ( rule__INNERJOIN__Group__2__Impl rule__INNERJOIN__Group__3 )
            // InternalSimpleSQL.g:1029:2: rule__INNERJOIN__Group__2__Impl rule__INNERJOIN__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__INNERJOIN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INNERJOIN__Group__3();

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
    // $ANTLR end "rule__INNERJOIN__Group__2"


    // $ANTLR start "rule__INNERJOIN__Group__2__Impl"
    // InternalSimpleSQL.g:1036:1: rule__INNERJOIN__Group__2__Impl : ( ( rule__INNERJOIN__TableAssignment_2 ) ) ;
    public final void rule__INNERJOIN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1040:1: ( ( ( rule__INNERJOIN__TableAssignment_2 ) ) )
            // InternalSimpleSQL.g:1041:1: ( ( rule__INNERJOIN__TableAssignment_2 ) )
            {
            // InternalSimpleSQL.g:1041:1: ( ( rule__INNERJOIN__TableAssignment_2 ) )
            // InternalSimpleSQL.g:1042:2: ( rule__INNERJOIN__TableAssignment_2 )
            {
             before(grammarAccess.getINNERJOINAccess().getTableAssignment_2()); 
            // InternalSimpleSQL.g:1043:2: ( rule__INNERJOIN__TableAssignment_2 )
            // InternalSimpleSQL.g:1043:3: rule__INNERJOIN__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__INNERJOIN__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getINNERJOINAccess().getTableAssignment_2()); 

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
    // $ANTLR end "rule__INNERJOIN__Group__2__Impl"


    // $ANTLR start "rule__INNERJOIN__Group__3"
    // InternalSimpleSQL.g:1051:1: rule__INNERJOIN__Group__3 : rule__INNERJOIN__Group__3__Impl ;
    public final void rule__INNERJOIN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1055:1: ( rule__INNERJOIN__Group__3__Impl )
            // InternalSimpleSQL.g:1056:2: rule__INNERJOIN__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INNERJOIN__Group__3__Impl();

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
    // $ANTLR end "rule__INNERJOIN__Group__3"


    // $ANTLR start "rule__INNERJOIN__Group__3__Impl"
    // InternalSimpleSQL.g:1062:1: rule__INNERJOIN__Group__3__Impl : ( 'on' ) ;
    public final void rule__INNERJOIN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1066:1: ( ( 'on' ) )
            // InternalSimpleSQL.g:1067:1: ( 'on' )
            {
            // InternalSimpleSQL.g:1067:1: ( 'on' )
            // InternalSimpleSQL.g:1068:2: 'on'
            {
             before(grammarAccess.getINNERJOINAccess().getOnKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getINNERJOINAccess().getOnKeyword_3()); 

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
    // $ANTLR end "rule__INNERJOIN__Group__3__Impl"


    // $ANTLR start "rule__SELECT__Group__0"
    // InternalSimpleSQL.g:1078:1: rule__SELECT__Group__0 : rule__SELECT__Group__0__Impl rule__SELECT__Group__1 ;
    public final void rule__SELECT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1082:1: ( rule__SELECT__Group__0__Impl rule__SELECT__Group__1 )
            // InternalSimpleSQL.g:1083:2: rule__SELECT__Group__0__Impl rule__SELECT__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSimpleSQL.g:1090:1: rule__SELECT__Group__0__Impl : ( 'show' ) ;
    public final void rule__SELECT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1094:1: ( ( 'show' ) )
            // InternalSimpleSQL.g:1095:1: ( 'show' )
            {
            // InternalSimpleSQL.g:1095:1: ( 'show' )
            // InternalSimpleSQL.g:1096:2: 'show'
            {
             before(grammarAccess.getSELECTAccess().getShowKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1105:1: rule__SELECT__Group__1 : rule__SELECT__Group__1__Impl rule__SELECT__Group__2 ;
    public final void rule__SELECT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1109:1: ( rule__SELECT__Group__1__Impl rule__SELECT__Group__2 )
            // InternalSimpleSQL.g:1110:2: rule__SELECT__Group__1__Impl rule__SELECT__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleSQL.g:1117:1: rule__SELECT__Group__1__Impl : ( ( rule__SELECT__Alternatives_1 ) ) ;
    public final void rule__SELECT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1121:1: ( ( ( rule__SELECT__Alternatives_1 ) ) )
            // InternalSimpleSQL.g:1122:1: ( ( rule__SELECT__Alternatives_1 ) )
            {
            // InternalSimpleSQL.g:1122:1: ( ( rule__SELECT__Alternatives_1 ) )
            // InternalSimpleSQL.g:1123:2: ( rule__SELECT__Alternatives_1 )
            {
             before(grammarAccess.getSELECTAccess().getAlternatives_1()); 
            // InternalSimpleSQL.g:1124:2: ( rule__SELECT__Alternatives_1 )
            // InternalSimpleSQL.g:1124:3: rule__SELECT__Alternatives_1
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
    // InternalSimpleSQL.g:1132:1: rule__SELECT__Group__2 : rule__SELECT__Group__2__Impl rule__SELECT__Group__3 ;
    public final void rule__SELECT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1136:1: ( rule__SELECT__Group__2__Impl rule__SELECT__Group__3 )
            // InternalSimpleSQL.g:1137:2: rule__SELECT__Group__2__Impl rule__SELECT__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:1144:1: rule__SELECT__Group__2__Impl : ( 'in' ) ;
    public final void rule__SELECT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1148:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:1149:1: ( 'in' )
            {
            // InternalSimpleSQL.g:1149:1: ( 'in' )
            // InternalSimpleSQL.g:1150:2: 'in'
            {
             before(grammarAccess.getSELECTAccess().getInKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1159:1: rule__SELECT__Group__3 : rule__SELECT__Group__3__Impl ;
    public final void rule__SELECT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1163:1: ( rule__SELECT__Group__3__Impl )
            // InternalSimpleSQL.g:1164:2: rule__SELECT__Group__3__Impl
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
    // InternalSimpleSQL.g:1170:1: rule__SELECT__Group__3__Impl : ( ( rule__SELECT__TableAssignment_3 ) ) ;
    public final void rule__SELECT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1174:1: ( ( ( rule__SELECT__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:1175:1: ( ( rule__SELECT__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1175:1: ( ( rule__SELECT__TableAssignment_3 ) )
            // InternalSimpleSQL.g:1176:2: ( rule__SELECT__TableAssignment_3 )
            {
             before(grammarAccess.getSELECTAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:1177:2: ( rule__SELECT__TableAssignment_3 )
            // InternalSimpleSQL.g:1177:3: rule__SELECT__TableAssignment_3
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
    // InternalSimpleSQL.g:1186:1: rule__UPDATE__Group__0 : rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1 ;
    public final void rule__UPDATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1190:1: ( rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1 )
            // InternalSimpleSQL.g:1191:2: rule__UPDATE__Group__0__Impl rule__UPDATE__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleSQL.g:1198:1: rule__UPDATE__Group__0__Impl : ( 'update' ) ;
    public final void rule__UPDATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1202:1: ( ( 'update' ) )
            // InternalSimpleSQL.g:1203:1: ( 'update' )
            {
            // InternalSimpleSQL.g:1203:1: ( 'update' )
            // InternalSimpleSQL.g:1204:2: 'update'
            {
             before(grammarAccess.getUPDATEAccess().getUpdateKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1213:1: rule__UPDATE__Group__1 : rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2 ;
    public final void rule__UPDATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1217:1: ( rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2 )
            // InternalSimpleSQL.g:1218:2: rule__UPDATE__Group__1__Impl rule__UPDATE__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleSQL.g:1225:1: rule__UPDATE__Group__1__Impl : ( 'entry' ) ;
    public final void rule__UPDATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1229:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:1230:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:1230:1: ( 'entry' )
            // InternalSimpleSQL.g:1231:2: 'entry'
            {
             before(grammarAccess.getUPDATEAccess().getEntryKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1240:1: rule__UPDATE__Group__2 : rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3 ;
    public final void rule__UPDATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1244:1: ( rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3 )
            // InternalSimpleSQL.g:1245:2: rule__UPDATE__Group__2__Impl rule__UPDATE__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:1252:1: rule__UPDATE__Group__2__Impl : ( 'in' ) ;
    public final void rule__UPDATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1256:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:1257:1: ( 'in' )
            {
            // InternalSimpleSQL.g:1257:1: ( 'in' )
            // InternalSimpleSQL.g:1258:2: 'in'
            {
             before(grammarAccess.getUPDATEAccess().getInKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getInKeyword_2()); 

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
    // InternalSimpleSQL.g:1267:1: rule__UPDATE__Group__3 : rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4 ;
    public final void rule__UPDATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1271:1: ( rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4 )
            // InternalSimpleSQL.g:1272:2: rule__UPDATE__Group__3__Impl rule__UPDATE__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSimpleSQL.g:1279:1: rule__UPDATE__Group__3__Impl : ( ( rule__UPDATE__TableAssignment_3 ) ) ;
    public final void rule__UPDATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1283:1: ( ( ( rule__UPDATE__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:1284:1: ( ( rule__UPDATE__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1284:1: ( ( rule__UPDATE__TableAssignment_3 ) )
            // InternalSimpleSQL.g:1285:2: ( rule__UPDATE__TableAssignment_3 )
            {
             before(grammarAccess.getUPDATEAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:1286:2: ( rule__UPDATE__TableAssignment_3 )
            // InternalSimpleSQL.g:1286:3: rule__UPDATE__TableAssignment_3
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
    // InternalSimpleSQL.g:1294:1: rule__UPDATE__Group__4 : rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5 ;
    public final void rule__UPDATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1298:1: ( rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5 )
            // InternalSimpleSQL.g:1299:2: rule__UPDATE__Group__4__Impl rule__UPDATE__Group__5
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
    // InternalSimpleSQL.g:1306:1: rule__UPDATE__Group__4__Impl : ( 'on' ) ;
    public final void rule__UPDATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1310:1: ( ( 'on' ) )
            // InternalSimpleSQL.g:1311:1: ( 'on' )
            {
            // InternalSimpleSQL.g:1311:1: ( 'on' )
            // InternalSimpleSQL.g:1312:2: 'on'
            {
             before(grammarAccess.getUPDATEAccess().getOnKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getOnKeyword_4()); 

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
    // InternalSimpleSQL.g:1321:1: rule__UPDATE__Group__5 : rule__UPDATE__Group__5__Impl rule__UPDATE__Group__6 ;
    public final void rule__UPDATE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1325:1: ( rule__UPDATE__Group__5__Impl rule__UPDATE__Group__6 )
            // InternalSimpleSQL.g:1326:2: rule__UPDATE__Group__5__Impl rule__UPDATE__Group__6
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
    // InternalSimpleSQL.g:1333:1: rule__UPDATE__Group__5__Impl : ( 'columns' ) ;
    public final void rule__UPDATE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1337:1: ( ( 'columns' ) )
            // InternalSimpleSQL.g:1338:1: ( 'columns' )
            {
            // InternalSimpleSQL.g:1338:1: ( 'columns' )
            // InternalSimpleSQL.g:1339:2: 'columns'
            {
             before(grammarAccess.getUPDATEAccess().getColumnsKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getColumnsKeyword_5()); 

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
    // InternalSimpleSQL.g:1348:1: rule__UPDATE__Group__6 : rule__UPDATE__Group__6__Impl rule__UPDATE__Group__7 ;
    public final void rule__UPDATE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1352:1: ( rule__UPDATE__Group__6__Impl rule__UPDATE__Group__7 )
            // InternalSimpleSQL.g:1353:2: rule__UPDATE__Group__6__Impl rule__UPDATE__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:1360:1: rule__UPDATE__Group__6__Impl : ( '(' ) ;
    public final void rule__UPDATE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1364:1: ( ( '(' ) )
            // InternalSimpleSQL.g:1365:1: ( '(' )
            {
            // InternalSimpleSQL.g:1365:1: ( '(' )
            // InternalSimpleSQL.g:1366:2: '('
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
    // InternalSimpleSQL.g:1375:1: rule__UPDATE__Group__7 : rule__UPDATE__Group__7__Impl rule__UPDATE__Group__8 ;
    public final void rule__UPDATE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1379:1: ( rule__UPDATE__Group__7__Impl rule__UPDATE__Group__8 )
            // InternalSimpleSQL.g:1380:2: rule__UPDATE__Group__7__Impl rule__UPDATE__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalSimpleSQL.g:1387:1: rule__UPDATE__Group__7__Impl : ( ( ( rule__UPDATE__ColsAssignment_7 ) ) ( ( rule__UPDATE__ColsAssignment_7 )* ) ) ;
    public final void rule__UPDATE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1391:1: ( ( ( ( rule__UPDATE__ColsAssignment_7 ) ) ( ( rule__UPDATE__ColsAssignment_7 )* ) ) )
            // InternalSimpleSQL.g:1392:1: ( ( ( rule__UPDATE__ColsAssignment_7 ) ) ( ( rule__UPDATE__ColsAssignment_7 )* ) )
            {
            // InternalSimpleSQL.g:1392:1: ( ( ( rule__UPDATE__ColsAssignment_7 ) ) ( ( rule__UPDATE__ColsAssignment_7 )* ) )
            // InternalSimpleSQL.g:1393:2: ( ( rule__UPDATE__ColsAssignment_7 ) ) ( ( rule__UPDATE__ColsAssignment_7 )* )
            {
            // InternalSimpleSQL.g:1393:2: ( ( rule__UPDATE__ColsAssignment_7 ) )
            // InternalSimpleSQL.g:1394:3: ( rule__UPDATE__ColsAssignment_7 )
            {
             before(grammarAccess.getUPDATEAccess().getColsAssignment_7()); 
            // InternalSimpleSQL.g:1395:3: ( rule__UPDATE__ColsAssignment_7 )
            // InternalSimpleSQL.g:1395:4: rule__UPDATE__ColsAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__UPDATE__ColsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUPDATEAccess().getColsAssignment_7()); 

            }

            // InternalSimpleSQL.g:1398:2: ( ( rule__UPDATE__ColsAssignment_7 )* )
            // InternalSimpleSQL.g:1399:3: ( rule__UPDATE__ColsAssignment_7 )*
            {
             before(grammarAccess.getUPDATEAccess().getColsAssignment_7()); 
            // InternalSimpleSQL.g:1400:3: ( rule__UPDATE__ColsAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleSQL.g:1400:4: rule__UPDATE__ColsAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UPDATE__ColsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUPDATEAccess().getColsAssignment_7()); 

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
    // InternalSimpleSQL.g:1409:1: rule__UPDATE__Group__8 : rule__UPDATE__Group__8__Impl rule__UPDATE__Group__9 ;
    public final void rule__UPDATE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1413:1: ( rule__UPDATE__Group__8__Impl rule__UPDATE__Group__9 )
            // InternalSimpleSQL.g:1414:2: rule__UPDATE__Group__8__Impl rule__UPDATE__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__UPDATE__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__9();

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
    // InternalSimpleSQL.g:1421:1: rule__UPDATE__Group__8__Impl : ( ')' ) ;
    public final void rule__UPDATE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1425:1: ( ( ')' ) )
            // InternalSimpleSQL.g:1426:1: ( ')' )
            {
            // InternalSimpleSQL.g:1426:1: ( ')' )
            // InternalSimpleSQL.g:1427:2: ')'
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


    // $ANTLR start "rule__UPDATE__Group__9"
    // InternalSimpleSQL.g:1436:1: rule__UPDATE__Group__9 : rule__UPDATE__Group__9__Impl rule__UPDATE__Group__10 ;
    public final void rule__UPDATE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1440:1: ( rule__UPDATE__Group__9__Impl rule__UPDATE__Group__10 )
            // InternalSimpleSQL.g:1441:2: rule__UPDATE__Group__9__Impl rule__UPDATE__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__UPDATE__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__10();

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
    // $ANTLR end "rule__UPDATE__Group__9"


    // $ANTLR start "rule__UPDATE__Group__9__Impl"
    // InternalSimpleSQL.g:1448:1: rule__UPDATE__Group__9__Impl : ( 'with' ) ;
    public final void rule__UPDATE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1452:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:1453:1: ( 'with' )
            {
            // InternalSimpleSQL.g:1453:1: ( 'with' )
            // InternalSimpleSQL.g:1454:2: 'with'
            {
             before(grammarAccess.getUPDATEAccess().getWithKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getWithKeyword_9()); 

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
    // $ANTLR end "rule__UPDATE__Group__9__Impl"


    // $ANTLR start "rule__UPDATE__Group__10"
    // InternalSimpleSQL.g:1463:1: rule__UPDATE__Group__10 : rule__UPDATE__Group__10__Impl rule__UPDATE__Group__11 ;
    public final void rule__UPDATE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1467:1: ( rule__UPDATE__Group__10__Impl rule__UPDATE__Group__11 )
            // InternalSimpleSQL.g:1468:2: rule__UPDATE__Group__10__Impl rule__UPDATE__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__UPDATE__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__11();

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
    // $ANTLR end "rule__UPDATE__Group__10"


    // $ANTLR start "rule__UPDATE__Group__10__Impl"
    // InternalSimpleSQL.g:1475:1: rule__UPDATE__Group__10__Impl : ( 'data' ) ;
    public final void rule__UPDATE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1479:1: ( ( 'data' ) )
            // InternalSimpleSQL.g:1480:1: ( 'data' )
            {
            // InternalSimpleSQL.g:1480:1: ( 'data' )
            // InternalSimpleSQL.g:1481:2: 'data'
            {
             before(grammarAccess.getUPDATEAccess().getDataKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getDataKeyword_10()); 

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
    // $ANTLR end "rule__UPDATE__Group__10__Impl"


    // $ANTLR start "rule__UPDATE__Group__11"
    // InternalSimpleSQL.g:1490:1: rule__UPDATE__Group__11 : rule__UPDATE__Group__11__Impl rule__UPDATE__Group__12 ;
    public final void rule__UPDATE__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1494:1: ( rule__UPDATE__Group__11__Impl rule__UPDATE__Group__12 )
            // InternalSimpleSQL.g:1495:2: rule__UPDATE__Group__11__Impl rule__UPDATE__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__UPDATE__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__12();

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
    // $ANTLR end "rule__UPDATE__Group__11"


    // $ANTLR start "rule__UPDATE__Group__11__Impl"
    // InternalSimpleSQL.g:1502:1: rule__UPDATE__Group__11__Impl : ( '(' ) ;
    public final void rule__UPDATE__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1506:1: ( ( '(' ) )
            // InternalSimpleSQL.g:1507:1: ( '(' )
            {
            // InternalSimpleSQL.g:1507:1: ( '(' )
            // InternalSimpleSQL.g:1508:2: '('
            {
             before(grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getLeftParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__UPDATE__Group__11__Impl"


    // $ANTLR start "rule__UPDATE__Group__12"
    // InternalSimpleSQL.g:1517:1: rule__UPDATE__Group__12 : rule__UPDATE__Group__12__Impl rule__UPDATE__Group__13 ;
    public final void rule__UPDATE__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1521:1: ( rule__UPDATE__Group__12__Impl rule__UPDATE__Group__13 )
            // InternalSimpleSQL.g:1522:2: rule__UPDATE__Group__12__Impl rule__UPDATE__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__UPDATE__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__13();

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
    // $ANTLR end "rule__UPDATE__Group__12"


    // $ANTLR start "rule__UPDATE__Group__12__Impl"
    // InternalSimpleSQL.g:1529:1: rule__UPDATE__Group__12__Impl : ( ( ( rule__UPDATE__DataAssignment_12 ) ) ( ( rule__UPDATE__DataAssignment_12 )* ) ) ;
    public final void rule__UPDATE__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1533:1: ( ( ( ( rule__UPDATE__DataAssignment_12 ) ) ( ( rule__UPDATE__DataAssignment_12 )* ) ) )
            // InternalSimpleSQL.g:1534:1: ( ( ( rule__UPDATE__DataAssignment_12 ) ) ( ( rule__UPDATE__DataAssignment_12 )* ) )
            {
            // InternalSimpleSQL.g:1534:1: ( ( ( rule__UPDATE__DataAssignment_12 ) ) ( ( rule__UPDATE__DataAssignment_12 )* ) )
            // InternalSimpleSQL.g:1535:2: ( ( rule__UPDATE__DataAssignment_12 ) ) ( ( rule__UPDATE__DataAssignment_12 )* )
            {
            // InternalSimpleSQL.g:1535:2: ( ( rule__UPDATE__DataAssignment_12 ) )
            // InternalSimpleSQL.g:1536:3: ( rule__UPDATE__DataAssignment_12 )
            {
             before(grammarAccess.getUPDATEAccess().getDataAssignment_12()); 
            // InternalSimpleSQL.g:1537:3: ( rule__UPDATE__DataAssignment_12 )
            // InternalSimpleSQL.g:1537:4: rule__UPDATE__DataAssignment_12
            {
            pushFollow(FOLLOW_21);
            rule__UPDATE__DataAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getUPDATEAccess().getDataAssignment_12()); 

            }

            // InternalSimpleSQL.g:1540:2: ( ( rule__UPDATE__DataAssignment_12 )* )
            // InternalSimpleSQL.g:1541:3: ( rule__UPDATE__DataAssignment_12 )*
            {
             before(grammarAccess.getUPDATEAccess().getDataAssignment_12()); 
            // InternalSimpleSQL.g:1542:3: ( rule__UPDATE__DataAssignment_12 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleSQL.g:1542:4: rule__UPDATE__DataAssignment_12
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__UPDATE__DataAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUPDATEAccess().getDataAssignment_12()); 

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
    // $ANTLR end "rule__UPDATE__Group__12__Impl"


    // $ANTLR start "rule__UPDATE__Group__13"
    // InternalSimpleSQL.g:1551:1: rule__UPDATE__Group__13 : rule__UPDATE__Group__13__Impl ;
    public final void rule__UPDATE__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1555:1: ( rule__UPDATE__Group__13__Impl )
            // InternalSimpleSQL.g:1556:2: rule__UPDATE__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UPDATE__Group__13__Impl();

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
    // $ANTLR end "rule__UPDATE__Group__13"


    // $ANTLR start "rule__UPDATE__Group__13__Impl"
    // InternalSimpleSQL.g:1562:1: rule__UPDATE__Group__13__Impl : ( ')' ) ;
    public final void rule__UPDATE__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1566:1: ( ( ')' ) )
            // InternalSimpleSQL.g:1567:1: ( ')' )
            {
            // InternalSimpleSQL.g:1567:1: ( ')' )
            // InternalSimpleSQL.g:1568:2: ')'
            {
             before(grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getRightParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__UPDATE__Group__13__Impl"


    // $ANTLR start "rule__DELETE__Group__0"
    // InternalSimpleSQL.g:1578:1: rule__DELETE__Group__0 : rule__DELETE__Group__0__Impl rule__DELETE__Group__1 ;
    public final void rule__DELETE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1582:1: ( rule__DELETE__Group__0__Impl rule__DELETE__Group__1 )
            // InternalSimpleSQL.g:1583:2: rule__DELETE__Group__0__Impl rule__DELETE__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleSQL.g:1590:1: rule__DELETE__Group__0__Impl : ( 'delete' ) ;
    public final void rule__DELETE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1594:1: ( ( 'delete' ) )
            // InternalSimpleSQL.g:1595:1: ( 'delete' )
            {
            // InternalSimpleSQL.g:1595:1: ( 'delete' )
            // InternalSimpleSQL.g:1596:2: 'delete'
            {
             before(grammarAccess.getDELETEAccess().getDeleteKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1605:1: rule__DELETE__Group__1 : rule__DELETE__Group__1__Impl rule__DELETE__Group__2 ;
    public final void rule__DELETE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1609:1: ( rule__DELETE__Group__1__Impl rule__DELETE__Group__2 )
            // InternalSimpleSQL.g:1610:2: rule__DELETE__Group__1__Impl rule__DELETE__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleSQL.g:1617:1: rule__DELETE__Group__1__Impl : ( 'entry' ) ;
    public final void rule__DELETE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1621:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:1622:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:1622:1: ( 'entry' )
            // InternalSimpleSQL.g:1623:2: 'entry'
            {
             before(grammarAccess.getDELETEAccess().getEntryKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1632:1: rule__DELETE__Group__2 : rule__DELETE__Group__2__Impl rule__DELETE__Group__3 ;
    public final void rule__DELETE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1636:1: ( rule__DELETE__Group__2__Impl rule__DELETE__Group__3 )
            // InternalSimpleSQL.g:1637:2: rule__DELETE__Group__2__Impl rule__DELETE__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:1644:1: rule__DELETE__Group__2__Impl : ( 'to' ) ;
    public final void rule__DELETE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1648:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:1649:1: ( 'to' )
            {
            // InternalSimpleSQL.g:1649:1: ( 'to' )
            // InternalSimpleSQL.g:1650:2: 'to'
            {
             before(grammarAccess.getDELETEAccess().getToKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1659:1: rule__DELETE__Group__3 : rule__DELETE__Group__3__Impl rule__DELETE__Group__4 ;
    public final void rule__DELETE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1663:1: ( rule__DELETE__Group__3__Impl rule__DELETE__Group__4 )
            // InternalSimpleSQL.g:1664:2: rule__DELETE__Group__3__Impl rule__DELETE__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSimpleSQL.g:1671:1: rule__DELETE__Group__3__Impl : ( ( rule__DELETE__TableAssignment_3 ) ) ;
    public final void rule__DELETE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1675:1: ( ( ( rule__DELETE__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:1676:1: ( ( rule__DELETE__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1676:1: ( ( rule__DELETE__TableAssignment_3 ) )
            // InternalSimpleSQL.g:1677:2: ( rule__DELETE__TableAssignment_3 )
            {
             before(grammarAccess.getDELETEAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:1678:2: ( rule__DELETE__TableAssignment_3 )
            // InternalSimpleSQL.g:1678:3: rule__DELETE__TableAssignment_3
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
    // InternalSimpleSQL.g:1686:1: rule__DELETE__Group__4 : rule__DELETE__Group__4__Impl rule__DELETE__Group__5 ;
    public final void rule__DELETE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1690:1: ( rule__DELETE__Group__4__Impl rule__DELETE__Group__5 )
            // InternalSimpleSQL.g:1691:2: rule__DELETE__Group__4__Impl rule__DELETE__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleSQL.g:1698:1: rule__DELETE__Group__4__Impl : ( 'with' ) ;
    public final void rule__DELETE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1702:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:1703:1: ( 'with' )
            {
            // InternalSimpleSQL.g:1703:1: ( 'with' )
            // InternalSimpleSQL.g:1704:2: 'with'
            {
             before(grammarAccess.getDELETEAccess().getWithKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1713:1: rule__DELETE__Group__5 : rule__DELETE__Group__5__Impl rule__DELETE__Group__6 ;
    public final void rule__DELETE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1717:1: ( rule__DELETE__Group__5__Impl rule__DELETE__Group__6 )
            // InternalSimpleSQL.g:1718:2: rule__DELETE__Group__5__Impl rule__DELETE__Group__6
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
    // InternalSimpleSQL.g:1725:1: rule__DELETE__Group__5__Impl : ( 'data' ) ;
    public final void rule__DELETE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1729:1: ( ( 'data' ) )
            // InternalSimpleSQL.g:1730:1: ( 'data' )
            {
            // InternalSimpleSQL.g:1730:1: ( 'data' )
            // InternalSimpleSQL.g:1731:2: 'data'
            {
             before(grammarAccess.getDELETEAccess().getDataKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1740:1: rule__DELETE__Group__6 : rule__DELETE__Group__6__Impl rule__DELETE__Group__7 ;
    public final void rule__DELETE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1744:1: ( rule__DELETE__Group__6__Impl rule__DELETE__Group__7 )
            // InternalSimpleSQL.g:1745:2: rule__DELETE__Group__6__Impl rule__DELETE__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalSimpleSQL.g:1752:1: rule__DELETE__Group__6__Impl : ( '(' ) ;
    public final void rule__DELETE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1756:1: ( ( '(' ) )
            // InternalSimpleSQL.g:1757:1: ( '(' )
            {
            // InternalSimpleSQL.g:1757:1: ( '(' )
            // InternalSimpleSQL.g:1758:2: '('
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
    // InternalSimpleSQL.g:1767:1: rule__DELETE__Group__7 : rule__DELETE__Group__7__Impl rule__DELETE__Group__8 ;
    public final void rule__DELETE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1771:1: ( rule__DELETE__Group__7__Impl rule__DELETE__Group__8 )
            // InternalSimpleSQL.g:1772:2: rule__DELETE__Group__7__Impl rule__DELETE__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalSimpleSQL.g:1779:1: rule__DELETE__Group__7__Impl : ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) ) ;
    public final void rule__DELETE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1783:1: ( ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) ) )
            // InternalSimpleSQL.g:1784:1: ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) )
            {
            // InternalSimpleSQL.g:1784:1: ( ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* ) )
            // InternalSimpleSQL.g:1785:2: ( ( rule__DELETE__DataAssignment_7 ) ) ( ( rule__DELETE__DataAssignment_7 )* )
            {
            // InternalSimpleSQL.g:1785:2: ( ( rule__DELETE__DataAssignment_7 ) )
            // InternalSimpleSQL.g:1786:3: ( rule__DELETE__DataAssignment_7 )
            {
             before(grammarAccess.getDELETEAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:1787:3: ( rule__DELETE__DataAssignment_7 )
            // InternalSimpleSQL.g:1787:4: rule__DELETE__DataAssignment_7
            {
            pushFollow(FOLLOW_21);
            rule__DELETE__DataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDELETEAccess().getDataAssignment_7()); 

            }

            // InternalSimpleSQL.g:1790:2: ( ( rule__DELETE__DataAssignment_7 )* )
            // InternalSimpleSQL.g:1791:3: ( rule__DELETE__DataAssignment_7 )*
            {
             before(grammarAccess.getDELETEAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:1792:3: ( rule__DELETE__DataAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleSQL.g:1792:4: rule__DELETE__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DELETE__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSimpleSQL.g:1801:1: rule__DELETE__Group__8 : rule__DELETE__Group__8__Impl ;
    public final void rule__DELETE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1805:1: ( rule__DELETE__Group__8__Impl )
            // InternalSimpleSQL.g:1806:2: rule__DELETE__Group__8__Impl
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
    // InternalSimpleSQL.g:1812:1: rule__DELETE__Group__8__Impl : ( ')' ) ;
    public final void rule__DELETE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1816:1: ( ( ')' ) )
            // InternalSimpleSQL.g:1817:1: ( ')' )
            {
            // InternalSimpleSQL.g:1817:1: ( ')' )
            // InternalSimpleSQL.g:1818:2: ')'
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
    // InternalSimpleSQL.g:1828:1: rule__CREATE_DB__Group__0 : rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1 ;
    public final void rule__CREATE_DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1832:1: ( rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1 )
            // InternalSimpleSQL.g:1833:2: rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSimpleSQL.g:1840:1: rule__CREATE_DB__Group__0__Impl : ( 'create' ) ;
    public final void rule__CREATE_DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1844:1: ( ( 'create' ) )
            // InternalSimpleSQL.g:1845:1: ( 'create' )
            {
            // InternalSimpleSQL.g:1845:1: ( 'create' )
            // InternalSimpleSQL.g:1846:2: 'create'
            {
             before(grammarAccess.getCREATE_DBAccess().getCreateKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1855:1: rule__CREATE_DB__Group__1 : rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2 ;
    public final void rule__CREATE_DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1859:1: ( rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2 )
            // InternalSimpleSQL.g:1860:2: rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSimpleSQL.g:1867:1: rule__CREATE_DB__Group__1__Impl : ( 'new' ) ;
    public final void rule__CREATE_DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1871:1: ( ( 'new' ) )
            // InternalSimpleSQL.g:1872:1: ( 'new' )
            {
            // InternalSimpleSQL.g:1872:1: ( 'new' )
            // InternalSimpleSQL.g:1873:2: 'new'
            {
             before(grammarAccess.getCREATE_DBAccess().getNewKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1882:1: rule__CREATE_DB__Group__2 : rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3 ;
    public final void rule__CREATE_DB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1886:1: ( rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3 )
            // InternalSimpleSQL.g:1887:2: rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:1894:1: rule__CREATE_DB__Group__2__Impl : ( 'database' ) ;
    public final void rule__CREATE_DB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1898:1: ( ( 'database' ) )
            // InternalSimpleSQL.g:1899:1: ( 'database' )
            {
            // InternalSimpleSQL.g:1899:1: ( 'database' )
            // InternalSimpleSQL.g:1900:2: 'database'
            {
             before(grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1909:1: rule__CREATE_DB__Group__3 : rule__CREATE_DB__Group__3__Impl ;
    public final void rule__CREATE_DB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1913:1: ( rule__CREATE_DB__Group__3__Impl )
            // InternalSimpleSQL.g:1914:2: rule__CREATE_DB__Group__3__Impl
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
    // InternalSimpleSQL.g:1920:1: rule__CREATE_DB__Group__3__Impl : ( ( rule__CREATE_DB__NameAssignment_3 ) ) ;
    public final void rule__CREATE_DB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1924:1: ( ( ( rule__CREATE_DB__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:1925:1: ( ( rule__CREATE_DB__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1925:1: ( ( rule__CREATE_DB__NameAssignment_3 ) )
            // InternalSimpleSQL.g:1926:2: ( rule__CREATE_DB__NameAssignment_3 )
            {
             before(grammarAccess.getCREATE_DBAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:1927:2: ( rule__CREATE_DB__NameAssignment_3 )
            // InternalSimpleSQL.g:1927:3: rule__CREATE_DB__NameAssignment_3
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
    // InternalSimpleSQL.g:1936:1: rule__CREATE_TABLE__Group__0 : rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1 ;
    public final void rule__CREATE_TABLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1940:1: ( rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1 )
            // InternalSimpleSQL.g:1941:2: rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSimpleSQL.g:1948:1: rule__CREATE_TABLE__Group__0__Impl : ( 'create' ) ;
    public final void rule__CREATE_TABLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1952:1: ( ( 'create' ) )
            // InternalSimpleSQL.g:1953:1: ( 'create' )
            {
            // InternalSimpleSQL.g:1953:1: ( 'create' )
            // InternalSimpleSQL.g:1954:2: 'create'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1963:1: rule__CREATE_TABLE__Group__1 : rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2 ;
    public final void rule__CREATE_TABLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1967:1: ( rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2 )
            // InternalSimpleSQL.g:1968:2: rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSimpleSQL.g:1975:1: rule__CREATE_TABLE__Group__1__Impl : ( 'new' ) ;
    public final void rule__CREATE_TABLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1979:1: ( ( 'new' ) )
            // InternalSimpleSQL.g:1980:1: ( 'new' )
            {
            // InternalSimpleSQL.g:1980:1: ( 'new' )
            // InternalSimpleSQL.g:1981:2: 'new'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1990:1: rule__CREATE_TABLE__Group__2 : rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3 ;
    public final void rule__CREATE_TABLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1994:1: ( rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3 )
            // InternalSimpleSQL.g:1995:2: rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:2002:1: rule__CREATE_TABLE__Group__2__Impl : ( 'table' ) ;
    public final void rule__CREATE_TABLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2006:1: ( ( 'table' ) )
            // InternalSimpleSQL.g:2007:1: ( 'table' )
            {
            // InternalSimpleSQL.g:2007:1: ( 'table' )
            // InternalSimpleSQL.g:2008:2: 'table'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2017:1: rule__CREATE_TABLE__Group__3 : rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4 ;
    public final void rule__CREATE_TABLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2021:1: ( rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4 )
            // InternalSimpleSQL.g:2022:2: rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleSQL.g:2029:1: rule__CREATE_TABLE__Group__3__Impl : ( ( rule__CREATE_TABLE__NameAssignment_3 ) ) ;
    public final void rule__CREATE_TABLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2033:1: ( ( ( rule__CREATE_TABLE__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:2034:1: ( ( rule__CREATE_TABLE__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:2034:1: ( ( rule__CREATE_TABLE__NameAssignment_3 ) )
            // InternalSimpleSQL.g:2035:2: ( rule__CREATE_TABLE__NameAssignment_3 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:2036:2: ( rule__CREATE_TABLE__NameAssignment_3 )
            // InternalSimpleSQL.g:2036:3: rule__CREATE_TABLE__NameAssignment_3
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
    // InternalSimpleSQL.g:2044:1: rule__CREATE_TABLE__Group__4 : rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5 ;
    public final void rule__CREATE_TABLE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2048:1: ( rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5 )
            // InternalSimpleSQL.g:2049:2: rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:2056:1: rule__CREATE_TABLE__Group__4__Impl : ( 'in' ) ;
    public final void rule__CREATE_TABLE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2060:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:2061:1: ( 'in' )
            {
            // InternalSimpleSQL.g:2061:1: ( 'in' )
            // InternalSimpleSQL.g:2062:2: 'in'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getInKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2071:1: rule__CREATE_TABLE__Group__5 : rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6 ;
    public final void rule__CREATE_TABLE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2075:1: ( rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6 )
            // InternalSimpleSQL.g:2076:2: rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalSimpleSQL.g:2083:1: rule__CREATE_TABLE__Group__5__Impl : ( ( rule__CREATE_TABLE__DbAssignment_5 ) ) ;
    public final void rule__CREATE_TABLE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2087:1: ( ( ( rule__CREATE_TABLE__DbAssignment_5 ) ) )
            // InternalSimpleSQL.g:2088:1: ( ( rule__CREATE_TABLE__DbAssignment_5 ) )
            {
            // InternalSimpleSQL.g:2088:1: ( ( rule__CREATE_TABLE__DbAssignment_5 ) )
            // InternalSimpleSQL.g:2089:2: ( rule__CREATE_TABLE__DbAssignment_5 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbAssignment_5()); 
            // InternalSimpleSQL.g:2090:2: ( rule__CREATE_TABLE__DbAssignment_5 )
            // InternalSimpleSQL.g:2090:3: rule__CREATE_TABLE__DbAssignment_5
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
    // InternalSimpleSQL.g:2098:1: rule__CREATE_TABLE__Group__6 : rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7 ;
    public final void rule__CREATE_TABLE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2102:1: ( rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7 )
            // InternalSimpleSQL.g:2103:2: rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimpleSQL.g:2110:1: rule__CREATE_TABLE__Group__6__Impl : ( 'with' ) ;
    public final void rule__CREATE_TABLE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2114:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:2115:1: ( 'with' )
            {
            // InternalSimpleSQL.g:2115:1: ( 'with' )
            // InternalSimpleSQL.g:2116:2: 'with'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2125:1: rule__CREATE_TABLE__Group__7 : rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8 ;
    public final void rule__CREATE_TABLE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2129:1: ( rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8 )
            // InternalSimpleSQL.g:2130:2: rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8
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
    // InternalSimpleSQL.g:2137:1: rule__CREATE_TABLE__Group__7__Impl : ( 'columns' ) ;
    public final void rule__CREATE_TABLE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2141:1: ( ( 'columns' ) )
            // InternalSimpleSQL.g:2142:1: ( 'columns' )
            {
            // InternalSimpleSQL.g:2142:1: ( 'columns' )
            // InternalSimpleSQL.g:2143:2: 'columns'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2152:1: rule__CREATE_TABLE__Group__8 : rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9 ;
    public final void rule__CREATE_TABLE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2156:1: ( rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9 )
            // InternalSimpleSQL.g:2157:2: rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:2164:1: rule__CREATE_TABLE__Group__8__Impl : ( '(' ) ;
    public final void rule__CREATE_TABLE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2168:1: ( ( '(' ) )
            // InternalSimpleSQL.g:2169:1: ( '(' )
            {
            // InternalSimpleSQL.g:2169:1: ( '(' )
            // InternalSimpleSQL.g:2170:2: '('
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
    // InternalSimpleSQL.g:2179:1: rule__CREATE_TABLE__Group__9 : rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10 ;
    public final void rule__CREATE_TABLE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2183:1: ( rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10 )
            // InternalSimpleSQL.g:2184:2: rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalSimpleSQL.g:2191:1: rule__CREATE_TABLE__Group__9__Impl : ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) ) ;
    public final void rule__CREATE_TABLE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2195:1: ( ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) ) )
            // InternalSimpleSQL.g:2196:1: ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) )
            {
            // InternalSimpleSQL.g:2196:1: ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) )
            // InternalSimpleSQL.g:2197:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* )
            {
            // InternalSimpleSQL.g:2197:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) )
            // InternalSimpleSQL.g:2198:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:2199:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )
            // InternalSimpleSQL.g:2199:4: rule__CREATE_TABLE__ColumnsAssignment_9
            {
            pushFollow(FOLLOW_13);
            rule__CREATE_TABLE__ColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 

            }

            // InternalSimpleSQL.g:2202:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* )
            // InternalSimpleSQL.g:2203:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )*
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:2204:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleSQL.g:2204:4: rule__CREATE_TABLE__ColumnsAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CREATE_TABLE__ColumnsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSimpleSQL.g:2213:1: rule__CREATE_TABLE__Group__10 : rule__CREATE_TABLE__Group__10__Impl ;
    public final void rule__CREATE_TABLE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2217:1: ( rule__CREATE_TABLE__Group__10__Impl )
            // InternalSimpleSQL.g:2218:2: rule__CREATE_TABLE__Group__10__Impl
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
    // InternalSimpleSQL.g:2224:1: rule__CREATE_TABLE__Group__10__Impl : ( ')' ) ;
    public final void rule__CREATE_TABLE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2228:1: ( ( ')' ) )
            // InternalSimpleSQL.g:2229:1: ( ')' )
            {
            // InternalSimpleSQL.g:2229:1: ( ')' )
            // InternalSimpleSQL.g:2230:2: ')'
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
    // InternalSimpleSQL.g:2240:1: rule__COLUMN_DEF__Group__0 : rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1 ;
    public final void rule__COLUMN_DEF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2244:1: ( rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1 )
            // InternalSimpleSQL.g:2245:2: rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSimpleSQL.g:2252:1: rule__COLUMN_DEF__Group__0__Impl : ( ( rule__COLUMN_DEF__NameAssignment_0 ) ) ;
    public final void rule__COLUMN_DEF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2256:1: ( ( ( rule__COLUMN_DEF__NameAssignment_0 ) ) )
            // InternalSimpleSQL.g:2257:1: ( ( rule__COLUMN_DEF__NameAssignment_0 ) )
            {
            // InternalSimpleSQL.g:2257:1: ( ( rule__COLUMN_DEF__NameAssignment_0 ) )
            // InternalSimpleSQL.g:2258:2: ( rule__COLUMN_DEF__NameAssignment_0 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getNameAssignment_0()); 
            // InternalSimpleSQL.g:2259:2: ( rule__COLUMN_DEF__NameAssignment_0 )
            // InternalSimpleSQL.g:2259:3: rule__COLUMN_DEF__NameAssignment_0
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
    // InternalSimpleSQL.g:2267:1: rule__COLUMN_DEF__Group__1 : rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2 ;
    public final void rule__COLUMN_DEF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2271:1: ( rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2 )
            // InternalSimpleSQL.g:2272:2: rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSimpleSQL.g:2279:1: rule__COLUMN_DEF__Group__1__Impl : ( 'with' ) ;
    public final void rule__COLUMN_DEF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2283:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:2284:1: ( 'with' )
            {
            // InternalSimpleSQL.g:2284:1: ( 'with' )
            // InternalSimpleSQL.g:2285:2: 'with'
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2294:1: rule__COLUMN_DEF__Group__2 : rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3 ;
    public final void rule__COLUMN_DEF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2298:1: ( rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3 )
            // InternalSimpleSQL.g:2299:2: rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSimpleSQL.g:2306:1: rule__COLUMN_DEF__Group__2__Impl : ( 'type' ) ;
    public final void rule__COLUMN_DEF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2310:1: ( ( 'type' ) )
            // InternalSimpleSQL.g:2311:1: ( 'type' )
            {
            // InternalSimpleSQL.g:2311:1: ( 'type' )
            // InternalSimpleSQL.g:2312:2: 'type'
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2321:1: rule__COLUMN_DEF__Group__3 : rule__COLUMN_DEF__Group__3__Impl ;
    public final void rule__COLUMN_DEF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2325:1: ( rule__COLUMN_DEF__Group__3__Impl )
            // InternalSimpleSQL.g:2326:2: rule__COLUMN_DEF__Group__3__Impl
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
    // InternalSimpleSQL.g:2332:1: rule__COLUMN_DEF__Group__3__Impl : ( ( rule__COLUMN_DEF__TypeAssignment_3 ) ) ;
    public final void rule__COLUMN_DEF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2336:1: ( ( ( rule__COLUMN_DEF__TypeAssignment_3 ) ) )
            // InternalSimpleSQL.g:2337:1: ( ( rule__COLUMN_DEF__TypeAssignment_3 ) )
            {
            // InternalSimpleSQL.g:2337:1: ( ( rule__COLUMN_DEF__TypeAssignment_3 ) )
            // InternalSimpleSQL.g:2338:2: ( rule__COLUMN_DEF__TypeAssignment_3 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeAssignment_3()); 
            // InternalSimpleSQL.g:2339:2: ( rule__COLUMN_DEF__TypeAssignment_3 )
            // InternalSimpleSQL.g:2339:3: rule__COLUMN_DEF__TypeAssignment_3
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
    // InternalSimpleSQL.g:2348:1: rule__INSERT__Group__0 : rule__INSERT__Group__0__Impl rule__INSERT__Group__1 ;
    public final void rule__INSERT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2352:1: ( rule__INSERT__Group__0__Impl rule__INSERT__Group__1 )
            // InternalSimpleSQL.g:2353:2: rule__INSERT__Group__0__Impl rule__INSERT__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleSQL.g:2360:1: rule__INSERT__Group__0__Impl : ( 'add' ) ;
    public final void rule__INSERT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2364:1: ( ( 'add' ) )
            // InternalSimpleSQL.g:2365:1: ( 'add' )
            {
            // InternalSimpleSQL.g:2365:1: ( 'add' )
            // InternalSimpleSQL.g:2366:2: 'add'
            {
             before(grammarAccess.getINSERTAccess().getAddKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2375:1: rule__INSERT__Group__1 : rule__INSERT__Group__1__Impl rule__INSERT__Group__2 ;
    public final void rule__INSERT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2379:1: ( rule__INSERT__Group__1__Impl rule__INSERT__Group__2 )
            // InternalSimpleSQL.g:2380:2: rule__INSERT__Group__1__Impl rule__INSERT__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleSQL.g:2387:1: rule__INSERT__Group__1__Impl : ( 'entry' ) ;
    public final void rule__INSERT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2391:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:2392:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:2392:1: ( 'entry' )
            // InternalSimpleSQL.g:2393:2: 'entry'
            {
             before(grammarAccess.getINSERTAccess().getEntryKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2402:1: rule__INSERT__Group__2 : rule__INSERT__Group__2__Impl rule__INSERT__Group__3 ;
    public final void rule__INSERT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2406:1: ( rule__INSERT__Group__2__Impl rule__INSERT__Group__3 )
            // InternalSimpleSQL.g:2407:2: rule__INSERT__Group__2__Impl rule__INSERT__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleSQL.g:2414:1: rule__INSERT__Group__2__Impl : ( 'to' ) ;
    public final void rule__INSERT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2418:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:2419:1: ( 'to' )
            {
            // InternalSimpleSQL.g:2419:1: ( 'to' )
            // InternalSimpleSQL.g:2420:2: 'to'
            {
             before(grammarAccess.getINSERTAccess().getToKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2429:1: rule__INSERT__Group__3 : rule__INSERT__Group__3__Impl rule__INSERT__Group__4 ;
    public final void rule__INSERT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2433:1: ( rule__INSERT__Group__3__Impl rule__INSERT__Group__4 )
            // InternalSimpleSQL.g:2434:2: rule__INSERT__Group__3__Impl rule__INSERT__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSimpleSQL.g:2441:1: rule__INSERT__Group__3__Impl : ( ( rule__INSERT__TableAssignment_3 ) ) ;
    public final void rule__INSERT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2445:1: ( ( ( rule__INSERT__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:2446:1: ( ( rule__INSERT__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:2446:1: ( ( rule__INSERT__TableAssignment_3 ) )
            // InternalSimpleSQL.g:2447:2: ( rule__INSERT__TableAssignment_3 )
            {
             before(grammarAccess.getINSERTAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:2448:2: ( rule__INSERT__TableAssignment_3 )
            // InternalSimpleSQL.g:2448:3: rule__INSERT__TableAssignment_3
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
    // InternalSimpleSQL.g:2456:1: rule__INSERT__Group__4 : rule__INSERT__Group__4__Impl rule__INSERT__Group__5 ;
    public final void rule__INSERT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2460:1: ( rule__INSERT__Group__4__Impl rule__INSERT__Group__5 )
            // InternalSimpleSQL.g:2461:2: rule__INSERT__Group__4__Impl rule__INSERT__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleSQL.g:2468:1: rule__INSERT__Group__4__Impl : ( 'with' ) ;
    public final void rule__INSERT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2472:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:2473:1: ( 'with' )
            {
            // InternalSimpleSQL.g:2473:1: ( 'with' )
            // InternalSimpleSQL.g:2474:2: 'with'
            {
             before(grammarAccess.getINSERTAccess().getWithKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2483:1: rule__INSERT__Group__5 : rule__INSERT__Group__5__Impl rule__INSERT__Group__6 ;
    public final void rule__INSERT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2487:1: ( rule__INSERT__Group__5__Impl rule__INSERT__Group__6 )
            // InternalSimpleSQL.g:2488:2: rule__INSERT__Group__5__Impl rule__INSERT__Group__6
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
    // InternalSimpleSQL.g:2495:1: rule__INSERT__Group__5__Impl : ( 'data' ) ;
    public final void rule__INSERT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2499:1: ( ( 'data' ) )
            // InternalSimpleSQL.g:2500:1: ( 'data' )
            {
            // InternalSimpleSQL.g:2500:1: ( 'data' )
            // InternalSimpleSQL.g:2501:2: 'data'
            {
             before(grammarAccess.getINSERTAccess().getDataKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2510:1: rule__INSERT__Group__6 : rule__INSERT__Group__6__Impl rule__INSERT__Group__7 ;
    public final void rule__INSERT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2514:1: ( rule__INSERT__Group__6__Impl rule__INSERT__Group__7 )
            // InternalSimpleSQL.g:2515:2: rule__INSERT__Group__6__Impl rule__INSERT__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalSimpleSQL.g:2522:1: rule__INSERT__Group__6__Impl : ( '(' ) ;
    public final void rule__INSERT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2526:1: ( ( '(' ) )
            // InternalSimpleSQL.g:2527:1: ( '(' )
            {
            // InternalSimpleSQL.g:2527:1: ( '(' )
            // InternalSimpleSQL.g:2528:2: '('
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
    // InternalSimpleSQL.g:2537:1: rule__INSERT__Group__7 : rule__INSERT__Group__7__Impl rule__INSERT__Group__8 ;
    public final void rule__INSERT__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2541:1: ( rule__INSERT__Group__7__Impl rule__INSERT__Group__8 )
            // InternalSimpleSQL.g:2542:2: rule__INSERT__Group__7__Impl rule__INSERT__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalSimpleSQL.g:2549:1: rule__INSERT__Group__7__Impl : ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) ) ;
    public final void rule__INSERT__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2553:1: ( ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) ) )
            // InternalSimpleSQL.g:2554:1: ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) )
            {
            // InternalSimpleSQL.g:2554:1: ( ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* ) )
            // InternalSimpleSQL.g:2555:2: ( ( rule__INSERT__DataAssignment_7 ) ) ( ( rule__INSERT__DataAssignment_7 )* )
            {
            // InternalSimpleSQL.g:2555:2: ( ( rule__INSERT__DataAssignment_7 ) )
            // InternalSimpleSQL.g:2556:3: ( rule__INSERT__DataAssignment_7 )
            {
             before(grammarAccess.getINSERTAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:2557:3: ( rule__INSERT__DataAssignment_7 )
            // InternalSimpleSQL.g:2557:4: rule__INSERT__DataAssignment_7
            {
            pushFollow(FOLLOW_21);
            rule__INSERT__DataAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getINSERTAccess().getDataAssignment_7()); 

            }

            // InternalSimpleSQL.g:2560:2: ( ( rule__INSERT__DataAssignment_7 )* )
            // InternalSimpleSQL.g:2561:3: ( rule__INSERT__DataAssignment_7 )*
            {
             before(grammarAccess.getINSERTAccess().getDataAssignment_7()); 
            // InternalSimpleSQL.g:2562:3: ( rule__INSERT__DataAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT||LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimpleSQL.g:2562:4: rule__INSERT__DataAssignment_7
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__INSERT__DataAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSimpleSQL.g:2571:1: rule__INSERT__Group__8 : rule__INSERT__Group__8__Impl ;
    public final void rule__INSERT__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2575:1: ( rule__INSERT__Group__8__Impl )
            // InternalSimpleSQL.g:2576:2: rule__INSERT__Group__8__Impl
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
    // InternalSimpleSQL.g:2582:1: rule__INSERT__Group__8__Impl : ( ')' ) ;
    public final void rule__INSERT__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2586:1: ( ( ')' ) )
            // InternalSimpleSQL.g:2587:1: ( ')' )
            {
            // InternalSimpleSQL.g:2587:1: ( ')' )
            // InternalSimpleSQL.g:2588:2: ')'
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
    // InternalSimpleSQL.g:2598:1: rule__Insert_List__Group_0__0 : rule__Insert_List__Group_0__0__Impl rule__Insert_List__Group_0__1 ;
    public final void rule__Insert_List__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2602:1: ( rule__Insert_List__Group_0__0__Impl rule__Insert_List__Group_0__1 )
            // InternalSimpleSQL.g:2603:2: rule__Insert_List__Group_0__0__Impl rule__Insert_List__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSimpleSQL.g:2610:1: rule__Insert_List__Group_0__0__Impl : ( '\"' ) ;
    public final void rule__Insert_List__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2614:1: ( ( '\"' ) )
            // InternalSimpleSQL.g:2615:1: ( '\"' )
            {
            // InternalSimpleSQL.g:2615:1: ( '\"' )
            // InternalSimpleSQL.g:2616:2: '\"'
            {
             before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2625:1: rule__Insert_List__Group_0__1 : rule__Insert_List__Group_0__1__Impl ;
    public final void rule__Insert_List__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2629:1: ( rule__Insert_List__Group_0__1__Impl )
            // InternalSimpleSQL.g:2630:2: rule__Insert_List__Group_0__1__Impl
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
    // InternalSimpleSQL.g:2636:1: rule__Insert_List__Group_0__1__Impl : ( ( rule__Insert_List__DataAssignment_0_1 ) ) ;
    public final void rule__Insert_List__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2640:1: ( ( ( rule__Insert_List__DataAssignment_0_1 ) ) )
            // InternalSimpleSQL.g:2641:1: ( ( rule__Insert_List__DataAssignment_0_1 ) )
            {
            // InternalSimpleSQL.g:2641:1: ( ( rule__Insert_List__DataAssignment_0_1 ) )
            // InternalSimpleSQL.g:2642:2: ( rule__Insert_List__DataAssignment_0_1 )
            {
             before(grammarAccess.getInsert_ListAccess().getDataAssignment_0_1()); 
            // InternalSimpleSQL.g:2643:2: ( rule__Insert_List__DataAssignment_0_1 )
            // InternalSimpleSQL.g:2643:3: rule__Insert_List__DataAssignment_0_1
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
    // InternalSimpleSQL.g:2652:1: rule__Insert_List__Group_1__0 : rule__Insert_List__Group_1__0__Impl rule__Insert_List__Group_1__1 ;
    public final void rule__Insert_List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2656:1: ( rule__Insert_List__Group_1__0__Impl rule__Insert_List__Group_1__1 )
            // InternalSimpleSQL.g:2657:2: rule__Insert_List__Group_1__0__Impl rule__Insert_List__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSimpleSQL.g:2664:1: rule__Insert_List__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Insert_List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2668:1: ( ( RULE_INT ) )
            // InternalSimpleSQL.g:2669:1: ( RULE_INT )
            {
            // InternalSimpleSQL.g:2669:1: ( RULE_INT )
            // InternalSimpleSQL.g:2670:2: RULE_INT
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
    // InternalSimpleSQL.g:2679:1: rule__Insert_List__Group_1__1 : rule__Insert_List__Group_1__1__Impl ;
    public final void rule__Insert_List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2683:1: ( rule__Insert_List__Group_1__1__Impl )
            // InternalSimpleSQL.g:2684:2: rule__Insert_List__Group_1__1__Impl
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
    // InternalSimpleSQL.g:2690:1: rule__Insert_List__Group_1__1__Impl : ( '\"' ) ;
    public final void rule__Insert_List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2694:1: ( ( '\"' ) )
            // InternalSimpleSQL.g:2695:1: ( '\"' )
            {
            // InternalSimpleSQL.g:2695:1: ( '\"' )
            // InternalSimpleSQL.g:2696:2: '\"'
            {
             before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSimpleSQL.g:2706:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2710:1: ( ( ruleStatement ) )
            // InternalSimpleSQL.g:2711:2: ( ruleStatement )
            {
            // InternalSimpleSQL.g:2711:2: ( ruleStatement )
            // InternalSimpleSQL.g:2712:3: ruleStatement
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


    // $ANTLR start "rule__ORDERBY__TableAssignment_2"
    // InternalSimpleSQL.g:2721:1: rule__ORDERBY__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ORDERBY__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2725:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2726:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2726:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2727:3: ( RULE_ID )
            {
             before(grammarAccess.getORDERBYAccess().getTableCREATE_TABLECrossReference_2_0()); 
            // InternalSimpleSQL.g:2728:3: ( RULE_ID )
            // InternalSimpleSQL.g:2729:4: RULE_ID
            {
             before(grammarAccess.getORDERBYAccess().getTableCREATE_TABLEIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getORDERBYAccess().getTableCREATE_TABLEIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getORDERBYAccess().getTableCREATE_TABLECrossReference_2_0()); 

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
    // $ANTLR end "rule__ORDERBY__TableAssignment_2"


    // $ANTLR start "rule__ORDERBY__ColAssignment_4"
    // InternalSimpleSQL.g:2740:1: rule__ORDERBY__ColAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ORDERBY__ColAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2744:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2745:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2745:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2746:3: ( RULE_ID )
            {
             before(grammarAccess.getORDERBYAccess().getColCOLUMN_DEFCrossReference_4_0()); 
            // InternalSimpleSQL.g:2747:3: ( RULE_ID )
            // InternalSimpleSQL.g:2748:4: RULE_ID
            {
             before(grammarAccess.getORDERBYAccess().getColCOLUMN_DEFIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getORDERBYAccess().getColCOLUMN_DEFIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getORDERBYAccess().getColCOLUMN_DEFCrossReference_4_0()); 

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
    // $ANTLR end "rule__ORDERBY__ColAssignment_4"


    // $ANTLR start "rule__WHERE__NameAssignment_3"
    // InternalSimpleSQL.g:2759:1: rule__WHERE__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__WHERE__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2763:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2764:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2764:2: ( RULE_ID )
            // InternalSimpleSQL.g:2765:3: RULE_ID
            {
             before(grammarAccess.getWHEREAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__WHERE__NameAssignment_3"


    // $ANTLR start "rule__WHERE__DbAssignment_5"
    // InternalSimpleSQL.g:2774:1: rule__WHERE__DbAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WHERE__DbAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2778:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2779:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2779:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2780:3: ( RULE_ID )
            {
             before(grammarAccess.getWHEREAccess().getDbCREATE_DBCrossReference_5_0()); 
            // InternalSimpleSQL.g:2781:3: ( RULE_ID )
            // InternalSimpleSQL.g:2782:4: RULE_ID
            {
             before(grammarAccess.getWHEREAccess().getDbCREATE_DBIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWHEREAccess().getDbCREATE_DBIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWHEREAccess().getDbCREATE_DBCrossReference_5_0()); 

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
    // $ANTLR end "rule__WHERE__DbAssignment_5"


    // $ANTLR start "rule__WHERE__ColumnsAssignment_9"
    // InternalSimpleSQL.g:2793:1: rule__WHERE__ColumnsAssignment_9 : ( ruleCOLUMN_DEF ) ;
    public final void rule__WHERE__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2797:1: ( ( ruleCOLUMN_DEF ) )
            // InternalSimpleSQL.g:2798:2: ( ruleCOLUMN_DEF )
            {
            // InternalSimpleSQL.g:2798:2: ( ruleCOLUMN_DEF )
            // InternalSimpleSQL.g:2799:3: ruleCOLUMN_DEF
            {
             before(grammarAccess.getWHEREAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLUMN_DEF();

            state._fsp--;

             after(grammarAccess.getWHEREAccess().getColumnsCOLUMN_DEFParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__WHERE__ColumnsAssignment_9"


    // $ANTLR start "rule__INNERJOIN__TableAssignment_2"
    // InternalSimpleSQL.g:2808:1: rule__INNERJOIN__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__INNERJOIN__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2812:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2813:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2813:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2814:3: ( RULE_ID )
            {
             before(grammarAccess.getINNERJOINAccess().getTableCREATE_TABLECrossReference_2_0()); 
            // InternalSimpleSQL.g:2815:3: ( RULE_ID )
            // InternalSimpleSQL.g:2816:4: RULE_ID
            {
             before(grammarAccess.getINNERJOINAccess().getTableCREATE_TABLEIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getINNERJOINAccess().getTableCREATE_TABLEIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getINNERJOINAccess().getTableCREATE_TABLECrossReference_2_0()); 

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
    // $ANTLR end "rule__INNERJOIN__TableAssignment_2"


    // $ANTLR start "rule__SELECT__NameAssignment_1_0"
    // InternalSimpleSQL.g:2827:1: rule__SELECT__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__SELECT__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2831:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2832:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2832:2: ( RULE_ID )
            // InternalSimpleSQL.g:2833:3: RULE_ID
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
    // InternalSimpleSQL.g:2842:1: rule__SELECT__TableAssignment_3 : ( RULE_ID ) ;
    public final void rule__SELECT__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2846:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2847:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2847:2: ( RULE_ID )
            // InternalSimpleSQL.g:2848:3: RULE_ID
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
    // InternalSimpleSQL.g:2857:1: rule__UPDATE__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UPDATE__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2861:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2862:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2862:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2863:3: ( RULE_ID )
            {
             before(grammarAccess.getUPDATEAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:2864:3: ( RULE_ID )
            // InternalSimpleSQL.g:2865:4: RULE_ID
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


    // $ANTLR start "rule__UPDATE__ColsAssignment_7"
    // InternalSimpleSQL.g:2876:1: rule__UPDATE__ColsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__UPDATE__ColsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2880:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2881:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2881:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2882:3: ( RULE_ID )
            {
             before(grammarAccess.getUPDATEAccess().getColsCOLUMN_DEFCrossReference_7_0()); 
            // InternalSimpleSQL.g:2883:3: ( RULE_ID )
            // InternalSimpleSQL.g:2884:4: RULE_ID
            {
             before(grammarAccess.getUPDATEAccess().getColsCOLUMN_DEFIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUPDATEAccess().getColsCOLUMN_DEFIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getUPDATEAccess().getColsCOLUMN_DEFCrossReference_7_0()); 

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
    // $ANTLR end "rule__UPDATE__ColsAssignment_7"


    // $ANTLR start "rule__UPDATE__DataAssignment_12"
    // InternalSimpleSQL.g:2895:1: rule__UPDATE__DataAssignment_12 : ( ruleInsert_List ) ;
    public final void rule__UPDATE__DataAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2899:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:2900:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:2900:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:2901:3: ruleInsert_List
            {
             before(grammarAccess.getUPDATEAccess().getDataInsert_ListParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleInsert_List();

            state._fsp--;

             after(grammarAccess.getUPDATEAccess().getDataInsert_ListParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__UPDATE__DataAssignment_12"


    // $ANTLR start "rule__DELETE__TableAssignment_3"
    // InternalSimpleSQL.g:2910:1: rule__DELETE__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DELETE__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2914:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2915:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2915:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2916:3: ( RULE_ID )
            {
             before(grammarAccess.getDELETEAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:2917:3: ( RULE_ID )
            // InternalSimpleSQL.g:2918:4: RULE_ID
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
    // InternalSimpleSQL.g:2929:1: rule__DELETE__DataAssignment_7 : ( ruleInsert_List ) ;
    public final void rule__DELETE__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2933:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:2934:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:2934:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:2935:3: ruleInsert_List
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
    // InternalSimpleSQL.g:2944:1: rule__CREATE_DB__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CREATE_DB__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2948:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2949:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2949:2: ( RULE_ID )
            // InternalSimpleSQL.g:2950:3: RULE_ID
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
    // InternalSimpleSQL.g:2959:1: rule__CREATE_TABLE__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CREATE_TABLE__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2963:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2964:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:2964:2: ( RULE_ID )
            // InternalSimpleSQL.g:2965:3: RULE_ID
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
    // InternalSimpleSQL.g:2974:1: rule__CREATE_TABLE__DbAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CREATE_TABLE__DbAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2978:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:2979:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:2979:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:2980:3: ( RULE_ID )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbCREATE_DBCrossReference_5_0()); 
            // InternalSimpleSQL.g:2981:3: ( RULE_ID )
            // InternalSimpleSQL.g:2982:4: RULE_ID
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
    // InternalSimpleSQL.g:2993:1: rule__CREATE_TABLE__ColumnsAssignment_9 : ( ruleCOLUMN_DEF ) ;
    public final void rule__CREATE_TABLE__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:2997:1: ( ( ruleCOLUMN_DEF ) )
            // InternalSimpleSQL.g:2998:2: ( ruleCOLUMN_DEF )
            {
            // InternalSimpleSQL.g:2998:2: ( ruleCOLUMN_DEF )
            // InternalSimpleSQL.g:2999:3: ruleCOLUMN_DEF
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
    // InternalSimpleSQL.g:3008:1: rule__COLUMN_DEF__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__COLUMN_DEF__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:3012:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:3013:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:3013:2: ( RULE_ID )
            // InternalSimpleSQL.g:3014:3: RULE_ID
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
    // InternalSimpleSQL.g:3023:1: rule__COLUMN_DEF__TypeAssignment_3 : ( ruleTYPE ) ;
    public final void rule__COLUMN_DEF__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:3027:1: ( ( ruleTYPE ) )
            // InternalSimpleSQL.g:3028:2: ( ruleTYPE )
            {
            // InternalSimpleSQL.g:3028:2: ( ruleTYPE )
            // InternalSimpleSQL.g:3029:3: ruleTYPE
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
    // InternalSimpleSQL.g:3038:1: rule__INSERT__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__INSERT__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:3042:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:3043:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:3043:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:3044:3: ( RULE_ID )
            {
             before(grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:3045:3: ( RULE_ID )
            // InternalSimpleSQL.g:3046:4: RULE_ID
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
    // InternalSimpleSQL.g:3057:1: rule__INSERT__DataAssignment_7 : ( ruleInsert_List ) ;
    public final void rule__INSERT__DataAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:3061:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:3062:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:3062:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:3063:3: ruleInsert_List
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
    // InternalSimpleSQL.g:3072:1: rule__Insert_List__DataAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Insert_List__DataAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:3076:1: ( ( RULE_STRING ) )
            // InternalSimpleSQL.g:3077:2: ( RULE_STRING )
            {
            // InternalSimpleSQL.g:3077:2: ( RULE_STRING )
            // InternalSimpleSQL.g:3078:3: RULE_STRING
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\1\uffff\1\43\6\uffff\1\24\2\uffff";
    static final String dfa_3s = "\1\46\1\uffff\1\43\6\uffff\1\44\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\2\1\3";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\1\uffff\1\7\6\uffff\1\6\2\uffff\1\1\1\5\3\uffff\1\4\1\2\3\uffff\1\3",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\17\uffff\1\12",
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
            return "393:1: rule__Statement__Alternatives : ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) | ( ruleDELETE ) | ( ruleUPDATE ) | ( ruleINNERJOIN ) | ( ruleWHERE ) | ( ruleORDERBY ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004632050002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});

}