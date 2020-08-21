import java.util.Scanner;
class num5
{
    int num;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
    }
    void digit()
    {
        int n=num;
        int digit=-1;
        int sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum=sum+(digit*digit);
            n=n/10;
        }
        System.out.println("The square of sum of digits of num="+sum);
    }
    public static void main()
    {
        num5 obj=new num5();
        obj.read();
        obj.digit();
    }
}
          
    
    