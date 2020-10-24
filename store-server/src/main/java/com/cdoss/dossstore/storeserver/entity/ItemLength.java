package com.cdoss.dossstore.storeserver.entity;

public enum ItemLength {
	short_short("Short"), short_long("Short/Long"), long_long("Long");
	
	private String name;
	
	private ItemLength(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
