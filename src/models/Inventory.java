package models;

import java.util.ArrayList;

import enums.Crust;

public class Inventory {

	private ArrayList<Item> pizzas;

	private ArrayList<Item> sides;

	private ArrayList<Topping> toppings;

	private ArrayList<Crust> crusts;

	public Inventory(ArrayList<Item> pizzas, ArrayList<Item> sides, ArrayList<Topping> toppings,
			ArrayList<Crust> crusts) {
		this.pizzas = pizzas;
		this.sides = sides;
		this.toppings = toppings;
		this.crusts = crusts;
	}

	public ArrayList<Item> getPizzas() {
		return pizzas;
	}

	public void setPizzas(ArrayList<Item> pizzas) {
		this.pizzas = pizzas;
	}

	public ArrayList<Item> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Item> sides) {
		this.sides = sides;
	}

	public ArrayList<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<Topping> toppings) {
		this.toppings = toppings;
	}

	public ArrayList<Crust> getCrusts() {
		return crusts;
	}

	public void setCrusts(ArrayList<Crust> crusts) {
		this.crusts = crusts;
	}

	public String showMenu() {
		return "Menu: {" + "\npizzas=" + pizzas + ", \nsides=" + sides + ", \ntoppings=" + toppings + ", \ncrusts="
				+ crusts + '}';
	}

}
