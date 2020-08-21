import java.util.Scanner;
class num6
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
        
        int rev=0;
        while(n!=0)
        {
            rev=rev*10;
            rev=rev+(n%10);
            n=n/10;
        }
        System.out.println("The reverse of num="+rev);
    }
    public static void main()
    {
        num6 obj=new num6();
        obj.read();
        obj.digit();
    }
}
          
    
    