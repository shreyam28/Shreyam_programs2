import java.util.Scanner;
class num1
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
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("The sum of digits of num="+sum);
    }
    public static void main()
    {
        num1 obj=new num1();
        obj.read();
        obj.digit();
    }
}
          
    
    