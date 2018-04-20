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
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getImImportParserRuleCall_0_0());
				}
				lv_im_0_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"im",
						lv_im_0_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestDrTestDriverParserRuleCall_1_0());
				}
				lv_testDr_1_0=ruleTestDriver
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"testDr",
						lv_testDr_1_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.TestDriver");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractModelAccess().getObsObserverParserRuleCall_2_0_0());
					}
					lv_obs_2_0=ruleObserver
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
						}
						add(
							$current,
							"obs",
							lv_obs_2_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.Observer");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractModelAccess().getCompAddComponentParserRuleCall_2_1_0());
					}
					lv_comp_3_0=ruleAddComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
						}
						add(
							$current,
							"comp",
							lv_comp_3_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.AddComponent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractModelAccess().getMockMockParserRuleCall_2_2_0());
					}
					lv_mock_4_0=ruleMock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
						}
						add(
							$current,
							"mock",
							lv_mock_4_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.Mock");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractModelAccess().getConfReplaceConfParserRuleCall_2_3_0());
					}
					lv_conf_5_0=ruleReplaceConf
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
						}
						add(
							$current,
							"conf",
							lv_conf_5_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.ReplaceConf");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractModelAccess().getBindBindingsParserRuleCall_2_4_0());
					}
					lv_bind_6_0=ruleBindings
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
						}
						add(
							$current,
							"bind",
							lv_bind_6_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.Bindings");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractModelAccess().getInstInstanceCompParserRuleCall_2_5_0());
					}
					lv_inst_7_0=ruleInstanceComp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
						}
						add(
							$current,
							"inst",
							lv_inst_7_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.InstanceComp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
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

// Entry rule entryRuleTestDriver
entryRuleTestDriver returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestDriverRule()); }
	iv_ruleTestDriver=ruleTestDriver
	{ $current=$iv_ruleTestDriver.current; }
	EOF;

// Rule TestDriver
ruleTestDriver returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTestDriverAccess().getTestDriverAction_0(),
					$current);
			}
		)
		otherlv_1='TestDriver'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestDriverAccess().getTestDriverKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTestDriverAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestDriverRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getTestDriverAccess().getOutVarVariableCrossReference_3_0_0());
					}
				)
			)
			otherlv_4='<-'
			{
				newLeafNode(otherlv_4, grammarAccess.getTestDriverAccess().getLessThanSignHyphenMinusKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestDriverAccess().getTestOpTestOPParserRuleCall_3_2_0());
					}
					lv_testOp_5_0=ruleTestOP
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestDriverRule());
						}
						add(
							$current,
							"testOp",
							lv_testOp_5_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.TestOP");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTestDriverAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleObserver
entryRuleObserver returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObserverRule()); }
	iv_ruleObserver=ruleObserver
	{ $current=$iv_ruleObserver.current; }
	EOF;

// Rule Observer
ruleObserver returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='observer:'
		{
			newLeafNode(otherlv_0, grammarAccess.getObserverAccess().getObserverKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserverRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getObserverAccess().getService1VariableCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getObserverAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserverRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getObserverAccess().getMember1OperationCrossReference_3_0());
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getObserverAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObserverRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getObserverAccess().getInstVarVariableCrossReference_5_0_0_0());
						}
					)
				)
				otherlv_6='<-'
				{
					newLeafNode(otherlv_6, grammarAccess.getObserverAccess().getLessThanSignHyphenMinusKeyword_5_0_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObserverRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getObserverAccess().getVarOpVariableCrossReference_5_0_2_0());
						}
					)
				)
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getObserverAccess().getCommaKeyword_5_0_3());
				}
			)*
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObserverRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getObserverAccess().getInstVarVariableCrossReference_5_1_0_0());
						}
					)
				)
				otherlv_10='<-'
				{
					newLeafNode(otherlv_10, grammarAccess.getObserverAccess().getLessThanSignHyphenMinusKeyword_5_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getObserverRule());
							}
						}
						otherlv_11=RULE_ID
						{
							newLeafNode(otherlv_11, grammarAccess.getObserverAccess().getVarOpVariableCrossReference_5_1_2_0());
						}
					)
				)
			)
		)*
		otherlv_12=')'
		{
			newLeafNode(otherlv_12, grammarAccess.getObserverAccess().getRightParenthesisKeyword_6());
		}
		otherlv_13='-'
		{
			newLeafNode(otherlv_13, grammarAccess.getObserverAccess().getHyphenMinusKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserverRule());
					}
				}
				otherlv_14=RULE_ID
				{
					newLeafNode(otherlv_14, grammarAccess.getObserverAccess().getService2VariableCrossReference_8_0());
				}
			)
		)
		otherlv_15='.'
		{
			newLeafNode(otherlv_15, grammarAccess.getObserverAccess().getFullStopKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObserverRule());
					}
				}
				otherlv_16=RULE_ID
				{
					newLeafNode(otherlv_16, grammarAccess.getObserverAccess().getMember2OperationCrossReference_10_0());
				}
			)
		)
	)
