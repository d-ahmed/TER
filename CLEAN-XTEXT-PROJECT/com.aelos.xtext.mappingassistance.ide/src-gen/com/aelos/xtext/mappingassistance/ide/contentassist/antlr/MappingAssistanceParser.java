/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.ide.contentassist.antlr;

import com.aelos.xtext.mappingassistance.ide.contentassist.antlr.internal.InternalMappingAssistanceParser;
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MappingAssistanceParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MappingAssistanceGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MappingAssistanceGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractModelAccess().getAlternatives_2(), "rule__AbstractModel__Alternatives_2");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getAbstractModelAccess().getGroup(), "rule__AbstractModel__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup(), "rule__TestDriver__Group__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup_3(), "rule__TestDriver__Group_3__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup_3_6(), "rule__TestDriver__Group_3_6__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup_3_6_0(), "rule__TestDriver__Group_3_6_0__0");
			builder.put(grammarAccess.getObserverAccess().getGroup(), "rule__Observer__Group__0");
			builder.put(grammarAccess.getObserverAccess().getGroup_12(), "rule__Observer__Group_12__0");
			builder.put(grammarAccess.getObserverAccess().getGroup_12_0(), "rule__Observer__Group_12_0__0");
			builder.put(grammarAccess.getMockAccess().getGroup(), "rule__Mock__Group__0");
			builder.put(grammarAccess.getConfAccess().getGroup(), "rule__Conf__Group__0");
			builder.put(grammarAccess.getConfAccess().getGroup_5(), "rule__Conf__Group_5__0");
			builder.put(grammarAccess.getConfAccess().getGroup_5_0(), "rule__Conf__Group_5_0__0");
			builder.put(grammarAccess.getConfAccess().getGroup_5_1(), "rule__Conf__Group_5_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
			builder.put(grammarAccess.getComopnentAccess().getGroup(), "rule__Comopnent__Group__0");
			builder.put(grammarAccess.getComopnentAccess().getGroup_5(), "rule__Comopnent__Group_5__0");
			builder.put(grammarAccess.getComopnentAccess().getGroup_5_0(), "rule__Comopnent__Group_5_0__0");
			builder.put(grammarAccess.getComopnentAccess().getGroup_7(), "rule__Comopnent__Group_7__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_3_0(), "rule__Operation__Group_3_0__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getBindingsAccess().getGroup(), "rule__Bindings__Group__0");
			builder.put(grammarAccess.getInstanceCompAccess().getGroup(), "rule__InstanceComp__Group__0");
			builder.put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
			builder.put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
			builder.put(grammarAccess.getModelAccess().getFunctionAssignment(), "rule__Model__FunctionAssignment");
			builder.put(grammarAccess.getAbstractModelAccess().getImAssignment_0(), "rule__AbstractModel__ImAssignment_0");
			builder.put(grammarAccess.getAbstractModelAccess().getTestDrAssignment_1(), "rule__AbstractModel__TestDrAssignment_1");
			builder.put(grammarAccess.getAbstractModelAccess().getObsAssignment_2_0(), "rule__AbstractModel__ObsAssignment_2_0");
			builder.put(grammarAccess.getAbstractModelAccess().getCompAssignment_2_1(), "rule__AbstractModel__CompAssignment_2_1");
			builder.put(grammarAccess.getAbstractModelAccess().getMockAssignment_2_2(), "rule__AbstractModel__MockAssignment_2_2");
			builder.put(grammarAccess.getAbstractModelAccess().getConfAssignment_2_3(), "rule__AbstractModel__ConfAssignment_2_3");
			builder.put(grammarAccess.getAbstractModelAccess().getBindAssignment_2_4(), "rule__AbstractModel__BindAssignment_2_4");
			builder.put(grammarAccess.getAbstractModelAccess().getInstAssignment_2_5(), "rule__AbstractModel__InstAssignment_2_5");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getTestDriverAccess().getOutVarAssignment_3_0(), "rule__TestDriver__OutVarAssignment_3_0");
			builder.put(grammarAccess.getTestDriverAccess().getServiceAssignment_3_2(), "rule__TestDriver__ServiceAssignment_3_2");
			builder.put(grammarAccess.getTestDriverAccess().getMemberAssignment_3_4(), "rule__TestDriver__MemberAssignment_3_4");
			builder.put(grammarAccess.getTestDriverAccess().getArgAssignment_3_6_0_0(), "rule__TestDriver__ArgAssignment_3_6_0_0");
			builder.put(grammarAccess.getTestDriverAccess().getArgAssignment_3_6_1(), "rule__TestDriver__ArgAssignment_3_6_1");
			builder.put(grammarAccess.getObserverAccess().getNameAssignment_1(), "rule__Observer__NameAssignment_1");
			builder.put(grammarAccess.getObserverAccess().getService1Assignment_3(), "rule__Observer__Service1Assignment_3");
			builder.put(grammarAccess.getObserverAccess().getMember1Assignment_5(), "rule__Observer__Member1Assignment_5");
			builder.put(grammarAccess.getObserverAccess().getService2Assignment_7(), "rule__Observer__Service2Assignment_7");
			builder.put(grammarAccess.getObserverAccess().getMember2Assignment_9(), "rule__Observer__Member2Assignment_9");
			builder.put(grammarAccess.getObserverAccess().getArgAssignment_12_0_0(), "rule__Observer__ArgAssignment_12_0_0");
			builder.put(grammarAccess.getObserverAccess().getArgAssignment_12_1(), "rule__Observer__ArgAssignment_12_1");
			builder.put(grammarAccess.getMockAccess().getIntentionVarAssignment_1(), "rule__Mock__IntentionVarAssignment_1");
			builder.put(grammarAccess.getMockAccess().getServiceAssignment_3(), "rule__Mock__ServiceAssignment_3");
			builder.put(grammarAccess.getMockAccess().getMemberAssignment_5(), "rule__Mock__MemberAssignment_5");
			builder.put(grammarAccess.getConfAccess().getServiceAssignment_1(), "rule__Conf__ServiceAssignment_1");
			builder.put(grammarAccess.getConfAccess().getMemberAssignment_3(), "rule__Conf__MemberAssignment_3");
			builder.put(grammarAccess.getConfAccess().getVarConfAssignment_5_0_0(), "rule__Conf__VarConfAssignment_5_0_0");
			builder.put(grammarAccess.getConfAccess().getInstVarAssignment_5_0_2(), "rule__Conf__InstVarAssignment_5_0_2");
			builder.put(grammarAccess.getConfAccess().getVarConfAssignment_5_1_0(), "rule__Conf__VarConfAssignment_5_1_0");
			builder.put(grammarAccess.getConfAccess().getInstVarAssignment_5_1_2(), "rule__Conf__InstVarAssignment_5_1_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
			builder.put(grammarAccess.getAtomicAccess().getVariableAssignment_4_1(), "rule__Atomic__VariableAssignment_4_1");
			builder.put(grammarAccess.getComopnentAccess().getNameAssignment_1(), "rule__Comopnent__NameAssignment_1");
			builder.put(grammarAccess.getComopnentAccess().getOpsAssignment_5_0_0(), "rule__Comopnent__OpsAssignment_5_0_0");
			builder.put(grammarAccess.getComopnentAccess().getOpsAssignment_5_1(), "rule__Comopnent__OpsAssignment_5_1");
			builder.put(grammarAccess.getComopnentAccess().getOperationsAssignment_7_0(), "rule__Comopnent__OperationsAssignment_7_0");
			builder.put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
			builder.put(grammarAccess.getOperationAccess().getArgAssignment_3_0_0(), "rule__Operation__ArgAssignment_3_0_0");
			builder.put(grammarAccess.getOperationAccess().getArgAssignment_3_1(), "rule__Operation__ArgAssignment_3_1");
			builder.put(grammarAccess.getOperationAccess().getTypeAssignment_6(), "rule__Operation__TypeAssignment_6");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
			builder.put(grammarAccess.getBindingsAccess().getNameCompAssignment_1(), "rule__Bindings__NameCompAssignment_1");
			builder.put(grammarAccess.getBindingsAccess().getNameServ1Assignment_3(), "rule__Bindings__NameServ1Assignment_3");
			builder.put(grammarAccess.getBindingsAccess().getNameComp1Assignment_5(), "rule__Bindings__NameComp1Assignment_5");
			builder.put(grammarAccess.getBindingsAccess().getNameServ2Assignment_7(), "rule__Bindings__NameServ2Assignment_7");
			builder.put(grammarAccess.getInstanceCompAccess().getNameAssignment_1(), "rule__InstanceComp__NameAssignment_1");
			builder.put(grammarAccess.getInstanceCompAccess().getTypeAssignment_3(), "rule__InstanceComp__TypeAssignment_3");
			builder.put(grammarAccess.getCallAccess().getReceiverAssignment_0(), "rule__Call__ReceiverAssignment_0");
			builder.put(grammarAccess.getCallAccess().getMemberAssignment_2(), "rule__Call__MemberAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MappingAssistanceGrammarAccess grammarAccess;

	@Override
	protected InternalMappingAssistanceParser createParser() {
		InternalMappingAssistanceParser result = new InternalMappingAssistanceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MappingAssistanceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MappingAssistanceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
