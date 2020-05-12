class employee
{
    String a;
    float b,c;
    void name(String a1)
    {
        a=a1;
        System.out.println("Name is"+a);
    }
    void salary(float b1)
    {
        b=b1;
        c=(50*b)/100+b;
        System.out.println("The salary including HRA is"+c);
    }
    public static void main()
    {
        employee obj=new employee();
        obj.name("Narendra Modi");
        obj.salary(200000);
    }
}
        
