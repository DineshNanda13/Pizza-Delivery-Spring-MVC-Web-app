package com.pizzaDelivery.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.pizzaDelivery.mvc.validation.CouponCode;

public class Pizza {
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Pattern(regexp = "[a-zA-z]+", message = "Only Alphabetic characters are allowed")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Pattern(regexp = "[a-zA-z]+", message = "Only Alphabetic characters are allowed")
	private String lastName;
	
	private String pizzaOptions;
	
	private String [] toppings;
	
	private String base;
	
	@NotNull(message = "is required")
	@Min(value = 1, message = "Atleast 1 pizza needs to be ordered")
	@Max(value = 10, message = "Not more than 10 can be ordered")
	private Integer quantity;
	
	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "Only 6 characters are allowed")
	private String postalCode;
	
	@CouponCode
	private String couponCode;
	
	public Pizza() {}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPizzaOptions() {
		return pizzaOptions;
	}

	public void setPizzaOptions(String pizzaOptions) {
		this.pizzaOptions = pizzaOptions;
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
}
