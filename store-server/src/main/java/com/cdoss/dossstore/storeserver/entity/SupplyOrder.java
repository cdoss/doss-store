package com.cdoss.dossstore.storeserver.entity;

import java.util.Currency;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supply_order")
public class SupplyOrder {

	@Id
	@GeneratedValue
	@Column(name = "supply_order_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplier;
	@Column(name = "order_date")
	private Date orderDate;
	@Column(name = "order_price")
	private Currency orderPrice;
	@Column(name = "shipping_price")
	private Currency shippingPrice;
	@Column(name = "order_total_price")
	private Currency orderTotalPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplierId(Supplier supplier) {
		this.supplier = supplier;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Currency getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Currency orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Currency getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(Currency shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public Currency getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(Currency orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
}
