import java.util.Scanner;
class series4
{
    double n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("value of n=");
        n=sc.nextInt();
    }
    void compute()
    {
        double s=1;
        double p=1;
        double sum=0;
        for(int i=2;i<=n;i++)
        {
            s=s+i;
            p=p*i;
            sum=sum+(s/p);
        }
        System.out.println("the sum of series="+sum);
    }
    public static void main()
    {
        series4 a=new series4();
        a.input();
        a.compute();
    }
}