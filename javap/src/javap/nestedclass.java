/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javap;

class heloo
{
    int x=10;
    
    int y=15;
    
    class boy
    {
        
             void displayy()
             {
                 System.out.println("nested is done");
                 System.out.println("value of x\n"+x);
             
             }
    
    
    }
    public void outer()
    {
        int t=8;
                  boy b=new boy();
                  b.displayy();
            
    
    }


}


/**
 *
 * @author rahul
 */
public class nestedclass {
    

public static void main(String arg[])
{
       // heloo h=new heloo();
       // h.outer();
        
       heloo.boy i=new heloo().new boy();
    
        i.displayy();

    }

}
