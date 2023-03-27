package models;

import enums.Category;

public class Topping {

	private String name;
	private enums.Category category;
	private Double price;

	public Topping(String name, Category category, Double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Topping: {" + "name='" + name + '\'' + ", category=" + category + ", price=" + price + '}';
	}
}
