package models;

import java.util.ArrayList;
import java.util.Objects;

import enums.Crust;
import enums.Size;

public class OrderItem {

	private Item item;
	private Size size;
	private Integer quantity;
	private Crust crust;
	private ArrayList<Topping> toppings;
	private Double amount;

	public OrderItem(Item item, Size size, Integer quantity, Crust crust, ArrayList<Topping> toppings) {
		this.item = item;
		this.size = size;
		this.quantity = quantity;
		this.crust = crust;
		this.toppings = toppings;
		this.amount = this.calculateAmount(item, size, quantity, toppings);
	}

	public OrderItem(Item item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
		this.amount = this.calculateAmount(item, size, quantity, toppings);
	}

	private Double calculateAmount(Item item, Size size, Integer quantity, ArrayList<Topping> toppings) {
		Double itemAmount = 0.0;
		if (item != null) {
			Double itemPrice = item.getPrice(size);
			Double toppingsTotalAmount = 0.0;
			if (toppings != null && !toppings.isEmpty()) {
				toppingsTotalAmount = toppings.stream().filter(Objects::nonNull).mapToDouble(Topping::getPrice).sum();
			}
			itemAmount = (itemPrice + toppingsTotalAmount) * quantity;
		}
		System.out.println(item.getName() + " Amount :: " + itemAmount);
		return itemAmount;
	}

	public Item getItem() {
		return item;
	}

	public void setPizza(Item item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Crust getCrust() {
		return crust;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	public ArrayList<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<Topping> toppings) {
		this.toppings = toppings;
	}
}
