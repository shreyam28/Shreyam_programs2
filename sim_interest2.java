class sim_interest2
{
    double p1,r1,t1,si;
    void init(double p,double r,double t)
    {
        p1=p;
        r1=r;
        t1=t;
    }
    void calc()
    {
        si=(p1*r1*t1)/100;
    }
    void dis()
    {
    System.out.print(si);
}
}
    
        
        
    