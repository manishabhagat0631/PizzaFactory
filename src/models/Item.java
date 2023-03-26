package models;

import enums.Category;
import enums.ItemType;
import enums.Size;

public class Item {
	
}
	
	private String name;
	private ItemType itemType;
	private Category category;
	private Long quantity;
	private Double price;
	private Size size;
	
	public Item(String name, ItemType type, Category category, Long quantity, Double price, Size size) {
		super();
		this.name = name;
		this.itemType = itemType;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.size = size;
		public Item(Long id, String name, ItemType itemType, Category category, Long quantity) {
	        this.id = id;
	        this.name = name;
	        this.itemType = itemType;
	        this.category = category;
	        this.quantity = quantity;
	    }

	    public Item(String name, ItemType itemType, Double price, Long quantity) {
	        this.name = name;
	        this.itemType = itemType;
	        this.price = price;
	        this.quantity = quantity;
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

	    public Long getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Long quantity) {
	        this.quantity = quantity;
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

	
	
	
	
	
	

}
