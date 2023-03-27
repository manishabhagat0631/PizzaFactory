package models;

import enums.ItemType;

public class Side extends Item {

	public Side(String name, ItemType itemType, Double price, Long quantity) {
        super(name, itemType, price, quantity);
    }

    @Override
    public String toString() {
        return "Side = {" +
                "name = " + super.getName() +
                ", ItemType = " + super.getItemType() +
                ", Price = " + super.getPrice() +
                "}";
    }

}
