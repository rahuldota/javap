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

class tv
{
        public void display()
        {
        
            System.out.println("tv");
        }
        public void switchOn()
        {
        
        System.out.println("Switch is on tv");
        
        }
            public void  switchOff()
            {
            tv t=new tv();
            t.display();
            System.out.println("switch off tv");
            }
}


class smartTv extends tv
{

@Override
public void display()
{
System.out.println("smarttv");

}
public void netflix()
{
System.out.println("netflix is here");
}
@Override
public void switchOn()
{
System.out.println("Smarttv switch on");

}




}
        
public class overridingAndDispatch {
    
public static void main(String arg[])

        
{
      /*  smartTv obj=new smartTv();
        obj.display();
        obj.switchOn();
        obj.netflix();
        obj.switchOff();
            */
        
        
        tv obj1=new smartTv();
        obj1.switchOff();
        obj1.switchOn();
        obj1.display();
        
        
       // display();        
         

}


}
