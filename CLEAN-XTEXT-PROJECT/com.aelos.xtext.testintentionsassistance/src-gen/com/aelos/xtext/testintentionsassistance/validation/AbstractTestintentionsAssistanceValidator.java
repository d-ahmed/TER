/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTestintentionsAssistanceValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage.eINSTANCE);
		return result;
	}
	
}
