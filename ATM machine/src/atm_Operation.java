import java.util.HashMap;
import java.util.Map;

public class atm_Operation implements atmOperation {

    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("the available balance is : "+ atm.getBalance());
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" deposited successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0 || withdrawAmount%200==0 ) {
            if(atm.getBalance()>= withdrawAmount) {
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println(withdrawAmount + "withdrawn sucessfully");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }
            else{
                System.out.println("Dont have sufficient balance!");
            }
        }
        else {
            System.out.println("Please enter the amount in multiple of 500 or 200");
        }
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
