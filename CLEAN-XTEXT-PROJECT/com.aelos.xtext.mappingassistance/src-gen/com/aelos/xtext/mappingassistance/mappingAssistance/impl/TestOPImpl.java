/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.mappingAssistance.impl;

import com.aelos.xtext.architecture.architecture.Operation;
import com.aelos.xtext.architecture.architecture.Variable;

import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestOP;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestOPImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestOPImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestOPImpl#getVarConf1 <em>Var Conf1</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestOPImpl#getInstVar <em>Inst Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestOPImpl extends MinimalEObjectImpl.Container implements TestOP
{
  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected Variable service;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Operation name;

  /**
   * The cached value of the '{@link #getVarConf1() <em>Var Conf1</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarConf1()
   * @generated
   * @ordered
   */
  protected EList<Variable> varConf1;

  /**
   * The cached value of the '{@link #getInstVar() <em>Inst Var</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstVar()
   * @generated
   * @ordered
   */
  protected EList<com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable> instVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestOPImpl()
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
    return MappingAssistancePackage.Literals.TEST_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getService()
  {
    if (service != null && service.eIsProxy())
    {
      InternalEObject oldService = (InternalEObject)service;
      service = (Variable)eResolveProxy(oldService);
      if (service != oldService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingAssistancePackage.TEST_OP__SERVICE, oldService, service));
      }
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(Variable newService)
  {
    Variable oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingAssistancePackage.TEST_OP__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Operation)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingAssistancePackage.TEST_OP__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Operation newName)
  {
    Operation oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingAssistancePackage.TEST_OP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVarConf1()
  {
    if (varConf1 == null)
    {
      varConf1 = new EObjectResolvingEList<Variable>(Variable.class, this, MappingAssistancePackage.TEST_OP__VAR_CONF1);
    }
    return varConf1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable> getInstVar()
  {
    if (instVar == null)
    {
      instVar = new EObjectResolvingEList<com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable>(com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable.class, this, MappingAssistancePackage.TEST_OP__INST_VAR);
    }
    return instVar;
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
      case MappingAssistancePackage.TEST_OP__SERVICE:
        if (resolve) return getService();
        return basicGetService();
      case MappingAssistancePackage.TEST_OP__NAME:
        if (resolve) return getName();
        return basicGetName();
      case MappingAssistancePackage.TEST_OP__VAR_CONF1:
        return getVarConf1();
      case MappingAssistancePackage.TEST_OP__INST_VAR:
        return getInstVar();
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
      case MappingAssistancePackage.TEST_OP__SERVICE:
        setService((Variable)newValue);
        return;
      case MappingAssistancePackage.TEST_OP__NAME:
        setName((Operation)newValue);
        return;
      case MappingAssistancePackage.TEST_OP__VAR_CONF1:
        getVarConf1().clear();
        getVarConf1().addAll((Collection<? extends Variable>)newValue);
        return;
      case MappingAssistancePackage.TEST_OP__INST_VAR:
        getInstVar().clear();
        getInstVar().addAll((Collection<? extends com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable>)newValue);
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
      case MappingAssistancePackage.TEST_OP__SERVICE:
        setService((Variable)null);
        return;
      case MappingAssistancePackage.TEST_OP__NAME:
        setName((Operation)null);
        return;
      case MappingAssistancePackage.TEST_OP__VAR_CONF1:
        getVarConf1().clear();
        return;
      case MappingAssistancePackage.TEST_OP__INST_VAR:
        getInstVar().clear();
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
      case MappingAssistancePackage.TEST_OP__SERVICE:
        return service != null;
      case MappingAssistancePackage.TEST_OP__NAME:
        return name != null;
      case MappingAssistancePackage.TEST_OP__VAR_CONF1:
        return varConf1 != null && !varConf1.isEmpty();
      case MappingAssistancePackage.TEST_OP__INST_VAR:
        return instVar != null && !instVar.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TestOPImpl
