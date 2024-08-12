import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        ATM one = new ATM();
        one.checkPin();

    }
}

class ATM{
    Scanner sc = new Scanner(System.in);
    float bal;
    int pin=9915;

    void checkPin(){

        System.out.println("enter your atm pin");
        int ent_pin=sc.nextInt();
        if(ent_pin==pin){
            if(bal==0){
                System.out.println("you have 0 rs in account, first deposit some money in account");
                bal=sc.nextFloat();
            }
            menu();
        }
        else{
            System.out.println("invalid pin");
        }
    }

    void menu(){
        while(true) {
            System.out.println("press 1 to check balance");
            System.out.println("press 2 to withdraw money");
            System.out.println("press 3 to deposit money");
            System.out.println("press 4 to exit the atm");
            int choice = sc.nextByte();

            switch (choice) {
                case 1:
                    System.out.println(bal);
                    break;

                case 2:
                    System.out.println("enter the amount you want to withdraw");
                    float withdraw = sc.nextFloat();
                    if (withdraw > bal) {
                        System.out.println("insufficient balance");
                    } else {
                        bal = bal - withdraw;
                        System.out.println("amount successfully withdrawn");
                    }
                    break;

                case 3:
                    System.out.println("enter the amount you want to deposit");
                    float dep = sc.nextFloat();
                    if (dep < 0) {
                        System.out.println("invalid amount");
                    } else {
                        bal = bal + dep;
                        System.out.println("amount successfully deposited");
                    }
                    break;

                case 4:
                    System.out.println("thanks for using our services");
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid input");
                    break;
                    12;

            }
        }

    }




}

