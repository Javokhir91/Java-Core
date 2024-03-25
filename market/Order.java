package ru.market;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Order {
    public static int count =0;
    private int id;
    public LocalDate dateBuy;
    private User user;
    private Map<Product, Integer> products;
    private double sum;

    public Order(User user) {
        this.id = ++count;
        this.dateBuy = LocalDate.now();
        this.user = user;
        products =new HashMap<Product, Integer>();
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getDateBuy() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMM");
        String formattedDate;
        return formattedDate = dateBuy.format(formatter);
    }

    public void add (Product product, int quantity){
        sum = product.getPrice()* quantity;
        products.put(product, quantity);
    }




    @Override
    public String toString() {
        return "Order{" +
                "date=" + dateBuy +
                "user=" + user +
                ", products=" + products +
                ", summa =" + sum +
                '}';
    }
}