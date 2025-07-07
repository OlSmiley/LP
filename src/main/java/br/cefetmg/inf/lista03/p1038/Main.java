package br.cefetmg.inf.lista03.p1038;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private final int code;
    private final String description;
    private final double price;

    public Product(int code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

class Menu {
    private final Map<Integer, Product> products;

    public Menu() {
        products = new HashMap<>();
        products.put(1, new Product(1, "Cachorro Quente", 4.00));
        products.put(2, new Product(2, "X-Salada", 4.50));
        products.put(3, new Product(3, "X-Bacon", 5.00));
        products.put(4, new Product(4, "Torrada simples", 2.00));
        products.put(5, new Product(5, "Refrigerante", 1.50));
    }

    public Product getProductByCode(int code) {
        return products.get(code);
    }
}

class Order {
    private final Product product;
    private final int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        Product product = menu.getProductByCode(code);
        Order order = new Order(product, quantity);

        System.out.printf("Total: R$ %.2f%n", order.calculateTotal());
    }
}
