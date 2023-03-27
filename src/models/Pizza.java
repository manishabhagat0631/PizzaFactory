package models;

import enums.Category;
import enums.ItemType;
import enums.Size;

public class Pizza extends Item {

	private Size size;
	private Double regularPrice;
	private Double mediumPrice;
	private Double largePrice;
	private Double price;

	public Pizza(Long id, String name, Size size, ItemType itemType, Category category, Double regularPrice,
			Double mediumPrice, Double largePrice, Long quantity) {
		super(id, name, itemType, category, quantity);
		this.regularPrice = regularPrice;
		this.mediumPrice = mediumPrice;
		this.largePrice = largePrice;
		this.size = size;
		this.price = getPrice(size);
	}

	public Pizza(Long id, String name, ItemType itemType, Category category, Double regularPrice, Double mediumPrice,
			Double largePrice, Long quantity) {
		super(id, name, itemType, category, quantity);
		this.regularPrice = regularPrice;
		this.mediumPrice = mediumPrice;
		this.largePrice = largePrice;
	}

	@Override
	public Double getPrice(Size size) {
		switch (size.toString()) {
		case "REGULAR":
			return regularPrice;

		case "MEDIUM":
			return mediumPrice;

		case "LARGE":
			return largePrice;

		default:
			return this.price;
		}
	}

	@Override
	public String toString() {
		return "Pizza {" + 
				" name=" + super.getName() + "\n" +
				" ItemType=" + super.getItemType() + "\n"+ 
				", regularPrice=" + regularPrice + "\n" + 
				", mediumPrice=" + mediumPrice + "\n" + 
				", largePrice="+ largePrice + "\n" + '}';
	}

}
