class overloading
{
    void prnsqr(int i)
    {
        System.out.println("Integer"+i+"square is"+i*i);
    }
    void prnsqr(char c)
    {
        System.out.println(c+"is a character"+"thus,no square");
    }
    void prnsqr(float f)
    {
        System.out.println("float"+f+"square is"+f*f);
    }
    void prnsqr(double d)
    {
        System.out.println("double"+d+"square is"+d*d);
    }
    public static void main()
    {
        overloading obj=new overloading();
        obj.prnsqr(4);
        obj.prnsqr(3.6);
        obj.prnsqr(6.5f);
        obj.prnsqr('A');
    }
}
    
    
    