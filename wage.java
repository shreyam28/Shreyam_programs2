import java.util.Scanner;
class wage
{
    double s,hrs;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        hrs=sc.nextInt();
    }
    void calc()
    {
        if(hrs<=35)
        {
            s=1*s;
            System.out.println("Weekly Salary="+s);
        }
        else if(hrs>35&&hrs<=60)
        {
            s=1.5*s;
            System.out.println("Weekly Salary="+s);
        }
        else if(hrs>60&&hrs<=70)
        {
            s=2*s;
            System.out.println("Weekly Salary="+s);
        }
        else
        {
            System.out.println("Weekly Salary="+2*s+"Cannot work for more than 70 hours a week");
        }
    }
    public static void main()
    {
        wage obj=new wage();
        obj.input();
        obj.calc();
    }
}