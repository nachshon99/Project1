import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int positiveNumber = positiveNumber();
        for(int i = 2; i < positiveNumber; i++){
            if(prime(i)){
                System.out.println(i);
            }
        }


    }

    public static Boolean withoutResidue(int num1 , int num2){

        if(num1 % num2 ==0){
            return true;
        }
        return false;
    }
    public static Boolean prime(int num){
        Boolean res = true;
        for (int i=2;i<num;i++){
            if (withoutResidue(num, i)){
                return false;
            }
        }
        return true;

    }
    public static int positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Enter a positive number: ");
            inputNumber = scanner.nextInt();
        }while (inputNumber < 0);

        return inputNumber;
    }
}
