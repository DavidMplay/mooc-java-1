/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gamer
 */
public class Product {
    private String name;
    private double price;
    private int quantitiy;
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantitiy = initialQuantity;
    }
    public void printProduct(){
        System.out.println(name + ", " + "price " + price + ", " + quantitiy + " pcs");
    }
}
