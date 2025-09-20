import java.util.*;
class BankAccount{
    long accountno = (long)(Math.random()*1000000000000L);
    String accHolder_name;
    double balance;
    String dob;
    String f_name ;
    long mobile_no;
    double amount;
    String address;

    public void inputDetails( Scanner scan ){
        scan.nextLine();
        System.out.print("Enter the your name : ");
        accHolder_name = scan.nextLine();
        System.out.print("enter your father  name : ");
        f_name = scan.nextLine();
        System.out.print("enter your Date of birth : ");
        dob = scan.nextLine();
        System.out.print("enter the Address: ");
        address = scan.nextLine();
        System.out.print("enter the mobile number :");
        mobile_no = scan.nextLong();
        
        scan.nextLine();

    }
    
    public void create(double amount ){
        balance +=amount;
        
        System.out.println("Account created successfully!");
        System.out.println("Account number is "+accountno);
        System.out.println();
    }

    public void  deposit(double amount)
    {
        if(amount>0){
            balance += amount;
            System.out.println("Deposited amount "+amount);
            System.out.println("balance  "+balance);
        }
        else
           System.out.println("deosited amount must be greater than 0");
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println("Withdraw amount "+amount);
            System.out.println("balance  "+balance);
        }
        else
           System.out.println("Insufficient balance...");
    }

    public void checkBalance(){
        System.out.println("Balance : "+balance);
    }

    public void displayDetails(){
       System.out.println("--------------Account Details----------------- ");
        System.out.println("Account number : "+accountno);
        System.out.println("Account HolderName : "+accHolder_name);
        System.out.println("father name :"+f_name);
        System.out.println("Date of Birth : "+dob);
        System.out.println("Address : "+address);
        System.out.println("Account balance  :"+balance);
        System.out.println();
    }
}

public class bankaccprog1 {
    public static void main(String[] args)
{  
    Scanner scan = new Scanner(System.in);
    BankAccount bank = new BankAccount();
    System.out.println("\nWELCOME TO STATE BANK OF INDIA ");
   
    while(true){
        System.out.println("----------------------------------------");
        System.out.println("1. create Account \n2.Deposit \n3.Withdraw \n4.Check balance\n5.manage account \n6.Exit");
        System.out.print("enter the choice :" );
        int ch = scan.nextInt();

        if(ch==1){
           bank.inputDetails(scan);
           System.out.print("Enter the  initial amount to deposit :");
           double amount = scan.nextDouble();
           bank.create(amount);
           bank.displayDetails();

        }
        
        else if(ch==2){
            System.out.print("enter the amount to deposit :");
            double amount = scan.nextInt();
            bank.deposit(amount);
        }

        else if(ch==3){
             System.out.print("enter the amount to withdraw :");
            double amount = scan.nextInt();
            bank.withdraw(amount);
        }
        else if(ch==4){
            System.out.println(" ---------------Check the balance------------------ ");
            bank.checkBalance();
        }
        else if(ch==5){
            bank.displayDetails();
        }
        else if(ch==6){
            System.out.println("Exit............");
            break;
        }
    }

    
}  
    
}
