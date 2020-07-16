class check
{
    char a;
    check(char ch)
    {
        a=ch;
    }
    void checkit()
    {
        if((a>=65)&&(a<=90)||(a>=97)&&(a<=122))
        {
            System.out.println("AN ALPHABET");
        }
        else if((a>=48)&&(a<=57))
        {
            System.out.println("A DIGIT");
        }
        else
        {
            System.out.println("A SYMBOL");
        }
    }
    public static void main()
    {
        check o=new check('9');
        o.checkit();
    }
}