;

// Entry rule entryRuleMock
entryRuleMock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMockRule()); }
	iv_ruleMock=ruleMock
	{ $current=$iv_ruleMock.current; }
	EOF;

// Rule Mock
ruleMock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mock:'
		{
			newLeafNode(otherlv_0, grammarAccess.getMockAccess().getMockKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMockRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getMockAccess().getServiceVariableCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getMockAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMockRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getMockAccess().getMemberOperationCrossReference_3_0());
				}
			)
		)
		otherlv_4='<-'
		{
			newLeafNode(otherlv_4, grammarAccess.getMockAccess().getLessThanSignHyphenMinusKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMockRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getMockAccess().getIntentionVarVariableCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleReplaceConf
entryRuleReplaceConf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReplaceConfRule()); }
	iv_ruleReplaceConf=ruleReplaceConf
	{ $current=$iv_ruleReplaceConf.current; }
	EOF;

// Rule ReplaceConf
ruleReplaceConf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='replaceConf:'
		{
			newLeafNode(otherlv_0, grammarAccess.getReplaceConfAccess().getReplaceConfKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReplaceConfRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getReplaceConfAccess().getServiceVariableCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getReplaceConfAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReplaceConfRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getReplaceConfAccess().getMemberOperationCrossReference_3_0());
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getReplaceConfAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getReplaceConfRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getReplaceConfAccess().getVarConfVariableCrossReference_5_0_0_0());
						}
					)
				)
				otherlv_6='<-'
				{
					newLeafNode(otherlv_6, grammarAccess.getReplaceConfAccess().getLessThanSignHyphenMinusKeyword_5_0_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getReplaceConfRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getReplaceConfAccess().getInstVarVariableCrossReference_5_0_2_0());
						}
					)
				)
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getReplaceConfAccess().getCommaKeyword_5_0_3());
				}
			)*
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getReplaceConfRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getReplaceConfAccess().getVarConfVariableCrossReference_5_1_0_0());
						}
					)
				)
				otherlv_10='<-'
				{
					newLeafNode(otherlv_10, grammarAccess.getReplaceConfAccess().getLessThanSignHyphenMinusKeyword_5_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getReplaceConfRule());
							}
						}
						otherlv_11=RULE_ID
						{
							newLeafNode(otherlv_11, grammarAccess.getReplaceConfAccess().getInstVarVariableCrossReference_5_1_2_0());
						}
					)
				)
			)
		)*
		otherlv_12=')'
		{
			newLeafNode(otherlv_12, grammarAccess.getReplaceConfAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleAddComponent
entryRuleAddComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddComponentRule()); }
	iv_ruleAddComponent=ruleAddComponent
	{ $current=$iv_ruleAddComponent.current; }
	EOF;

