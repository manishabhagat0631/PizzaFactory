package models;

import enums.Category;
import enums.ItemType;
import enums.Size;

public class Item {
	
	private Long id;
    private String name;
    private ItemType itemType;
    private Category category;
    private Size size;
    private Double price;
    private Long quantityInStock;

    public Item(Long id, String name, ItemType itemType, Category category, Double price, Long quantityInStock) {
        this.id = id;
        this.name = name;
        this.itemType = itemType;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Item(Long id, String name, ItemType itemType, Category category, Long quantityInStock) {
        this.id = id;
        this.name = name;
        this.itemType = itemType;
        this.category = category;
        this.quantityInStock = quantityInStock;
    }

    public Item(String name, ItemType itemType, Double price, Long quantityInStock) {
        this.name = name;
        this.itemType = itemType;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Long quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", type=" + itemType +
                ", category=" + category +
                ", size=" + size +
                ", price=" + price;
    }

    public Double getPrice(Size size) {
        return getPrice();
    }

}
