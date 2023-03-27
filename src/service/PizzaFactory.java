package service;

import java.util.ArrayList;

import models.Customer;
import models.Inventory;
import models.Order;
import models.OrderItem;
import service.InventoryService;
import service.OrderService;
import service.ValidationService;

public class PizzaFactory {
	
	private Inventory inventory;

    private OrderService orderService = new OrderService();
    private ValidationService validationService = new ValidationService();
    private InventoryService inventoryService = new InventoryService();

    private static Long orderId = 1l;

    public PizzaFactory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void showMenu() {
        System.out.println(inventory.showMenu());
    }

    public Order placeOrder(String terminalId, Customer customer, ArrayList<OrderItem> orderItems) {
        boolean isOrderValid = orderService.validateOrder();
        if(orderService.validateOrder()) {
            Order order =  new Order(terminalId, orderId++, orderItems, customer);
            return order;
        }
        throw new IllegalArgumentException("Order items are not valid");
    } 
}
