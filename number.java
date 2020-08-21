import java.util.Scanner;
class number
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
            digit=num%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("The sum of digits of num="+sum);
    }
    public static void main()
    {
        number obj=new number();
        obj.read();
        obj.digit();
    }
}
          
    
    