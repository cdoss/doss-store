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
@Table(name = "customer_order_detail")
public class CustomerOrderDetail {

	@Id
	@GeneratedValue
	@Column(name = "customer_order_detail_id")
	private int id;
	@OneToOne
	@JoinColumn(name = "customer_order_id", nullable = false)
	private CustomerOrder customerOrder;
	@ManyToOne
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;
	@Column
	private int quantity;
	@Column(name = "list_price")
	private Currency listPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrderId(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Currency getListPrice() {
		return listPrice;
	}

	public void setListPrice(Currency listPrice) {
		this.listPrice = listPrice;
	}
}
