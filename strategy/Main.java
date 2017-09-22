package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Duck mallard = new MallardDuck();
        System.out.println(mallard.preformFly());
        System.out.println(mallard.preformQuack());

        Duck model = new ModelDuck();
        System.out.println(model.preformFly());
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println(model.preformFly());
    }
}
