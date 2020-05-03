
package tow_company;


import java.util.Scanner;
 

public class CostForSubscription extends CostVehicles {
    private int oxhma;

    private void setOxhma(int ox)
  {
      oxhma = ox;
  }
  public int getOxhma()
  {
      return oxhma;
  }

  public  void cost(int exei_acc){
      Account acc1 = new Account();   
        CostVehicles costv =new CostVehicles();
         
        Scanner input = new Scanner(System.in);    
        System.out.print("exeis mixanh h amaksi h fortigo? ");
      
        String apanthsh=input.nextLine();
          if(!((apanthsh.equals("amaksi"))|| (apanthsh.equals("mixanh"))||(apanthsh.equals("fortigo")))){
             do{
            System.out.print(" prepei na dialekseis ena apo ta tria ");
           
             apanthsh=input.nextLine(); 
             }while(!(apanthsh.equals("amaksi")||(apanthsh.equals("mixanh"))||apanthsh.equals("fortigo")));
          }  
          
       if(apanthsh.equals("amaksi")){
         costv.costvehicle();
         
         setOxhma(1);
         
          
      
       }
       if(apanthsh.equals("mixanh")) 
       { 
           costv.costvehicle();
           setOxhma(2);
       }
       if(apanthsh.equals("fortigo")) 
       { 
           costv.costvehicle();
           setOxhma(3);
       }
               
         
         
           
        System.out.println("to kostos ths asfaleias gia to oxhma gia 6 mhnes einai: " +costv.getKostos());
        
        
             
        System.out.println("kai to kostos ths asfaleias gia to oxhma gia 12 mhnes einai: " +(1.5*costv.getKostos()));               //ektupwnei to kostos ths asfaleias tou
       
          acc1.ekxwrish_pinaka(costv.getKostos());
        if(exei_acc==0){
        System.out.println("gia na kaneis thn asfaleia tha xreiastei na kaneis logariasmo \n an  theleis na kaneis pata to 1 alliws ama exeis hdh pata 2");
                  
        
          int apant=input.nextInt();
          if (apant==1)
          {
                                                                                   //dhmiourgei logariasmo
              
             acc1.kataxwrish_stoixeiwn();
             acc1.date();
             acc1.captcha();
             acc1.ekxwrish_pinaka(costv.getKostos());
          
        }
        }
          
             
          
              
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
    }
    
    
    

  

}