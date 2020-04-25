class ovrl2
{
    int a;
    float b;
    double c;
    void add(int a1)
    {
        a=a1;
    }
    void add(float b1)
    {
        b=b1;
    }
    void add()
    {
        c=a+b;
        System.out.print(c);
    }
    public static void main()
    {
        ovrl2 obj=new ovrl2();
        obj.add(3);
        obj.add(7.3f);
        obj.add();
    }
}
        
