package project;
  
import java.util.Scanner;  

public class ATMExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //declare and initialize balance, withdraw, and deposit  
		        int  Total_Balance =500000;
		        int Withdraw;
		        int Deposit;  
		         
		        Scanner sc = new Scanner(System.in);  
		          
		        while(true)  
		        {  
		            System.out.println("Automated Teller Machine");  
		            System.out.println("1.Withdraw Money:");  
		            System.out.println("2.Deposit:");  
		            System.out.println("3.Check Total Balance:");  
		            System.out.println("4.EXIT");  
		            System.out.print("Enter the operation:");  
		              
		             
		            int choice = sc.nextInt();  
		         switch(choice)  
		         {  
		         case 1:  
		        System.out.print("Enter money to be withdrawn:");  
		                      
		        Withdraw = sc.nextInt();  
		                      
		        if(Total_Balance >= Withdraw)  
		        {  
		        	Total_Balance = Total_Balance - Withdraw;  
		            System.out.println("Please collect your money");  
		        }  
		        else  
		        {  
   
		            System.out.println("Insufficient Balance");  
		        }  
		        System.out.println("");  
		        break;  
		   
		        case 2:  
		                      
		        System.out.print("Enter money to be deposited:");  
		                      
		        Deposit = sc.nextInt();  
		         
		        Total_Balance = Total_Balance + Deposit;  
		        System.out.println("Your Money has been successfully depsited");  
		        System.out.println("");  
		        break;  
		   
		        case 3:  
		         
		        System.out.println("Balance : "+Total_Balance);  
		        System.out.println("");  
		        break;  
		   
		         case 4:  
		        
		        System.exit(0);  
		            }  
		        }  
	}

}
