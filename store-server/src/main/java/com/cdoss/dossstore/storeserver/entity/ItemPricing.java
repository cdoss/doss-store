package com.cdoss.dossstore.storeserver.entity;

import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_pricing")
public class ItemPricing {

	@Id
	@GeneratedValue
	@Column(name = "item_pricing_id")
	private int id;
	@OneToOne
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;
	@Column(name = "unit_price")
	private Currency unitPrice;
	@Column(name = "list_price")
	private Currency listPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Currency getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Currency unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Currency getListPrice() {
		return listPrice;
	}

	public void setListPrice(Currency listPrice) {
		this.listPrice = listPrice;
	}
}
