import java.util.Scanner;
class series3
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Value of n=");
        n=sc.nextInt();
    }
    int fact(int m)
    {
        int prod=1;
        for(int i=1;i<=m;i++)
        {
            prod=prod*i;
        }
        return prod;
    }
    void compute()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            sum=sum-fact(2*i);
            else
            sum=sum+fact(2*i);
        }
        System.out.println("the sum of the series="+sum);
    }
    public static void main()
    {
        series3 o=new series3();
        o.input();
        o.compute();
    }
}
            
