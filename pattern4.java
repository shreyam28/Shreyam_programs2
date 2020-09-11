import java.util.Scanner;// to print 55555 54444 54333 54322 54321
class pattern4
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Value of n");
        n=sc.nextInt();
    }
    void generatePattern()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(" "+(n-(j-1)));
            
            for(int j=1;j<=n-i;j++)
            System.out.print(" "+(n-(i-1)));
            
            System.out.println();
    }
}
    public static void main()
    {
        pattern4 obj=new pattern4();
        obj.getData();
        obj.generatePattern();
    }
}