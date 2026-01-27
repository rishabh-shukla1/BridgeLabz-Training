package exception_handling;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}

