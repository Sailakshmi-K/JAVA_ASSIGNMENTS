package Exceptions;

public class User {
    public void validAmount(float amount,float withdraw) throws Exception {
        float balance=1000.50f;
        if (amount <= 0.0 && withdraw> balance) {
            throw new Exception("Please enter amount and balance with in specified range and positive numbers");
        }
        else if( withdraw >= balance ){
            throw new InsufficientBalanceException("Caution !! ...Trying to withdrawn more than your present balance");
        }
       else if (amount<=0.0f){
            throw new InvalidAmountException("Invalid amount");
        }
        else{
            System.out.println("Initial balance : "+balance);
            System.out.println("After deposit and withdrawl ::::::::: ");
            System.out.println("Amount deposited : "+amount+"withdraw amount : "+withdraw+
                    " Current balance : "+(balance+amount-withdraw));

        }
    }
}

