import java.util.Scanner;// to print 12345 1234 123 12 1
class pattern5
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
            for(int j=1;j<=(n-(i-1));j++)
            System.out.print(" "+j);
            
            System.out.println();
        }
    }
    public static void main()
    {
        pattern5 obj=new pattern5();
        obj.getData();
        obj.generatePattern();
    }
}
    
        