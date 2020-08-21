import java.util.Scanner;
class num4
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
        int average=0;
        int count=0;
        while(n!=0)
        {
            digit=n%10;
            count++;
            average=(average+digit)/3;
            n=n/10;
        }
        System.out.println("The average of digits of num="+average);
    }
    public static void main()
    {
        num4 obj=new num4();
        obj.read();
        obj.digit();
    }
}
          
    
    