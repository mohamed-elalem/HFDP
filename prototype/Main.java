package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza margrittaPizza = new MargrittaPizza();
        Pizza pepperoniPizza = new PepperoniPizza();

        margrittaPizza.setServeBehavior(new InPlaceServe());
        pepperoniPizza.setServeBehavior(new InPlaceServe());

	    PizzaFactory factory = new PizzaFactory(margrittaPizza, pepperoniPizza);
	    Pizza inPlaceMargritta = factory.getPizza(PizzaEnum.MARGRITTA);
        Pizza inPlacePepperoni = factory.getPizza(PizzaEnum.PEPPERONI);
        System.out.println(inPlaceMargritta);
        System.out.println(inPlacePepperoni);
        inPlaceMargritta.serve();
        inPlacePepperoni.serve();

        System.out.println("==============================================");

        factory = new PizzaFactory(margrittaPizza, pepperoniPizza);

        margrittaPizza.setServeBehavior(new DeliveryServe());
        pepperoniPizza.setServeBehavior(new DeliveryServe());

        Pizza deliveryMargritta = factory.getPizza(PizzaEnum.MARGRITTA);
        Pizza deliveryPepperoni = factory.getPizza(PizzaEnum.PEPPERONI);
        System.out.println(deliveryMargritta);
        System.out.println(deliveryPepperoni);
        deliveryMargritta.serve();
        deliveryPepperoni.serve();

        System.out.println(System.identityHashCode(margrittaPizza) +
                " " +
                System.identityHashCode(inPlaceMargritta) +
                " " +
                System.identityHashCode(deliveryMargritta)
        );


        System.out.println(System.identityHashCode(pepperoniPizza) +
                " " +
                System.identityHashCode(inPlacePepperoni) +
                " " +
                System.identityHashCode(deliveryPepperoni)

        );
    }
}
