package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import models.Customer;
import models.OrderItem;

public class Order {
	
	private String terminalId;
    private Long orderId;
    private Double amount;
    private ArrayList<OrderItem> orderItems;
    private Customer customer;	
	
    public Order(String terminalId,
            Long orderId,
            ArrayList<OrderItem> orderItems,
            Customer customer) {
   this.terminalId = terminalId;
   this.orderId = orderId;
   this.orderItems = orderItems;
   this.customer = customer;
   this.amount = calculateOrderAmount();
}

	private Double calculateOrderAmount() {
	   Double orderTotalAmount = 0.0;
	   orderTotalAmount = this.orderItems.stream().filter(Objects::nonNull).mapToDouble(OrderItem::getAmount).sum();
	   System.out.println("Order Total Amount :: " + orderTotalAmount);
	   return orderTotalAmount;
	}
	
	public String getTerminalId() {
	   return terminalId;
	}
	
	public void setTerminalId(String terminalId) {
	   this.terminalId = terminalId;
	}
	
	public Long getOrderId() {
	   return orderId;
	}
	
	public void setOrderId(Long orderId) {
	   this.orderId = orderId;
	}
	
	public Double getAmount() {
	   return amount;
	}
	
	public void setAmount(Double amount) {
	   this.amount = amount;
	}
	
	public ArrayList<OrderItem> getOrderItems() {
	   return orderItems;
	}
	
	public void setOrderItems(ArrayList<OrderItem> pizzaOrders) {
	   this.orderItems = pizzaOrders;
	}
	
	public Customer getCustomer() {
	   return customer;
	}
	
	public void setCustomer(Customer customer) {
	   this.customer = customer;
	}
}
