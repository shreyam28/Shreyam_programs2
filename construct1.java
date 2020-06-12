class construct1
{
    double p,t,r,si;
    construct1()
    {
        p=10000;
        t=2;
        r=5;
    }
    void st()
    {
        si=(p*r*t)/100;
        System.out.print(si);
    }
    public static void main()
    {
        construct1 obj=new construct1();
        obj.st();
    }
}
        
    
    
