import java.util.Scanner;// to print ***** **** *** ** * 
class pattern12
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
            for(int j=1;j<=i-1;j++)
            System.out.print(" "+" ");
            for(int j=1;j<=(n-(i-1));j++)
            System.out.print(" "+"*");
            System.out.println();
        }
    }
    public static void main()
    {
        pattern12 obj=new pattern12();
        obj.getData();
        obj.generatePattern();
    }
}
    
        