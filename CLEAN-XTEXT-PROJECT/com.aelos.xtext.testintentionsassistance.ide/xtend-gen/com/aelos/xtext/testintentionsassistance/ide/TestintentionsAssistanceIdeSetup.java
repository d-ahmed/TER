/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance.ide;

import com.aelos.xtext.testintentionsassistance.TestintentionsAssistanceRuntimeModule;
import com.aelos.xtext.testintentionsassistance.TestintentionsAssistanceStandaloneSetup;
import com.aelos.xtext.testintentionsassistance.ide.TestintentionsAssistanceIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TestintentionsAssistanceIdeSetup extends TestintentionsAssistanceStandaloneSetup {
  @Override
  public Injector createInjector() {
    TestintentionsAssistanceRuntimeModule _testintentionsAssistanceRuntimeModule = new TestintentionsAssistanceRuntimeModule();
    TestintentionsAssistanceIdeModule _testintentionsAssistanceIdeModule = new TestintentionsAssistanceIdeModule();
    return Guice.createInjector(Modules2.mixin(_testintentionsAssistanceRuntimeModule, _testintentionsAssistanceIdeModule));
  }
}
