import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        startAndAgain();
    }

    public static int calSalary(int typeWorker, int hourAmount, int bonusDays){
        int salary = 0;
        switch (typeWorker){
            case 0:
            {
                salary = (50*hourAmount) + (250*bonusDays);
                break;
            }
            case 1:
            {
                salary = (200*hourAmount) + (250*bonusDays);
                break;
            }
            default:
            {
                System.out.println("There are no this type worker");
                break;
            }
        }

        return salary;
    }

    public  static  void startAndAgain(){
        Scanner scanner = new Scanner(System.in);
        int typeWorker, hourAmount, bonusDays;
        System.out.println("Enter type of worker: ");
        typeWorker = scanner.nextInt();
        System.out.println("Enter amount of working hours: ");
        hourAmount = scanner.nextInt();
        System.out.println("Enter amount of bonus days: ");
        bonusDays = scanner.nextInt();

        int resSalary = calSalary(typeWorker, hourAmount, bonusDays);
        System.out.println("The salary is: " + resSalary);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Do you want to calculate again? (Y/N)");
        String again = scanner1.next();
        switch (again){
            case "Y":
            {
                startAndAgain();

            }
            case "N":
            {
                break;
            }
            default:
            {
                System.out.println("There are no this answer");
                break;
            }
        }
    }
}
