import java.util.Scanner;

  class Account{
    String cName,accNum,accType;
    Scanner sc = new Scanner(System.in);

    Account(String name,String accNo,String accType){
        this.cName = name;
        this.accNum = accNo;
        this.accType = accType; 
    }
    Account(){};
}

class CurrentAcc extends Account{
    private double balance = 1000,rate = 0.03;

    CurrentAcc(String name,String accNo,String accType){
        super(name,accNo,accType);
        System.out.println("Welcome " + cName);
    }

    void getBalance() {
        System.out.format("Your balance: %f\n",balance);
    }

    void deposit(double amount){
        char choice;
        System.out.println("Deposit. Account holder: " + cName + " Amount: " + amount);
        System.out.println("Approve Deposit?(Y/N): ");
        choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            balance+=amount;
            System.out.println("Deposit approved. Updated balance: " + balance );
        }else{
            System.out.println( "Deposit not approved" );
        }
    }
    
    void withdraw(double amount){
        System.out.println( "This account cannot withdraw any funds" );
    }

    void calcInterest() {};
    void checkMinAmount(){
        if(balance < 500){
            balance-=100;
            System.out.println( "Balance under minimum amount to be maintained." );
            System.out.println( "Penalty imposed. Updated balance: " + balance );
        }
    }
}

class SavingsAcc extends Account{
    private double balance = 1000,rate = 0.03;

    SavingsAcc(String name,String accNo,String accType){
        super(name,accNo,accType);
        System.out.println("New Customer: " + cName);
    }

    void getBalance() {
        System.out.format("Your balance: %f\n",balance);
    }

    void deposit(double amount){
        char choice;
        System.out.println("Deposit. Account holder: " + cName + " Amount: " + amount);
        System.out.println("Approve Deposit?(Y/N): ");
        choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            balance+=amount;
            System.out.println("Deposit approved. Updated balance: " + balance );
            calcInterest();
            checkMinAmount();
        }else{
            System.out.println( "Deposit not approved" );
        }
    }

    void calcInterest(){
        double CI;

        CI = balance * (Math.pow((1+rate/100),2));
        balance+=CI;
        System.out.println("Interest added. Updated balace: " + balance );
    }
    
    void withdraw(double amount){
        char choice;

        
        if(balance < amount){
            System.out.println( "Account balance is lower than amount to be withdrawn" );
            return;
        }
        System.out.println("Approve " + cName + "'s request for withdrawal? (Y/N): ");
        choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            balance-=amount;
            System.out.println("Withdrawal approved. Updated balance: " + balance );
            calcInterest();
            checkMinAmount();
        }else{
            System.out.println( "Withdrawal not approved" );
        }
        
    }

    void checkMinAmount(){
        int minAmount = 500,penalty = 100;
        if(balance < minAmount){
            balance-=penalty;
            System.out.println( "Balance under minimum amount to be maintained." );
            System.out.println( "Penalty imposed. Updated balance: " + balance );
        }
    }
}



public class Labprog5 {
    public static void main(String[] args) {
        int c;
        double temp;

        String name,accNo,accType;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Name: ");
        name = sc.nextLine();
        System.out.println("\nEnter Account number: ");
        accNo = sc.nextLine();
        System.out.println("\nEnter Account Type: C-->Current Account    S-->Savings Account ");
        accType = sc.nextLine();
        
        if(accType.charAt(0) == 'c'){
            CurrentAcc a = new CurrentAcc(name, accNo, accType);
            while(true){
                System.out.println("1. Deposit money\n2. Withdraw money\n3. Display money\n4. Exit");
                c = sc.nextInt();
                switch(c){
                    case 1: {
                        System.out.println("\nEnter amount to be deposited: ");
                        temp = sc.nextDouble();
                        a.deposit(temp);
                        break;
                    }
                    case 2: {
                        System.out.println("\nEnter amount to be withdrawn: ");
                        temp = sc.nextDouble();
                        a.withdraw(temp);
                        break;
                    }
                    case 3: {
                        a.getBalance();
                        break;
                    }
                    case 4: {
                        System.exit(0);
                        break;
                    }
                    default: System.out.println("Enter the correct options");
                }
    
            }
            
        }else if(accType.charAt(0) == 's'){
            SavingsAcc a = new SavingsAcc(name, accNo, accType);
            while(true){
                System.out.println("1. Deposit \n2. Withdraw \n3. Display Balance\n4. Exit\n");
                c = sc.nextInt();
                switch(c){
                    case 1: {
                        System.out.println("\nEnter the amount to be deposited: ");
                        temp = sc.nextDouble();
                        a.deposit(temp);
            
                        break;
                    }
                    case 2: {
                        System.out.println("\nEnter amount to be withdrawn: ");
                        temp = sc.nextDouble();
                        a.withdraw(temp);
                        
                        break;
                    }
                    case 3: {
                        a.getBalance();
                        break;
                    }
                    case 4: {
                        System.exit(0);
                        break;
                    }
                    default: System.out.println("Enter the correct options");
                }
    
            }
            
        }else{
            System.out.println("Enter valid type... Exiting");
        }
    }
}