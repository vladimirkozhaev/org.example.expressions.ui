package org.example.expressions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.example.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'/'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'true'", "'false'", "'='", "'+'", "'-'", "'&&'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleExpressionsModel"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:60:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: ( ruleExpressionsModel EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ruleExpressionsModel EOF
            {
             before(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel61);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getExpressionsModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionsModel68); 

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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:69:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:73:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( rule__ExpressionsModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:2: rule__ExpressionsModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionsModel__ElementsAssignment_in_ruleExpressionsModel94);
            	    rule__ExpressionsModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: ( ruleAbstractElement EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: ( ruleVariable EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable182);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable189); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Variable__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable215);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:144:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: ( ruleExpression EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression242);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression249); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:153:1: ruleExpression : ( rulePlusOrMinus ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:157:2: ( ( rulePlusOrMinus ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( rulePlusOrMinus )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( rulePlusOrMinus )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: rulePlusOrMinus
            {
             before(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleExpression275);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:172:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: ( rulePlusOrMinus EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus301);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus308); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:181:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:185:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus334);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:200:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: ( ruleMulOrDiv EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv361);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv368); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:209:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:213:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__MulOrDiv__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv394);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleAnd"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ( ruleAnd EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:232:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd423);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd430); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:239:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:243:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( ( rule__And__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:246:1: ( rule__And__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:246:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd456);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: ( ruleEquality EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:260:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality483);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality490); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:271:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( rule__Equality__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:1: ( rule__Equality__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality516);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ( ruleComparison EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:288:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison543);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison550); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:295:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:299:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:302:1: ( rule__Comparison__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:302:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison576);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: ( ruleAtomic EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:316:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic603);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic610); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:323:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:327:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:1: ( rule__Atomic__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic636);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:346:1: ( ( ruleVariable ) | ( ruleExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=11 && LA2_1<=12)||(LA2_1>=19 && LA2_1<=20)||(LA2_1>=22 && LA2_1<=23)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=19 && LA2_0<=20)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:347:1: ( ruleVariable )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:347:1: ( ruleVariable )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:348:1: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives672);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:353:6: ( ruleExpression )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:353:6: ( ruleExpression )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:354:1: ruleExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives689);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:364:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:368:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_0721);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:375:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:375:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:376:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:377:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:377:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_0739);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_0_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:386:1: rule__MulOrDiv__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:390:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:391:1: ( '*' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:391:1: ( '*' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:392:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__MulOrDiv__OpAlternatives_1_0_1_0773); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:6: ( '/' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:6: ( '/' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:400:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__MulOrDiv__OpAlternatives_1_0_1_0793); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:416:1: ( ( '==' ) | ( '!=' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:417:1: ( '==' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:417:1: ( '==' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:418:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_0828); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:425:6: ( '!=' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:425:6: ( '!=' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Equality__OpAlternatives_1_1_0848); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:438:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:442:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
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
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:443:1: ( '>=' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:443:1: ( '>=' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:444:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_0883); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:451:6: ( '<=' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:451:6: ( '<=' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:452:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_0903); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:459:6: ( '>' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:459:6: ( '>' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:460:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,17,FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_0923); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:467:6: ( '<' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:467:6: ( '<' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,18,FOLLOW_18_in_rule__Comparison__OpAlternatives_1_1_0943); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:480:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:484:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 19:
            case 20:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:485:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:485:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:486:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:487:1: ( rule__Atomic__Group_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:487:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives977);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:491:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:491:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:492:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:1: ( rule__Atomic__Group_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives995);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:498:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:499:1: ( rule__Atomic__Group_2__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:499:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1013);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:503:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:503:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:504:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:505:1: ( rule__Atomic__Group_3__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:505:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1031);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:514:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:519:1: ( 'true' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:519:1: ( 'true' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:520:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Atomic__ValueAlternatives_2_1_01065); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:527:6: ( 'false' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:527:6: ( 'false' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:528:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Atomic__ValueAlternatives_2_1_01085); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:542:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:547:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__01117);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__01120);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:554:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:558:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:559:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:559:1: ( ( rule__Variable__NameAssignment_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:560:1: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:561:1: ( rule__Variable__NameAssignment_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:561:2: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl1147);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:571:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:576:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__11177);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__11180);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:583:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:587:1: ( ( '=' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:588:1: ( '=' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:588:1: ( '=' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:589:1: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Variable__Group__1__Impl1208); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:602:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:606:1: ( rule__Variable__Group__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:607:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__21239);
            rule__Variable__Group__2__Impl();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:613:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:617:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:618:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:618:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:619:1: ( rule__Variable__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:620:1: ( rule__Variable__ExpressionAssignment_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:620:2: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl1266);
            rule__Variable__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:640:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:641:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__01302);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__01305);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:648:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:652:1: ( ( ruleMulOrDiv ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: ( ruleMulOrDiv )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: ( ruleMulOrDiv )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:654:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl1332);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:665:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:669:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__11361);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:676:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:680:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:681:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:681:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:683:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl1388);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:697:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:701:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:702:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__01423);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__01426);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:709:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:713:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:714:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:714:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:715:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:716:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:716:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl1453);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:726:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:730:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:731:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__11483);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:737:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:741:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:742:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:742:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:743:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:744:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl1510);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:762:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__01544);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__01547);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:770:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:774:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:775:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:775:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:776:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:777:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:779:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:793:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:794:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__11605);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:800:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:804:1: ( ( '+' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:805:1: ( '+' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:805:1: ( '+' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:806:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,22,FOLLOW_22_in_rule__PlusOrMinus__Group_1_0_0__1__Impl1633); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:823:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:827:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:828:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__01668);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__01671);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:835:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:839:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:840:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:840:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:841:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:842:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:844:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:854:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:859:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__11729);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:865:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:869:1: ( ( '-' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( '-' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( '-' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:871:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,23,FOLLOW_23_in_rule__PlusOrMinus__Group_1_0_1__1__Impl1757); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:888:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:893:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__01792);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__01795);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:900:1: rule__MulOrDiv__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: ( ( ruleAtomic ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:905:1: ( ruleAtomic )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:905:1: ( ruleAtomic )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:906:1: ruleAtomic
            {
             before(grammarAccess.getMulOrDivAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__MulOrDiv__Group__0__Impl1822);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getAtomicParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:917:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:921:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:922:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__11851);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:928:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:932:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:933:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:933:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:934:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:935:1: ( rule__MulOrDiv__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:935:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl1878);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:949:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:953:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:954:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__01913);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__01916);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:961:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Group_1_0__0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:965:1: ( ( ( rule__MulOrDiv__Group_1_0__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:966:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:1: ( rule__MulOrDiv__Group_1_0__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ( rule__MulOrDiv__Group_1_0__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:968:2: rule__MulOrDiv__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__0_in_rule__MulOrDiv__Group_1__0__Impl1943);
            rule__MulOrDiv__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:978:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:982:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__11973);
            rule__MulOrDiv__Group_1__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:989:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:993:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:994:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:994:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:995:1: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:996:1: ( rule__MulOrDiv__RightAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:996:2: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl2000);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1010:1: rule__MulOrDiv__Group_1_0__0 : rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 ;
    public final void rule__MulOrDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:1: ( rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1015:2: rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__0__Impl_in_rule__MulOrDiv__Group_1_0__02034);
            rule__MulOrDiv__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__1_in_rule__MulOrDiv__Group_1_0__02037);
            rule__MulOrDiv__Group_1_0__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1022:1: rule__MulOrDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1027:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1028:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1029:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1031:1: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1041:1: rule__MulOrDiv__Group_1_0__1 : rule__MulOrDiv__Group_1_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1045:1: ( rule__MulOrDiv__Group_1_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1046:2: rule__MulOrDiv__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1_0__1__Impl_in_rule__MulOrDiv__Group_1_0__12095);
            rule__MulOrDiv__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1052:1: rule__MulOrDiv__Group_1_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1056:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1057:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:1: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1059:1: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1059:2: rule__MulOrDiv__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_0_1_in_rule__MulOrDiv__Group_1_0__1__Impl2122);
            rule__MulOrDiv__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1075:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1080:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02158);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__02161);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1091:1: ( ( ruleEquality ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:1: ( ruleEquality )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:1: ( ruleEquality )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1093:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl2188);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1108:1: ( rule__And__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1109:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12217);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1115:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1119:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1120:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1120:1: ( ( rule__And__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1121:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1122:1: ( rule__And__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1122:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl2244);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1136:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1140:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1141:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__02279);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__02282);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1148:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1152:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1153:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1153:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1154:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1155:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1157:1: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1167:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1171:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1172:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__12340);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__12343);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1179:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1183:1: ( ( '&&' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1184:1: ( '&&' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1184:1: ( '&&' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1185:1: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,24,FOLLOW_24_in_rule__And__Group_1__1__Impl2371); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1198:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1202:1: ( rule__And__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1203:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__22402);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1209:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1213:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1214:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1214:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1215:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1216:1: ( rule__And__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1216:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl2429);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1232:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1236:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1237:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__02465);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__02468);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1244:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: ( ( ruleComparison ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ( ruleComparison )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ( ruleComparison )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1250:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl2495);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1261:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1265:1: ( rule__Equality__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1266:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12524);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1272:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1276:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1278:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:1: ( rule__Equality__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl2551);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1293:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1297:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1298:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__02586);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__02589);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1305:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1311:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1312:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1314:1: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1328:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1329:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__12647);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__12650);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1336:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1343:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1343:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl2677);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1353:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1357:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1358:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__22707);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1364:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1368:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1369:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1369:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1370:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1371:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1371:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl2734);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1387:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1391:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1392:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02770);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02773);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1399:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1403:1: ( ( rulePlusOrMinus ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1404:1: ( rulePlusOrMinus )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1404:1: ( rulePlusOrMinus )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1405:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl2800);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1416:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1420:1: ( rule__Comparison__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1421:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12829);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1427:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1431:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1432:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1432:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1433:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1434:1: ( rule__Comparison__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=15 && LA13_0<=18)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1434:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2856);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1448:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1452:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1453:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02891);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02894);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1460:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1464:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1466:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1467:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1469:1: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1479:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1483:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1484:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12952);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12955);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1491:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1496:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1496:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1497:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1498:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1498:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2982);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1508:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1513:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__23012);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1519:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1523:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1524:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1524:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1525:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1526:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1526:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl3039);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1542:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1546:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1547:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__03075);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__03078);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1554:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1558:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1559:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1559:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1560:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1561:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1563:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1573:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1577:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1578:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__13136);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1584:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1588:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1589:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1589:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1590:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1591:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1591:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl3163);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1609:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1610:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__03197);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__03200);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1617:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1621:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1622:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1622:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1623:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1624:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1626:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1636:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1640:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1641:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__13258);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1647:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1651:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1652:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1652:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1653:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1654:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1654:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl3285);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1668:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1672:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1673:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__03319);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__03322);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1680:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1684:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1685:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1685:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1686:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1687:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1689:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1699:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1703:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1704:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__13380);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1710:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1715:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1715:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1716:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1717:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1717:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl3407);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1735:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1736:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__03441);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__03444);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1743:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1747:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1748:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1748:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1749:1: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1750:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1752:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1766:1: ( rule__Atomic__Group_3__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1767:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__13502);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1773:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__VariableAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1777:1: ( ( ( rule__Atomic__VariableAssignment_3_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1778:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1778:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1779:1: ( rule__Atomic__VariableAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1780:1: ( rule__Atomic__VariableAssignment_3_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1780:2: rule__Atomic__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__VariableAssignment_3_1_in_rule__Atomic__Group_3__1__Impl3529);
            rule__Atomic__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__ExpressionsModel__ElementsAssignment"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1795:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1799:1: ( ( ruleAbstractElement ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1800:1: ( ruleAbstractElement )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1800:1: ( ruleAbstractElement )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1801:1: ruleAbstractElement
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__ExpressionsModel__ElementsAssignment3568);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExpressionsModel__ElementsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1810:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1814:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1815:1: ( RULE_ID )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1815:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1816:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_03599); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ExpressionAssignment_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: rule__Variable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1829:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1830:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1830:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1831:1: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_23630);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variable__ExpressionAssignment_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1840:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1844:1: ( ( ruleMulOrDiv ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1845:1: ( ruleMulOrDiv )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1845:1: ( ruleMulOrDiv )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1846:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_13661);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1855:1: rule__MulOrDiv__OpAssignment_1_0_1 : ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1859:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1860:1: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1860:1: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1861:1: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:1: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:2: rule__MulOrDiv__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_0_1_0_in_rule__MulOrDiv__OpAssignment_1_0_13692);
            rule__MulOrDiv__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1871:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleAtomic ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1875:1: ( ( ruleAtomic ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1876:1: ( ruleAtomic )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1876:1: ( ruleAtomic )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1877:1: ruleAtomic
            {
             before(grammarAccess.getMulOrDivAccess().getRightAtomicParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__MulOrDiv__RightAssignment_1_13725);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightAtomicParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1887:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1891:1: ( ( ruleEquality ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1892:1: ( ruleEquality )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1892:1: ( ruleEquality )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1893:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_23757);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1902:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1906:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1907:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1907:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1908:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1909:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1909:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_13788);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1918:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1922:1: ( ( ruleComparison ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: ( ruleComparison )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: ( ruleComparison )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1924:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_23821);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1933:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1937:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1938:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1938:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1939:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1940:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1940:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_13852);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1949:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1953:1: ( ( rulePlusOrMinus ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1954:1: ( rulePlusOrMinus )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1954:1: ( rulePlusOrMinus )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1955:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_23885);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1964:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1968:1: ( ( RULE_INT ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1969:1: ( RULE_INT )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1969:1: ( RULE_INT )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1970:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_0_13916); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1979:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: ( ( RULE_STRING ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1984:1: ( RULE_STRING )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1984:1: ( RULE_STRING )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1985:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_1_13947); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1994:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1998:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1999:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1999:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2000:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2001:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2001:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_13978);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_3_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2010:1: rule__Atomic__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2014:1: ( ( ( RULE_ID ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ( ( RULE_ID ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2016:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2017:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2018:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_3_14015); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__VariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionsModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionsModel__ElementsAssignment_in_ruleExpressionsModel94 = new BitSet(new long[]{0x0000000000180072L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleExpression275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_0721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_0739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MulOrDiv__OpAlternatives_1_0_1_0773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MulOrDiv__OpAlternatives_1_0_1_0793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Equality__OpAlternatives_1_1_0828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Equality__OpAlternatives_1_1_0848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_0883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_0903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Comparison__OpAlternatives_1_1_0923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Comparison__OpAlternatives_1_1_0943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Atomic__ValueAlternatives_2_1_01065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Atomic__ValueAlternatives_2_1_01085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__01117 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__01120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__11177 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Variable__Group__1__Impl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__21239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__01302 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__01305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl1388 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__01423 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__01426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__01544 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__01547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PlusOrMinus__Group_1_0_0__1__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__01668 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__11729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PlusOrMinus__Group_1_0_1__1__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__01792 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__01795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__MulOrDiv__Group__0__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl1878 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__01913 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__01916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__0_in_rule__MulOrDiv__Group_1__0__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__0__Impl_in_rule__MulOrDiv__Group_1_0__02034 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__1_in_rule__MulOrDiv__Group_1_0__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1_0__1__Impl_in_rule__MulOrDiv__Group_1_0__12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_0_1_in_rule__MulOrDiv__Group_1_0__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02158 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl2244 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__02279 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__02282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__12340 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__And__Group_1__1__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__22402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__02465 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__02468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl2551 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__02586 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__02589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__12647 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__12650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__22707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02770 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2856 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02891 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12952 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__23012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__03075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__03078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__03197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__03200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__13258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__03319 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__03322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__03441 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__VariableAssignment_3_1_in_rule__Atomic__Group_3__1__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__ExpressionsModel__ElementsAssignment3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_03599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_23630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_0_1_0_in_rule__MulOrDiv__OpAssignment_1_0_13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__MulOrDiv__RightAssignment_1_13725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_23757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_23821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_23885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_0_13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_1_13947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_3_14015 = new BitSet(new long[]{0x0000000000000002L});

}