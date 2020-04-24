class average1
{
    double phy,chem,maths,avg;
    void init()
    {
        phy=99;
        chem=100;
        maths=100;
    }
    void calc()
    {
        avg=(phy+chem+maths)/3;
    }
    void dis()
    {
        System.out.print(avg);
    }
}
    
