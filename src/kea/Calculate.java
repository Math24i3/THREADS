package kea;

public class Calculate {
    private double value;

    public int compare(double i1, double i2){

        if (i1 < i2){
         return -1;
        } else if (i1>i2){
            return 1;
        } else {
            return 0;
        }


    }
}
