/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

class cylinder
{
    private double radius;
    private double height;
    
    public cylinder()
    {
          radius=1;
          height=1;
          
    
    }
    public cylinder(double r,double h)
    {
        radius=r;
        height=h;
    
    }
   public double area()
   {
   
   return 2*3.14*radius*height;
   }
   public double volume()
   {
   
   return 3.14*radius*radius*height;
   
   }
}
/**
 *
 * @author rahul
 */
public class constructor {
   
    
    public static void main(String arg[])
    {   
        cylinder obj=new cylinder();
       // cylinder obj=new cylinder(2,5);
            
          System.out.println(obj.volume());
          System.out.println(obj.area());
    
    
    }




}
