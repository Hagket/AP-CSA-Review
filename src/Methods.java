public class Methods
{
    private int var;
    public Methods()
    {
        var=0;
    }


    //Question 8:

    public int fun(int[] w)
    {
        int w=0;
        for(int j=0; j<w.length; j++)
        {
            w=3*w + w[i];
        }
        return w;
    }



    //Question 11:
    public static int mystery1(int n, int a)
    {
        if (n==1){return a;};
        return a * mystery1(n-1,a);
    }

    //Question 13:
    public static int mystery2(String str)
    {
        if (str.length() == 1){return 0;}
        else
        {
            if (str.substring(0,1).equals("y"))
            {
                return 1 + mystery2(str.substring(1));
            }
            else
            {
                return mystery2(str.substring(1));
            }
        }
    }
}