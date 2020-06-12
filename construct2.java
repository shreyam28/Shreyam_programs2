class construct2
{
    double r,pi,area;
    construct2()
    {
        r=21;
        pi=3.14;
    }
    void mai()
    {
        area=pi*r*r;
        System.out.println(area);
    }
    public static void main()
    {
        construct2 a=new construct2();
        a.mai();
    }
}
    