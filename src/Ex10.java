import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, count1 = 0, count2 = 0;
        double randomNumber = (int)(Math.random()*1000)+1;
        //System.out.println(randomNumber);

        do{
            System.out.println("User1");
            System.out.println("Guess a number: ");
            number1 = scanner.nextInt();
            if(number1 != randomNumber){
                count1++;
                if(number1 <randomNumber){
                    System.out.println("The guess smaller than random number");
                }
                else{
                    System.out.println("The guess larger than random number");
                }

            }
            else{
                System.out.println("User1 win with " + count1 + " wrong guesses");
                break;
            }

            System.out.println("User2");
            System.out.println("Guess a number: ");
            number2 = scanner.nextInt();
            if(number2 != randomNumber){
                count2++;
                if(number2<randomNumber){
                    System.out.println("The guess smaller than random number");
                }
                else{
                    System.out.println("The guess larger than random number");
                }

            }
            else{
                System.out.println("User1 win with " + count2 + " wrong guesses");
                break;
            }
        } while (number1 != randomNumber || number2 != randomNumber);

    }
}
