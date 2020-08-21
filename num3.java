import java.util.Scanner;
class num3
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
        int prod=1;
        while(n!=0)
        {
            digit=n%10;
            prod=prod*digit;
            n=n/10;
        }
        System.out.println("The product of digits of num="+prod);
    }
    public static void main()
    {
        num3 obj=new num3();
        obj.read();
        obj.digit();
    }
}
          
    
    