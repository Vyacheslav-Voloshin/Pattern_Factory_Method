package project;


import project.female.FemaleFactory;
import project.male.MaleFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType){
        if (humanFactoryType == HumanFactoryType.MALE) {
            return new MaleFactory();
        } else {
            return new FemaleFactory();
        }
    }
    public enum HumanFactoryType {
        MALE, FEMALE;
    }
}
