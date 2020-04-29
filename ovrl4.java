class ovrl4
{
    void num_calc(int num,char ch)
    {
        if(ch=='s')
        {
            int ans=num*num;
            System.out.println(ans);
        }
        else
        {
            int ans=num*num*num;
            System.out.println(ans);
        }
    }
    void num_calc(int a,int b,char ch)
    {
        if(ch=='p')
        {
            int ans2=a*b;
            System.out.println(ans2);
        }
        else
        {
            int ans2=a+b;
            System.out.print(ans2);
        }
    }
    public static void main()
    {
        ovrl4 obj=new ovrl4();
        obj.num_calc(45,'a');
        obj.num_calc(36,7,'p');
    }
}
            
            
        