import java.util.Scanner;// to print 1 11 111 1111 11111
class pattern9
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
            System.out.print(" "+1);
            
            System.out.println();
        }
    }
    public static void main()
    {
        pattern9 obj=new pattern9();
        obj.getData();
        obj.generatePattern();
    }
}
    
        