package com.company;

public class Box {
    private String name;
    private Product prod;

    Box(String name, Product prod) {
        this.name = name;
        this.prod = prod;
    }

    public String getName() {
        return this.name;
    }

    public Product getProd() {
        return this.prod;
    }

    @Override
    public String toString() {
        return this.name + "," + this.prod;
    }

    static Product[] getProducts(Box[] boxData) {
        Product[] prodArr = new Product[boxData.length];

        for (int i = 0; i < boxData.length; i++) {
            prodArr[i] = boxData[i].getProd();
        }

        return prodArr;
    }

    static String[] boxesNames(Box[] boxData, int minPrice, int maxPrice) {
        String boxesNames = "";

        for (int i = 0; i < boxData.length; i++) {
            Product prod = boxData[i].getProd();
            if (prod.getPrice() > minPrice && prod.getPrice() < maxPrice) {
                boxesNames += boxData[i].getName() + ",";
            }
        }

        if (boxesNames.length() == 0) {
            return null;
        }
        return boxesNames.split(",");
    }

}
