package Hmwk4;

public class SmallestNumber {

    public static void main(String[] args) {

        System.out.println(new SmallestNumber().smallestNumberFinder(123.0,5.0,1.0));
    }

    private double smallestNumberFinder (double a, double b, double c){
        double smallest = 0;

        if(a < b){
            smallest = a;
        } else if (b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        return smallest;
    }
}
