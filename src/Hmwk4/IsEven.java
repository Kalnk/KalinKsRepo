package Hmwk4;

public class IsEven {

    public static void main(String[] args) {

        System.out.println(new IsEven().isEven(5));
    }

    private boolean isEven (int a){
        boolean isEven = a % 2 ==0;

        return isEven;
    }
}
