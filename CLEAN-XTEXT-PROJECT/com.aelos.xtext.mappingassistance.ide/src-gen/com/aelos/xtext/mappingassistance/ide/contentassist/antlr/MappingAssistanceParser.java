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
			builder.put(grammarAccess.getAbstractModelAccess().getGroup(), "rule__AbstractModel__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup(), "rule__TestDriver__Group__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup_2(), "rule__TestDriver__Group_2__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup_2_4(), "rule__TestDriver__Group_2_4__0");
			builder.put(grammarAccess.getTestDriverAccess().getGroup_2_4_0(), "rule__TestDriver__Group_2_4_0__0");
			builder.put(grammarAccess.getObserverAccess().getGroup(), "rule__Observer__Group__0");
			builder.put(grammarAccess.getObserverAccess().getGroup_7(), "rule__Observer__Group_7__0");
			builder.put(grammarAccess.getObserverAccess().getGroup_7_1(), "rule__Observer__Group_7_1__0");
			builder.put(grammarAccess.getObserverAccess().getGroup_7_1_0(), "rule__Observer__Group_7_1_0__0");
			builder.put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
			builder.put(grammarAccess.getModelAccess().getFunctionAssignment(), "rule__Model__FunctionAssignment");
			builder.put(grammarAccess.getAbstractModelAccess().getImAssignment_0(), "rule__AbstractModel__ImAssignment_0");
			builder.put(grammarAccess.getAbstractModelAccess().getTestDrAssignment_1(), "rule__AbstractModel__TestDrAssignment_1");
			builder.put(grammarAccess.getAbstractModelAccess().getObsAssignment_2(), "rule__AbstractModel__ObsAssignment_2");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getTestDriverAccess().getOutVarAssignment_2_0(), "rule__TestDriver__OutVarAssignment_2_0");
			builder.put(grammarAccess.getTestDriverAccess().getTagetedserviceAssignment_2_2(), "rule__TestDriver__TagetedserviceAssignment_2_2");
			builder.put(grammarAccess.getTestDriverAccess().getArgAssignment_2_4_0_0(), "rule__TestDriver__ArgAssignment_2_4_0_0");
			builder.put(grammarAccess.getTestDriverAccess().getArgAssignment_2_4_1(), "rule__TestDriver__ArgAssignment_2_4_1");
			builder.put(grammarAccess.getObserverAccess().getNameAssignment_1(), "rule__Observer__NameAssignment_1");
			builder.put(grammarAccess.getObserverAccess().getServiceName1Assignment_3(), "rule__Observer__ServiceName1Assignment_3");
			builder.put(grammarAccess.getObserverAccess().getServiceName2Assignment_5(), "rule__Observer__ServiceName2Assignment_5");
			builder.put(grammarAccess.getObserverAccess().getArgAssignment_7_1_0_0(), "rule__Observer__ArgAssignment_7_1_0_0");
			builder.put(grammarAccess.getObserverAccess().getArgAssignment_7_1_1(), "rule__Observer__ArgAssignment_7_1_1");
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
