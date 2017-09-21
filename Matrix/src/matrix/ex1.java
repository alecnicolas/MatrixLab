public class ex1
{
    public static void main(String[] args) 
    {
        int x = 0;
        int[] y = {0};
        add(x);
        add(y);
        System.out.println(x);
        System.out.println(y[0]);
    }
    public static void add(int x)
    {
        x+=1;
    }
    public static void add(int[]x)
    {
        x[0]+=1;
    }
    
}