class sim_interest
{
    double p,t,r,SI;
    void init()
    {
        p=2000;
        r=3.5;
        t=2;
    }
    void calc()
    {
        SI=(p*r*t)/100;
    }
    void dis()
    {
        System.out.print(SI);
    }
}