import java.util.Scanner;
class num7
{
    int num;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
    }
    void compute()
    {
        int n=num;
        int digit=0;
        int sum=n%10;
        while(n!=0)
        {
            digit=n%10;
            
            n=n/10;
        }
        sum=sum+digit;
        System.out.println("The sum of first and last digits of num="+sum);
    }
    public static void main()
    {
        num7 obj=new num7();
        obj.read();
        obj.compute();
    }
}
          
    
    