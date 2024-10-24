package project.female;

import project.AbstractFactory;
import project.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson (int age){
        if (0<age && age<13){
            return new KidGirl();
        } else if (13<=age && age<20) {
            return new TeenGirl();
        } else return new Woman();
    }
}
