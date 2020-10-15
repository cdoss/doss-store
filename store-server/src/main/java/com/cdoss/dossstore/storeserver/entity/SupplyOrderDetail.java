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
@Table(name = "supply_order_detail")
public class SupplyOrderDetail {

	@Id
	@GeneratedValue
	@Column(name = "supply_order_detail_id")
	private int id;
	@OneToOne
	@JoinColumn(name = "supply_order_id", nullable = false)
	private SupplyOrder supplyOrder;
	@ManyToOne
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;
	@Column
	private int quantity;
	@Column
	private Currency unitPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SupplyOrder getSupplyOrder() {
		return supplyOrder;
	}

	public void setSupplyOrderId(SupplyOrder supplyOrder) {
		this.supplyOrder = supplyOrder;
	}

	public Item getItem() {
		return item;
	}

	public void setItemId(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Currency getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Currency unitPrice) {
		this.unitPrice = unitPrice;
	}
}
