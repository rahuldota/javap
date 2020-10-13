/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

class product{

       private int itemno;
       private String name;
       private double price;
       private int qty;
       
       public int getItemno()
       {
           return itemno;
       }
       public String getName()
       {
           return name;
       }
       public void setName(String n)
       {
           name=n;
       }
       public double getPrice()
       {
           return price;
       
        }
    
       public int getQty()
       {
       
           return qty;
       }
       public void setQty(int q)
       {
       
       qty=q;
       }
       
       public product()
       {
           itemno=123;
           name="binod";
           price=40;
           qty=2;
       
       }
          public product(int i,String n,double p,int q)
       {
       itemno=i;
        name=n;
       price=p;
       qty=q;
       
       }


}
/**
 *
 * @author rahul
 */
public class constructor2 {
    
}
