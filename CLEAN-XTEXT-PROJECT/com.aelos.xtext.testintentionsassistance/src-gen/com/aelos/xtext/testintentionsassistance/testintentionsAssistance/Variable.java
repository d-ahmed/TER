/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.testintentionsassistance.testintentionsAssistance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable#getName <em>Name</em>}</li>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Type
   * @see #setType(Type)
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getVariable_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Variable
