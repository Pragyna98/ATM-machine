import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        atm_Operation op=new atm_Operation() ;
        int atmNumber= 123456789;
        int atmPin= 12345;
        System.out.println("Welcome To ATM Machine");
        Scanner input=new Scanner(System.in);
        System.out.println("enter ATM number:");
        int atm_number=input.nextInt();
        System.out.println("enter the pin:");
        int pin= input.nextInt();

        if((atmNumber==atm_number)&&(atmPin== pin)){
            System.out.println("validation done");
            while (true){
                System.out.println("1.View Available Balance\n2.Deposit Amount\n3.Withdraw Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("enter a choice");
                int ch=input.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("enter the amount to deposit:");
                    double depositAmount=input.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==3){
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount=input.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==4){
                    op.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Please collect your ATM card");
                    System.out.println("Thank you for using ATM machine :)");
                }
                else{
                    System.out.println("Please enter a right choice");
                    System.exit(0);
                }

            }
        }
        else{
            System.out.println("either wrong atm munber or wrong pin");
            System.exit(0);
        }

    }
}