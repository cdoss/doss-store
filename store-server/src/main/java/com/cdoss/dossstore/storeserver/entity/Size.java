package com.cdoss.dossstore.storeserver.entity;

public enum Size {

	s("S"), m("M"), l("L"), xl("XL"), xxl("2XL"), xxxl("3XL"), xxxxl("4XL"), xxxxxl("5XL");

	private String name;
	
	Size(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
