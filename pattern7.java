import java.util.Scanner;// to print 1 12 123 1234 12345
class pattern7
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
            System.out.print(" "+j);
            
            System.out.println();
        }
    }
    public static void main()
    {
        pattern7 obj=new pattern7();
        obj.getData();
        obj.generatePattern();
    }
}
    
        