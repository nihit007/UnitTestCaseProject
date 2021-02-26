package com.order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {

	private Order order;

	@BeforeEach
	void setup() {
		// given
		this.order = new Order(3, "Pizza", 500);
	}

	@Test
	public void Should_Return_The_Quantity() {

		// When
		int quantity_acutal = order.getQuantity();

		// Then
		assertEquals(3, quantity_acutal);
	}

	@Test
	public void Should_Return_The_Quantity_after_set() {
		// given

		order.setQuantity(5);

		// When
		int quantity_acutal = order.getQuantity();

		// Then
		assertEquals(5, quantity_acutal);
	}

	@Test
	public void Should_Return_The_ItemName() {

		// When
		String Item_actual = order.getItemName();

		// Then
		assertEquals("Pizza", Item_actual);
	}

	@Test
	public void Should_Return_The_ItemName_afterSet() {
		// Given
		
		this.order.setItemName("Burger");
		
		// When
		String Item_actual = order.getItemName();

		// Then
		assertEquals("Burger", Item_actual);
	}
	
	@Test
	public void Should_Return_The_ItemPrice() {

		// When
		double price_actual = order.getPrice();

		// Then
		assertEquals(500, price_actual);
	}
	
	@Test
	public void Should_Return_The_ItemPrice_afterSet() {
		// Given
		
		this.order.setPrice(600);
		
		// When
		double Item_actual = order.getPrice();

		// Then
		assertEquals(600, Item_actual);
	}
	
	@Test
	public void Should_Return_getPriceWithtax() {

		// When
		double price_actual = order.getPriceWithTex();

		// Then
		assertEquals(0,price_actual);
	}
	
	@Test
	public void Should_Return_After_SetPriceWithtax() {
		
		this.order.setPriceWithTex(4);
		// When
		double price_actual = order.getPriceWithTex();

		// Then
		assertEquals(4,price_actual);
	}


}
