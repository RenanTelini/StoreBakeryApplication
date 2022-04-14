package com.store.entities.enums;

public enum OrderStatus {
<<<<<<< HEAD
	
	WAITING_PAYMENT(8),
	PAID(9),
=======

	WAITING_PAYMENT(1),
	PAID(2),
>>>>>>> de482b675e3f9f4c309c4011a514a3624a946349
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
<<<<<<< HEAD
	
=======
>>>>>>> de482b675e3f9f4c309c4011a514a3624a946349
}
