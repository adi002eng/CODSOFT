//package ATMMachine;
import java.util.Scanner;

class ATM{
        public static final String Check = null;
        float Balance;
        int PIN  = 1323;

        public void checkpin(){
            System.out.println("Enter your pin:");
            Scanner sc = new Scanner(System.in);
            int enteredpin = sc.nextInt();

            if (enteredpin == PIN) {
                menu();

            }else{
                System.out.println("Enter a valid pin");
               
            }


        }
            public void menu(){
                System.out.println("Enter your choice:");
                System.out.println("1. Check A/C Balance");
                System.out.println("2. Withdrawl money");
                System.out.println("3. Deposit money");
                System.out.println("4. EXIT");

                Scanner sc = new Scanner(System.in);
                int opt = sc.nextInt();

                if (opt == 1) {
                    checkBalance();
                }
                    if (opt == 2) {
                        Withdrawlmoney();
                    }
                        else if(opt == 3){
                            Depositmoney();
                        }
                        else if(opt == 4){
                          return;
                        }
                        else{
                            System.out.println("You Entered a valid choice:");
                        }
                    
            }

            

            public void checkBalance(){
                System.out.println("Balance:" + Balance);
                menu();
            }

                public void Withdrawlmoney(){
                    System.out.println("Enter amount");
                    Scanner sc = new Scanner (System.in);
                    float amount = sc.nextFloat();
                    if (amount>Balance) {
                        System.out.println("Insufficent amount");
                    } else{
                        Balance = Balance - amount;
                        System.out.println("Money successfully withdrawl:");
                    }
                    menu();
                }

                public void Depositmoney(){
                    System.out.println("Enter amount:");
                    Scanner sc = new Scanner(System.in);
                    float amount = sc.nextFloat();
                    Balance  = Balance + amount;
                    System.out.println("Money successfully deposited");
                    menu();
                }   


    }   


public class ATMMachine {
     public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();
       

       
    }
}
