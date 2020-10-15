
  

//package interfacepractice;

interface Test
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
   /* public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
*/
    default void meth3()
    {
    System.out.println("something is wrong here");
    }
   // public abstract void meth3();
}

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
    public void meth3(){System.out.println("hello boy");}
}
public class interfaccDo 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);
        My obj=new My();
        obj.meth3();
      // Test.meth3();
        
    }
}

