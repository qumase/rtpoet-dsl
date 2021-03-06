/*
 * generated by Xtext 2.25.0
 */
package ca.jahed.rtpoet.dsl.ide;

import ca.jahed.rtpoet.dsl.RtRuntimeModule;
import ca.jahed.rtpoet.dsl.RtStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RtIdeSetup extends RtStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RtRuntimeModule(), new RtIdeModule()));
	}
}
