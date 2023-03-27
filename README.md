
# PizzaFactory Java Assignment

This Java project is a pizza ordering service that allows customers to place their orders through a self-service terminal. The project is intended to serve as a proof of concept for a startup company that wishes to manage their pizza orders through a simple UI client.





## Features

• The service will be accepting requests from multiple self-service terminals.

• Customers can select one or more Pizzas from the menu and then customize them
with
available options.

• Customers should be able to select a type of crust and add extra toppings.

• Customers should be able to verify their order, check the amount and place the order
Once the order is received service will verify the business rules and confirm the order.
Payment/order processing workflow is intentionally skipped here to keep it simple.

• Customers can also place side orders along with the pizza order.

• The “PizzaFactory” ensures that appropriate inventory is available before allowing
customers to proceed with their orders. It also makes best efforts to utilize inventory in
an optimal manner to fulfill maximum orders.

• Customers can’t cancel the order once it is placed.

• The vendor can restock inventory through “PizzaFactory” service.

• The vendor should be able to add new pizzas, toppings, sides and also change prices.

• The design should require minimal changes in the code while adding new business
rules.

## Business Requirements

• Vegetarian pizza cannot have a non-vegetarian topping.

• Non-vegetarian pizza cannot have paneer topping.

• Only one type of crust can be selected for any pizza.

• You can add only one of the non-veg toppings in non-vegetarian pizza.

• Large size pizzas come with any 2 toppings of customers choice with no additional
cost.


## Data Models

The data model for the PizzaFactory service includes the following classes:

Item: Any item that can be sold.

Pizza: Represents a pizza, with properties for the type of pizza, size, toppings, category (veg/non-veg) and crust. This extends the item class.

Sides: Sides include things like cold-drink and mousse cake.

Order: Represents an order, with properties for the customer name, address, orderItems, and amount.

Inventory: Represents the inventory of pizzas and sides available in stock.

OrderItem: Represents the individual items (multiple quantities included) in a order like item name, item quantity, item's total price.

Order: This model represents the final order like orderId, customerId, orderItems and amount

