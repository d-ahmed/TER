/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.validation

import org.eclipse.xtext.validation.Check
import com.aelos.xtext.mappingassistance.mappingAssistance.Conf
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage
import com.aelos.xtext.mappingassistance.mappingAssistance.TestDriver

//import com.aelos.xtext.mappingassistance.mappingAssistance.Mapping
//import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MappingAssistanceValidator extends AbstractMappingAssistanceValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MappingAssistancePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def checkMappingSameType(Conf conf) {
		var x=0;
		for(varconf:conf.varConf){
			//System.out.println(conf.instVar.get(x).eClass.name+" : "+varconf.type.atomType.literal)
			if(!( (conf.instVar.get(x).type.literal).equals(varconf.type.atomType.literal))){
				
				error("the variables must have the same Type",MappingAssistancePackage.Literals.CONF__VAR_CONF)
			}
			x++
		}
	}
	
	@Check
	def checkMappingTestDriver(TestDriver td) {
		var x=0;
		for(varconf:td.varConf){
			//System.out.println(conf.instVar.get(x).eClass.name+" : "+varconf.type.atomType.literal)
			if(!( (td.instVar.get(x).type.literal).equals(varconf.type.atomType.literal))){
				
				error("the variables must have the same Type",MappingAssistancePackage.Literals.CONF__VAR_CONF)
			}
			x++
		}
	}
//
//	@Check
//	def checkMappingSameType(Mapping map) {
//		var x=0;
//		for(varmod:map.nameVarMode){
//			if(!((varmod.type.literal).equals(map.nameVarTest.get(x).type.literal))){
//				error("the variables must have the same Type",MappingAssistancePackage.Literals.MAPPING__NAME_VAR_MODE)
//			}
//			x++
//		}
//	}
	
}
