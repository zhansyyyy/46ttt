class B
{
    private int l;
    B(int l){this.l = l;}
    B(){}
    B(String s)
    {
        System.out.println("B "+s);
    }
    int get ()
    {
        return l;
    }
}

interface C{
    void get();
}

public class Outer {
    Outer(){ System.out.println("OuterClass Object!");}
    private class  Inner1 { private  Inner1(String s){ System.out.println(s); }}
    static class Inner2 extends B
    {
        int l;
        Inner2(int ll,int r)
        {
           // super(ll);
            super(ll);
            this.l = r;
            System.out.println(l+" "+get());
        }
    }
    public static void  main(String[] args)
    {
        Outer ob= new Outer();
        Inner1 ib1 = ob.new Inner1("InnerClass1 Object!");
        Inner2 ib2=new Inner2(3,2);
    }
}
