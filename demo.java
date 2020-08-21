import java.util.Scanner;
class demo
{
    int n,x;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=sc.nextInt();
    }
    void compute()
    {
        double sum=0;
        int s=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                s=s*j;
            }
            sum=Math.pow(x,i)/s;
        }
        System.out.println("Sum of series="+sum);
    }
    public static void main()
    {
        demo o=new demo();
        o.input();
        o.compute();
    }
}