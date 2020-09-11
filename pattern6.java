import java.util.Scanner;// to print 54321 5432 543 54 5
class pattern6
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
            System.out.print(" "+(n-(j-1)));
            
            System.out.println();
        }
    }
    public static void main()
    {
        pattern6 obj=new pattern6();
        obj.getData();
        obj.generatePattern();
    }
}
    
        