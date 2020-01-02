package kea;

import javax.swing.plaf.TableHeaderUI;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Car car1 = new Car("JeDie", 200, "Hard");
        Car car2 = new Car("Gamer", 210, "Soft");
        Car car3 = new Car("Hacker", 200, "Hard");

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);

        for(int i = 3; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
            if(i == 1){
                System.out.println("GOOOOOO!");
            }
        }
        t1.start();
        t2.start();
        t3.start();

    }
}
