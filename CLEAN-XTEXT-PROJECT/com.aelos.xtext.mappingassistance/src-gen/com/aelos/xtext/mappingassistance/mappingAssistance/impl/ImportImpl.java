/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.mappingAssistance.impl;

import com.aelos.xtext.mappingassistance.mappingAssistance.Import;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.Mocks;
import com.aelos.xtext.mappingassistance.mappingAssistance.Observeurs;
import com.aelos.xtext.mappingassistance.mappingAssistance.Testedcomposant;
import com.aelos.xtext.mappingassistance.mappingAssistance.Testedservice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.ImportImpl#getObs <em>Obs</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.ImportImpl#getMock <em>Mock</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.ImportImpl#getTestedserv <em>Testedserv</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.ImportImpl#getTestedcomp <em>Testedcomp</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.ImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends AbstractModelImpl implements Import
{
  /**
   * The cached value of the '{@link #getObs() <em>Obs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObs()
   * @generated
   * @ordered
   */
  protected EList<Observeurs> obs;

  /**
   * The cached value of the '{@link #getMock() <em>Mock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMock()
   * @generated
   * @ordered
   */
  protected EList<Mocks> mock;

  /**
   * The cached value of the '{@link #getTestedserv() <em>Testedserv</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestedserv()
   * @generated
   * @ordered
   */
  protected EList<Testedservice> testedserv;

  /**
   * The cached value of the '{@link #getTestedcomp() <em>Testedcomp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestedcomp()
   * @generated
   * @ordered
   */
  protected EList<Testedcomposant> testedcomp;

  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MappingAssistancePackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Observeurs> getObs()
  {
    if (obs == null)
    {
      obs = new EObjectContainmentEList<Observeurs>(Observeurs.class, this, MappingAssistancePackage.IMPORT__OBS);
    }
    return obs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mocks> getMock()
  {
    if (mock == null)
    {
      mock = new EObjectContainmentEList<Mocks>(Mocks.class, this, MappingAssistancePackage.IMPORT__MOCK);
    }
    return mock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Testedservice> getTestedserv()
  {
    if (testedserv == null)
    {
      testedserv = new EObjectContainmentEList<Testedservice>(Testedservice.class, this, MappingAssistancePackage.IMPORT__TESTEDSERV);
    }
    return testedserv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Testedcomposant> getTestedcomp()
  {
    if (testedcomp == null)
    {
      testedcomp = new EObjectContainmentEList<Testedcomposant>(Testedcomposant.class, this, MappingAssistancePackage.IMPORT__TESTEDCOMP);
    }
    return testedcomp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingAssistancePackage.IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MappingAssistancePackage.IMPORT__OBS:
        return ((InternalEList<?>)getObs()).basicRemove(otherEnd, msgs);
      case MappingAssistancePackage.IMPORT__MOCK:
        return ((InternalEList<?>)getMock()).basicRemove(otherEnd, msgs);
      case MappingAssistancePackage.IMPORT__TESTEDSERV:
        return ((InternalEList<?>)getTestedserv()).basicRemove(otherEnd, msgs);
      case MappingAssistancePackage.IMPORT__TESTEDCOMP:
        return ((InternalEList<?>)getTestedcomp()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingAssistancePackage.IMPORT__OBS:
        return getObs();
      case MappingAssistancePackage.IMPORT__MOCK:
        return getMock();
      case MappingAssistancePackage.IMPORT__TESTEDSERV:
        return getTestedserv();
      case MappingAssistancePackage.IMPORT__TESTEDCOMP:
        return getTestedcomp();
      case MappingAssistancePackage.IMPORT__IMPORTED_NAMESPACE:
        return getImportedNamespace();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingAssistancePackage.IMPORT__OBS:
        getObs().clear();
        getObs().addAll((Collection<? extends Observeurs>)newValue);
        return;
      case MappingAssistancePackage.IMPORT__MOCK:
        getMock().clear();
        getMock().addAll((Collection<? extends Mocks>)newValue);
        return;
      case MappingAssistancePackage.IMPORT__TESTEDSERV:
        getTestedserv().clear();
        getTestedserv().addAll((Collection<? extends Testedservice>)newValue);
        return;
      case MappingAssistancePackage.IMPORT__TESTEDCOMP:
        getTestedcomp().clear();
        getTestedcomp().addAll((Collection<? extends Testedcomposant>)newValue);
        return;
      case MappingAssistancePackage.IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingAssistancePackage.IMPORT__OBS:
        getObs().clear();
        return;
      case MappingAssistancePackage.IMPORT__MOCK:
        getMock().clear();
        return;
      case MappingAssistancePackage.IMPORT__TESTEDSERV:
        getTestedserv().clear();
        return;
      case MappingAssistancePackage.IMPORT__TESTEDCOMP:
        getTestedcomp().clear();
        return;
      case MappingAssistancePackage.IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingAssistancePackage.IMPORT__OBS:
        return obs != null && !obs.isEmpty();
      case MappingAssistancePackage.IMPORT__MOCK:
        return mock != null && !mock.isEmpty();
      case MappingAssistancePackage.IMPORT__TESTEDSERV:
        return testedserv != null && !testedserv.isEmpty();
      case MappingAssistancePackage.IMPORT__TESTEDCOMP:
        return testedcomp != null && !testedcomp.isEmpty();
      case MappingAssistancePackage.IMPORT__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //ImportImpl
