package ru.market;

import ru.market.Exeptions.ProductNotFoundException;
import ru.market.Exeptions.QuantityIsNegativeException;
import ru.market.Exeptions.UserNotFoundException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Market {
    private final List<User> users;
    private final List<Product> products;
    private final List<Order> orders;
    //    private List<Order> holiDay;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd");

    public Market(){
        users = new ArrayList<>(List.of(
                new User("Tom", Gender.Man,45,"11111"),
                new User("Eva", Gender.Woman,35,"2222"),
                new User("Elis",Gender.Woman, 55,"4444"),
                new User("Dzina",Gender.Woman, 25,"45322")
        ));
        products = new ArrayList<>(List.of(
                new Product("Milk", 89),
                new Product("Bread", 26),
                new Product("Cheese", 125)
        ));



        orders = new ArrayList<>();
    }

    public int createOrder(User user) throws UserNotFoundException {
        if(!users.contains(user)) throw new UserNotFoundException("покупатель не найден " + user);
        Order order = new Order(user);
        orders.add(order);
        return order.getId();
    }
    public void addProductToOrder(int orderId, Product product, int quantity) throws ProductNotFoundException, QuantityIsNegativeException {
        if(!products.contains(product)) throw new ProductNotFoundException("продукт не найден");
        if(quantity<=0) throw new QuantityIsNegativeException("не верное колличество товаров");
        Order order = null;
//        Order order = orders.stream().filter(o->o.getId() == orderId).findFirst().get();
        for (Order o: orders) {
            for (User u : users) {
                if (Objects.equals(o.getDateBuy(), Holidays.MARCH_8.getCode()) && u.getGender() == Gender.Woman) {
                    product.setPrice((product.getPrice() * 0.85));
                }
                else if (Objects.equals(o.getDateBuy(), Holidays.FEBRUARY_23.getCode()) && u.getGender() == Gender.Man) {
                    product.setPrice((product.getPrice() * 0.85));
                }
                else if (Objects.equals(o.getDateBuy(), Holidays.NEW_YEAR.getCode())) {
                    product.setPrice((product.getPrice() * 0.85));
                }
                else {
                    product.getPrice();
                }
            }
        }
        for (Order o: orders) {
            if(o.getId() == orderId){
                order =o;
                break;
            }
        }
        order.add(product,quantity);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
