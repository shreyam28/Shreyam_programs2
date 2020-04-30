class time
{
    int hr,min,sec,ans;
    void accept(int hr2,int min2,int sec2)
    {
        hr=hr2;
        min=min2;
        sec=sec2;
    }
    void convert()
    {
         ans=(3600*hr)+(60*min)+sec;
    }
    void showResult()
    {
         System.out.println(ans);
        }
        public static void main()
        {
            time obj=new time();
            obj.accept(2,30,45);
            obj.convert();
            obj.showResult();
        }
    }
        
        
        