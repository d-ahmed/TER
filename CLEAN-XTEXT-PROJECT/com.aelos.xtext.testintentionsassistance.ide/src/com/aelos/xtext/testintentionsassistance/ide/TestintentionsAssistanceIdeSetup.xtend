/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.ide

import com.aelos.xtext.testintentionsassistance.TestintentionsAssistanceRuntimeModule
import com.aelos.xtext.testintentionsassistance.TestintentionsAssistanceStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TestintentionsAssistanceIdeSetup extends TestintentionsAssistanceStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TestintentionsAssistanceRuntimeModule, new TestintentionsAssistanceIdeModule))
	}
	
}