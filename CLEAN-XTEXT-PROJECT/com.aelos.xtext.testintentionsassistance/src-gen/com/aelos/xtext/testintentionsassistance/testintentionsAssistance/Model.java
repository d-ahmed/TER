/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.testintentionsAssistance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.DomainDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DomainDeclaration> getElements();

} // Model
