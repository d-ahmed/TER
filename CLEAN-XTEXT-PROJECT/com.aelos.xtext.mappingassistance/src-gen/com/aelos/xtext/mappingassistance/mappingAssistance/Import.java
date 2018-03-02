/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.mappingAssistance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Import#getComp <em>Comp</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getImport()
 * @model
 * @generated
 */
public interface Import extends AbstractModel
{
  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.mappingassistance.mappingAssistance.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference list.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getImport_Comp()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComp();

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getImport_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link com.aelos.xtext.mappingassistance.mappingAssistance.Import#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // Import
