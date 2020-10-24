package com.cdoss.dossstore.storeserver.entity;

public enum ItemType {

	dress("Dress"), pajamas("Pajamas"), kidPajamas("Kid Pajamas");

	private String name;

	ItemType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
