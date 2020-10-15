/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javap;

class teammate
{
    static int x=10;
    static int y=15;
        static class radiant
        {
                public void display()
                {   
                        System.out.println("innerStatic class is done");
                           System.out.println(x);
                           System.out.println(y);
                }
        
        }
       public void dire()
       {
                
                radiant t=new radiant();
                t.display();
                        }
        



}

/**
 *
 * @author rahul
 */
public class staticInnerclass {
    
public static void main(String arg[])
{
        teammate t=new teammate();
       t.dire();
    
}


}
