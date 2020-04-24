class sim_interest3
{
    double p,r,t,si;
    void init()
    {
        p=2000;
        r=2.5;
        t=5;
    }
    void calc()
    {
        si=(p*r*t)/100;
    }
    void disp()
    {
        System.out.print(si);
    }
    public static void main()
    {
        sim_interest3 obj=new sim_interest3();
        obj.init();
        obj.calc();
        obj.disp();
    }
}
