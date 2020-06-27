class rainfall
{
    double r1,r2,r3,avg;
    rainfall()
    {
        r1=12.0;
        r2=14.0;
        r3=8.0;
        avg=(r1+r2+r3)/3.0;
    }
    public static void main()
    {
        rainfall obj=new rainfall();
        System.out.println("Rainfall for April-"+"\t"+obj.r1);
        System.out.println("Rainfall for May-"+"\t"+obj.r2);
        System.out.println("Rainfall for June-"+"\t"+obj.r3);
        System.out.println("Average Rainfall"+"\t"+obj.avg);
    }
}