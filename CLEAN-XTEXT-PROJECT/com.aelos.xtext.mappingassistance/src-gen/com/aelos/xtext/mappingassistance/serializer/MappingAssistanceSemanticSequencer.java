/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.serializer;

import com.aelos.xtext.mappingassistance.mappingAssistance.Bindings;
import com.aelos.xtext.mappingassistance.mappingAssistance.Component;
import com.aelos.xtext.mappingassistance.mappingAssistance.Import;
import com.aelos.xtext.mappingassistance.mappingAssistance.InstanceComp;
import com.aelos.xtext.mappingassistance.mappingAssistance.Mapping;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.Model;
import com.aelos.xtext.mappingassistance.mappingAssistance.RequiredService;
import com.aelos.xtext.mappingassistance.mappingAssistance.ServiceName;
import com.aelos.xtext.mappingassistance.mappingAssistance.Variable;
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MappingAssistanceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MappingAssistanceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MappingAssistancePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MappingAssistancePackage.BINDINGS:
				sequence_Bindings(context, (Bindings) semanticObject); 
				return; 
			case MappingAssistancePackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case MappingAssistancePackage.IMPORT:
				if (rule == grammarAccess.getAbstractModelRule()) {
					sequence_AbstractModel_Import(context, (Import) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MappingAssistancePackage.INSTANCE_COMP:
				sequence_InstanceComp(context, (InstanceComp) semanticObject); 
				return; 
			case MappingAssistancePackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case MappingAssistancePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MappingAssistancePackage.REQUIRED_SERVICE:
				sequence_RequiredService(context, (RequiredService) semanticObject); 
				return; 
			case MappingAssistancePackage.SERVICE_NAME:
				sequence_ServiceName(context, (ServiceName) semanticObject); 
				return; 
			case MappingAssistancePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractModel returns Import
	 *
	 * Constraint:
	 *     (importedNamespace=QualifiedNameWithWildcard comp+=Component+)
	 */
	protected void sequence_AbstractModel_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Bindings returns Bindings
	 *
	 * Constraint:
	 *     (nameComp+=[InstanceComp|ID] nameServ1+=[ServiceName|ID] nameComp+=[InstanceComp|ID] nameServ2+=[ServiceName|ID])
	 */
	protected void sequence_Bindings(ISerializationContext context, Bindings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         inst+=InstanceComp 
	 *         name=ID 
	 *         arg+=Variable* 
	 *         arg1+=Variable 
	 *         (methode+=ServiceName (arg+=Variable* arg+=Variable)* arg+=Variable?)* 
	 *         req+=RequiredService* 
	 *         map+=Mapping* 
	 *         bind+=Bindings*
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InstanceComp returns InstanceComp
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_InstanceComp(ISerializationContext context, InstanceComp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.INSTANCE_COMP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.INSTANCE_COMP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (nameVarMode+=[Variable|ID] nameVarTest+=[Variable|ID])
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     function+=AbstractModel+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RequiredService returns RequiredService
	 *
	 * Constraint:
	 *     (nameVarMethode+=Variable nameComp+=[InstanceComp|ID] nameServ+=[ServiceName|ID])
	 */
	protected void sequence_RequiredService(ISerializationContext context, RequiredService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceName returns ServiceName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ServiceName(ISerializationContext context, ServiceName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.SERVICE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.SERVICE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
