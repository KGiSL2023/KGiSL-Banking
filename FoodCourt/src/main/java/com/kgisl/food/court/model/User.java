package com.kgisl.food.court.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {
	
	 @NotEmpty
	 private String username;
	 @NotEmpty
	 private String password;
	 @NotEmpty
	 private String pizzaType;
	 @NotEmpty
	 private String topping;
	 @NotEmpty
	 private String size;
	 @NotNull
	 private int quantity;
	 @NotEmpty
	 private String address;
	 private double totalAmount;
	 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", pizzaType=" + pizzaType + ", topping="
				+ topping + ", size=" + size + ", quantity=" + quantity + ", address=" + address + ", totalAmount="
				+ totalAmount + "]";
	}
	
	
	
	 

}
