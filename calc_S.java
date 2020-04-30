class calc_S
{
    int S,u,t,a;
    void displacement()
    {
        u=20;
        t=1200;//since time is in minutes,it has to be converted in seconds or the answer will go wrong
        a=10;
        S=u*t+1/2*(a*t*t);
        System.out.println(S+"\t"+"metre");
    }
    public static void main()
    {
        calc_S obj=new calc_S();
        obj.displacement();
    }
}
        
        