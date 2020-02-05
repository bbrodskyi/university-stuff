package com.company;

public class Main {

    public static void main(String[] args) {
        Box[] boxData = {
                new Box("BoxOne", new Product("Egg", 10)),
                new Box("BoxTwo", new Product("Butter", 20)),
                new Box("BoxThree", new Product("Juice", 30)),
                new Box("BoxFour", new Product("Ham", 12)),
                new Box("BoxFive", new Product("Cheese", 22)),
                new Box("BoxSix", new Product("Bacon", 32)),
                new Box("BoxSeven", new Product("Water", 14)),
                new Box("BoxEight", new Product("Beans", 24)),
                new Box("BoxNine", new Product("Cheddar", 34)),
        };
        
        System.out.println("Products contained in the boxes: ");
        printArr(Box.getProducts(boxData));
        System.out.println("----------------------------------------");
        System.out.println("Boxes with Product(s) with price above 10 and below 22: ");
        printArr(Box.boxesNames(boxData, 10, 22));
        System.out.println("----------------------------------------");
        System.out.println("Boxes with Product(s) with price above 5 and below 10: ");
        printArr(Box.boxesNames(boxData, 5, 10));
        System.out.println("----------------------------------------");
        System.out.println("Boxes with Product(s) with price above 20 and below 30: ");
        printArr(Box.boxesNames(boxData, 20, 30));
        System.out.println("----------------------------------------");
    }

    static void printArr(Object[] array) {
    
        if (array == null) {
            System.out.println("No products found");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
