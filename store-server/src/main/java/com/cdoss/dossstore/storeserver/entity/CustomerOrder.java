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
@Table(name = "customer_order")
public class CustomerOrder {

	@Id
	@GeneratedValue
	@Column(name = "customer_order_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address shippingAddress;
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

	public Customer getCustomerId() {
		return customer;
	}

	public void setCustomerId(Customer customer) {
		this.customer = customer;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
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
