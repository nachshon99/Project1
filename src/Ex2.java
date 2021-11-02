import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        num2 = scanner.nextInt();
        if((num1 + num2)%2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
