package com.cdoss.dossstore.storeserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Item {

	public Item() {

	}

	@Id
	@GeneratedValue
	@Column(name = "item_id")
	private int id;
	@Column
	private ItemType type;
	@Column(name = "item_length")
	private ItemLength itemLength;
	@Column
	private Size size;
	@Column
	private String designer;
	@Column
	private int pattern;
	@Column
	private String color;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public ItemLength getItemLength() {
		return itemLength;
	}

	public void setItemLength(ItemLength itemLength) {
		this.itemLength = itemLength;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public int getPattern() {
		return pattern;
	}

	public void setPattern(int pattern) {
		this.pattern = pattern;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
