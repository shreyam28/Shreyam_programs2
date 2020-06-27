class temperature
{
    double temp;
    temperature()//no arg constructor
    {
        temp=92;
    }
    temperature(double t)//parm. constructor
    {
        temp=t;
    }
    double convert2celcius()//method from conversion of de... f to de... c
    {
        double cel=(5.0/9)+(temp-32);
        return cel;
    }
    public double gettemp()
    {
        return temp;
    }
    public static void main()
    {
        temperature b=new temperature(94);
        System.out.println("Temperature in F"+b.gettemp());
        System.out.println("Temperature in C"+b.convert2celcius());
    }
}
        