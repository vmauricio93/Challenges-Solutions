public class Number
{
    public int DigitalRoot(long n)
    {
        if (n < 10) return (int)n;
        long r = 0;
        while (n > 0)
        {
            r += n % 10;
            n /= 10;
        }
        return DigitalRoot(r);
    }
}
