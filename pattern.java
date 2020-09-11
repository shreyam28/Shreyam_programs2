import java.util.Scanner;//to print floyd's triangle
class pattern
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
        int a=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                a++;
                System.out.print(" "+a);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern obj=new pattern();
        obj.getData();
        obj.generatePattern();
    }
}