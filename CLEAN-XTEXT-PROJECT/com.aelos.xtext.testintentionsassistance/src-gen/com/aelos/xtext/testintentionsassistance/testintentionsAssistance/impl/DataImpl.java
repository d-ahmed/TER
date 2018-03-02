/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.testintentionsAssistance.impl;

import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Data;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Expression;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.impl.DataImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.impl.DataImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends AbstractElementImpl implements Data
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<Variable> variable;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected EList<Expression> val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataImpl()
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
    return TestintentionsAssistancePackage.Literals.DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<Variable>(Variable.class, this, TestintentionsAssistancePackage.DATA__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getVal()
  {
    if (val == null)
    {
      val = new EObjectContainmentEList<Expression>(Expression.class, this, TestintentionsAssistancePackage.DATA__VAL);
    }
    return val;
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
      case TestintentionsAssistancePackage.DATA__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case TestintentionsAssistancePackage.DATA__VAL:
        return ((InternalEList<?>)getVal()).basicRemove(otherEnd, msgs);
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
      case TestintentionsAssistancePackage.DATA__VARIABLE:
        return getVariable();
      case TestintentionsAssistancePackage.DATA__VAL:
        return getVal();
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
      case TestintentionsAssistancePackage.DATA__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Variable>)newValue);
        return;
      case TestintentionsAssistancePackage.DATA__VAL:
        getVal().clear();
        getVal().addAll((Collection<? extends Expression>)newValue);
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
      case TestintentionsAssistancePackage.DATA__VARIABLE:
        getVariable().clear();
        return;
      case TestintentionsAssistancePackage.DATA__VAL:
        getVal().clear();
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
      case TestintentionsAssistancePackage.DATA__VARIABLE:
        return variable != null && !variable.isEmpty();
      case TestintentionsAssistancePackage.DATA__VAL:
        return val != null && !val.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataImpl