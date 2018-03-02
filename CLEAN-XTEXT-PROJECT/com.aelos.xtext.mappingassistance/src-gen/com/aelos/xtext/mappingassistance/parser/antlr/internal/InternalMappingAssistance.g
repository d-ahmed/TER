/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
grammar InternalMappingAssistance;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.aelos.xtext.mappingassistance.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.aelos.xtext.mappingassistance.parser.antlr.internal;

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
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;

}

@parser::members {

 	private MappingAssistanceGrammarAccess grammarAccess;

    public InternalMappingAssistanceParser(TokenStream input, MappingAssistanceGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected MappingAssistanceGrammarAccess getGrammarAccess() {
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
				newCompositeNode(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0());
			}
			lv_function_0_0=ruleAbstractModel
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"function",
					lv_function_0_0,
					"com.aelos.xtext.mappingassistance.MappingAssistance.AbstractModel");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractModel
entryRuleAbstractModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractModelRule()); }
	iv_ruleAbstractModel=ruleAbstractModel
	{ $current=$iv_ruleAbstractModel.current; }
	EOF;

// Rule AbstractModel
ruleAbstractModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
		}
		this_Import_0=ruleImport
		{
			$current = $this_Import_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getObsObserveursParserRuleCall_1_0());
				}
				lv_obs_1_0=ruleObserveurs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"obs",
						lv_obs_1_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Observeurs");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getMockMocksParserRuleCall_2_0());
				}
				lv_mock_2_0=ruleMocks
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"mock",
						lv_mock_2_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Mocks");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestedservTestedserviceParserRuleCall_3_0());
				}
				lv_testedserv_3_0=ruleTestedservice
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"testedserv",
						lv_testedserv_3_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Testedservice");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestedcompTestedcomposantParserRuleCall_4_0());
				}
				lv_testedcomp_4_0=ruleTestedcomposant
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"testedcomp",
						lv_testedcomp_4_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Testedcomposant");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.QualifiedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleTestedcomposant
entryRuleTestedcomposant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestedcomposantRule()); }
	iv_ruleTestedcomposant=ruleTestedcomposant
	{ $current=$iv_ruleTestedcomposant.current; }
	EOF;

// Rule Testedcomposant
ruleTestedcomposant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTestedcomposantRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getTestedcomposantAccess().getNameCompInstanceCompCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleTestedservice
entryRuleTestedservice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestedserviceRule()); }
	iv_ruleTestedservice=ruleTestedservice
	{ $current=$iv_ruleTestedservice.current; }
	EOF;

// Rule Testedservice
ruleTestedservice returns [EObject current=null]
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestedserviceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTestedserviceAccess().getNameCompInstanceCompCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestedserviceAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestedserviceRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTestedserviceAccess().getNameServ1ServiceNameCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleMocks
entryRuleMocks returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMocksRule()); }
	iv_ruleMocks=ruleMocks
	{ $current=$iv_ruleMocks.current; }
	EOF;

// Rule Mocks
ruleMocks returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='addMock('
		{
			newLeafNode(otherlv_0, grammarAccess.getMocksAccess().getAddMockKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMocksRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getMocksAccess().getMocknameMockNameCrossReference_1_0());
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getMocksAccess().getCommaKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMocksRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getMocksAccess().getNameCompInstanceCompCrossReference_3_0());
				}
			)
		)
		otherlv_4='.'
		{
			newLeafNode(otherlv_4, grammarAccess.getMocksAccess().getFullStopKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMocksRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getMocksAccess().getNameServ1ServiceNameCrossReference_5_0());
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMocksAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleObserveurs
entryRuleObserveurs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObserveursRule()); }
	iv_ruleObserveurs=ruleObserveurs
	{ $current=$iv_ruleObserveurs.current; }
	EOF;

// Rule Observeurs
ruleObserveurs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='addObserveur('
		{
			newLeafNode(otherlv_0, grammarAccess.getObserveursAccess().getAddObserveurKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserveursRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getObserveursAccess().getObsnameObserveurNameCrossReference_1_0());
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getObserveursAccess().getCommaKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserveursRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_3_0());
				}
			)
		)
		otherlv_4='.'
		{
			newLeafNode(otherlv_4, grammarAccess.getObserveursAccess().getFullStopKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserveursRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getObserveursAccess().getNameServ1ServiceNameCrossReference_5_0());
				}
			)
		)
		otherlv_6=','
		{
			newLeafNode(otherlv_6, grammarAccess.getObserveursAccess().getCommaKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserveursRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_7_0());
				}
			)
		)
		otherlv_8='.'
		{
			newLeafNode(otherlv_8, grammarAccess.getObserveursAccess().getFullStopKeyword_8());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserveursRule());
					}
				}
				otherlv_9=RULE_ID
				{
					newLeafNode(otherlv_9, grammarAccess.getObserveursAccess().getNameServ2ServiceNameCrossReference_9_0());
				}
			)
		)
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getObserveursAccess().getRightParenthesisKeyword_10());
		}
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='INT'
			{
				$current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='STRING'
			{
				$current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Boolean'
			{
				$current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Double'
			{
				$current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3());
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
