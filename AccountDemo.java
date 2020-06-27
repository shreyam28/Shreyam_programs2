class AccountDemo
    {
        public static void main()
        {
            Account a=new Account();//creating an empty account
            a.startAccount(1000);
            a.deposit(250.0);//deposit money
            //print current balance
            System.out.println("Current Balance"+a.getBalance());
            a.withdraw(80.0);//withdraw money
            //print remaining balance
            System.out.println("Remaining Balance"+a.getBalance());
        }
    }