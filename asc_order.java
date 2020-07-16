class asc_order
{
    int a,b,c;
    asc_order(int a1,int b1,int c1)
    {
        a=a1;
        b=b1;
        c=c1;
    }
    void asc_order2()
    {
        if(((a<b)&&(b<c))&&((a<c)&&(a<b)))
        {
            System.out.println("SMALLEST NUMBER:"+a);
            System.out.println("NEXT HIGHER NUMBER:"+b);
            System.out.println("HIGHEST NUMBER:"+c);
        }
        else if(((b<a)&&(a<c))&&(b<c)&&(b<a))
        {
            System.out.println("SMALLEST NUMBER:"+b);
            System.out.println("NEXT HIGHER NUMBER:"+a);
            System.out.println("HIGHEST NUMBER:"+c);
        }
        else if(((a<b)&&(c<b))&&((c<a)&&(c<b)))
        {
            System.out.println("SMALLEST NUMBER:"+c);
            System.out.println("NEXT HIGHER NUMBER:"+a);
            System.out.println("HIGHEST NUMBER:"+b);
        }
        else if(((c<b)&&(b<a))&&((c<a)&&(b<a)))
        {
            System.out.println("SMALLEST NUMBER:"+c);
            System.out.println("NEXT HIGHER NUMBER:"+b);
            System.out.println("HIGHEST NUMBER:"+a);
        }
        else if(((b<c)&&(c<a))&&((b<a)&&(c<a)))
        {
            System.out.println("SMALLEST NUMBER:"+b);
            System.out.println("NEXT HIGHER NUMBER:"+c);
            System.out.println("HIGHEST NUMBER:"+a);
        }
        else
        {
            System.out.println("SMALLEST NUMBER:"+a);
            System.out.println("NEXT HIGHER NUMBER:"+c);
            System.out.println("HIGHEST NUMBER:"+b);
        }
    }
    public static void main()
    {
        asc_order obj=new asc_order(50,60,40);
        obj.asc_order2();
    }
}