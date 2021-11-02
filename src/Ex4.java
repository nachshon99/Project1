import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double resultQE1;
        double resultQE2;
        System.out.println("Enter parameter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter parameter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter parameter c: ");
        c = scanner.nextDouble();
        double delta = Math.sqrt((b*b) - 4*a*c);

        if((delta >0)){
            resultQE1 = quadraticEquation1(a,b,c);
            resultQE2 = quadraticEquation2(a,b,c);
            System.out.println("There are 2 solutions: " + "X1=" + resultQE1 + ", " + "X2=" + resultQE2);
        }else if(delta == 0){
            resultQE1 = quadraticEquation1(a,b,c);
            System.out.println("There is 1 solution: x=" + resultQE1);
        }
        else{
            System.out.println("There are no solutions");
        }


    }



    public static double quadraticEquation1(double a, double b, double c){
        double resultQE1 = (b*b) - (4*a*c);
        resultQE1 = Math.sqrt(resultQE1);
        resultQE1 = ((-b) + resultQE1) / (2*a);
        return resultQE1;

    }


    public static double quadraticEquation2(double a, double b, double c){
        double resultQE2 = (b*b) - (4*a*c);
        resultQE2 = Math.sqrt(resultQE2);
        resultQE2 = ((-b) - resultQE2) / (2*a);
        return resultQE2;
    }
}
