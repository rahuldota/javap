/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;
import java.lang.*;
import java.util.*;

class test
{
        public void testt()
        {
              abstract  class test2{
                            
         
                    public void methodd()
                    {
                    System.out.println("inner local loop is done");
                    }
                    
                
                }
              class test3 extends test2{}
              
              test3 t=new test3();
            t.methodd();
              
                  
            
            
              
        }
    


}
/**
 *
 * @author rahul
 */
public class innerLocalClass {
    
public static void main(String arg[])
{
            test t=new test();
            t.testt();
            

}


}
