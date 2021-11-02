import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int value = numberValue();
        asterisks(value);
        //System.out.println(value);
    }

    public static int numberValue(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number between 5-20: ");
            number = scanner.nextInt();
        }while(number < 5 || number > 20);

        return number;
    }

    public static void asterisks(int count){
        String asterisk= "*";
        for (int i = 0; i < count; i++ ){
            System.out.println(asterisk);
            asterisk = asterisk + "*";
        }

    }
}
