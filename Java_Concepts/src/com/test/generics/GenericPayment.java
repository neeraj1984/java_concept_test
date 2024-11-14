package com.test.generics;

public class GenericPayment<T> {
	 private T paymentType;

	public T getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(T paymentType) {
		this.paymentType = paymentType;
	}

}
