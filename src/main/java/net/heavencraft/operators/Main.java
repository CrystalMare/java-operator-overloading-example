package net.heavencraft.operators;

public class Main {

    public static void main(String[] args) {
        MyObject obj1 = new MyObject(10);
        MyObject obj2 = new MyObject(5);

        MyObject objTotal = obj1 + obj2;

        System.out.print("Total value: ");
        //Prints 15
        System.out.println(objTotal.getValue());
    }
}
