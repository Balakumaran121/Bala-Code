//Methods

class methodex
{
    int a=5,b=10;
    void show()
    {
        System.out.println("A is:"+a+" "+"B is:"+b);
    }
    void add()
    {
        System.out.println("Add is:"+(a+b));
    }
    int sub()
    {
        int d=a-b;
        return d;
    }
    public static void main(String ar[])
    {
        methodex m=new methodex();
        m.show();
        m.add();
       int e= m.sub();
       System.out.println("E is:"+e);
    }
}