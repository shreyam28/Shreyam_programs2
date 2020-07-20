import java.util.Scanner;
class practise
{
    int acc_num,daysLate;
    String title,author;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        author=sc.nextLine();
        title=sc.nextLine();
        acc_num=sc.nextInt();
    }
    void compute(int d)
    {
        daysLate=d;
        if(daysLate>15)
        {
            daysLate=2*(daysLate-15);
            System.out.println("Fine charged:"+daysLate);
        }
        else
        {
            System.out.println("No fine charged");
        }
    }
    void display()
    {
        System.out.println("Accession number:"+acc_num+"\t"+"Title:"+title+"\t"+"Author:"+author);
    }
    public static void main()
    {
        practise obj=new practise();
        obj.input();
        obj.compute(22);
        obj.display();
    }
}
        
        
        
        
    
    