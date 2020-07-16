class calc
{
    double a,b,ans1,ans2,ans3,ans;
    calc(double a1,double b1)
    {
        a=a1;
        b=b1;
    }
    void add()
    {
        ans=a+b;
        
    }
    void subtract()
    {
        ans1=a-b;
        
    }
    void multiply()
    {
        ans2=a*b;
        
    }
    void divide()
    {
        ans3=a/b;
        
    }
    public static void main()
    {
        calc obj=new calc(20,5);
        obj.add();
        System.out.println("ADDITION IS:"+obj.ans);
        obj.subtract();
        System.out.println("SUBTRACTION IS:"+obj.ans1);  
        obj.multiply();
        System.out.println("MULTIPLICATION IS:"+obj.ans2);
        obj.divide();
        System.out.println("DIVISION IS:"+obj.ans3);
    }
}
        
        