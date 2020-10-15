/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javap;

/**
 *
 * @author rahul
 */
abstract class team{
   abstract void display();

}
class test
{
        public void testt()
        {
                
                //team t=new team(){public void display(){System.out.println("anyonomous is done");}};
                // t.display();
                 new team(){public void display(){System.out.println("anyonomous is done");}}.display();
                }



}




public class innerAnnyonmous {
    
    public static void main(String arg[])
            
    {
            test t=new test();
            t.testt();
        
    
    }


}
