package kea;

import java.util.Random;

public class Car implements Runnable{

    private String carName;
    private int horsePower;
    private String tyreType;
    private double time;
    private int luck;
    Random rand = new Random();



    public Car(String carName, int horsePower, String tyreType) {
        this.carName = carName;
        this.horsePower = horsePower;
        this.tyreType = tyreType;
    }

    @Override
    public void run() {
        if(horsePower<300 && horsePower >100) {
            luck= rand.nextInt(10);
            for (int i = 100; i > 0; i--) {
                System.out.println(carName + ": Distance to goal: " + i + ", Meters");
                try {
                    if (tyreType.equals("Soft")) {
                        Thread.sleep(400 - horsePower - luck);
                        time+= 400 - horsePower - luck;
                    } else if (tyreType.equals("Hard")) {
                        Thread.sleep(390 - horsePower - luck);
                        time+= 390 - horsePower - luck;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(carName + "'s tid: " + time/1000 + " sekunder");
        } else{
            System.out.println(carName + ", Is either too fast or too slow to participate int the race");
        }
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
