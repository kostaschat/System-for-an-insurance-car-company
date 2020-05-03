package tow_company;
/**
 *
 * @author kwstas
 */
import java.util.Scanner;
public class Tow_Company {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);   
       Account acc1 = new Account();
       CostForSubscription cost = new CostForSubscription();
       double temp= 0;
       Incident inc = new Incident();
       int temp1=0;
       
       
       
       
        int apa=1;
       do{
    System.out.println("****************************************************");
     System.out.println("*              Exit ........................0     *");
    System.out.println("*               New Account press............1     *");                      // einai to menu pou tha emfanizetai gia na epilekseis ti theleis
    System.out.println("*               Enter to your account press..2     *");
    System.out.println("*               Cost for subscription........3     *");
    System.out.println("*               antimetopish problhmatous....4     *");
     System.out.println("****************************************************");
      System.out.print("dialekse apo to menu: ");        
               
              
    
         int apanthsh = input.nextInt(); 
         if(apanthsh==1){
             
             acc1.kataxwrish_stoixeiwn();
             acc1.captcha();
             acc1.date();
             temp1=acc1.getExei_acc();
             cost.cost(temp1);
             
             
             acc1.ekxwrish_pinaka(temp);
          } 
      
         if( apanthsh==2)
            acc1.loginToAccount();
          
        if (apanthsh==3)
        {
            
            
           cost.cost(temp1);
           
        }
        if (apanthsh==4)
        {
         inc.antimetopish_peristatikou();
        }
        if (apanthsh==0)
        {
            apa=0;
        }
            
         
       }while(apa!=0);
           
         }
    }


