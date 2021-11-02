import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLimb, diff, amount;
        System.out.println("Enter a first limb: ");
        firstLimb = scanner.nextInt();
        System.out.println("Enter a difference: ");
        diff = scanner.nextInt();
        System.out.println("Enter amount of limbs: ");
        amount = scanner.nextInt();
        if(amount>0){
            invoiceSeries(firstLimb,diff,amount);
        }



    }

   public  static void invoiceSeries(int firstLimb, int diff, int amount){
       System.out.println(firstLimb);
       int res;
        for (int i = 1; i< amount; i++){
            res = firstLimb+ diff;
            System.out.println(res+" ");
            firstLimb = res;


        }


    }
}
