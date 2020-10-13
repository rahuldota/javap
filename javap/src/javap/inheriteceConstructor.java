/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javap;


class rectanglee{
    
        public int length;
        public int breadth;
        
        
       public rectanglee()
               {
                   length=1;
                   breadth=1;
               System.out.println("length, breadth "+length+breadth);
               }
       public rectanglee(int a)
       {
       System.out.println("rectangle" +a);
       
       }
       public rectanglee(int a , int b)
       {
           length=a;
           breadth=b;
           System.out.println("length,breadth "+a +" " +b);
       }
}

class cuboid extends rectanglee{

    private int height;
        public cuboid()
        {
            
            super(3);
           // super();
            
            height=1;
            System.out.println("height " +height);
        }
        public cuboid(int a)
        {
             super(a);
            System.out.println("cuboid  "+a);
           
        }
        public cuboid(int a, int b, int c)
        {
            super(a,b);
            height=c;
            System.out.println("height" +height);
        
        }
        public void volume()
        {
        
        System.out.println("volume is" + length*breadth*height);
        }

}   
/**
 *
 * @author rahul
 */
public class inheriteceConstructor {
    
public static void main(String arg[])
{
           // cuboid c=new cuboid(1,2,3);
           //cuboid c=new cuboid(1);
            cuboid c=new cuboid();

//c.volume();
            
        }

}
