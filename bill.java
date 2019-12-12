/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author dequn_teng_local
 */
public class bill {
     private int billID;
     private String billName;
     private customer billCustomer; 
     private double billAmount;
     
     
     public int getBillID() 
     {
        return billID;
     }
      public  String getBillName() 
     {
        return billName;
     }
       public  customer getBillCustomer() 
     {
        return billCustomer;
     }
       
      public  double getBillAmount() 
     {
        return billAmount;
     }
    
      public void setBillID(int a)
      {
          billID=a;
      }
      
      public void setBillName(String a)
      {
          billName=a;
      }
      public void setBillCustomer(customer a)
      {
          billCustomer=a;
      }
      public void setBillAmount(double a)
      {
          billAmount=a;
      }
}
