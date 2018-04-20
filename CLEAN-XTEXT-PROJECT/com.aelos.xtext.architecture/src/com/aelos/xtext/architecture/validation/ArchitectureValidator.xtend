/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.validation

import org.eclipse.xtext.validation.Check
import com.aelos.xtext.architecture.architecture.ArchitecturePackage
import com.aelos.xtext.architecture.architecture.Binding

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ArchitectureValidator extends AbstractArchitectureValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					ArchitecturePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
    @Check
	def checkBindingSign(Binding bind) {
		System.out.println("why")
		if(bind.proMember.arg.size != bind.recMember.arg.size){
			error("services must have the same signature",ArchitecturePackage.Literals.BINDING__PRO_MEMBER)
		}
		else{
		if(!((bind.proMember.type.atomType.literal).equals(bind.recMember.type.atomType.literal))){
			error("services must have the same signature",ArchitecturePackage.Literals.BINDING__PRO_MEMBER)
		}	
		var x=0;
		for(providerArg:bind.proMember.arg){
			if(!((providerArg.type.atomType.literal).equals(bind.recMember.arg.get(x).type.atomType.literal))){
				error("the service parameters must have the same Type",ArchitecturePackage.Literals.BINDING__PRO_MEMBER)
			}
			x++
		}
	
	   }
	}
}