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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'all'", "'string'", "'int'", "'double'", "'date'", "'show'", "'in'", "'create'", "'new'", "'database'", "'table'", "'with'", "'columns'", "'('", "')'", "'type'", "'add'", "'entry'", "'to'", "'\"'"
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

                if ( (LA1_0==16||LA1_0==18||LA1_0==27) ) {
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


    // $ANTLR start "entryRuleCREATE_DB"
    // InternalSimpleSQL.g:128:1: entryRuleCREATE_DB : ruleCREATE_DB EOF ;
    public final void entryRuleCREATE_DB() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:129:1: ( ruleCREATE_DB EOF )
            // InternalSimpleSQL.g:130:1: ruleCREATE_DB EOF
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
    // InternalSimpleSQL.g:137:1: ruleCREATE_DB : ( ( rule__CREATE_DB__Group__0 ) ) ;
    public final void ruleCREATE_DB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:141:2: ( ( ( rule__CREATE_DB__Group__0 ) ) )
            // InternalSimpleSQL.g:142:2: ( ( rule__CREATE_DB__Group__0 ) )
            {
            // InternalSimpleSQL.g:142:2: ( ( rule__CREATE_DB__Group__0 ) )
            // InternalSimpleSQL.g:143:3: ( rule__CREATE_DB__Group__0 )
            {
             before(grammarAccess.getCREATE_DBAccess().getGroup()); 
            // InternalSimpleSQL.g:144:3: ( rule__CREATE_DB__Group__0 )
            // InternalSimpleSQL.g:144:4: rule__CREATE_DB__Group__0
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
    // InternalSimpleSQL.g:153:1: entryRuleCREATE_TABLE : ruleCREATE_TABLE EOF ;
    public final void entryRuleCREATE_TABLE() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:154:1: ( ruleCREATE_TABLE EOF )
            // InternalSimpleSQL.g:155:1: ruleCREATE_TABLE EOF
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
    // InternalSimpleSQL.g:162:1: ruleCREATE_TABLE : ( ( rule__CREATE_TABLE__Group__0 ) ) ;
    public final void ruleCREATE_TABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:166:2: ( ( ( rule__CREATE_TABLE__Group__0 ) ) )
            // InternalSimpleSQL.g:167:2: ( ( rule__CREATE_TABLE__Group__0 ) )
            {
            // InternalSimpleSQL.g:167:2: ( ( rule__CREATE_TABLE__Group__0 ) )
            // InternalSimpleSQL.g:168:3: ( rule__CREATE_TABLE__Group__0 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getGroup()); 
            // InternalSimpleSQL.g:169:3: ( rule__CREATE_TABLE__Group__0 )
            // InternalSimpleSQL.g:169:4: rule__CREATE_TABLE__Group__0
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
    // InternalSimpleSQL.g:178:1: entryRuleCOLUMN_DEF : ruleCOLUMN_DEF EOF ;
    public final void entryRuleCOLUMN_DEF() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:179:1: ( ruleCOLUMN_DEF EOF )
            // InternalSimpleSQL.g:180:1: ruleCOLUMN_DEF EOF
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
    // InternalSimpleSQL.g:187:1: ruleCOLUMN_DEF : ( ( rule__COLUMN_DEF__Group__0 ) ) ;
    public final void ruleCOLUMN_DEF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:191:2: ( ( ( rule__COLUMN_DEF__Group__0 ) ) )
            // InternalSimpleSQL.g:192:2: ( ( rule__COLUMN_DEF__Group__0 ) )
            {
            // InternalSimpleSQL.g:192:2: ( ( rule__COLUMN_DEF__Group__0 ) )
            // InternalSimpleSQL.g:193:3: ( rule__COLUMN_DEF__Group__0 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getGroup()); 
            // InternalSimpleSQL.g:194:3: ( rule__COLUMN_DEF__Group__0 )
            // InternalSimpleSQL.g:194:4: rule__COLUMN_DEF__Group__0
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
    // InternalSimpleSQL.g:203:1: entryRuleINSERT : ruleINSERT EOF ;
    public final void entryRuleINSERT() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:204:1: ( ruleINSERT EOF )
            // InternalSimpleSQL.g:205:1: ruleINSERT EOF
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
    // InternalSimpleSQL.g:212:1: ruleINSERT : ( ( rule__INSERT__Group__0 ) ) ;
    public final void ruleINSERT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:216:2: ( ( ( rule__INSERT__Group__0 ) ) )
            // InternalSimpleSQL.g:217:2: ( ( rule__INSERT__Group__0 ) )
            {
            // InternalSimpleSQL.g:217:2: ( ( rule__INSERT__Group__0 ) )
            // InternalSimpleSQL.g:218:3: ( rule__INSERT__Group__0 )
            {
             before(grammarAccess.getINSERTAccess().getGroup()); 
            // InternalSimpleSQL.g:219:3: ( rule__INSERT__Group__0 )
            // InternalSimpleSQL.g:219:4: rule__INSERT__Group__0
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
    // InternalSimpleSQL.g:228:1: entryRuleInsert_List : ruleInsert_List EOF ;
    public final void entryRuleInsert_List() throws RecognitionException {
        try {
            // InternalSimpleSQL.g:229:1: ( ruleInsert_List EOF )
            // InternalSimpleSQL.g:230:1: ruleInsert_List EOF
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
    // InternalSimpleSQL.g:237:1: ruleInsert_List : ( ( rule__Insert_List__Group__0 ) ) ;
    public final void ruleInsert_List() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:241:2: ( ( ( rule__Insert_List__Group__0 ) ) )
            // InternalSimpleSQL.g:242:2: ( ( rule__Insert_List__Group__0 ) )
            {
            // InternalSimpleSQL.g:242:2: ( ( rule__Insert_List__Group__0 ) )
            // InternalSimpleSQL.g:243:3: ( rule__Insert_List__Group__0 )
            {
             before(grammarAccess.getInsert_ListAccess().getGroup()); 
            // InternalSimpleSQL.g:244:3: ( rule__Insert_List__Group__0 )
            // InternalSimpleSQL.g:244:4: rule__Insert_List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsert_ListAccess().getGroup()); 

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
    // InternalSimpleSQL.g:253:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:257:1: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalSimpleSQL.g:258:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalSimpleSQL.g:258:2: ( ( rule__TYPE__Alternatives ) )
            // InternalSimpleSQL.g:259:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalSimpleSQL.g:260:3: ( rule__TYPE__Alternatives )
            // InternalSimpleSQL.g:260:4: rule__TYPE__Alternatives
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
    // InternalSimpleSQL.g:268:1: rule__Statement__Alternatives : ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:272:1: ( ( ruleSELECT ) | ( ruleCREATE_DB ) | ( ruleCREATE_TABLE ) | ( ruleINSERT ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==19) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==20) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==21) ) {
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
            case 27:
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
                    // InternalSimpleSQL.g:273:2: ( ruleSELECT )
                    {
                    // InternalSimpleSQL.g:273:2: ( ruleSELECT )
                    // InternalSimpleSQL.g:274:3: ruleSELECT
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
                    // InternalSimpleSQL.g:279:2: ( ruleCREATE_DB )
                    {
                    // InternalSimpleSQL.g:279:2: ( ruleCREATE_DB )
                    // InternalSimpleSQL.g:280:3: ruleCREATE_DB
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
                    // InternalSimpleSQL.g:285:2: ( ruleCREATE_TABLE )
                    {
                    // InternalSimpleSQL.g:285:2: ( ruleCREATE_TABLE )
                    // InternalSimpleSQL.g:286:3: ruleCREATE_TABLE
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
                    // InternalSimpleSQL.g:291:2: ( ruleINSERT )
                    {
                    // InternalSimpleSQL.g:291:2: ( ruleINSERT )
                    // InternalSimpleSQL.g:292:3: ruleINSERT
                    {
                     before(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleINSERT();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getINSERTParserRuleCall_3()); 

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
    // InternalSimpleSQL.g:301:1: rule__SELECT__Alternatives_1 : ( ( ( rule__SELECT__NameAssignment_1_0 ) ) | ( 'all' ) );
    public final void rule__SELECT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:305:1: ( ( ( rule__SELECT__NameAssignment_1_0 ) ) | ( 'all' ) )
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
                    // InternalSimpleSQL.g:306:2: ( ( rule__SELECT__NameAssignment_1_0 ) )
                    {
                    // InternalSimpleSQL.g:306:2: ( ( rule__SELECT__NameAssignment_1_0 ) )
                    // InternalSimpleSQL.g:307:3: ( rule__SELECT__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getSELECTAccess().getNameAssignment_1_0()); 
                    // InternalSimpleSQL.g:308:3: ( rule__SELECT__NameAssignment_1_0 )
                    // InternalSimpleSQL.g:308:4: rule__SELECT__NameAssignment_1_0
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
                    // InternalSimpleSQL.g:312:2: ( 'all' )
                    {
                    // InternalSimpleSQL.g:312:2: ( 'all' )
                    // InternalSimpleSQL.g:313:3: 'all'
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


    // $ANTLR start "rule__TYPE__Alternatives"
    // InternalSimpleSQL.g:322:1: rule__TYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:326:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'date' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSimpleSQL.g:327:2: ( ( 'string' ) )
                    {
                    // InternalSimpleSQL.g:327:2: ( ( 'string' ) )
                    // InternalSimpleSQL.g:328:3: ( 'string' )
                    {
                     before(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSimpleSQL.g:329:3: ( 'string' )
                    // InternalSimpleSQL.g:329:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleSQL.g:333:2: ( ( 'int' ) )
                    {
                    // InternalSimpleSQL.g:333:2: ( ( 'int' ) )
                    // InternalSimpleSQL.g:334:3: ( 'int' )
                    {
                     before(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSimpleSQL.g:335:3: ( 'int' )
                    // InternalSimpleSQL.g:335:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleSQL.g:339:2: ( ( 'double' ) )
                    {
                    // InternalSimpleSQL.g:339:2: ( ( 'double' ) )
                    // InternalSimpleSQL.g:340:3: ( 'double' )
                    {
                     before(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // InternalSimpleSQL.g:341:3: ( 'double' )
                    // InternalSimpleSQL.g:341:4: 'double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleSQL.g:345:2: ( ( 'date' ) )
                    {
                    // InternalSimpleSQL.g:345:2: ( ( 'date' ) )
                    // InternalSimpleSQL.g:346:3: ( 'date' )
                    {
                     before(grammarAccess.getTYPEAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalSimpleSQL.g:347:3: ( 'date' )
                    // InternalSimpleSQL.g:347:4: 'date'
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
    // InternalSimpleSQL.g:355:1: rule__SELECT__Group__0 : rule__SELECT__Group__0__Impl rule__SELECT__Group__1 ;
    public final void rule__SELECT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:359:1: ( rule__SELECT__Group__0__Impl rule__SELECT__Group__1 )
            // InternalSimpleSQL.g:360:2: rule__SELECT__Group__0__Impl rule__SELECT__Group__1
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
    // InternalSimpleSQL.g:367:1: rule__SELECT__Group__0__Impl : ( 'show' ) ;
    public final void rule__SELECT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:371:1: ( ( 'show' ) )
            // InternalSimpleSQL.g:372:1: ( 'show' )
            {
            // InternalSimpleSQL.g:372:1: ( 'show' )
            // InternalSimpleSQL.g:373:2: 'show'
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
    // InternalSimpleSQL.g:382:1: rule__SELECT__Group__1 : rule__SELECT__Group__1__Impl rule__SELECT__Group__2 ;
    public final void rule__SELECT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:386:1: ( rule__SELECT__Group__1__Impl rule__SELECT__Group__2 )
            // InternalSimpleSQL.g:387:2: rule__SELECT__Group__1__Impl rule__SELECT__Group__2
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
    // InternalSimpleSQL.g:394:1: rule__SELECT__Group__1__Impl : ( ( rule__SELECT__Alternatives_1 ) ) ;
    public final void rule__SELECT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:398:1: ( ( ( rule__SELECT__Alternatives_1 ) ) )
            // InternalSimpleSQL.g:399:1: ( ( rule__SELECT__Alternatives_1 ) )
            {
            // InternalSimpleSQL.g:399:1: ( ( rule__SELECT__Alternatives_1 ) )
            // InternalSimpleSQL.g:400:2: ( rule__SELECT__Alternatives_1 )
            {
             before(grammarAccess.getSELECTAccess().getAlternatives_1()); 
            // InternalSimpleSQL.g:401:2: ( rule__SELECT__Alternatives_1 )
            // InternalSimpleSQL.g:401:3: rule__SELECT__Alternatives_1
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
    // InternalSimpleSQL.g:409:1: rule__SELECT__Group__2 : rule__SELECT__Group__2__Impl rule__SELECT__Group__3 ;
    public final void rule__SELECT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:413:1: ( rule__SELECT__Group__2__Impl rule__SELECT__Group__3 )
            // InternalSimpleSQL.g:414:2: rule__SELECT__Group__2__Impl rule__SELECT__Group__3
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
    // InternalSimpleSQL.g:421:1: rule__SELECT__Group__2__Impl : ( 'in' ) ;
    public final void rule__SELECT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:425:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:426:1: ( 'in' )
            {
            // InternalSimpleSQL.g:426:1: ( 'in' )
            // InternalSimpleSQL.g:427:2: 'in'
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
    // InternalSimpleSQL.g:436:1: rule__SELECT__Group__3 : rule__SELECT__Group__3__Impl ;
    public final void rule__SELECT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:440:1: ( rule__SELECT__Group__3__Impl )
            // InternalSimpleSQL.g:441:2: rule__SELECT__Group__3__Impl
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
    // InternalSimpleSQL.g:447:1: rule__SELECT__Group__3__Impl : ( ( rule__SELECT__TableAssignment_3 ) ) ;
    public final void rule__SELECT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:451:1: ( ( ( rule__SELECT__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:452:1: ( ( rule__SELECT__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:452:1: ( ( rule__SELECT__TableAssignment_3 ) )
            // InternalSimpleSQL.g:453:2: ( rule__SELECT__TableAssignment_3 )
            {
             before(grammarAccess.getSELECTAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:454:2: ( rule__SELECT__TableAssignment_3 )
            // InternalSimpleSQL.g:454:3: rule__SELECT__TableAssignment_3
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


    // $ANTLR start "rule__CREATE_DB__Group__0"
    // InternalSimpleSQL.g:463:1: rule__CREATE_DB__Group__0 : rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1 ;
    public final void rule__CREATE_DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:467:1: ( rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1 )
            // InternalSimpleSQL.g:468:2: rule__CREATE_DB__Group__0__Impl rule__CREATE_DB__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleSQL.g:475:1: rule__CREATE_DB__Group__0__Impl : ( 'create' ) ;
    public final void rule__CREATE_DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:479:1: ( ( 'create' ) )
            // InternalSimpleSQL.g:480:1: ( 'create' )
            {
            // InternalSimpleSQL.g:480:1: ( 'create' )
            // InternalSimpleSQL.g:481:2: 'create'
            {
             before(grammarAccess.getCREATE_DBAccess().getCreateKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSimpleSQL.g:490:1: rule__CREATE_DB__Group__1 : rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2 ;
    public final void rule__CREATE_DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:494:1: ( rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2 )
            // InternalSimpleSQL.g:495:2: rule__CREATE_DB__Group__1__Impl rule__CREATE_DB__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSimpleSQL.g:502:1: rule__CREATE_DB__Group__1__Impl : ( 'new' ) ;
    public final void rule__CREATE_DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:506:1: ( ( 'new' ) )
            // InternalSimpleSQL.g:507:1: ( 'new' )
            {
            // InternalSimpleSQL.g:507:1: ( 'new' )
            // InternalSimpleSQL.g:508:2: 'new'
            {
             before(grammarAccess.getCREATE_DBAccess().getNewKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSimpleSQL.g:517:1: rule__CREATE_DB__Group__2 : rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3 ;
    public final void rule__CREATE_DB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:521:1: ( rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3 )
            // InternalSimpleSQL.g:522:2: rule__CREATE_DB__Group__2__Impl rule__CREATE_DB__Group__3
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
    // InternalSimpleSQL.g:529:1: rule__CREATE_DB__Group__2__Impl : ( 'database' ) ;
    public final void rule__CREATE_DB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:533:1: ( ( 'database' ) )
            // InternalSimpleSQL.g:534:1: ( 'database' )
            {
            // InternalSimpleSQL.g:534:1: ( 'database' )
            // InternalSimpleSQL.g:535:2: 'database'
            {
             before(grammarAccess.getCREATE_DBAccess().getDatabaseKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSimpleSQL.g:544:1: rule__CREATE_DB__Group__3 : rule__CREATE_DB__Group__3__Impl ;
    public final void rule__CREATE_DB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:548:1: ( rule__CREATE_DB__Group__3__Impl )
            // InternalSimpleSQL.g:549:2: rule__CREATE_DB__Group__3__Impl
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
    // InternalSimpleSQL.g:555:1: rule__CREATE_DB__Group__3__Impl : ( ( rule__CREATE_DB__NameAssignment_3 ) ) ;
    public final void rule__CREATE_DB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:559:1: ( ( ( rule__CREATE_DB__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:560:1: ( ( rule__CREATE_DB__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:560:1: ( ( rule__CREATE_DB__NameAssignment_3 ) )
            // InternalSimpleSQL.g:561:2: ( rule__CREATE_DB__NameAssignment_3 )
            {
             before(grammarAccess.getCREATE_DBAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:562:2: ( rule__CREATE_DB__NameAssignment_3 )
            // InternalSimpleSQL.g:562:3: rule__CREATE_DB__NameAssignment_3
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
    // InternalSimpleSQL.g:571:1: rule__CREATE_TABLE__Group__0 : rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1 ;
    public final void rule__CREATE_TABLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:575:1: ( rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1 )
            // InternalSimpleSQL.g:576:2: rule__CREATE_TABLE__Group__0__Impl rule__CREATE_TABLE__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleSQL.g:583:1: rule__CREATE_TABLE__Group__0__Impl : ( 'create' ) ;
    public final void rule__CREATE_TABLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:587:1: ( ( 'create' ) )
            // InternalSimpleSQL.g:588:1: ( 'create' )
            {
            // InternalSimpleSQL.g:588:1: ( 'create' )
            // InternalSimpleSQL.g:589:2: 'create'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getCreateKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSimpleSQL.g:598:1: rule__CREATE_TABLE__Group__1 : rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2 ;
    public final void rule__CREATE_TABLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:602:1: ( rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2 )
            // InternalSimpleSQL.g:603:2: rule__CREATE_TABLE__Group__1__Impl rule__CREATE_TABLE__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleSQL.g:610:1: rule__CREATE_TABLE__Group__1__Impl : ( 'new' ) ;
    public final void rule__CREATE_TABLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:614:1: ( ( 'new' ) )
            // InternalSimpleSQL.g:615:1: ( 'new' )
            {
            // InternalSimpleSQL.g:615:1: ( 'new' )
            // InternalSimpleSQL.g:616:2: 'new'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNewKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSimpleSQL.g:625:1: rule__CREATE_TABLE__Group__2 : rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3 ;
    public final void rule__CREATE_TABLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:629:1: ( rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3 )
            // InternalSimpleSQL.g:630:2: rule__CREATE_TABLE__Group__2__Impl rule__CREATE_TABLE__Group__3
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
    // InternalSimpleSQL.g:637:1: rule__CREATE_TABLE__Group__2__Impl : ( 'table' ) ;
    public final void rule__CREATE_TABLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:641:1: ( ( 'table' ) )
            // InternalSimpleSQL.g:642:1: ( 'table' )
            {
            // InternalSimpleSQL.g:642:1: ( 'table' )
            // InternalSimpleSQL.g:643:2: 'table'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getTableKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSimpleSQL.g:652:1: rule__CREATE_TABLE__Group__3 : rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4 ;
    public final void rule__CREATE_TABLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:656:1: ( rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4 )
            // InternalSimpleSQL.g:657:2: rule__CREATE_TABLE__Group__3__Impl rule__CREATE_TABLE__Group__4
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
    // InternalSimpleSQL.g:664:1: rule__CREATE_TABLE__Group__3__Impl : ( ( rule__CREATE_TABLE__NameAssignment_3 ) ) ;
    public final void rule__CREATE_TABLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:668:1: ( ( ( rule__CREATE_TABLE__NameAssignment_3 ) ) )
            // InternalSimpleSQL.g:669:1: ( ( rule__CREATE_TABLE__NameAssignment_3 ) )
            {
            // InternalSimpleSQL.g:669:1: ( ( rule__CREATE_TABLE__NameAssignment_3 ) )
            // InternalSimpleSQL.g:670:2: ( rule__CREATE_TABLE__NameAssignment_3 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getNameAssignment_3()); 
            // InternalSimpleSQL.g:671:2: ( rule__CREATE_TABLE__NameAssignment_3 )
            // InternalSimpleSQL.g:671:3: rule__CREATE_TABLE__NameAssignment_3
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
    // InternalSimpleSQL.g:679:1: rule__CREATE_TABLE__Group__4 : rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5 ;
    public final void rule__CREATE_TABLE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:683:1: ( rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5 )
            // InternalSimpleSQL.g:684:2: rule__CREATE_TABLE__Group__4__Impl rule__CREATE_TABLE__Group__5
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
    // InternalSimpleSQL.g:691:1: rule__CREATE_TABLE__Group__4__Impl : ( 'in' ) ;
    public final void rule__CREATE_TABLE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:695:1: ( ( 'in' ) )
            // InternalSimpleSQL.g:696:1: ( 'in' )
            {
            // InternalSimpleSQL.g:696:1: ( 'in' )
            // InternalSimpleSQL.g:697:2: 'in'
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
    // InternalSimpleSQL.g:706:1: rule__CREATE_TABLE__Group__5 : rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6 ;
    public final void rule__CREATE_TABLE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:710:1: ( rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6 )
            // InternalSimpleSQL.g:711:2: rule__CREATE_TABLE__Group__5__Impl rule__CREATE_TABLE__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimpleSQL.g:718:1: rule__CREATE_TABLE__Group__5__Impl : ( ( rule__CREATE_TABLE__DbNameAssignment_5 ) ) ;
    public final void rule__CREATE_TABLE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:722:1: ( ( ( rule__CREATE_TABLE__DbNameAssignment_5 ) ) )
            // InternalSimpleSQL.g:723:1: ( ( rule__CREATE_TABLE__DbNameAssignment_5 ) )
            {
            // InternalSimpleSQL.g:723:1: ( ( rule__CREATE_TABLE__DbNameAssignment_5 ) )
            // InternalSimpleSQL.g:724:2: ( rule__CREATE_TABLE__DbNameAssignment_5 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbNameAssignment_5()); 
            // InternalSimpleSQL.g:725:2: ( rule__CREATE_TABLE__DbNameAssignment_5 )
            // InternalSimpleSQL.g:725:3: rule__CREATE_TABLE__DbNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CREATE_TABLE__DbNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getDbNameAssignment_5()); 

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
    // InternalSimpleSQL.g:733:1: rule__CREATE_TABLE__Group__6 : rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7 ;
    public final void rule__CREATE_TABLE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:737:1: ( rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7 )
            // InternalSimpleSQL.g:738:2: rule__CREATE_TABLE__Group__6__Impl rule__CREATE_TABLE__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalSimpleSQL.g:745:1: rule__CREATE_TABLE__Group__6__Impl : ( 'with' ) ;
    public final void rule__CREATE_TABLE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:749:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:750:1: ( 'with' )
            {
            // InternalSimpleSQL.g:750:1: ( 'with' )
            // InternalSimpleSQL.g:751:2: 'with'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getWithKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSimpleSQL.g:760:1: rule__CREATE_TABLE__Group__7 : rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8 ;
    public final void rule__CREATE_TABLE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:764:1: ( rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8 )
            // InternalSimpleSQL.g:765:2: rule__CREATE_TABLE__Group__7__Impl rule__CREATE_TABLE__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalSimpleSQL.g:772:1: rule__CREATE_TABLE__Group__7__Impl : ( 'columns' ) ;
    public final void rule__CREATE_TABLE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:776:1: ( ( 'columns' ) )
            // InternalSimpleSQL.g:777:1: ( 'columns' )
            {
            // InternalSimpleSQL.g:777:1: ( 'columns' )
            // InternalSimpleSQL.g:778:2: 'columns'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSimpleSQL.g:787:1: rule__CREATE_TABLE__Group__8 : rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9 ;
    public final void rule__CREATE_TABLE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:791:1: ( rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9 )
            // InternalSimpleSQL.g:792:2: rule__CREATE_TABLE__Group__8__Impl rule__CREATE_TABLE__Group__9
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
    // InternalSimpleSQL.g:799:1: rule__CREATE_TABLE__Group__8__Impl : ( '(' ) ;
    public final void rule__CREATE_TABLE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:803:1: ( ( '(' ) )
            // InternalSimpleSQL.g:804:1: ( '(' )
            {
            // InternalSimpleSQL.g:804:1: ( '(' )
            // InternalSimpleSQL.g:805:2: '('
            {
             before(grammarAccess.getCREATE_TABLEAccess().getLeftParenthesisKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSimpleSQL.g:814:1: rule__CREATE_TABLE__Group__9 : rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10 ;
    public final void rule__CREATE_TABLE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:818:1: ( rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10 )
            // InternalSimpleSQL.g:819:2: rule__CREATE_TABLE__Group__9__Impl rule__CREATE_TABLE__Group__10
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
    // InternalSimpleSQL.g:826:1: rule__CREATE_TABLE__Group__9__Impl : ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) ) ;
    public final void rule__CREATE_TABLE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:830:1: ( ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) ) )
            // InternalSimpleSQL.g:831:1: ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) )
            {
            // InternalSimpleSQL.g:831:1: ( ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* ) )
            // InternalSimpleSQL.g:832:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) ) ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* )
            {
            // InternalSimpleSQL.g:832:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 ) )
            // InternalSimpleSQL.g:833:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:834:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )
            // InternalSimpleSQL.g:834:4: rule__CREATE_TABLE__ColumnsAssignment_9
            {
            pushFollow(FOLLOW_14);
            rule__CREATE_TABLE__ColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 

            }

            // InternalSimpleSQL.g:837:2: ( ( rule__CREATE_TABLE__ColumnsAssignment_9 )* )
            // InternalSimpleSQL.g:838:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )*
            {
             before(grammarAccess.getCREATE_TABLEAccess().getColumnsAssignment_9()); 
            // InternalSimpleSQL.g:839:3: ( rule__CREATE_TABLE__ColumnsAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleSQL.g:839:4: rule__CREATE_TABLE__ColumnsAssignment_9
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CREATE_TABLE__ColumnsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalSimpleSQL.g:848:1: rule__CREATE_TABLE__Group__10 : rule__CREATE_TABLE__Group__10__Impl ;
    public final void rule__CREATE_TABLE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:852:1: ( rule__CREATE_TABLE__Group__10__Impl )
            // InternalSimpleSQL.g:853:2: rule__CREATE_TABLE__Group__10__Impl
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
    // InternalSimpleSQL.g:859:1: rule__CREATE_TABLE__Group__10__Impl : ( ')' ) ;
    public final void rule__CREATE_TABLE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:863:1: ( ( ')' ) )
            // InternalSimpleSQL.g:864:1: ( ')' )
            {
            // InternalSimpleSQL.g:864:1: ( ')' )
            // InternalSimpleSQL.g:865:2: ')'
            {
             before(grammarAccess.getCREATE_TABLEAccess().getRightParenthesisKeyword_10()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSimpleSQL.g:875:1: rule__COLUMN_DEF__Group__0 : rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1 ;
    public final void rule__COLUMN_DEF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:879:1: ( rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1 )
            // InternalSimpleSQL.g:880:2: rule__COLUMN_DEF__Group__0__Impl rule__COLUMN_DEF__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimpleSQL.g:887:1: rule__COLUMN_DEF__Group__0__Impl : ( ( rule__COLUMN_DEF__NameAssignment_0 ) ) ;
    public final void rule__COLUMN_DEF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:891:1: ( ( ( rule__COLUMN_DEF__NameAssignment_0 ) ) )
            // InternalSimpleSQL.g:892:1: ( ( rule__COLUMN_DEF__NameAssignment_0 ) )
            {
            // InternalSimpleSQL.g:892:1: ( ( rule__COLUMN_DEF__NameAssignment_0 ) )
            // InternalSimpleSQL.g:893:2: ( rule__COLUMN_DEF__NameAssignment_0 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getNameAssignment_0()); 
            // InternalSimpleSQL.g:894:2: ( rule__COLUMN_DEF__NameAssignment_0 )
            // InternalSimpleSQL.g:894:3: rule__COLUMN_DEF__NameAssignment_0
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
    // InternalSimpleSQL.g:902:1: rule__COLUMN_DEF__Group__1 : rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2 ;
    public final void rule__COLUMN_DEF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:906:1: ( rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2 )
            // InternalSimpleSQL.g:907:2: rule__COLUMN_DEF__Group__1__Impl rule__COLUMN_DEF__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSimpleSQL.g:914:1: rule__COLUMN_DEF__Group__1__Impl : ( 'with' ) ;
    public final void rule__COLUMN_DEF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:918:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:919:1: ( 'with' )
            {
            // InternalSimpleSQL.g:919:1: ( 'with' )
            // InternalSimpleSQL.g:920:2: 'with'
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getWithKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSimpleSQL.g:929:1: rule__COLUMN_DEF__Group__2 : rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3 ;
    public final void rule__COLUMN_DEF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:933:1: ( rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3 )
            // InternalSimpleSQL.g:934:2: rule__COLUMN_DEF__Group__2__Impl rule__COLUMN_DEF__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSimpleSQL.g:941:1: rule__COLUMN_DEF__Group__2__Impl : ( 'type' ) ;
    public final void rule__COLUMN_DEF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:945:1: ( ( 'type' ) )
            // InternalSimpleSQL.g:946:1: ( 'type' )
            {
            // InternalSimpleSQL.g:946:1: ( 'type' )
            // InternalSimpleSQL.g:947:2: 'type'
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSimpleSQL.g:956:1: rule__COLUMN_DEF__Group__3 : rule__COLUMN_DEF__Group__3__Impl ;
    public final void rule__COLUMN_DEF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:960:1: ( rule__COLUMN_DEF__Group__3__Impl )
            // InternalSimpleSQL.g:961:2: rule__COLUMN_DEF__Group__3__Impl
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
    // InternalSimpleSQL.g:967:1: rule__COLUMN_DEF__Group__3__Impl : ( ( rule__COLUMN_DEF__TypeAssignment_3 ) ) ;
    public final void rule__COLUMN_DEF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:971:1: ( ( ( rule__COLUMN_DEF__TypeAssignment_3 ) ) )
            // InternalSimpleSQL.g:972:1: ( ( rule__COLUMN_DEF__TypeAssignment_3 ) )
            {
            // InternalSimpleSQL.g:972:1: ( ( rule__COLUMN_DEF__TypeAssignment_3 ) )
            // InternalSimpleSQL.g:973:2: ( rule__COLUMN_DEF__TypeAssignment_3 )
            {
             before(grammarAccess.getCOLUMN_DEFAccess().getTypeAssignment_3()); 
            // InternalSimpleSQL.g:974:2: ( rule__COLUMN_DEF__TypeAssignment_3 )
            // InternalSimpleSQL.g:974:3: rule__COLUMN_DEF__TypeAssignment_3
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
    // InternalSimpleSQL.g:983:1: rule__INSERT__Group__0 : rule__INSERT__Group__0__Impl rule__INSERT__Group__1 ;
    public final void rule__INSERT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:987:1: ( rule__INSERT__Group__0__Impl rule__INSERT__Group__1 )
            // InternalSimpleSQL.g:988:2: rule__INSERT__Group__0__Impl rule__INSERT__Group__1
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
    // InternalSimpleSQL.g:995:1: rule__INSERT__Group__0__Impl : ( 'add' ) ;
    public final void rule__INSERT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:999:1: ( ( 'add' ) )
            // InternalSimpleSQL.g:1000:1: ( 'add' )
            {
            // InternalSimpleSQL.g:1000:1: ( 'add' )
            // InternalSimpleSQL.g:1001:2: 'add'
            {
             before(grammarAccess.getINSERTAccess().getAddKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1010:1: rule__INSERT__Group__1 : rule__INSERT__Group__1__Impl rule__INSERT__Group__2 ;
    public final void rule__INSERT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1014:1: ( rule__INSERT__Group__1__Impl rule__INSERT__Group__2 )
            // InternalSimpleSQL.g:1015:2: rule__INSERT__Group__1__Impl rule__INSERT__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSimpleSQL.g:1022:1: rule__INSERT__Group__1__Impl : ( 'entry' ) ;
    public final void rule__INSERT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1026:1: ( ( 'entry' ) )
            // InternalSimpleSQL.g:1027:1: ( 'entry' )
            {
            // InternalSimpleSQL.g:1027:1: ( 'entry' )
            // InternalSimpleSQL.g:1028:2: 'entry'
            {
             before(grammarAccess.getINSERTAccess().getEntryKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1037:1: rule__INSERT__Group__2 : rule__INSERT__Group__2__Impl rule__INSERT__Group__3 ;
    public final void rule__INSERT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1041:1: ( rule__INSERT__Group__2__Impl rule__INSERT__Group__3 )
            // InternalSimpleSQL.g:1042:2: rule__INSERT__Group__2__Impl rule__INSERT__Group__3
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
    // InternalSimpleSQL.g:1049:1: rule__INSERT__Group__2__Impl : ( 'to' ) ;
    public final void rule__INSERT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1053:1: ( ( 'to' ) )
            // InternalSimpleSQL.g:1054:1: ( 'to' )
            {
            // InternalSimpleSQL.g:1054:1: ( 'to' )
            // InternalSimpleSQL.g:1055:2: 'to'
            {
             before(grammarAccess.getINSERTAccess().getToKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1064:1: rule__INSERT__Group__3 : rule__INSERT__Group__3__Impl rule__INSERT__Group__4 ;
    public final void rule__INSERT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1068:1: ( rule__INSERT__Group__3__Impl rule__INSERT__Group__4 )
            // InternalSimpleSQL.g:1069:2: rule__INSERT__Group__3__Impl rule__INSERT__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimpleSQL.g:1076:1: rule__INSERT__Group__3__Impl : ( ( rule__INSERT__TableAssignment_3 ) ) ;
    public final void rule__INSERT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1080:1: ( ( ( rule__INSERT__TableAssignment_3 ) ) )
            // InternalSimpleSQL.g:1081:1: ( ( rule__INSERT__TableAssignment_3 ) )
            {
            // InternalSimpleSQL.g:1081:1: ( ( rule__INSERT__TableAssignment_3 ) )
            // InternalSimpleSQL.g:1082:2: ( rule__INSERT__TableAssignment_3 )
            {
             before(grammarAccess.getINSERTAccess().getTableAssignment_3()); 
            // InternalSimpleSQL.g:1083:2: ( rule__INSERT__TableAssignment_3 )
            // InternalSimpleSQL.g:1083:3: rule__INSERT__TableAssignment_3
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
    // InternalSimpleSQL.g:1091:1: rule__INSERT__Group__4 : rule__INSERT__Group__4__Impl rule__INSERT__Group__5 ;
    public final void rule__INSERT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1095:1: ( rule__INSERT__Group__4__Impl rule__INSERT__Group__5 )
            // InternalSimpleSQL.g:1096:2: rule__INSERT__Group__4__Impl rule__INSERT__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSimpleSQL.g:1103:1: rule__INSERT__Group__4__Impl : ( 'with' ) ;
    public final void rule__INSERT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1107:1: ( ( 'with' ) )
            // InternalSimpleSQL.g:1108:1: ( 'with' )
            {
            // InternalSimpleSQL.g:1108:1: ( 'with' )
            // InternalSimpleSQL.g:1109:2: 'with'
            {
             before(grammarAccess.getINSERTAccess().getWithKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSimpleSQL.g:1118:1: rule__INSERT__Group__5 : rule__INSERT__Group__5__Impl rule__INSERT__Group__6 ;
    public final void rule__INSERT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1122:1: ( rule__INSERT__Group__5__Impl rule__INSERT__Group__6 )
            // InternalSimpleSQL.g:1123:2: rule__INSERT__Group__5__Impl rule__INSERT__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleSQL.g:1130:1: rule__INSERT__Group__5__Impl : ( 'columns' ) ;
    public final void rule__INSERT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1134:1: ( ( 'columns' ) )
            // InternalSimpleSQL.g:1135:1: ( 'columns' )
            {
            // InternalSimpleSQL.g:1135:1: ( 'columns' )
            // InternalSimpleSQL.g:1136:2: 'columns'
            {
             before(grammarAccess.getINSERTAccess().getColumnsKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getINSERTAccess().getColumnsKeyword_5()); 

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
    // InternalSimpleSQL.g:1145:1: rule__INSERT__Group__6 : rule__INSERT__Group__6__Impl ;
    public final void rule__INSERT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1149:1: ( rule__INSERT__Group__6__Impl )
            // InternalSimpleSQL.g:1150:2: rule__INSERT__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSERT__Group__6__Impl();

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
    // InternalSimpleSQL.g:1156:1: rule__INSERT__Group__6__Impl : ( ( ( rule__INSERT__DataAssignment_6 ) ) ( ( rule__INSERT__DataAssignment_6 )* ) ) ;
    public final void rule__INSERT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1160:1: ( ( ( ( rule__INSERT__DataAssignment_6 ) ) ( ( rule__INSERT__DataAssignment_6 )* ) ) )
            // InternalSimpleSQL.g:1161:1: ( ( ( rule__INSERT__DataAssignment_6 ) ) ( ( rule__INSERT__DataAssignment_6 )* ) )
            {
            // InternalSimpleSQL.g:1161:1: ( ( ( rule__INSERT__DataAssignment_6 ) ) ( ( rule__INSERT__DataAssignment_6 )* ) )
            // InternalSimpleSQL.g:1162:2: ( ( rule__INSERT__DataAssignment_6 ) ) ( ( rule__INSERT__DataAssignment_6 )* )
            {
            // InternalSimpleSQL.g:1162:2: ( ( rule__INSERT__DataAssignment_6 ) )
            // InternalSimpleSQL.g:1163:3: ( rule__INSERT__DataAssignment_6 )
            {
             before(grammarAccess.getINSERTAccess().getDataAssignment_6()); 
            // InternalSimpleSQL.g:1164:3: ( rule__INSERT__DataAssignment_6 )
            // InternalSimpleSQL.g:1164:4: rule__INSERT__DataAssignment_6
            {
            pushFollow(FOLLOW_20);
            rule__INSERT__DataAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getINSERTAccess().getDataAssignment_6()); 

            }

            // InternalSimpleSQL.g:1167:2: ( ( rule__INSERT__DataAssignment_6 )* )
            // InternalSimpleSQL.g:1168:3: ( rule__INSERT__DataAssignment_6 )*
            {
             before(grammarAccess.getINSERTAccess().getDataAssignment_6()); 
            // InternalSimpleSQL.g:1169:3: ( rule__INSERT__DataAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleSQL.g:1169:4: rule__INSERT__DataAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__INSERT__DataAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getINSERTAccess().getDataAssignment_6()); 

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
    // $ANTLR end "rule__INSERT__Group__6__Impl"


    // $ANTLR start "rule__Insert_List__Group__0"
    // InternalSimpleSQL.g:1179:1: rule__Insert_List__Group__0 : rule__Insert_List__Group__0__Impl rule__Insert_List__Group__1 ;
    public final void rule__Insert_List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1183:1: ( rule__Insert_List__Group__0__Impl rule__Insert_List__Group__1 )
            // InternalSimpleSQL.g:1184:2: rule__Insert_List__Group__0__Impl rule__Insert_List__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Insert_List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert_List__Group__1();

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
    // $ANTLR end "rule__Insert_List__Group__0"


    // $ANTLR start "rule__Insert_List__Group__0__Impl"
    // InternalSimpleSQL.g:1191:1: rule__Insert_List__Group__0__Impl : ( '\"' ) ;
    public final void rule__Insert_List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1195:1: ( ( '\"' ) )
            // InternalSimpleSQL.g:1196:1: ( '\"' )
            {
            // InternalSimpleSQL.g:1196:1: ( '\"' )
            // InternalSimpleSQL.g:1197:2: '\"'
            {
             before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_0()); 

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
    // $ANTLR end "rule__Insert_List__Group__0__Impl"


    // $ANTLR start "rule__Insert_List__Group__1"
    // InternalSimpleSQL.g:1206:1: rule__Insert_List__Group__1 : rule__Insert_List__Group__1__Impl rule__Insert_List__Group__2 ;
    public final void rule__Insert_List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1210:1: ( rule__Insert_List__Group__1__Impl rule__Insert_List__Group__2 )
            // InternalSimpleSQL.g:1211:2: rule__Insert_List__Group__1__Impl rule__Insert_List__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Insert_List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert_List__Group__2();

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
    // $ANTLR end "rule__Insert_List__Group__1"


    // $ANTLR start "rule__Insert_List__Group__1__Impl"
    // InternalSimpleSQL.g:1218:1: rule__Insert_List__Group__1__Impl : ( ( rule__Insert_List__DataAssignment_1 ) ) ;
    public final void rule__Insert_List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1222:1: ( ( ( rule__Insert_List__DataAssignment_1 ) ) )
            // InternalSimpleSQL.g:1223:1: ( ( rule__Insert_List__DataAssignment_1 ) )
            {
            // InternalSimpleSQL.g:1223:1: ( ( rule__Insert_List__DataAssignment_1 ) )
            // InternalSimpleSQL.g:1224:2: ( rule__Insert_List__DataAssignment_1 )
            {
             before(grammarAccess.getInsert_ListAccess().getDataAssignment_1()); 
            // InternalSimpleSQL.g:1225:2: ( rule__Insert_List__DataAssignment_1 )
            // InternalSimpleSQL.g:1225:3: rule__Insert_List__DataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__DataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsert_ListAccess().getDataAssignment_1()); 

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
    // $ANTLR end "rule__Insert_List__Group__1__Impl"


    // $ANTLR start "rule__Insert_List__Group__2"
    // InternalSimpleSQL.g:1233:1: rule__Insert_List__Group__2 : rule__Insert_List__Group__2__Impl ;
    public final void rule__Insert_List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1237:1: ( rule__Insert_List__Group__2__Impl )
            // InternalSimpleSQL.g:1238:2: rule__Insert_List__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert_List__Group__2__Impl();

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
    // $ANTLR end "rule__Insert_List__Group__2"


    // $ANTLR start "rule__Insert_List__Group__2__Impl"
    // InternalSimpleSQL.g:1244:1: rule__Insert_List__Group__2__Impl : ( '\"' ) ;
    public final void rule__Insert_List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1248:1: ( ( '\"' ) )
            // InternalSimpleSQL.g:1249:1: ( '\"' )
            {
            // InternalSimpleSQL.g:1249:1: ( '\"' )
            // InternalSimpleSQL.g:1250:2: '\"'
            {
             before(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getQuotationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Insert_List__Group__2__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSimpleSQL.g:1260:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1264:1: ( ( ruleStatement ) )
            // InternalSimpleSQL.g:1265:2: ( ruleStatement )
            {
            // InternalSimpleSQL.g:1265:2: ( ruleStatement )
            // InternalSimpleSQL.g:1266:3: ruleStatement
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
    // InternalSimpleSQL.g:1275:1: rule__SELECT__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__SELECT__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1279:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1280:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1280:2: ( RULE_ID )
            // InternalSimpleSQL.g:1281:3: RULE_ID
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
    // InternalSimpleSQL.g:1290:1: rule__SELECT__TableAssignment_3 : ( RULE_ID ) ;
    public final void rule__SELECT__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1294:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1295:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1295:2: ( RULE_ID )
            // InternalSimpleSQL.g:1296:3: RULE_ID
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


    // $ANTLR start "rule__CREATE_DB__NameAssignment_3"
    // InternalSimpleSQL.g:1305:1: rule__CREATE_DB__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CREATE_DB__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1309:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1310:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1310:2: ( RULE_ID )
            // InternalSimpleSQL.g:1311:3: RULE_ID
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
    // InternalSimpleSQL.g:1320:1: rule__CREATE_TABLE__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CREATE_TABLE__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1324:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1325:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1325:2: ( RULE_ID )
            // InternalSimpleSQL.g:1326:3: RULE_ID
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


    // $ANTLR start "rule__CREATE_TABLE__DbNameAssignment_5"
    // InternalSimpleSQL.g:1335:1: rule__CREATE_TABLE__DbNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__CREATE_TABLE__DbNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1339:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1340:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1340:2: ( RULE_ID )
            // InternalSimpleSQL.g:1341:3: RULE_ID
            {
             before(grammarAccess.getCREATE_TABLEAccess().getDbNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCREATE_TABLEAccess().getDbNameIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__CREATE_TABLE__DbNameAssignment_5"


    // $ANTLR start "rule__CREATE_TABLE__ColumnsAssignment_9"
    // InternalSimpleSQL.g:1350:1: rule__CREATE_TABLE__ColumnsAssignment_9 : ( ruleCOLUMN_DEF ) ;
    public final void rule__CREATE_TABLE__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1354:1: ( ( ruleCOLUMN_DEF ) )
            // InternalSimpleSQL.g:1355:2: ( ruleCOLUMN_DEF )
            {
            // InternalSimpleSQL.g:1355:2: ( ruleCOLUMN_DEF )
            // InternalSimpleSQL.g:1356:3: ruleCOLUMN_DEF
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
    // InternalSimpleSQL.g:1365:1: rule__COLUMN_DEF__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__COLUMN_DEF__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1369:1: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1370:2: ( RULE_ID )
            {
            // InternalSimpleSQL.g:1370:2: ( RULE_ID )
            // InternalSimpleSQL.g:1371:3: RULE_ID
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
    // InternalSimpleSQL.g:1380:1: rule__COLUMN_DEF__TypeAssignment_3 : ( ruleTYPE ) ;
    public final void rule__COLUMN_DEF__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1384:1: ( ( ruleTYPE ) )
            // InternalSimpleSQL.g:1385:2: ( ruleTYPE )
            {
            // InternalSimpleSQL.g:1385:2: ( ruleTYPE )
            // InternalSimpleSQL.g:1386:3: ruleTYPE
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
    // InternalSimpleSQL.g:1395:1: rule__INSERT__TableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__INSERT__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1399:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleSQL.g:1400:2: ( ( RULE_ID ) )
            {
            // InternalSimpleSQL.g:1400:2: ( ( RULE_ID ) )
            // InternalSimpleSQL.g:1401:3: ( RULE_ID )
            {
             before(grammarAccess.getINSERTAccess().getTableCREATE_TABLECrossReference_3_0()); 
            // InternalSimpleSQL.g:1402:3: ( RULE_ID )
            // InternalSimpleSQL.g:1403:4: RULE_ID
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


    // $ANTLR start "rule__INSERT__DataAssignment_6"
    // InternalSimpleSQL.g:1414:1: rule__INSERT__DataAssignment_6 : ( ruleInsert_List ) ;
    public final void rule__INSERT__DataAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1418:1: ( ( ruleInsert_List ) )
            // InternalSimpleSQL.g:1419:2: ( ruleInsert_List )
            {
            // InternalSimpleSQL.g:1419:2: ( ruleInsert_List )
            // InternalSimpleSQL.g:1420:3: ruleInsert_List
            {
             before(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInsert_List();

            state._fsp--;

             after(grammarAccess.getINSERTAccess().getDataInsert_ListParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__INSERT__DataAssignment_6"


    // $ANTLR start "rule__Insert_List__DataAssignment_1"
    // InternalSimpleSQL.g:1429:1: rule__Insert_List__DataAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Insert_List__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleSQL.g:1433:1: ( ( RULE_STRING ) )
            // InternalSimpleSQL.g:1434:2: ( RULE_STRING )
            {
            // InternalSimpleSQL.g:1434:2: ( RULE_STRING )
            // InternalSimpleSQL.g:1435:3: RULE_STRING
            {
             before(grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsert_ListAccess().getDataSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Insert_List__DataAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008050002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});

}