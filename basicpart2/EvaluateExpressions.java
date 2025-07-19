package basicpart2;

public class EvaluateExpressions {
    public static void main(String[] args) {
        int ex1=(101+0)/3;
        double ex2=3.0e-6 * 10000000.1;
        boolean ex3=true && true;
        boolean ex4=false && true;
        boolean ex5=(false && false) || (true && true);
        boolean ex6=(false || false) && (true && true);
        System.out.println("(101 + 0) / 3) -> " + ex1);
        System.out.println("(3.0e-6 * 10000000.1) -> " + ex2);
        System.out.println("(true && true) -> " + ex3);
        System.out.println("(false && true) -> " + ex4);
        System.out.println("((false && false) || (true && true)) -> " + ex5);
        System.out.println("(false || false) && (true && true) -> " + ex6);
    }
}
