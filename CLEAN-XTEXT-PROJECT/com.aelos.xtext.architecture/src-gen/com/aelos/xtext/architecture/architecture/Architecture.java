/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.architecture.architecture.Architecture#getVars <em>Vars</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.Architecture#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.Architecture#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getArchitecture_Vars()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVars();

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.Call}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference list.
   * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getArchitecture_Receiver()
   * @model containment="true"
   * @generated
   */
  EList<Call> getReceiver();

  /**
   * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.Call}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' containment reference list.
   * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getArchitecture_Provider()
   * @model containment="true"
   * @generated
   */
  EList<Call> getProvider();

} // Architecture