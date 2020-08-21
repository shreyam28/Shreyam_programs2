class calc
{
    double a,b,ans;
    char ch;
    calc(double a1,double b1,char c)
    {
        a=a1;
        b=b1;
        ch=c;
    }
    void method()
    {
        if(ch=='/')
        {
            ans=a/b;
            System.out.println("DIVISION IS:"+ans);
        }
        else if(ch=='+')
        {
            ans=a+b;
            System.out.println("ADDITION IS:"+ans);
        }
        else if(ch=='*')
        {
            ans=a*b;
            System.out.println("MULTIPLICAION IS:"+ans);
        }
        else if(ch=='-')
        {
            ans=a-b;
            System.out.println("SUBTRACTION IS:"+ans);
        }
        else
        {
            System.out.println("INVALID");
        }
    }
    public static void main()
    {
        calc obj=new calc(25,2,'/');
        obj.method();
    }
}
        
        