package com.order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EmailServiceTest {

	@Test
	void Should_Return_NewEmailService() {
		// Given

		EmailService Expected = EmailService.getInstance();

		// When

		EmailService actual = EmailService.getInstance();

		// Then

		assertSame(Expected, actual);
	}

	@Test
	void Should_Through_RuntimeException() {
		// Given
		EmailService e1 = new EmailService();
		Order order = new Order(3, "Pizza", 500);

		// When

		Executable executable = () -> e1.sendEmail(order);

		// Then

		assertThrows(RuntimeException.class, executable);
	}

	@Test
	void Should_Return_True_Byaccepting_orderDetails_And_MailId() {
		// Given
		
		EmailService e1 = new EmailService();
		Order order = new Order(3, "Pizza", 500);
		String Mail_Id = "nihitgarg007@gmail.com";
		
		// When

		boolean expected = e1.sendEmail(order, Mail_Id);

		// Then

		assertTrue(expected);
	}

}
