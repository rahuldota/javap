/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

interface member
{

         public void callback();
         
}

class store
{
    member mem[]=new member[100];
    
    int count=0;
    public void register(member m)
    {
        mem[count++]=m;
    
    }
    public void festive()
    {
        for(int i=0;i<count;i++)
        {
                mem[i].callback();
                
        
        }
    
    }
}
  class customer implements member
{
           String name;
           
           public customer(String name)
           {
               this.name=name;
               
  }
                
    @Override        
            public void callback()
            {
            System.out.println("name" +name+"is ready to go");
           
            
            }
            
            
           
            
                   
            
            
       }
/**
 *
 * @author rahul
 */
public class interfacecallback {
    
    
    public static void main(String arg[])
    {
    
            store s=new store();
            customer c1=new customer("jack");
            customer c2=new customer("smith");
            
            s.register(c2);
            s.register(c1);
            s.festive();
            
           


                    }
                    }
