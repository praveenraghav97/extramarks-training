class myCalculator
    {
    int power(int a, int b) throws Exception
        {
        if(a < 0 | b < 0)
            throw new Exception("n and p should be non-negative");
        
        else
            return (int)Math.pow((double)a, (double)b);
    }
}
