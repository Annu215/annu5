package Bank;
import static java.lang.System.exit;
import java.util.Scanner;

 class Bank
{
    private int account_no;
    String name,Address;
    float balance;

    Bank(int acc,String Name,String Addr)
    {
        account_no = acc;
        name = Name;
        Address= Addr;
        balance = 500;
    }

    void deposit()
    {
        float amt;
        System.out.println("Enter the amount to be deposited::");
        Scanner s = new Scanner(System.in);
        amt = s.nextFloat();
        balance += amt;

    }//end of deposit

    void withdraw()
    {
        float amt;
        System.out.println("Enter the amount to be withdrawn::");
        Scanner s = new Scanner(System.in);
        amt = s.nextFloat();
        if((balance-amt)>=500)
        {
            balance -= amt;
        }
        else
            System.out.println("***Insufficient balance***");
    }

    void transfer()
    {
        int acc1,acc2;
        float amt;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the account no. from which you want to transer money:\n");
        acc1 = s.nextInt();
        System.out.println("Enter the account no to which you want to transfer money:\n");
        acc2 = s.nextInt();
           
        System.out.println("Enter the amount to be transfered:");
        amt = s.nextFloat();
        
        /* acc1.balance = balance-amt;
           acc2.balance = balance+amt;
        */
    }   
    
    void totalamt()
    {
        System.out.println("The total amount is:");
    }
    
    void Richestperson()
    {
        
    }
    
    void Createacc()
    {
    }
            
        
}
/**
 *
 * @author annu
 */

 public class Bankdemo {
    
    public static void main(String[] args) {
    int choice;
    
    
    //for(i=0;i<n;i++)
    

       Bank b = new Bank(1,"Annu","CKD");
        /* {
             Bank b1 = new Bank(100,"Annu");
             Bank b2 = new Bank(101,"Abhi");
             Bank b3 = new Bank(102,"Pratiksha");
             Bank b4 = new Bank(103,"Vaishnavi");
             Bank b5 = new Bank(104,"Arpita");
             Bank b6 = new Bank(105,"Aaradhya");
             Bank b7 = new Bank(106,"Yojith");
             Bank b8 = new Bank(107,"Ankita");
             Bank b9 = new Bank(108,"Asma");
             Bank b10 = new Bank(109,"Sulochana");
        }*/
    
      
    do{
        System.out.println("ENTER");
        System.out.println("1.ADD ACCOUNT");
        System.out.println("2.DEPOSIT MONEY");
        System.out.println("3.WITHDRAW MONEY");
        System.out.println("4.TRANSFER MONEY");
        System.out.println("5.TOTAL MONEY IN BANK");
        System.out.println("6.RICHEST PERSON IN THE BANK");
        System.out.println("7.Exit");
        System.out.println("Enter your Choice :: ");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        switch(choice)
        {
            case 1: b.Createacc();
                    break;
                    
            case 2:b.deposit();
                   break;
            
            case 3:b.withdraw();
                   break;
                   
            case 4:b.transfer();
                   break;
                   
            case 5:b.totalamt();
                   break;
                   
            case 6:b.Richestperson();
                   break;
                   
            case 7: exit(0);
        }
    }while(choice!=7);

    }

  
}

   

   