/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.serializer;

import com.aelos.xtext.architecture.architecture.AbstractModel;
import com.aelos.xtext.architecture.architecture.ArchitecturePackage;
import com.aelos.xtext.architecture.architecture.AtomicType;
import com.aelos.xtext.architecture.architecture.Call;
import com.aelos.xtext.architecture.architecture.Component;
import com.aelos.xtext.architecture.architecture.DomainDeclaration;
import com.aelos.xtext.architecture.architecture.Import;
import com.aelos.xtext.architecture.architecture.Model;
import com.aelos.xtext.architecture.architecture.Operation;
import com.aelos.xtext.architecture.architecture.Variable;
import com.aelos.xtext.architecture.architecture.VariableRef;
import com.aelos.xtext.architecture.services.ArchitectureGrammarAccess;
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
public class ArchitectureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ArchitectureGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ArchitecturePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ArchitecturePackage.ABSTRACT_MODEL:
				sequence_AbstractModel(context, (AbstractModel) semanticObject); 
				return; 
			case ArchitecturePackage.ATOMIC_TYPE:
				sequence_AtomicType(context, (AtomicType) semanticObject); 
				return; 
			case ArchitecturePackage.CALL:
				sequence_Call(context, (Call) semanticObject); 
				return; 
			case ArchitecturePackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case ArchitecturePackage.DOMAIN_DECLARATION:
				sequence_DomainDeclaration(context, (DomainDeclaration) semanticObject); 
				return; 
			case ArchitecturePackage.IMPORT:
				if (rule == grammarAccess.getAbstractModelRule()) {
					sequence_AbstractModel_Import(context, (Import) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ArchitecturePackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case ArchitecturePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case ArchitecturePackage.VARIABLE_REF:
				sequence_AtomicType(context, (VariableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractModel returns AbstractModel
	 *
	 * Constraint:
	 *     comp+=Component+
	 */
	protected void sequence_AbstractModel(ISerializationContext context, AbstractModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     AtomicType returns AtomicType
	 *
	 * Constraint:
	 *     atomType=Type
	 */
	protected void sequence_AtomicType(ISerializationContext context, AtomicType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.ATOMIC_TYPE__ATOM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.ATOMIC_TYPE__ATOM_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicTypeAccess().getAtomTypeTypeEnumRuleCall_0_0(), semanticObject.getAtomType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AtomicType returns VariableRef
	 *
	 * Constraint:
	 *     type=[Component|ID]
	 */
	protected void sequence_AtomicType(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.VARIABLE_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.VARIABLE_REF__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicTypeAccess().getTypeComponentIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(ArchitecturePackage.Literals.VARIABLE_REF__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Call returns Call
	 *
	 * Constraint:
	 *     (receiver=[Component|ID] member+=[Operation|ID])
	 */
	protected void sequence_Call(ISerializationContext context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=ID (ops+=[Operation|ID]* ops+=[Operation|ID])* operations+=Operation* vars+=Variable* (calls+=Call* calls+=Call)*)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainDeclaration returns DomainDeclaration
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractModel*)
	 */
	protected void sequence_DomainDeclaration(ISerializationContext context, DomainDeclaration semanticObject) {
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
			if (transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     package+=DomainDeclaration+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (name=ID (arg+=Variable* arg+=Variable)* type=AtomicType)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID type=AtomicType)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeAtomicTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
