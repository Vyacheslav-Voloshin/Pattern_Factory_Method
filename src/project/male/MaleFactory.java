package project.male;

import project.AbstractFactory;
import project.Human;

public class MaleFactory implements AbstractFactory {
    public  Human getPerson (int age){
        Human human = null;
        if (0<age && age<13){
            return human = new KidBoy();
        } else if (13<=age && age<20) {
            return human =  new TeenBoy();
        } else return human =  new Man();
    }
}
