class Q3
{
    void init(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j,int k,int l,int m,int n,int o,int p,int q,int r,int s,int t,int x)
    {
        if((x>0)&&(x<101))
        {
            System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n"+i+"\n"+j+"\n"+k+"\n"+l+"\n"+m+"\n"+n+"\n"+o+"\n"+p+"\n"+q+"\n"+r+"\n"+s+"\n"+t);
        }
        else
        {
            System.out.println("Invlalid");
        }
    }
    public static void main()
    {
        Q3 obj=new Q3();
        obj.init(1,3,5,7,9,14,32,62,69,67,71,12,13,16,87,99,64,34,65,34,100);
    }
}
        
