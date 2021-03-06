package com.Justa.Desafio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class UnitsController {

	
	@GetMapping("units/si")
	
	public Units si(@RequestParam(value = "units", defaultValue = "") String eqUnit) {
		
		
		double multFactor = 0;
		String tempUnit = "";
		String units = "";
		char operator ='-';
		
		
			for(int i=0;eqUnit.length()>i;i++) {
			
				
						if(eqUnit.charAt(i)!='/'&& eqUnit.charAt(i)!='*' &&eqUnit.charAt(i)!='('&&eqUnit.charAt(i)!=')') {
						
							tempUnit += eqUnit.charAt(i)+"";
						
						}else {
							
							if(eqUnit.charAt(i)=='/'|| eqUnit.charAt(i)=='*') {
								operator = eqUnit.charAt(i);
								
							
							}
							
							units+=eqUnit.charAt(i)+"";
						}
						
						
						
						
						//verificacao para graus
						if(eqUnit.charAt(i)==')'|| i==(eqUnit.length()-1)) {
							
							if(tempUnit.equals("degree")||tempUnit.equals("°")) {
								
								if(multFactor==0) {
									
									multFactor = (Math.PI/180);
									
								}else if(operator =='/') {
									multFactor = multFactor/(Math.PI/180);
									
								}else if(operator =='*') {
									multFactor = multFactor*(Math.PI/180);
								}
								
								operator = '-';
								
								units+="rad";
								
								
							}else if(tempUnit.equals("minute")||tempUnit.equals("min")) {
								
								if(multFactor==0) {
									
									multFactor = 60;
									
								}else if(operator =='/') {
									multFactor = multFactor/60;
									
								}else if(operator =='*') {
									multFactor = multFactor*60;
								}
								
								operator = '-';
								
								units+="s";
								tempUnit="";
							}else if(tempUnit.equals("hour")||tempUnit.equals("h")) {
								
								if(multFactor==0) {
									
									multFactor = 3600;
									
								}else if(operator =='/') {
									multFactor = multFactor/3600;
									
								}else if(operator =='*') {
									multFactor = multFactor*3600;
								}
								
								operator = '-';
								
								units+="s";
								tempUnit="";
							}else if(tempUnit.equals("day")||tempUnit.equals("d")) {
								
								if(multFactor==0) {
									
									multFactor = 86400;
									
								}else if(operator =='/') {
									multFactor = multFactor/86400;
									
								}else if(operator =='*') {
									multFactor = multFactor*86400;
								}
								
								operator = '-';
								
								units+="s";
								tempUnit="";
								
							}else if(tempUnit.equals("arcminute")||tempUnit.equals("'")) {
								
								if(multFactor==0) {
									
									multFactor = (Math.PI/10800);
									
								}else if(operator =='/') {
									multFactor = multFactor/(Math.PI/10800);
									
								}else if(operator =='*') {
									multFactor = multFactor*(Math.PI/10800);
								}
								
								operator = '-';
								
								units+="rad";
								tempUnit="";
							}else if(tempUnit.equals("arcsecond")||tempUnit.equals("''")) {
								
								if(multFactor==0) {
									
									multFactor = (Math.PI/648000);
									
								}else if(operator =='/') {
									multFactor = multFactor/(Math.PI/648000);
									
								}else if(operator =='*') {
									multFactor = multFactor*(Math.PI/648000);
								}
								
								operator = '-';
								
								units+="rad";
								tempUnit="";
							}else if(tempUnit.equals("hectare")||tempUnit.equals("ha")) {
								
								if(multFactor==0) {
									
									multFactor = 10000;
									
								}else if(operator =='/') {
									multFactor = multFactor/10000;
									
								}else if(operator =='*') {
									multFactor = multFactor*10000;
								}
								
								operator = '-';
								
								units+="m^2";
								tempUnit="";
							}else if(tempUnit.equals("litre")||tempUnit.equals("L")) {
								
								if(multFactor==0) {
									
									multFactor = 0.001;
									
								}else if(operator =='/') {
									multFactor = multFactor/0.001;
									
								}else if(operator =='*') {
									multFactor = multFactor*0.001;
								}
								
								operator = '-';
								
								units+="m^3";
								tempUnit="";
							}else if(tempUnit.equals("tonne")||tempUnit.equals("t")) {
								
								if(multFactor==0) {
									
									multFactor = 1000;
									
								}else if(operator =='/') {
									multFactor = multFactor/1000;
									
								}else if(operator =='*') {
									multFactor = multFactor*1000;
								}
								
								operator = '-';
								
								units+="kg";
								tempUnit="";
							}
							
							
							
							
							
							
							
						}else {
							
							if( i != (eqUnit.length()-1) ){
							
								if((tempUnit.equals("degree")||tempUnit.equals("°")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = (Math.PI/180);
										
									}else if(operator =='/') {
										multFactor = multFactor/(Math.PI/180);
										
									}else if(operator =='*') {
										multFactor = multFactor*(Math.PI/180);
									}
									
									operator = '-';
									
									units+="rad";
									tempUnit="";
									
								}else if((tempUnit.equals("minute")||tempUnit.equals("min")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = 60;
										
									}else if(operator =='/') {
										multFactor = multFactor/60;
										
									}else if(operator =='*') {
										multFactor = multFactor*60;
									}
									
									operator = '-';
									
									units+="s";
									tempUnit="";
								}else if((tempUnit.equals("hour")||tempUnit.equals("h")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = 3600;
										
									}else if(operator =='/') {
										multFactor = multFactor/3600;
										
									}else if(operator =='*') {
										multFactor = multFactor*3600;
									}
									
									operator = '-';
									
									units+="s";
									tempUnit="";
								}else if((tempUnit.equals("day")||tempUnit.equals("d")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = 86400;
										
									}else if(operator =='/') {
										multFactor = multFactor/86400;
										
									}else if(operator =='*') {
										multFactor = multFactor*86400;
									}
									
									operator = '-';
									
									units+="s";
									tempUnit="";
								}else if((tempUnit.equals("arcminute")||tempUnit.equals("'")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = (Math.PI/10800);
										
									}else if(operator =='/') {
										multFactor = multFactor/(Math.PI/10800);
										
									}else if(operator =='*') {
										multFactor = multFactor*(Math.PI/10800);
									}
									
									operator = '-';
									
									units+="rad";
									tempUnit="";
								}else if((tempUnit.equals("arcsecond")||tempUnit.equals("''")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = (Math.PI/648000);
										
									}else if(operator =='/') {
										multFactor = multFactor/(Math.PI/648000);
										
									}else if(operator =='*') {
										multFactor = multFactor*(Math.PI/648000);
									}
									
									operator = '-';
									
									units+="rad";
									tempUnit="";
								}else if((tempUnit.equals("hectare")||tempUnit.equals("ha")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = 10000;
										
									}else if(operator =='/') {
										multFactor = multFactor/10000;
										
									}else if(operator =='*') {
										multFactor = multFactor*10000;
									}
									
									operator = '-';
									
									units+="m^2";
									tempUnit="";
									
									
								}else if((tempUnit.equals("litre")||tempUnit.equals("L")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = 0.001;
										
									}else if(operator =='/') {
										multFactor = multFactor/0.001;
										
									}else if(operator =='*') {
										multFactor = multFactor*0.001;
									}
									
									operator = '-';
									
									units+="m^3";
									tempUnit="";
								}else if((tempUnit.equals("tonne")||tempUnit.equals("t")) && (eqUnit.charAt(i+1)=='/' || eqUnit.charAt(i+1)=='*' || eqUnit.charAt(i+1)=='(' || eqUnit.charAt(i+1)==')')) {
									
									if(multFactor==0) {
										
										multFactor = 1000;
										
									}else if(operator =='/') {
										multFactor = multFactor/1000;
										
									}else if(operator =='*') {
										multFactor = multFactor*1000;
									}
									
									operator = '-';
									
									units+="kg";
									tempUnit="";
						}
					}
				}
			}
			
		return new Units(units,multFactor);
		
	}
	
	
}
