/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance;

import com.aelos.xtext.mappingassistance.MappingAssistanceStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MappingAssistanceStandaloneSetup extends MappingAssistanceStandaloneSetupGenerated {
  public static void doSetup() {
    new MappingAssistanceStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
