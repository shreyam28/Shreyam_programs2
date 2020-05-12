class student
{
    void name(String a)
    {
        System.out.println(a);
    }
    void roll_no(int n)
    {
        System.out.println(n);
    }
    void marks(double b,double c,double d,double e,double f)
    {
        double ans=((b+c+d+e+f)/500)*100;
        System.out.println("Marks is"+"\t"+ans);
        if(ans>=90)
        {
            System.out.println("Science with Computers");
        }
        else if((ans>=80)&&(ans<=89))
        {
            System.out.println("Science without Computers");
        }
        else if((ans>=70)&&(ans<=79))
        {
            System.out.println("Commerce with Maths");
        }
        else
        {
            System.out.println("Commerce without Maths");
        }
    }
    public static void main()
    {
        student obj=new student();
        obj.name("SHREYAM RAJ");
        obj.roll_no(34);
        obj.marks(99,100,98,100,100);
    }
}
    
        