package ru.market;

import ru.market.Exeptions.ProductNotFoundException;
import ru.market.Exeptions.QuantityIsNegativeException;
import ru.market.Exeptions.UserNotFoundException;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        List<User> users= market.getUsers();
        int orderId1 = 0;
        int orderId2 = 0;
        try {
            orderId1 = market.createOrder(users.get(1));
//            orderId2 = market.createOrder(new User("Alex",Gender.Man, 22,"1234567"));
            market.addProductToOrder(orderId1, market.getProducts().get(0),5);
            System.out.println(market.getOrders());
        } catch (UserNotFoundException |
                 ProductNotFoundException | QuantityIsNegativeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=================================");

        try {
            orderId2 = market.createOrder(new User("Alex",Gender.Man, 22, "234422"));
            market.addProductToOrder(orderId1, market.getProducts().get(0),5);
        } catch (UserNotFoundException | ProductNotFoundException | QuantityIsNegativeException e) {
            System.out.println(e.getMessage());;
        }
//        System.out.println(Holidays.MARCH_8.getCode());
    }
}