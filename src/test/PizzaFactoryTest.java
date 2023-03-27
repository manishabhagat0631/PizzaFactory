package test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import enums.Category;
import enums.Crust;
import enums.ItemType;
import enums.Size;
import models.Customer;
import models.Inventory;
import models.Item;
import models.Order;
import models.OrderItem;
import models.Pizza;
import models.Side;
import models.Topping;
import service.InventoryService;
import service.PizzaFactory;

public class PizzaFactoryTest {
	
	private InventoryService inventoryService = new InventoryService();

    private ArrayList<Item> pizzas;
    private ArrayList<Item> sides;
    private ArrayList<Topping> toppings;
    private ArrayList<Crust> crusts;

    private PizzaFactory pizzaFactory;
    private Inventory inventory;

    @Before
    public void init() {
        this.pizzas = loadPizzasIntoInventory();
        this.sides = loadSidesIntoInventory();
        this.toppings = loadToppingsIntoInventory();
        this.crusts = loadCrustsIntoInventory();
        this.inventory = new Inventory(pizzas, sides, toppings, crusts);
        pizzaFactory = new PizzaFactory(inventory);
        pizzaFactory.showMenu();
    }

    @Test
    public void testPlaceOrder() {
        Order order = pizzaFactory.placeOrder("counter1", createCustomer(), createOrder(this.inventory));
        Assertions.assertEquals(1015.00, order.getAmount());
    }

    private static ArrayList<OrderItem> createOrder(Inventory inventory) {
        //Pizza
        Item cheeseCornPizza = inventory.getPizzas().get(1);

        //Toppings
        ArrayList<Topping> pizzaToppings = new ArrayList<>();
        pizzaToppings.add(inventory.getToppings().get(1));
        pizzaToppings.add(inventory.getToppings().get(2));

        //Sides
        Item coldDrink = inventory.getSides().get(0);
        Item mousseCake = inventory.getSides().get(1);

        OrderItem pizza = new OrderItem(cheeseCornPizza, Size.MEDIUM, 2, Crust.WHEAT_THIN_CRUST, pizzaToppings);
        OrderItem side1 = new OrderItem(coldDrink, 1);
        OrderItem side2 = new OrderItem(mousseCake, 1);

        ArrayList<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(pizza);
        orderItems.add(side1);
        orderItems.add(side2);

        return orderItems;
    }

    private static Customer createCustomer() {
        //Create Customer
        return new Customer(1l, "Jenny", "9111111111", "jenny@email.com");
    }

    public ArrayList<Item> loadSidesIntoInventory() {
        ArrayList<Item> sides = new ArrayList<>();
        Item coldDrink = new Side("Cold Drink", ItemType.SIDE, 55.0, 50l);
        sides.add(coldDrink);

        Item mousseCake = new Side("Mousse cake", ItemType.SIDE, 90.0, 50l);
        sides.add(mousseCake);

        return sides;
    }

    public ArrayList<Item> loadPizzasIntoInventory() {
        ArrayList<Item> pizzas = new ArrayList<>();
        Item deluxeVeggiePizza = new Pizza(1l , "Deluxe Veggie", ItemType.PIZZA, Category.VEG, 150.00, 200.00, 325.00, 10l);
        pizzas.add(deluxeVeggiePizza);

        Item cheeseAndCorn = new Pizza(2l, "Cheese and corn ", ItemType.PIZZA, Category.VEG, 175.00, 375.00, 475.00, 5l);
        pizzas.add(cheeseAndCorn);

        Item paneerTikka = new Pizza(3l, "Paneer Tikka", ItemType.PIZZA, Category.VEG, 160.00, 290.00, 340.00, 5l);
        pizzas.add(paneerTikka);

        Item nonVegSupreme = new Pizza(4l, "Non-Veg Supreme", ItemType.PIZZA, Category.NON_VEG, 190.00, 325.00, 425.00, 10l);
        pizzas.add(nonVegSupreme);

        Item chickenTikka = new Pizza(4l, "Chicken Tikka", ItemType.PIZZA, Category.NON_VEG, 210.00, 370.00, 500.00, 10l);
        pizzas.add(chickenTikka);

        Item pepperBarbecue = new Pizza(4l, "Pepper Barbecue", ItemType.PIZZA, Category.NON_VEG, 220.00, 380.00, 525.00, 10l);
        pizzas.add(pepperBarbecue);

        return pizzas;
    }

    public ArrayList<Topping> loadToppingsIntoInventory() {
        ArrayList<Topping> toppings = new ArrayList<>();

        //VEG
        Topping blackOliveTopping = new Topping("Black Olive", Category.VEG, 20.0);
        toppings.add(blackOliveTopping);

        Topping capsicumTopping = new Topping("Capsicum", Category.VEG, 25.0);
        toppings.add(capsicumTopping);

        Topping paneerTopping = new Topping("Paneer Topping", Category.VEG, 35.0);
        toppings.add(paneerTopping);

        Topping mushroomTopping = new Topping("Mushroom Topping", Category.VEG, 30.0);
        toppings.add(mushroomTopping);

        Topping freshTomatoTopping = new Topping("Fresh tomato Topping", Category.VEG, 10.0);
        toppings.add(freshTomatoTopping);


        //NON-VEG
        Topping chickenTopping = new Topping("Chicken Topping", Category.NON_VEG, 35.0);
        toppings.add(chickenTopping);

        Topping BarbequeChickenTopping = new Topping("Barbeque Chicken Topping", Category.NON_VEG, 45.0);
        toppings.add(BarbequeChickenTopping);

        Topping GrilledChickenTopping = new Topping("Grilled Chicken Topping", Category.NON_VEG, 40.0);
        toppings.add(GrilledChickenTopping);

        //EXTRA CHEESE
        Topping extraCheese = new Topping("Extra Cheese", Category.NOT_APPLICABLE, 35.0);
        toppings.add(GrilledChickenTopping);

        return toppings;
    }

    public ArrayList<Crust> loadCrustsIntoInventory() {
        ArrayList<Crust> crusts = new ArrayList<>();
        crusts.add(Crust.NEW_HAND_TOSSED);
        crusts.add(Crust.WHEAT_THIN_CRUST);
        crusts.add(Crust.FRESH_PAN_PIZZA);
        crusts.add(Crust.CHEESE_BURST);
        return crusts;
    }

}
