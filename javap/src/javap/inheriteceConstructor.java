/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javap;


class rectanglee{
    
        private int length;
        private int breadth;
        
        
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
}

class cuboid extends rectanglee{

    private int height;
        public cuboid()
        {
            height=1;
            System.out.println("height " +height);
        }
        public cuboid(int a)
        {
            super(a);
            System.out.println("cuboid  "+a);
            
        }

}   
/**
 *
 * @author rahul
 */
public class inheriteceConstructor {
    
public static void main(String arg[])
{
            cuboid c=new cuboid(2);
        }

}
