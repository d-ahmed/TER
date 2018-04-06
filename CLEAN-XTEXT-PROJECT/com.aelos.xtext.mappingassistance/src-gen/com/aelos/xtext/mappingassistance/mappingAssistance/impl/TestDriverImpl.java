/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.mappingAssistance.impl;

import com.aelos.xtext.architecture.architecture.Operation;

import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestDriver;

import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable;

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
 * An implementation of the model object '<em><b>Test Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestDriverImpl#getOutVar <em>Out Var</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestDriverImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestDriverImpl#getMember <em>Member</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestDriverImpl#getVarConf <em>Var Conf</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.impl.TestDriverImpl#getInstVar <em>Inst Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestDriverImpl extends MinimalEObjectImpl.Container implements TestDriver
{
  /**
   * The cached value of the '{@link #getOutVar() <em>Out Var</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutVar()
   * @generated
   * @ordered
   */
  protected EList<Variable> outVar;

  /**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected com.aelos.xtext.architecture.architecture.Variable service;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected Operation member;

  /**
   * The cached value of the '{@link #getVarConf() <em>Var Conf</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarConf()
   * @generated
   * @ordered
   */
  protected EList<com.aelos.xtext.architecture.architecture.Variable> varConf;

  /**
   * The cached value of the '{@link #getInstVar() <em>Inst Var</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstVar()
   * @generated
   * @ordered
   */
  protected EList<Variable> instVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestDriverImpl()
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
    return MappingAssistancePackage.Literals.TEST_DRIVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getOutVar()
  {
    if (outVar == null)
    {
      outVar = new EObjectResolvingEList<Variable>(Variable.class, this, MappingAssistancePackage.TEST_DRIVER__OUT_VAR);
    }
    return outVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.aelos.xtext.architecture.architecture.Variable getService()
  {
    if (service != null && service.eIsProxy())
    {
      InternalEObject oldService = (InternalEObject)service;
      service = (com.aelos.xtext.architecture.architecture.Variable)eResolveProxy(oldService);
      if (service != oldService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingAssistancePackage.TEST_DRIVER__SERVICE, oldService, service));
      }
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.aelos.xtext.architecture.architecture.Variable basicGetService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(com.aelos.xtext.architecture.architecture.Variable newService)
  {
    com.aelos.xtext.architecture.architecture.Variable oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingAssistancePackage.TEST_DRIVER__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getMember()
  {
    if (member != null && member.eIsProxy())
    {
      InternalEObject oldMember = (InternalEObject)member;
      member = (Operation)eResolveProxy(oldMember);
      if (member != oldMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingAssistancePackage.TEST_DRIVER__MEMBER, oldMember, member));
      }
    }
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(Operation newMember)
  {
    Operation oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingAssistancePackage.TEST_DRIVER__MEMBER, oldMember, member));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.aelos.xtext.architecture.architecture.Variable> getVarConf()
  {
    if (varConf == null)
    {
      varConf = new EObjectResolvingEList<com.aelos.xtext.architecture.architecture.Variable>(com.aelos.xtext.architecture.architecture.Variable.class, this, MappingAssistancePackage.TEST_DRIVER__VAR_CONF);
    }
    return varConf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getInstVar()
  {
    if (instVar == null)
    {
      instVar = new EObjectResolvingEList<Variable>(Variable.class, this, MappingAssistancePackage.TEST_DRIVER__INST_VAR);
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
      case MappingAssistancePackage.TEST_DRIVER__OUT_VAR:
        return getOutVar();
      case MappingAssistancePackage.TEST_DRIVER__SERVICE:
        if (resolve) return getService();
        return basicGetService();
      case MappingAssistancePackage.TEST_DRIVER__MEMBER:
        if (resolve) return getMember();
        return basicGetMember();
      case MappingAssistancePackage.TEST_DRIVER__VAR_CONF:
        return getVarConf();
      case MappingAssistancePackage.TEST_DRIVER__INST_VAR:
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
      case MappingAssistancePackage.TEST_DRIVER__OUT_VAR:
        getOutVar().clear();
        getOutVar().addAll((Collection<? extends Variable>)newValue);
        return;
      case MappingAssistancePackage.TEST_DRIVER__SERVICE:
        setService((com.aelos.xtext.architecture.architecture.Variable)newValue);
        return;
      case MappingAssistancePackage.TEST_DRIVER__MEMBER:
        setMember((Operation)newValue);
        return;
      case MappingAssistancePackage.TEST_DRIVER__VAR_CONF:
        getVarConf().clear();
        getVarConf().addAll((Collection<? extends com.aelos.xtext.architecture.architecture.Variable>)newValue);
        return;
      case MappingAssistancePackage.TEST_DRIVER__INST_VAR:
        getInstVar().clear();
        getInstVar().addAll((Collection<? extends Variable>)newValue);
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
      case MappingAssistancePackage.TEST_DRIVER__OUT_VAR:
        getOutVar().clear();
        return;
      case MappingAssistancePackage.TEST_DRIVER__SERVICE:
        setService((com.aelos.xtext.architecture.architecture.Variable)null);
        return;
      case MappingAssistancePackage.TEST_DRIVER__MEMBER:
        setMember((Operation)null);
        return;
      case MappingAssistancePackage.TEST_DRIVER__VAR_CONF:
        getVarConf().clear();
        return;
      case MappingAssistancePackage.TEST_DRIVER__INST_VAR:
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
      case MappingAssistancePackage.TEST_DRIVER__OUT_VAR:
        return outVar != null && !outVar.isEmpty();
      case MappingAssistancePackage.TEST_DRIVER__SERVICE:
        return service != null;
      case MappingAssistancePackage.TEST_DRIVER__MEMBER:
        return member != null;
      case MappingAssistancePackage.TEST_DRIVER__VAR_CONF:
        return varConf != null && !varConf.isEmpty();
      case MappingAssistancePackage.TEST_DRIVER__INST_VAR:
        return instVar != null && !instVar.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TestDriverImpl
