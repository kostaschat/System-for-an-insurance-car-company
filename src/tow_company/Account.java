
package tow_company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Account   {
    
    //  dilwsh twn metablhtwn
     
   private String userName;
   private String userEmail;
   private String password ;
   private String passwrd1;
   private String passwrd2;
   private String callNumber; 
   private int exei_acc;
   
   public int getExei_acc()
   {
       return exei_acc;
   }
           
  public void setName(String name)
  {
      userName = name;
  }
  public String getName()
  {
      return userName;
  }
  public void setEmail(String email)
  {
      userEmail = email;
  }
  public String getEmail()
  {
      return userEmail;
  }
  
  public void setPassword1(String pass1)
  {
      passwrd1 = pass1;
  }
  public String getPassword1()
  {
      return passwrd1;
  }
  
  public void setPassword2(String pass2)
  {
      passwrd2 = pass2;
  }
  public String getPassword2()
  {
      return passwrd2;
  }

  public void setPassword(String passwrd)
  {
        password = passwrd;
  }
  public String getPassword()
  {
      return password;
  }
  
  public void setCall(String number)
  {
   callNumber=number;    
  }
  public String getCall()
  {
      return callNumber;
  }
  
  
  
  public void kataxwrish_stoixeiwn()
{
       
       Scanner input = new Scanner(System.in);        // diabazei to onoma tou xrhsth 
       System.out.print("Dwse to onoma sou: ");
       setName(input.nextLine());
      
       System.out.print("Dwse to email sou: ");
       setEmail(input.nextLine());                       // diabazei to email  tou xrhsth 
      exei_acc=1;
       
       int k=0;
       do{
         System.out.print("Dwse ena kwdiko gia ton logariasmo sou: ");
         setPassword1(input.nextLine());                                                 //dinei  o xrhsths kwdiko kai elegxei an einai idios 
                                                                                          
         System.out.print("ksana grapse   ton kwdiko tou  logariasmo sou: ");
         setPassword2(input.nextLine());
           
       if (passwrd1.equals(passwrd2))
               
       {
          setPassword(getPassword1());
          k=1;
          System.out.println("o kwdikos einai egkuros");
          
       }
       else
        {
          System.out.print("o kwdikos pou edwses den tairiazei, ");
          while(passwrd1.equals(passwrd2)){
          setPassword1(input.nextLine());
          System.out.print("ksana grapse   ton kwdiko tou  logariasmo sou: ");
          setPassword2(input.nextLine());
        }
        }
       }while(k==0);
       
       System.out.print("dwse ton arithmo tou thlefonou sou: ");
       setCall(input.nextLine());
       String numberOnly;                                        
       numberOnly = callNumber.replaceAll("[^0-9]", "");              //gia na pernei mono arithmous kai oxi grammata
       
       System.out.println(getName());
       System.out.println(getEmail());
       System.out.println(numberOnly);                 // ektupwnei to onoma email  passw
       
       System.out.println(getPassword());
       
    }
 public String generateCaptcha() {
        
  Random random = new Random();
  int length = 5;
  
  StringBuffer captchaStringBuffer = new StringBuffer();
  for (int i = 0; i < length; i++) {
      
   int captchaNumber = Math.abs(random.nextInt()) % 60;
   int charNumber = 0;
   
   if (captchaNumber < 26) {
         charNumber = 65 + captchaNumber;
   }
   else if (captchaNumber < 52){
         charNumber = 97 + (captchaNumber - 26);
   }
   else {
         charNumber = 48 + (captchaNumber - 52);
   }
         captchaStringBuffer.append((char)charNumber);
  }

  return captchaStringBuffer.toString();
  
  }
 public void date()
    {
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      System.out.print("hmeromhnia egrafhs einai: "); 
      System.out.println(dateFormat.format(date)); 
    }
  
    
    public void captcha() {
        Scanner input = new Scanner(System.in);   
        String str =generateCaptcha();
      System.out.println(str);
      System.out.println("grapse to parapanw mnm");
      String str1=input.nextLine();
     if (str.equals(str1))
         System.out.println("einai swsto");
     
     else{
         while(!(str.equals(str1))){
          System.out.println(str);
          System.out.println("grapse to parapanw mnm");
          System.out.println("einai lathos auto pou egrapses, ksana prospathise ");
          str1=input.nextLine();
      }
       System.out.println("einai swsto");  
    }
     System.out.println("h egrafh oloklhrwthike");  
    }
      public void loginToAccount()
      {
          Scanner input = new Scanner(System.in); 
        System.out.println("grapse to onoma");
         String onoma =input.nextLine();
         System.out.println("grapse to kwdikos");
         String kwdikos =input.nextLine();
           
         System.out.println(userName);
         
         
         
          if((onoma.equals(userName)) && (kwdikos.equals(password))){
           System.out.println("exeis sundethh me ton profil sou");   
          
          
          }else {
              while(!((onoma.equals(userName)) && (kwdikos.equals(password))))  { 
          System.out.println("den exeis dwsei swsta stoixeia, ksana prospathise ");
          System.out.println("grapse to onoma");
           onoma =input.nextLine();
          System.out.println("grapse to kwdikos");
          kwdikos =input.nextLine();
          
              }
              System.out.println("exeis sundethh me ton profil sou");  
          }
          
      }

public void ekxwrish_pinaka(double kostos)
{
    Scanner input = new Scanner(System.in); 
    
    int grammes=0;
   String pin_pelatwn[][]=  new String[grammes+1][5];
    pin_pelatwn[grammes][1]=userName;
    System.out.println(pin_pelatwn[grammes][1]);
    pin_pelatwn[grammes][2]=password;
     System.out.println(pin_pelatwn[grammes][2]);
   
   System.out.println("theleis na kaneis shmbolaio gia 6 mhnes h gia 12 mhnes? \n an theleis gia 6 mhnes pata 6 alliws pata 12  \n an den exeis apofasisei pata 0");
      int apanthsh=input.nextInt();
     if (apanthsh==6)  {      
     pin_pelatwn[grammes][3]=String.valueOf(kostos);
    System.out.println(pin_pelatwn[grammes][3]);
     }
     else if(apanthsh==12)
     {
       pin_pelatwn[grammes][3]=String.valueOf(1.5*(kostos));
    System.out.println(pin_pelatwn[grammes][3]);  
     }
     else if (apanthsh==0)
     {
         
     }
            
            
            
 
     
}


} 
     
     



  


    
    
