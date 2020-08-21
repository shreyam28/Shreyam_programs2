import java.util.Scanner;
class series5
{
    double n,x;
    double m=n+1;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("VALUE OF n=");
        n=sc.nextInt();
        System.out.println("VALUE OF x=");
        x=sc.nextInt();
    }
    void compute()
    {
        double s,p=1;
        double sum=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                p=p*j;
            }
            s=Math.pow(x,i);
            sum=sum+(s/p);
        }
        System.out.println("The sum of series="+sum);
    }
    public static void main()
    {
        series5 m=new series5();
        m.input();
        m.compute();
    }
}
        
        
        