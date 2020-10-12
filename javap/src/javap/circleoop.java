/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

/**
 *
 * @author rahul
 */
class circle
{
    public double radius;
    public double area()
    {
    return 3.14*radius*radius;
    }
    public double parameter()
    {
    return 2*3.14*radius;
    }


}

public class circleoop {
    

    public static void main(String arg[])
    {
                
               circle obj=new circle();
               obj.radius=7;
               System.out.println(obj.area());
               System.out.println();
               System.out.println(obj.parameter());
    
    
    }


}
