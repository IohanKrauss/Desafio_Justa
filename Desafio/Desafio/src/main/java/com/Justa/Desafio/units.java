package com.Justa.Desafio;

public class units {
	
	private String unit_name;
	private Number mutiplication_factor;
	
	public units(String unit_name,Number mutiplication_factor) {
		
		this.unit_name = unit_name;
		this.mutiplication_factor = mutiplication_factor;
	}
	
	public String getUnit_name() {
		return unit_name;
	}

	public Number getMutiplication_factor() {
		return mutiplication_factor;
	}

	
}
