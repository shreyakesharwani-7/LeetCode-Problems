
class Bank 
{
    long[] balances;
    int n;

    public Bank(long[] balance) 
    {
        this.balances = balance;
        this.n = balance.length;
    }

    private boolean validAccount(int account) 
    {
        return account >= 1 && account <= n;
    }

    public boolean transfer(int account1, int account2, long money) 
    {
        if (!validAccount(account1) || !validAccount(account2)) 
        {
            return false;
        }
        if (balances[account1 - 1] < money) 
        {
            return false;
        }
        balances[account1 - 1] -= money;
        balances[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) 
    {
        if (!validAccount(account)) 
        {
            return false;
        }
        balances[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) 
    {
        if (!validAccount(account)) 
        {
            return false;
        }
        if (balances[account - 1] < money) 
        {
            return false;
        }
        balances[account - 1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */