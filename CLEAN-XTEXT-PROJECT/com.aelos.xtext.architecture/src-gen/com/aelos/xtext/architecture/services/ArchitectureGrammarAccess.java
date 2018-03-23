/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArchitectureGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Model");
		private final Assignment cPackageAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPackageDomainDeclarationParserRuleCall_0 = (RuleCall)cPackageAssignment.eContents().get(0);
		
		//Model:
		//	package+=DomainDeclaration*;
		@Override public ParserRule getRule() { return rule; }
		
		//package+=DomainDeclaration*
		public Assignment getPackageAssignment() { return cPackageAssignment; }
		
		//DomainDeclaration
		public RuleCall getPackageDomainDeclarationParserRuleCall_0() { return cPackageDomainDeclarationParserRuleCall_0; }
	}
	public class DomainDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.DomainDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractModelParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DomainDeclaration:
		//	'domain' name=QualifiedName '{'
		//	elements+=AbstractModel*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'domain' name=QualifiedName '{' elements+=AbstractModel* '}'
		public Group getGroup() { return cGroup; }
		
		//'domain'
		public Keyword getDomainKeyword_0() { return cDomainKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=AbstractModel*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//AbstractModel
		public RuleCall getElementsAbstractModelParserRuleCall_3_0() { return cElementsAbstractModelParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.AbstractModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cImportParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cCompAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCompComponentParserRuleCall_1_0 = (RuleCall)cCompAssignment_1.eContents().get(0);
		
		//AbstractModel:
		//	Import? comp+=Component+;
		@Override public ParserRule getRule() { return rule; }
		
		//Import? comp+=Component+
		public Group getGroup() { return cGroup; }
		
		//Import?
		public RuleCall getImportParserRuleCall_0() { return cImportParserRuleCall_0; }
		
		//comp+=Component+
		public Assignment getCompAssignment_1() { return cCompAssignment_1; }
		
		//Component
		public RuleCall getCompComponentParserRuleCall_1_0() { return cCompComponentParserRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Import");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.QualifiedNameWithWildcard");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.QualifiedName");
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
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cProvidedServicesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cGroup_5.eContents().get(0);
		private final Assignment cOpsAssignment_5_0_0 = (Assignment)cGroup_5_0.eContents().get(0);
		private final CrossReference cOpsOperationCrossReference_5_0_0_0 = (CrossReference)cOpsAssignment_5_0_0.eContents().get(0);
		private final RuleCall cOpsOperationIDTerminalRuleCall_5_0_0_0_1 = (RuleCall)cOpsOperationCrossReference_5_0_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cOpsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cOpsOperationCrossReference_5_1_0 = (CrossReference)cOpsAssignment_5_1.eContents().get(0);
		private final RuleCall cOpsOperationIDTerminalRuleCall_5_1_0_1 = (RuleCall)cOpsOperationCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cOperationsAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cOperationsOperationParserRuleCall_7_0_0 = (RuleCall)cOperationsAssignment_7_0.eContents().get(0);
		private final Assignment cVarsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cVarsVariableParserRuleCall_8_0 = (RuleCall)cVarsAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Component:
		//	"Component:" name=ID "{"
		//	"providedServices" "(" ((ops+=[Operation] ",")* ops+=[Operation])* ")"
		//	-> (operations+=Operation)*
		//	vars+=Variable*
		//	//"providedServices" "(" ((ops+=[Operation] ",")*(ops+=[Operation]))* ")"
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"Component:" name=ID "{" "providedServices" "(" ((ops+=[Operation] ",")* ops+=[Operation])* ")" ->
		//(operations+=Operation)* vars+=Variable* //"providedServices" "(" ((ops+=[Operation] ",")*(ops+=[Operation]))* ")"
		//"}"
		public Group getGroup() { return cGroup; }
		
		//"Component:"
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//"providedServices"
		public Keyword getProvidedServicesKeyword_3() { return cProvidedServicesKeyword_3; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//((ops+=[Operation] ",")* ops+=[Operation])*
		public Group getGroup_5() { return cGroup_5; }
		
		//(ops+=[Operation] ",")*
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//ops+=[Operation]
		public Assignment getOpsAssignment_5_0_0() { return cOpsAssignment_5_0_0; }
		
		//[Operation]
		public CrossReference getOpsOperationCrossReference_5_0_0_0() { return cOpsOperationCrossReference_5_0_0_0; }
		
		//ID
		public RuleCall getOpsOperationIDTerminalRuleCall_5_0_0_0_1() { return cOpsOperationIDTerminalRuleCall_5_0_0_0_1; }
		
		//","
		public Keyword getCommaKeyword_5_0_1() { return cCommaKeyword_5_0_1; }
		
		//ops+=[Operation]
		public Assignment getOpsAssignment_5_1() { return cOpsAssignment_5_1; }
		
		//[Operation]
		public CrossReference getOpsOperationCrossReference_5_1_0() { return cOpsOperationCrossReference_5_1_0; }
		
		//ID
		public RuleCall getOpsOperationIDTerminalRuleCall_5_1_0_1() { return cOpsOperationIDTerminalRuleCall_5_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//-> (operations+=Operation)*
		public Group getGroup_7() { return cGroup_7; }
		
		//operations+=Operation
		public Assignment getOperationsAssignment_7_0() { return cOperationsAssignment_7_0; }
		
		//Operation
		public RuleCall getOperationsOperationParserRuleCall_7_0_0() { return cOperationsOperationParserRuleCall_7_0_0; }
		
		//vars+=Variable*
		public Assignment getVarsAssignment_8() { return cVarsAssignment_8; }
		
		//Variable
		public RuleCall getVarsVariableParserRuleCall_8_0() { return cVarsVariableParserRuleCall_8_0; }
		
		////"providedServices" "(" ((ops+=[Operation] ",")*(ops+=[Operation]))* ")"
		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Variable:
		//	name=ID ":" type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ":" type=Type
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeEnumRuleCall_2_0() { return cTypeTypeEnumRuleCall_2_0; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDefKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Group cGroup_0_3_0 = (Group)cGroup_0_3.eContents().get(0);
		private final Assignment cArgAssignment_0_3_0_0 = (Assignment)cGroup_0_3_0.eContents().get(0);
		private final RuleCall cArgVariableParserRuleCall_0_3_0_0_0 = (RuleCall)cArgAssignment_0_3_0_0.eContents().get(0);
		private final Keyword cCommaKeyword_0_3_0_1 = (Keyword)cGroup_0_3_0.eContents().get(1);
		private final Assignment cArgAssignment_0_3_1 = (Assignment)cGroup_0_3.eContents().get(1);
		private final RuleCall cArgVariableParserRuleCall_0_3_1_0 = (RuleCall)cArgAssignment_0_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Keyword cColonKeyword_0_5 = (Keyword)cGroup_0.eContents().get(5);
		private final Assignment cTypeAssignment_0_6 = (Assignment)cGroup_0.eContents().get(6);
		private final RuleCall cTypeTypeEnumRuleCall_0_6_0 = (RuleCall)cTypeAssignment_0_6.eContents().get(0);
		private final Assignment cTypeCompAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cTypeCompComponentCrossReference_1_0 = (CrossReference)cTypeCompAssignment_1.eContents().get(0);
		private final RuleCall cTypeCompComponentIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeCompComponentCrossReference_1_0.eContents().get(1);
		
		//Operation:
		//	"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=Type | typeComp+=[Component];
		@Override public ParserRule getRule() { return rule; }
		
		//"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=Type | typeComp+=[Component]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=Type
		public Group getGroup_0() { return cGroup_0; }
		
		//"def"
		public Keyword getDefKeyword_0_0() { return cDefKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0_2() { return cLeftParenthesisKeyword_0_2; }
		
		//((arg+=Variable ",")* arg+=Variable)*
		public Group getGroup_0_3() { return cGroup_0_3; }
		
		//(arg+=Variable ",")*
		public Group getGroup_0_3_0() { return cGroup_0_3_0; }
		
		//arg+=Variable
		public Assignment getArgAssignment_0_3_0_0() { return cArgAssignment_0_3_0_0; }
		
		//Variable
		public RuleCall getArgVariableParserRuleCall_0_3_0_0_0() { return cArgVariableParserRuleCall_0_3_0_0_0; }
		
		//","
		public Keyword getCommaKeyword_0_3_0_1() { return cCommaKeyword_0_3_0_1; }
		
		//arg+=Variable
		public Assignment getArgAssignment_0_3_1() { return cArgAssignment_0_3_1; }
		
		//Variable
		public RuleCall getArgVariableParserRuleCall_0_3_1_0() { return cArgVariableParserRuleCall_0_3_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_0_4() { return cRightParenthesisKeyword_0_4; }
		
		//":"
		public Keyword getColonKeyword_0_5() { return cColonKeyword_0_5; }
		
		//type=Type
		public Assignment getTypeAssignment_0_6() { return cTypeAssignment_0_6; }
		
		//Type
		public RuleCall getTypeTypeEnumRuleCall_0_6_0() { return cTypeTypeEnumRuleCall_0_6_0; }
		
		//typeComp+=[Component]
		public Assignment getTypeCompAssignment_1() { return cTypeCompAssignment_1; }
		
		//[Component]
		public CrossReference getTypeCompComponentCrossReference_1_0() { return cTypeCompComponentCrossReference_1_0; }
		
		//ID
		public RuleCall getTypeCompComponentIDTerminalRuleCall_1_0_1() { return cTypeCompComponentIDTerminalRuleCall_1_0_1; }
	}
	
	public class TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTINTKeyword_0_0 = (Keyword)cINTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSTRINGSTRINGKeyword_1_0 = (Keyword)cSTRINGEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBooleanBooleanKeyword_2_0 = (Keyword)cBooleanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDoubleDoubleKeyword_3_0 = (Keyword)cDoubleEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Type:
		//	INT | STRING | Boolean | Double;
		public EnumRule getRule() { return rule; }
		
		//INT | STRING | Boolean | Double
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public EnumLiteralDeclaration getINTEnumLiteralDeclaration_0() { return cINTEnumLiteralDeclaration_0; }
		
		//"INT"
		public Keyword getINTINTKeyword_0_0() { return cINTINTKeyword_0_0; }
		
		//STRING
		public EnumLiteralDeclaration getSTRINGEnumLiteralDeclaration_1() { return cSTRINGEnumLiteralDeclaration_1; }
		
		//"STRING"
		public Keyword getSTRINGSTRINGKeyword_1_0() { return cSTRINGSTRINGKeyword_1_0; }
		
		//Boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_2() { return cBooleanEnumLiteralDeclaration_2; }
		
		//"Boolean"
		public Keyword getBooleanBooleanKeyword_2_0() { return cBooleanBooleanKeyword_2_0; }
		
		//Double
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_3() { return cDoubleEnumLiteralDeclaration_3; }
		
		//"Double"
		public Keyword getDoubleDoubleKeyword_3_0() { return cDoubleDoubleKeyword_3_0; }
	}
	
	private final ModelElements pModel;
	private final DomainDeclarationElements pDomainDeclaration;
	private final AbstractModelElements pAbstractModel;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final ComponentElements pComponent;
	private final VariableElements pVariable;
	private final OperationElements pOperation;
	private final TypeElements eType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArchitectureGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDomainDeclaration = new DomainDeclarationElements();
		this.pAbstractModel = new AbstractModelElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pComponent = new ComponentElements();
		this.pVariable = new VariableElements();
		this.pOperation = new OperationElements();
		this.eType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.aelos.xtext.architecture.Architecture".equals(grammar.getName())) {
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
	//	package+=DomainDeclaration*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//DomainDeclaration:
	//	'domain' name=QualifiedName '{'
	//	elements+=AbstractModel*
	//	'}';
	public DomainDeclarationElements getDomainDeclarationAccess() {
		return pDomainDeclaration;
	}
	
	public ParserRule getDomainDeclarationRule() {
		return getDomainDeclarationAccess().getRule();
	}
	
	//AbstractModel:
	//	Import? comp+=Component+;
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
	
	//Component:
	//	"Component:" name=ID "{"
	//	"providedServices" "(" ((ops+=[Operation] ",")* ops+=[Operation])* ")"
	//	-> (operations+=Operation)*
	//	vars+=Variable*
	//	//"providedServices" "(" ((ops+=[Operation] ",")*(ops+=[Operation]))* ")"
	//	"}";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Variable:
	//	name=ID ":" type=Type;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Operation:
	//	"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=Type | typeComp+=[Component];
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//enum Type:
	//	INT | STRING | Boolean | Double;
	public TypeElements getTypeAccess() {
		return eType;
	}
	
	public EnumRule getTypeRule() {
		return getTypeAccess().getRule();
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
