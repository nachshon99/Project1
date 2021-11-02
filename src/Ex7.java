import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int ans1, ans2, ans3;
        boolean isInvalid = false;
        String day = null, minHour = null, maxHour = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, You must make an appointment for an appointment at the IRS offices ");
        System.out.println("What day do you want to come?");
        ans1 = scanner.nextInt();
        switch (ans1) {
            case 1: {
                System.out.println("You chose Sunday");
                day = "Sunday";
                System.out.println("The offices are open from 09:00 to 17:00.");
                break;
            }
            case 2: {
                System.out.println("You chose Monday");
                day = "Monday";
                System.out.println("The offices are open from 09:00 to 17:00.");
                break;
            }
            case 3: {
                System.out.println("You chose Tuesday");
                day = "Tuesday";
                System.out.println("The offices are open from 08:00 to 12:00.");
                break;
            }
            case 4: {
                System.out.println("You chose Wednesday");
                day = "Wednesday";
                System.out.println("The offices are open from 09:00 to 17:00.");
                break;
            }
            case 5: {
                System.out.println("You chose Thursday");
                day = "Thursday";
                System.out.println("The offices are open from 09:00 to 17:00.");
                break;
            }
            case 6: {
                System.out.println("You chose Friday");
                day = "Friday";
                System.out.println("The offices are closed on weekends");
                isInvalid = true;
                break;
            }
            case 7: {
                System.out.println("You chose Saturday");
                day = "Saturday";
                System.out.println("The offices are closed on weekends");
                isInvalid = true;
                break;
            }

            default: {
                System.out.println("You have selected an invalid day!");
                isInvalid = true;
                break;
            }
        }
        if(!isInvalid){
            System.out.println("What is the earliest hour you can arrive?");
            ans2 = scanner.nextInt();
            switch (ans2) {
                case 8: {
                    if(ans1 == 3){
                        System.out.println("You selected at 8:00");
                        minHour = "8:00";
                    }else {
                        System.out.println("The offices are closed");
                        isInvalid = true;
                    }
                    break;

                }
                case 9: {
                    System.out.println("You selected at 9:00");
                    minHour = "9:00";
                    break;
                }
                case 10: {
                    System.out.println("You selected at 10:00");
                    minHour = "10:00";
                    break;
                }
                case 11: {
                    System.out.println("You selected at 11:00");
                    minHour = "11:00";
                    break;
                }
                case 12: {
                    if(ans1 == 3){
                        System.out.println("The offices are closed");
                        System.out.println("The offices are open from 08:00 to 12:00.");
                        isInvalid = true;
                    }else {
                        System.out.println("You selected at 12:00");
                        minHour = "12:00";
                    }
                    break;
                }
                case 13: {
                    if(ans1 == 3){
                        System.out.println("The offices are closed");
                        System.out.println("The offices are open from 08:00 to 12:00.");
                        isInvalid = true;
                    }else {
                        System.out.println("You selected at 13:00");
                        minHour = "13:00";
                    }
                    break;
                }
                case 14: {
                    if(ans1 == 3){
                        System.out.println("The offices are closed");
                        System.out.println("The offices are open from 08:00 to 12:00.");
                        isInvalid = true;
                    }else {
                        System.out.println("You selected at 14:00");
                        minHour = "14:00";
                    }
                    break;
                }
                case 15: {
                    if(ans1 == 3){
                        System.out.println("The offices are closed");
                        System.out.println("The offices are open from 08:00 to 12:00.");
                        isInvalid = true;
                    }else {
                        System.out.println("You selected at 15:00");
                        minHour = "15:00";
                    }

                    break;
                }
                case 16: {
                    if(ans1 == 3){
                        System.out.println("The offices are closed");
                        System.out.println("The offices are open from 08:00 to 12:00.");
                        isInvalid = true;
                    }else {
                        System.out.println("You selected at 16:00");
                        minHour = "16:00";
                    }
                    break;
                }
                case 17: {
                    if(ans1 == 3){
                        System.out.println("The offices are closed");
                        System.out.println("The offices are open from 08:00 to 12:00.");
                        isInvalid = true;
                    }else {
                        System.out.println("You selected at 17:00");
                        minHour = "17:00";
                    }
                    break;
                }
                default: {
                    if ((ans2 < 0 || ans2 > 23)) {
                        isInvalid = true;
                        System.out.println("You have selected an invalid hour");
                    }
                    else if(ans1 == 3){
                        if(ans2<8 || ans2 >11){
                            System.out.println("The offices are closed");
                            System.out.println("The offices are open from 08:00 to 12:00.");
                            isInvalid = true;
                        }
                    }else if(ans1 ==1 || ans1 == 2 || ans1 == 4 || ans1 == 5){
                        if(ans2 < 9 || ans2 > 16){
                            System.out.println("The offices are closed");
                            System.out.println("The offices are open from 09:00 to 17:00.");
                            isInvalid = true;
                        }
                    }
                    break;
                }
            }
            if(!isInvalid){
                System.out.println("What is the latest hour you can arrive?");
                ans3 = scanner.nextInt();
                if(ans3>=ans2){
                    switch (ans3) {
                        case 8: {
                            System.out.println("You selected at 8:00");
                            maxHour = "8:00";
                            break;
                        }
                        case 9: {
                            System.out.println("You selected at 9:00");
                            maxHour = "9:00";
                            break;
                        }
                        case 10: {
                            System.out.println("You selected at 10:00");
                            maxHour = "10:00";
                            break;
                        }
                        case 11: {
                            System.out.println("You selected at 11:00");
                            maxHour = "11:00";
                            break;
                        }
                        case 12: {
                            System.out.println("You selected at 12:00");
                            maxHour = "12:00";
                            break;
                        }
                        case 13: {
                            if(ans1 == 3){
                                System.out.println("You have selected an invalid hour");
                                System.out.println("The offices are open from 08:00 to 12:00.");
                                isInvalid = true;
                            }else{
                                System.out.println("You selected at 13:00");
                                maxHour = "13:00";
                            }
                            break;
                        }
                        case 14: {
                            if(ans1 == 3){
                                System.out.println("You have selected an invalid hour");
                                System.out.println("The offices are open from 08:00 to 12:00.");
                                isInvalid = true;
                            }else{
                                System.out.println("You selected at 14:00");
                                maxHour = "14:00";
                            }
                            break;
                        }
                        case 15: {
                            if(ans1 == 3){
                                System.out.println("You have selected an invalid hour");
                                System.out.println("The offices are open from 08:00 to 12:00.");
                                isInvalid = true;
                            }else{
                                System.out.println("You selected at 15:00");
                                maxHour = "15:00";
                            }
                            break;
                        }
                        case 16: {
                            if(ans1 == 3){
                                System.out.println("You have selected an invalid hour");
                                System.out.println("The offices are open from 08:00 to 12:00.");
                                isInvalid = true;
                            }else{
                                System.out.println("You selected at 16:00");
                                maxHour = "16:00";
                            }
                            break;
                        }
                        case 17: {
                            if(ans1 == 3){
                                System.out.println("You have selected an invalid hour");
                                System.out.println("The offices are open from 08:00 to 12:00.");
                                isInvalid = true;
                            }else{
                                System.out.println("You selected at 17:00");
                                maxHour = "17:00";
                            }
                            break;
                        }
                        default: {
                            if ((ans3 < 0 || ans3 > 23)) {
                                System.out.println("You have selected an invalid hour");
                                isInvalid = true;
                                break;
                            }else if(ans1 == 3){
                                if(ans3 > 12){
                                    System.out.println("You have selected an invalid hour");
                                    System.out.println("The offices are open from 08:00 to 12:00.");
                                    isInvalid = true;
                                    break;
                                }
                            }else if(ans1 ==1 || ans1 == 2 || ans1 == 4 || ans1 == 5) {
                                if (ans3 > 17) {
                                    System.out.println("You have selected an invalid hour");
                                    System.out.println("The offices are open from 09:00 to 17:00.");
                                    isInvalid = true;
                                    break;
                                }
                            }
                        }

                    }
                    if(!isInvalid){
                        System.out.println("The meeting was scheduled successfully");
                        System.out.println("Your day is " + day + "." + " Your turn is between " + minHour + "-"+ maxHour);
                    }
                }
                else{
                    System.out.println("You have selected an invalid hour");
                }
            }
        }
    }
}
