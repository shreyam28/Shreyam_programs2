class Account
{
    double balance;
    Account()
    {
        balance=0;
    }
    void startAccount(double amt)
    {
        balance=amt;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    double withdraw(double amount)
    {
        balance-=amount;//amount withdrawn without any check
        return amount;
    }
    double getBalance()
    {
        return balance;//current balance is returned
    }
    }

        