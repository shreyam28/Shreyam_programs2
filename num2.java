import java.util.Scanner;
class num2
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
        
        int count=0;
        while(n!=0)
        {
            
            count=count++;
            n=n/10;
        }
        System.out.println("The count of digits of num="+count);
    }
    public static void main()
    {
        num2 obj=new num2();
        obj.read();
        obj.digit();
    }
}
          
    
    