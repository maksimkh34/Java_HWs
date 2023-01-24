public class defs {
    static int factor(int n)
    {
        int temp = 1;
        for(int i = 1; i < n+1; i++)
        {
            temp *= i;
        }
        return temp;
    }

    static int triangle(int n)
    {
        int temp = 0;
        for(int i = 1; i < n+1; i++)
        {
            temp += i;
        }
        return temp;
    }
}
