class Demo
{
    int n1,n2,ans;
    void init(int num1,int num2)//multiple metd,non-interactive metod,called, formal parameters
    {
        //body of method
        n1=num1;
        n2=num2;
    }
    void calc()
    {
        ans=n1+n2;//adding 2 numbers
    }
    void display()
    {
        System.out.print(ans);
    }
    public static void main()
    {
        Demo obj=new Demo();
        obj.init(56,71);
        obj.calc();
        obj.display();
    }
}
        
    