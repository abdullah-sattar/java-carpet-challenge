package com.company;

public class Main {

    public static void main(String[] args) {
	    Floor myFloor = new Floor(-13, -20);
        Carpet myCarpet = new Carpet(7);
        Calculator calc = new Calculator(myFloor,myCarpet);
        System.out.println(calc.getTotalCost());
    }
}
