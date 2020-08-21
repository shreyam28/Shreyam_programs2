class calc2
{
    double a,b,ans;
    char ch;
    calc2(double a1,double b1,char c)
    {
        a=a1;
        b=b1;
        ch=c;
    }
    void method()
    {
        switch(ch)
        {
            case'/':
            ans=a/b;
            System.out.println("DIVISION IS:"+ans);
            break;
            case'*':
            ans=a*b;
            System.out.println("MULTIPLICATION IS:"+ans);
            break;
            case'+':
            ans=a+b;
            System.out.println("ADDITION IS:"+ans);
            break;
            case'-':
            ans=a-b;
            System.out.println("SUBTRACTION IS"+ans);
            break;
            default:
            System.out.println("INVALID");
            break;
        }
    }
    public static void main()
    {
        calc2 obj=new calc2(25,2,'*');
        obj.method();
    }
}
            
            
    