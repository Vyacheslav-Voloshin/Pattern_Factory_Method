package project;

import project.male.MaleFactory;

public class Solution {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE);
        useFactory(abstractFactory);
        abstractFactory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        useFactory(abstractFactory);
    }

    public static void useFactory (AbstractFactory abstractFactory){
        System.out.println(abstractFactory.getPerson(99));
        System.out.println(abstractFactory.getPerson(4));
        System.out.println(abstractFactory.getPerson(15));
    }
}
