import java.util.Scanner;//to print A bb CCC dddd EEEEE
class pattern3
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
        char ch=64;
        for(int i=1;i<=n;i++)
        {
            ch++;
            if(i%2!=0)
            for(int j=1;j<=i;j++)
            System.out.print(" "+ch);
            else
            for(int j=1;j<=i;j++)
            System.out.print(" "+Character.toLowerCase(ch));
            
            System.out.println();
        }
        }
    
    public static void main()
    {
        pattern3 obj=new pattern3();
        obj.getData();
        obj.generatePattern();
    }
}