package tow_company;


import java.util.Scanner;

public class CostVehicles { 
  
    private int kubika;
    private int etos_kukloforias;
     private double kostos;
     
     public void setKubika(int kb)
  {
      kubika = ((kb>=49 && kb<10000)?kb:0);
  }
  public int getKubika()
  {
      return kubika;
  }
  
  public void setEtos_kukloforias(int ek)
  {
      etos_kukloforias= ((ek>0 && ek<2017)?ek:0);
  }
  public int getEtos_kukloforias()
  {
      return etos_kukloforias;
  }
  public void setKostos(double ks)
  {
      kostos=ks;   
  }
  public  double getKostos()
  {
      
      return kostos ;
  }
 
  
    public  double costvehicle(){
         
        Scanner input = new Scanner(System.in);    
        
        System.out.print("posa kubika einai to oxhma pou exeis: ");                 //ekxwrei kubika kai etos kukloforias gia amaksi
         setKubika(input.nextInt());
         System.out.print("ti etos kukloforise  to oxhma  pou exeis: ");
         setEtos_kukloforias(input.nextInt());
         if((etos_kukloforias==0)||(kubika==0))
          {
           while((etos_kukloforias==0)&&(kubika==0))
              {
             System.out.println("exeis dwsei lathos times, ksana dwse ");  
                                                                                              // elegxei ama oi times gia kubika einai panw apo 49 kai gia etos kukloforias na einai panw apo 0 
             System.out.print("posa kubika einai to oxhma  pou exeis: ");
             setKubika(input.nextInt());
             System.out.print("ti etos kukloforise to oxhma pou exeis: ");
             setEtos_kukloforias(input.nextInt());
             }
          }
      
       
       int kostos_kubika = 0;
       if (kubika<500){
            kostos_kubika=30;
        }
       else if (kubika>=500 && kubika<1000){             //kostos analoga me ta kubika 
            kostos_kubika=50;
        }
       else if (kubika>=1000 && kubika<1600){
            kostos_kubika=60;
        }
        else if (kubika>=1600 && kubika<2400){
            kostos_kubika=70;
        }
        else if (kubika>=2400 && kubika<4000){
            kostos_kubika=80;
        }
        else if (kubika>=4000){
            kostos_kubika=50;
        }
       int xronos= 2017-etos_kukloforias;
       
            kostos = kostos_kubika  + xronos*5;         
         
     return kostos;       
    }
  }
    

