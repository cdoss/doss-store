package com.cdoss.dossstore.storeserver.entity;

import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supplier_item_pricing")
public class SupplierItemPricing {

	@Id
	@GeneratedValue
	@Column(name = "supplier_item_pricing_id")
	private int id;
	@OneToOne
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	@Column(name = "unit_price")
	private Currency unitPrice;

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
}
