/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;
class rectangle
{
    private int length;
    private int breadth;
    
    
    public void set(int l,int b)
    {
        if(l>0 && b>0)
        {
        length=l;
        breadth=b;
        }
        else
        {
        l=0;
        b=0;
        }
    }
    public int getlength()
    {
    
    return length;
    
    }
    public int getbreadth()
    {
    return breadth;
    
    
    }
    public int area()
    {
        return length*breadth;
    
    }
public int parameter()
{

    return 2*(length+breadth);

}



}
/**
 *
 * @author rahul
 */
public class getset {
    
public static void main(String arg[])
{   
       rectangle obj=new rectangle();
       
       
       obj.set(3, 4);
       System.out.println(obj.area());
       //System.out.println();
       System.out.println(obj.parameter());
        



}



}
