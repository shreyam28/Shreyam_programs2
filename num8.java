import java.util.Scanner;
class num8
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
        int min=n%10;
        int max=n%10;
        while(n!=0)
        {
            digit=n%10;
            if(digit>max)
            max=digit;
            if(digit<min)
            min=digit;
            
            n=n/10;
        }
        System.out.println("The largest digit="+max);
        System.out.println("The smallest digit="+min);
    }
    public static void main()
    {
        num8 obj=new num8();
        obj.read();
        obj.digit();
    }
}
          
    
    