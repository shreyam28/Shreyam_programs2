class date
{
    int dd,mm,yy;
    date()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    date(int d,int m,int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }
    public static void main()
    {
        date obj=new date(1,1,2014);
        System.out.println(obj.dd+"/"+obj.mm+"/"+obj.yy);
        date obj1=new date();
        System.out.println(obj1.dd+"/"+obj1.mm+"/"+obj1.yy);
    }
}
