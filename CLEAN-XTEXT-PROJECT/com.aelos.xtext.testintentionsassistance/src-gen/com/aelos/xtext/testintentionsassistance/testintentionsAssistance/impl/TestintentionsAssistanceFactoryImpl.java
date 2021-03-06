/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.testintentionsassistance.testintentionsAssistance.impl;

import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.AbstractElement;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.And;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Comparison;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Data;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.DomainDeclaration;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Equality;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Expression;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Function;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.INT;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Import;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Inst;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Minus;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Model;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.MulOrDiv;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Not;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Or;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.OutVariable;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Plus;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.STRING;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestIntention;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistanceFactory;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Type;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.VariableRef;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestintentionsAssistanceFactoryImpl extends EFactoryImpl implements TestintentionsAssistanceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TestintentionsAssistanceFactory init()
  {
    try
    {
      TestintentionsAssistanceFactory theTestintentionsAssistanceFactory = (TestintentionsAssistanceFactory)EPackage.Registry.INSTANCE.getEFactory(TestintentionsAssistancePackage.eNS_URI);
      if (theTestintentionsAssistanceFactory != null)
      {
        return theTestintentionsAssistanceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TestintentionsAssistanceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestintentionsAssistanceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TestintentionsAssistancePackage.MODEL: return createModel();
      case TestintentionsAssistancePackage.DOMAIN_DECLARATION: return createDomainDeclaration();
      case TestintentionsAssistancePackage.IMPORT: return createImport();
      case TestintentionsAssistancePackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case TestintentionsAssistancePackage.FUNCTION: return createFunction();
      case TestintentionsAssistancePackage.DATA: return createData();
      case TestintentionsAssistancePackage.OUT_VARIABLE: return createOutVariable();
      case TestintentionsAssistancePackage.INST: return createInst();
      case TestintentionsAssistancePackage.TEST_INTENTION: return createTestIntention();
      case TestintentionsAssistancePackage.EXPRESSION: return createExpression();
      case TestintentionsAssistancePackage.VARIABLE: return createVariable();
      case TestintentionsAssistancePackage.OR: return createOr();
      case TestintentionsAssistancePackage.AND: return createAnd();
      case TestintentionsAssistancePackage.EQUALITY: return createEquality();
      case TestintentionsAssistancePackage.COMPARISON: return createComparison();
      case TestintentionsAssistancePackage.PLUS: return createPlus();
      case TestintentionsAssistancePackage.MINUS: return createMinus();
      case TestintentionsAssistancePackage.MUL_OR_DIV: return createMulOrDiv();
      case TestintentionsAssistancePackage.NOT: return createNot();
      case TestintentionsAssistancePackage.INT: return createINT();
      case TestintentionsAssistancePackage.STRING: return createSTRING();
      case TestintentionsAssistancePackage.BOOLEAN: return createBoolean();
      case TestintentionsAssistancePackage.DOUBLE: return createDouble();
      case TestintentionsAssistancePackage.VARIABLE_REF: return createVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TestintentionsAssistancePackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TestintentionsAssistancePackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDeclaration createDomainDeclaration()
  {
    DomainDeclarationImpl domainDeclaration = new DomainDeclarationImpl();
    return domainDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutVariable createOutVariable()
  {
    OutVariableImpl outVariable = new OutVariableImpl();
    return outVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inst createInst()
  {
    InstImpl inst = new InstImpl();
    return inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestIntention createTestIntention()
  {
    TestIntentionImpl testIntention = new TestIntentionImpl();
    return testIntention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INT createINT()
  {
    INTImpl int_ = new INTImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Double createDouble()
  {
    DoubleImpl double_ = new DoubleImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestintentionsAssistancePackage getTestintentionsAssistancePackage()
  {
    return (TestintentionsAssistancePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TestintentionsAssistancePackage getPackage()
  {
    return TestintentionsAssistancePackage.eINSTANCE;
  }

} //TestintentionsAssistanceFactoryImpl
