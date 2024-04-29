package com.Arambyeol._Backend.domain.logging.enums;

public enum PlatformType {
	WEB("WEB"),
	AOS("AOS"),
	IOS("IOS");

	private final String toString;

	PlatformType(String toString){
		this.toString = toString;
	}

	public String getToString(){
		return toString;
	}
}
