import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int min, max, mid;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter a third number: ");
        num3 = scanner.nextInt();

        if(num1<num2 && num1<num3){
            min = num1;
            if(num2>num3){
                max = num2;
                mid = num3;
            }else{
                max = num3;
                mid = num2;
            }

        }
        else if(num2<num1 && num2<num3){
            min = num2;
            if(num1>num3){
                max = num1;
                mid = num3;
            }else{
                max = num3;
                mid = num1;
            }
        }
        else{
            min = num3;
            if(num2>num1){
                max = num2;
                mid = num1;
            }else{
                max = num1;
                mid = num2;
            }
        }
        System.out.println("Min:" + min +" , "+ mid + " , " + max +":Max");
    }
}
