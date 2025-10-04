class Solution 
{
    public int findNthDigit(int n) 
    {
        long l = 1;
        long count = 9;
        long s = 1;

        while (n > l * count) 
        {
            n -= l * count;
            l++;
            count *= 10;
            s *= 10;
        }

        long number = s + (n - 1) / l;
        String s1 = Long.toString(number);
        int index = (int) ((n - 1) % l);
        return s1.charAt(index) - '0';
    }
}
