import java.util.Scanner;// to print 1 23 345 4567 5678
class pattern2
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
            a=i;
            for(int j=1;j<=i;j++)
            {
                
                
                System.out.print(" "+(a++));
            }
            System.out.println();
        }
    }
    public static void main()
    {
        pattern2 obj=new pattern2();
        obj.getData();
        obj.generatePattern();
    }
}