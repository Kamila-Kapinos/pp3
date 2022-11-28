public class BankAccount {
    
    private String accountId;
    private String owner;
    private double balance;

    public void setId(String accountId){
        this.accountId = accountId;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getId(){
        return this.accountId;
    }

    public String getOwner(){
        return this.owner;
    }

    public BankAccount(String accountId, String owner) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = 0;
    }

    public double getBalance(){
        return this.balance;
    }


    public void deposit(double moneyAmount){
        this.balance += moneyAmount;
    }
//TODO napraw to pure method
    public boolean withdraw(double moneyAmount){   
        if(this.balance <= moneyAmount){
            System.out.println("You're trying to withdraw a larger amount than you have");
            return false;     
        }else if(moneyAmount>500){
            System.out.println("You're trying to withdraw a larger amount than limit");
            return false;
        }else{
            this.balance -= moneyAmount;
            return true;
        }
    }

    public void displayBalance(){
        System.out.println("Balance of your account: " + getBalance());
    }

    public static void main(String[] args){
        BankAccount b1 = new BankAccount("123456789", "Jan Kowalski");
        b1.setId("123425678");
        b1.setOwner("Ala Makota");
        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withdraw(1000);
        b1.displayBalance();
    }
}
