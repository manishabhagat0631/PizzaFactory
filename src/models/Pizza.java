package models;

import enums.Category;
import enums.ItemType;
import enums.Size;

public class Pizza extends Item{
	
	private Size size;
	private Double regularPrice;
	private Double mediumPrice;
	private Double largeprice;
	private Double price;
	
	public Pizza(String name, ItemType type, Category category, Long quantity, Double price, Size size, Size size2,
			Double regularPrice, Double mediumPrice, Double largeprice) {
		super(name, type, category, quantity, price, size);
		size = size2;
		this.regularPrice = regularPrice;
		this.mediumPrice = mediumPrice;
		this.largeprice = largeprice;
		this.size = size;
		this.price = getPrice(size);
	}

	public Pizza(Long id, String name, ItemType itemType, Category category, Double regularPrice, Double mediumPrice, Double largePrice, Long quantity) {
        super(id, name, itemType, category, quantity);
        this.regularPrice = regularPrice;
        this.mediumPrice = mediumPrice;
        this.largeprice = largePrice;
    }

    public Double getPrice(Size size) {
        switch (size.toString()) {
            case "REGULAR":
                return regularPrice;

            case "MEDIUM":
                return mediumPrice;

            case "LARGE":
                return largeprice;

            default:
                return this.price;
        }
    }

    @Override
    public String toString() {
        return "Pizza {" +
                " name=" + super.getName() +
                " ItemType=" + super.getItemType() +
                ", regularPrice=" + regularPrice +
                ", mediumPrice=" + mediumPrice +
                ", largePrice=" + largeprice +
                '}';
    }



    
	
	

	
	
	
	
	
	
	

}
