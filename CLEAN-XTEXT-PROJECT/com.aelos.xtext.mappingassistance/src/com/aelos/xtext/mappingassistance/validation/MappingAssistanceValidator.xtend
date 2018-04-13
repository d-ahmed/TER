/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.validation

import org.eclipse.xtext.validation.Check
import com.aelos.xtext.mappingassistance.mappingAssistance.Conf
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage
import com.aelos.xtext.mappingassistance.mappingAssistance.TestDriver
import com.aelos.xtext.mappingassistance.mappingAssistance.TestOP
import com.aelos.xtext.mappingassistance.mappingAssistance.Operation

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
		var y=0;
		x=0
		for(varconf:conf.varConf){
			y=0
			//System.out.println(conf.instVar.get(x).eClass.name+" : "+varconf.type.atomType.literal)
			for(varconfy:conf.varConf){
				if(varconf.name.equals(varconfy.name)){
					y++
				}
			}
			if(y>1){
			error("you can not use the same twice",MappingAssistancePackage.Literals.CONF__VAR_CONF)	
				}
			x++
			}
	}
//	@Check
//		def checkOperation(Operation oper) {
//		var x=0;
//		var y=0;
//		
//		for(varconf:oper.arg){
//			y=0
//			//System.out.println(conf.instVar.get(x).eClass.name+" : "+varconf.type.atomType.literal)
//			for(varconfy:oper.arg){
//				if(varconf.name.equals(varconfy.name)){
//					y++
//				}
//			}
//			if(y>1){
//			error("you can not use the same twice",MappingAssistancePackage.Literals.OPERATION__ARG)	
//				}
//			x++
//			}
//		}
	@Check
	def checkMappingTestDriver(TestOP td) {

		if(td.name.arg.size < td.varConf1.size){
			error("size varconf > function args",MappingAssistancePackage.Literals.TEST_OP__VAR_CONF1)
		}
		var x=0;
		var y=0
		for(varconf:td.varConf1){
			y=0
			//System.out.println(conf.instVar.get(x).eClass.name+" : "+varconf.type.atomType.literal)
			if(td.instVar.length>x && !( (td.instVar.get(x).type.literal).equals(varconf.type.atomType.literal))){
				System.out.println(MappingAssistancePackage.Literals.TEST_OP__VAR_CONF1)
				error("the variables must have the same Type",MappingAssistancePackage.Literals.TEST_OP__VAR_CONF1)
			}
			for(varconfy:td.varConf1){
				if(varconf.name.equals(varconfy.name)){
					y++
				}
			}
			if(y>1){
			error("you can not use the same variabe twice",MappingAssistancePackage.Literals.TEST_OP__VAR_CONF1)	
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
