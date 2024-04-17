package hw3PreaparingForInterview.Exception;

public class Main {
    public static void main(String[] args) {
        int result = division(55, 0);
        System.out.println(result);
    }

    public static int division(int a, int b){
        if(b==0)
            try {
                throw new MyMathException("The divisor cannot by zero");
            } catch (MyMathException e) {
                System.err.println(e.getMessage());
                return 15;
            }

        return a/b;
    }
}
