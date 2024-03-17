package Hmwk4;

public class AverageOfThree {

    public static void main(String[] args) {
        System.out.println(new AverageOfThree().average(-2,10.0,1.0));
    }

    private double average (double a, double b, double c){

        return (a + b + c)/3;
    }
}
