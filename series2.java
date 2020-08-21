import java.util.Scanner;
class series2
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void compute()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
          if(i%2==0)
          sum=sum-i;
          else
          sum=sum+i;
        }
        System.out.println("the sum of series="+sum);
    }
    public static void main()
    {
        series2 ob=new series2();
        ob.input();
        ob.compute();
    }
}
        
    