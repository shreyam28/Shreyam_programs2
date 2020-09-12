import java.util.Scanner;// to print * ** *** **** ***** **** *** ** *
class pattern13
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("VALUE OF N ");
        n=sc.nextInt();
    }
    void generatePattern()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(" "+"*");
            
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=2;j<=(n-(i-1));j++)
            System.out.print(" "+"*");
            
            System.out.println();
        }
    }
    public static void main()
    {
        pattern13 obj=new pattern13();
        obj.getData();
        obj.generatePattern();
    }
}
    
        