// Rule AddComponent
ruleAddComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='AddComponent:'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddComponentAccess().getAddComponentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAddComponentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddComponentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAddComponentAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='providedServices'
		{
			newLeafNode(otherlv_3, grammarAccess.getAddComponentAccess().getProvidedServicesKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getAddComponentAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAddComponentRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getAddComponentAccess().getOpsOperationCrossReference_5_0_0_0());
						}
					)
				)
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getAddComponentAccess().getCommaKeyword_5_0_1());
				}
			)*
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAddComponentRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getAddComponentAccess().getOpsOperationCrossReference_5_1_0());
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getAddComponentAccess().getRightParenthesisKeyword_6());
		}
		otherlv_9='requeredServices'
		{
			newLeafNode(otherlv_9, grammarAccess.getAddComponentAccess().getRequeredServicesKeyword_7());
		}
		otherlv_10='('
		{
			newLeafNode(otherlv_10, grammarAccess.getAddComponentAccess().getLeftParenthesisKeyword_8());
		}
		(
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAddComponentRule());
							}
						}
						otherlv_11=RULE_ID
						{
							newLeafNode(otherlv_11, grammarAccess.getAddComponentAccess().getOpsReqOperationCrossReference_9_0_0_0());
						}
					)
				)
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getAddComponentAccess().getCommaKeyword_9_0_1());
				}
			)*
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAddComponentRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getAddComponentAccess().getOpsReqOperationCrossReference_9_1_0());
					}
				)
			)
		)*
		otherlv_14=')'
		{
			newLeafNode(otherlv_14, grammarAccess.getAddComponentAccess().getRightParenthesisKeyword_10());
		}
		(
			('def')=>
			(
				(
					{
						newCompositeNode(grammarAccess.getAddComponentAccess().getOperationsOperationParserRuleCall_11_0_0());
					}
					lv_operations_15_0=ruleOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAddComponentRule());
						}
						add(
							$current,
							"operations",
							lv_operations_15_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.Operation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getAddComponentAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleTestOP
entryRuleTestOP returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestOPRule()); }
	iv_ruleTestOP=ruleTestOP
	{ $current=$iv_ruleTestOP.current; }
	EOF;

// Rule TestOP
ruleTestOP returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getTestOPRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTestOPAccess().getServiceVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestOPAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestOPRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTestOPAccess().getNameOperationCrossReference_2_0());
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getTestOPAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTestOPRule());
							}
						}
						otherlv_4=RULE_ID
						{
							newLeafNode(otherlv_4, grammarAccess.getTestOPAccess().getVarConf1VariableCrossReference_4_0_0_0());
						}
					)
				)
				otherlv_5='<-'
				{
					newLeafNode(otherlv_5, grammarAccess.getTestOPAccess().getLessThanSignHyphenMinusKeyword_4_0_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTestOPRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getTestOPAccess().getInstVarVariableCrossReference_4_0_2_0());
						}
					)
				)
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getTestOPAccess().getCommaKeyword_4_0_3());
				}
			)*
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTestOPRule());
							}
						}
						otherlv_8=RULE_ID
						{
							newLeafNode(otherlv_8, grammarAccess.getTestOPAccess().getVarConf1VariableCrossReference_4_1_0_0());
						}
					)
				)
				otherlv_9='<-'
				{
					newLeafNode(otherlv_9, grammarAccess.getTestOPAccess().getLessThanSignHyphenMinusKeyword_4_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTestOPRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getTestOPAccess().getInstVarVariableCrossReference_4_1_2_0());
						}
					)
				)
			)
		)*
		otherlv_11=')'
		{
			newLeafNode(otherlv_11, grammarAccess.getTestOPAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getDefKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_0_0_0());
						}
						lv_arg_3_0=ruleVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOperationRule());
							}
							add(
								$current,
								"arg",
								lv_arg_3_0,
								"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_0_1());
				}
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_1_0());
					}
					lv_arg_5_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOperationRule());
						}
						add(
							$current,
							"arg",
							lv_arg_5_0,
							"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
		}
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationAccess().getTypeTypeEnumRuleCall_6_0());
				}
				lv_type_8_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"com.aelos.xtext.mappingassistance.MappingAssistance.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBindings
entryRuleBindings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingsRule()); }
	iv_ruleBindings=ruleBindings
	{ $current=$iv_ruleBindings.current; }
	EOF;

// Rule Bindings
ruleBindings returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='addBind('
		{
			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getAddBindKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1OperationCrossReference_3_0());
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameComp1VariableCrossReference_5_0());
				}
			)
		)
		otherlv_6='.'
		{
			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2OperationCrossReference_7_0());
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8());
		}
	)
;

// Entry rule entryRuleInstanceComp
entryRuleInstanceComp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceCompRule()); }
	iv_ruleInstanceComp=ruleInstanceComp
	{ $current=$iv_ruleInstanceComp.current; }
	EOF;

// Rule InstanceComp
ruleInstanceComp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstanceCompAccess().getDefKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceCompRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstanceCompAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceCompRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getInstanceCompAccess().getTypeAddComponentCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleDouble
entryRuleDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDoubleRule()); }
	iv_ruleDouble=ruleDouble
	{ $current=$iv_ruleDouble.current.getText(); }
	EOF;

// Rule Double
ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
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
