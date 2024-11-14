package com.test.generics;

public class GenericTest {

	public static void main(String args[]) {
		GenericPayment<GPay> gPay = new GenericPayment<>();
		gPay.setPaymentType(new GPay());
		gPay.getPaymentType().makePayment();
		
		GenericPayment<PhonePay> phonePay = new GenericPayment<>();
		phonePay.setPaymentType(new PhonePay());
		phonePay.getPaymentType().makePayment();
		
	}
}
