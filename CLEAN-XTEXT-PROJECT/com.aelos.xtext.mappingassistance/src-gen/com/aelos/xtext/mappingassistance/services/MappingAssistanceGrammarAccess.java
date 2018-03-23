/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MappingAssistanceGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Model");
		private final Assignment cFunctionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFunctionAbstractModelParserRuleCall_0 = (RuleCall)cFunctionAssignment.eContents().get(0);
		
		//Model:
		//	function+=AbstractModel*;
		@Override public ParserRule getRule() { return rule; }
		
		//function+=AbstractModel*
		public Assignment getFunctionAssignment() { return cFunctionAssignment; }
		
		//AbstractModel
		public RuleCall getFunctionAbstractModelParserRuleCall_0() { return cFunctionAbstractModelParserRuleCall_0; }
	}
	public class AbstractModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.AbstractModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImImportParserRuleCall_0_0 = (RuleCall)cImAssignment_0.eContents().get(0);
		private final Assignment cTestDrAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTestDrTestDriverParserRuleCall_1_0 = (RuleCall)cTestDrAssignment_1.eContents().get(0);
		private final Assignment cObsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cObsObserverParserRuleCall_2_0 = (RuleCall)cObsAssignment_2.eContents().get(0);
		
		//AbstractModel:
		//	im+=Import+ testDr+=TestDriver obs+=Observer*;
		@Override public ParserRule getRule() { return rule; }
		
		//im+=Import+ testDr+=TestDriver obs+=Observer*
		public Group getGroup() { return cGroup; }
		
		//im+=Import+
		public Assignment getImAssignment_0() { return cImAssignment_0; }
		
		//Import
		public RuleCall getImImportParserRuleCall_0_0() { return cImImportParserRuleCall_0_0; }
		
		//testDr+=TestDriver
		public Assignment getTestDrAssignment_1() { return cTestDrAssignment_1; }
		
		//TestDriver
		public RuleCall getTestDrTestDriverParserRuleCall_1_0() { return cTestDrTestDriverParserRuleCall_1_0; }
		
		//obs+=Observer*
		public Assignment getObsAssignment_2() { return cObsAssignment_2; }
		
		//Observer
		public RuleCall getObsObserverParserRuleCall_2_0() { return cObsObserverParserRuleCall_2_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class TestDriverElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.TestDriver");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTestDriverAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTestDriverKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cOutVarAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final CrossReference cOutVarVariableCrossReference_2_0_0 = (CrossReference)cOutVarAssignment_2_0.eContents().get(0);
		private final RuleCall cOutVarVariableIDTerminalRuleCall_2_0_0_1 = (RuleCall)cOutVarVariableCrossReference_2_0_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cTagetedserviceAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cTagetedserviceCallParserRuleCall_2_2_0 = (RuleCall)cTagetedserviceAssignment_2_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_2_4 = (Group)cGroup_2.eContents().get(4);
		private final Group cGroup_2_4_0 = (Group)cGroup_2_4.eContents().get(0);
		private final Assignment cArgAssignment_2_4_0_0 = (Assignment)cGroup_2_4_0.eContents().get(0);
		private final CrossReference cArgVariableCrossReference_2_4_0_0_0 = (CrossReference)cArgAssignment_2_4_0_0.eContents().get(0);
		private final RuleCall cArgVariableIDTerminalRuleCall_2_4_0_0_0_1 = (RuleCall)cArgVariableCrossReference_2_4_0_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_2_4_0_1 = (Keyword)cGroup_2_4_0.eContents().get(1);
		private final Assignment cArgAssignment_2_4_1 = (Assignment)cGroup_2_4.eContents().get(1);
		private final CrossReference cArgVariableCrossReference_2_4_1_0 = (CrossReference)cArgAssignment_2_4_1.eContents().get(0);
		private final RuleCall cArgVariableIDTerminalRuleCall_2_4_1_0_1 = (RuleCall)cArgVariableCrossReference_2_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_5 = (Keyword)cGroup_2.eContents().get(5);
		
		//TestDriver:
		//	{TestDriver} "TestDriver:" (outVar+=[testIntention::Variable] ":=" tagetedservice+=Call "("
		//	((arg+=[testIntention::Variable] ",")* arg+=[testIntention::Variable])* ")")*;
		@Override public ParserRule getRule() { return rule; }
		
		//{TestDriver} "TestDriver:" (outVar+=[testIntention::Variable] ":=" tagetedservice+=Call "("
		//((arg+=[testIntention::Variable] ",")* arg+=[testIntention::Variable])* ")")*
		public Group getGroup() { return cGroup; }
		
		//{TestDriver}
		public Action getTestDriverAction_0() { return cTestDriverAction_0; }
		
		//"TestDriver:"
		public Keyword getTestDriverKeyword_1() { return cTestDriverKeyword_1; }
		
		//(outVar+=[testIntention::Variable] ":=" tagetedservice+=Call "(" ((arg+=[testIntention::Variable] ",")*
		//arg+=[testIntention::Variable])* ")")*
		public Group getGroup_2() { return cGroup_2; }
		
		//outVar+=[testIntention::Variable]
		public Assignment getOutVarAssignment_2_0() { return cOutVarAssignment_2_0; }
		
		//[testIntention::Variable]
		public CrossReference getOutVarVariableCrossReference_2_0_0() { return cOutVarVariableCrossReference_2_0_0; }
		
		//ID
		public RuleCall getOutVarVariableIDTerminalRuleCall_2_0_0_1() { return cOutVarVariableIDTerminalRuleCall_2_0_0_1; }
		
		//":="
		public Keyword getColonEqualsSignKeyword_2_1() { return cColonEqualsSignKeyword_2_1; }
		
		//tagetedservice+=Call
		public Assignment getTagetedserviceAssignment_2_2() { return cTagetedserviceAssignment_2_2; }
		
		//Call
		public RuleCall getTagetedserviceCallParserRuleCall_2_2_0() { return cTagetedserviceCallParserRuleCall_2_2_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2_3() { return cLeftParenthesisKeyword_2_3; }
		
		//((arg+=[testIntention::Variable] ",")* arg+=[testIntention::Variable])*
		public Group getGroup_2_4() { return cGroup_2_4; }
		
		//(arg+=[testIntention::Variable] ",")*
		public Group getGroup_2_4_0() { return cGroup_2_4_0; }
		
		//arg+=[testIntention::Variable]
		public Assignment getArgAssignment_2_4_0_0() { return cArgAssignment_2_4_0_0; }
		
		//[testIntention::Variable]
		public CrossReference getArgVariableCrossReference_2_4_0_0_0() { return cArgVariableCrossReference_2_4_0_0_0; }
		
		//ID
		public RuleCall getArgVariableIDTerminalRuleCall_2_4_0_0_0_1() { return cArgVariableIDTerminalRuleCall_2_4_0_0_0_1; }
		
		//","
		public Keyword getCommaKeyword_2_4_0_1() { return cCommaKeyword_2_4_0_1; }
		
		//arg+=[testIntention::Variable]
		public Assignment getArgAssignment_2_4_1() { return cArgAssignment_2_4_1; }
		
		//[testIntention::Variable]
		public CrossReference getArgVariableCrossReference_2_4_1_0() { return cArgVariableCrossReference_2_4_1_0; }
		
		//ID
		public RuleCall getArgVariableIDTerminalRuleCall_2_4_1_0_1() { return cArgVariableIDTerminalRuleCall_2_4_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2_5() { return cRightParenthesisKeyword_2_5; }
	}
	public class ObserverElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Observer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObserverKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceName1Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cServiceName1CallParserRuleCall_3_0 = (RuleCall)cServiceName1Assignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cServiceName2Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cServiceName2CallParserRuleCall_5_0 = (RuleCall)cServiceName2Assignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cLeftParenthesisKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cGroup_7.eContents().get(1);
		private final Group cGroup_7_1_0 = (Group)cGroup_7_1.eContents().get(0);
		private final Assignment cArgAssignment_7_1_0_0 = (Assignment)cGroup_7_1_0.eContents().get(0);
		private final CrossReference cArgVariableCrossReference_7_1_0_0_0 = (CrossReference)cArgAssignment_7_1_0_0.eContents().get(0);
		private final RuleCall cArgVariableIDTerminalRuleCall_7_1_0_0_0_1 = (RuleCall)cArgVariableCrossReference_7_1_0_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_7_1_0_1 = (Keyword)cGroup_7_1_0.eContents().get(1);
		private final Assignment cArgAssignment_7_1_1 = (Assignment)cGroup_7_1.eContents().get(1);
		private final CrossReference cArgVariableCrossReference_7_1_1_0 = (CrossReference)cArgAssignment_7_1_1.eContents().get(0);
		private final RuleCall cArgVariableIDTerminalRuleCall_7_1_1_0_1 = (RuleCall)cArgVariableCrossReference_7_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		
		//Observer:
		//	"observer:" name=ID "(" serviceName1+=Call "," serviceName2+=Call ")" ("(" ((arg+=[testIntention::Variable] ",")*
		//	arg+=[testIntention::Variable])* ")")*;
		@Override public ParserRule getRule() { return rule; }
		
		//"observer:" name=ID "(" serviceName1+=Call "," serviceName2+=Call ")" ("(" ((arg+=[testIntention::Variable] ",")*
		//arg+=[testIntention::Variable])* ")")*
		public Group getGroup() { return cGroup; }
		
		//"observer:"
		public Keyword getObserverKeyword_0() { return cObserverKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//serviceName1+=Call
		public Assignment getServiceName1Assignment_3() { return cServiceName1Assignment_3; }
		
		//Call
		public RuleCall getServiceName1CallParserRuleCall_3_0() { return cServiceName1CallParserRuleCall_3_0; }
		
		//","
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//serviceName2+=Call
		public Assignment getServiceName2Assignment_5() { return cServiceName2Assignment_5; }
		
		//Call
		public RuleCall getServiceName2CallParserRuleCall_5_0() { return cServiceName2CallParserRuleCall_5_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//("(" ((arg+=[testIntention::Variable] ",")* arg+=[testIntention::Variable])* ")")*
		public Group getGroup_7() { return cGroup_7; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_7_0() { return cLeftParenthesisKeyword_7_0; }
		
		//((arg+=[testIntention::Variable] ",")* arg+=[testIntention::Variable])*
		public Group getGroup_7_1() { return cGroup_7_1; }
		
		//(arg+=[testIntention::Variable] ",")*
		public Group getGroup_7_1_0() { return cGroup_7_1_0; }
		
		//arg+=[testIntention::Variable]
		public Assignment getArgAssignment_7_1_0_0() { return cArgAssignment_7_1_0_0; }
		
		//[testIntention::Variable]
		public CrossReference getArgVariableCrossReference_7_1_0_0_0() { return cArgVariableCrossReference_7_1_0_0_0; }
		
		//ID
		public RuleCall getArgVariableIDTerminalRuleCall_7_1_0_0_0_1() { return cArgVariableIDTerminalRuleCall_7_1_0_0_0_1; }
		
		//","
		public Keyword getCommaKeyword_7_1_0_1() { return cCommaKeyword_7_1_0_1; }
		
		//arg+=[testIntention::Variable]
		public Assignment getArgAssignment_7_1_1() { return cArgAssignment_7_1_1; }
		
		//[testIntention::Variable]
		public CrossReference getArgVariableCrossReference_7_1_1_0() { return cArgVariableCrossReference_7_1_1_0; }
		
		//ID
		public RuleCall getArgVariableIDTerminalRuleCall_7_1_1_0_1() { return cArgVariableIDTerminalRuleCall_7_1_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_7_2() { return cRightParenthesisKeyword_7_2; }
	}
	public class CallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Call");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReceiverAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cReceiverVariableCrossReference_0_0 = (CrossReference)cReceiverAssignment_0.eContents().get(0);
		private final RuleCall cReceiverVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cReceiverVariableCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMemberAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMemberOperationCrossReference_2_0 = (CrossReference)cMemberAssignment_2.eContents().get(0);
		private final RuleCall cMemberOperationIDTerminalRuleCall_2_0_1 = (RuleCall)cMemberOperationCrossReference_2_0.eContents().get(1);
		
		////	("Component" | "Mock" | "Observator")":" 
		////	inst+=InstanceComp":" name=ID
		////	"ProvidedServices:"
		////	"conf("(arg+=Variable ",")*arg1+=Variable")"
		////	(methode+=ServiceName "("((arg+=Variable ",")*arg+=Variable)*")"(":"arg+=Variable)?)*
		////    "RequiredServices:"?
		////    (req+=RequiredService)*
		////	(map+=Mapping)*
		////	(bind+=Bindings)*
		////;
		////
		////InstanceComp:
		////	name=ID
		////;
		////
		////Variable:
		////      name=ID ":" type=Type;
		////      
		////Mapping :
		////	 'varModel:' nameVarMode+=[Variable] 'ref' 'varTest:' nameVarTest+=[testIntention::Variable]
		////;
		////
		////Bindings :
		////	"bind(" nameComp+=[InstanceComp]'.'nameServ1+=[ServiceName] "," nameComp+=[InstanceComp]'.'nameServ2+=[ServiceName] ")";
		////	  
		////RequiredService:
		////		 
		////		nameVarMethode+=Variable":="nameComp+=[InstanceComp]'.'nameServ+=[ServiceName]";";
		////	  
		////
		////ServiceName : name=ID;
		//Call:
		//	receiver=[arch::Variable] '.' member+=[arch::Operation];
		@Override public ParserRule getRule() { return rule; }
		
		//receiver=[arch::Variable] '.' member+=[arch::Operation]
		public Group getGroup() { return cGroup; }
		
		//receiver=[arch::Variable]
		public Assignment getReceiverAssignment_0() { return cReceiverAssignment_0; }
		
		//[arch::Variable]
		public CrossReference getReceiverVariableCrossReference_0_0() { return cReceiverVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getReceiverVariableIDTerminalRuleCall_0_0_1() { return cReceiverVariableIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//member+=[arch::Operation]
		public Assignment getMemberAssignment_2() { return cMemberAssignment_2; }
		
		//[arch::Operation]
		public CrossReference getMemberOperationCrossReference_2_0() { return cMemberOperationCrossReference_2_0; }
		
		//ID
		public RuleCall getMemberOperationIDTerminalRuleCall_2_0_1() { return cMemberOperationIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractModelElements pAbstractModel;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final TestDriverElements pTestDriver;
	private final ObserverElements pObserver;
	private final CallElements pCall;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MappingAssistanceGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractModel = new AbstractModelElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pTestDriver = new TestDriverElements();
		this.pObserver = new ObserverElements();
		this.pCall = new CallElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.aelos.xtext.mappingassistance.MappingAssistance".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	function+=AbstractModel*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//AbstractModel:
	//	im+=Import+ testDr+=TestDriver obs+=Observer*;
	public AbstractModelElements getAbstractModelAccess() {
		return pAbstractModel;
	}
	
	public ParserRule getAbstractModelRule() {
		return getAbstractModelAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//TestDriver:
	//	{TestDriver} "TestDriver:" (outVar+=[testIntention::Variable] ":=" tagetedservice+=Call "("
	//	((arg+=[testIntention::Variable] ",")* arg+=[testIntention::Variable])* ")")*;
	public TestDriverElements getTestDriverAccess() {
		return pTestDriver;
	}
	
	public ParserRule getTestDriverRule() {
		return getTestDriverAccess().getRule();
	}
	
	//Observer:
	//	"observer:" name=ID "(" serviceName1+=Call "," serviceName2+=Call ")" ("(" ((arg+=[testIntention::Variable] ",")*
	//	arg+=[testIntention::Variable])* ")")*;
	public ObserverElements getObserverAccess() {
		return pObserver;
	}
	
	public ParserRule getObserverRule() {
		return getObserverAccess().getRule();
	}
	
	////	("Component" | "Mock" | "Observator")":" 
	////	inst+=InstanceComp":" name=ID
	////	"ProvidedServices:"
	////	"conf("(arg+=Variable ",")*arg1+=Variable")"
	////	(methode+=ServiceName "("((arg+=Variable ",")*arg+=Variable)*")"(":"arg+=Variable)?)*
	////    "RequiredServices:"?
	////    (req+=RequiredService)*
	////	(map+=Mapping)*
	////	(bind+=Bindings)*
	////;
	////
	////InstanceComp:
	////	name=ID
	////;
	////
	////Variable:
	////      name=ID ":" type=Type;
	////      
	////Mapping :
	////	 'varModel:' nameVarMode+=[Variable] 'ref' 'varTest:' nameVarTest+=[testIntention::Variable]
	////;
	////
	////Bindings :
	////	"bind(" nameComp+=[InstanceComp]'.'nameServ1+=[ServiceName] "," nameComp+=[InstanceComp]'.'nameServ2+=[ServiceName] ")";
	////	  
	////RequiredService:
	////		 
	////		nameVarMethode+=Variable":="nameComp+=[InstanceComp]'.'nameServ+=[ServiceName]";";
	////	  
	////
	////ServiceName : name=ID;
	//Call:
	//	receiver=[arch::Variable] '.' member+=[arch::Operation];
	public CallElements getCallAccess() {
		return pCall;
	}
	
	public ParserRule getCallRule() {
		return getCallAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
