import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num;
        num = scanner.nextInt();
        if(num < 0){
            num *= -1;
        }
        System.out.println("The absolute value is: "+ num);

    }
}
