class Q4
{
       void amount(String s,double P,double r,double n)
    {
        switch(s)
        {
            case"Terminal Deposit":
            double A=P*Math.pow((1+(r/100)),n);
            System.out.println("Maturity Amount is"+  A);
            break;
            case"Recurring Deposit":
            double A1=P*n+P*(n*(n+1))/2*(r/100)*1/12;
            System.out.println("Maturity Amount is"+  A1);
            break;
            default:
            System.out.println("INVALID CHARACTER");
        }
    }
    public static void main()
        {
          Q4 obj=new Q4();
          obj.amount("Recurring Deposit",1000,10,24) ;
        }
    }
            
        
        
            
            
            
            
            
        
        
            
            