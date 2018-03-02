/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.ui;

import com.aelos.xtext.mappingassistance.ui.internal.MappingassistanceActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MappingAssistanceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MappingassistanceActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MappingassistanceActivator activator = MappingassistanceActivator.getInstance();
		return activator != null ? activator.getInjector(MappingassistanceActivator.COM_AELOS_XTEXT_MAPPINGASSISTANCE_MAPPINGASSISTANCE) : null;
	}

}