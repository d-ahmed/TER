/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.validation;

import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Inst;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable;
import com.aelos.xtext.testintentionsassistance.validation.AbstractTestintentionsAssistanceValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TestintentionsAssistanceValidator extends AbstractTestintentionsAssistanceValidator {
  @Check
  public void checkMappingSameType(final Inst data) {
    int x = 0;
    EList<Variable> _variable = data.getVariable();
    for (final Variable variable : _variable) {
      {
        boolean _equals = data.getValeur().get(x).eClass().getName().toString().equals(variable.getType().getLiteral());
        boolean _not = (!_equals);
        if (_not) {
          this.error("the variables must have the same Type", TestintentionsAssistancePackage.Literals.INST__VARIABLE);
        }
        x++;
      }
    }
  }
}
