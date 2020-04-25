class ovrl3
{
    void area(int s)
    {
        int a=s*s;
        System.out.println(a);
    }
    void area(long l,long b)
    {
        long c=l*b;
        System.out.println(c);
    }
    void area(double r)
    {
        double d=3.14*r*r;
        System.out.print(d);
    }
    public static void main()
    {
        ovrl3 obj=new ovrl3();
        obj.area(5);
        obj.area(7,21);
        obj.area(4.9);
    }
}
   