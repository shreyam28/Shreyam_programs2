import java.util.Scanner;//to print laterally inverted 1 12 123 1234 12345
class pattern10
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of Rows");
        n=sc.nextInt();
    }
    void generate()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print(" "+" ");
            
            for(int j=1;j<=i;j++)
            System.out.print(" "+j);
            
            System.out.println();
        }
    }
    public static void main()
    {
        pattern10 obj=new pattern10();
        obj.getData();
        obj.generate();
    }
}