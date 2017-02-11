public class Labw03
{
    public void poka(int N)
    {
        int a,b,c,d,e,f,g,k;
        a=N%10;
        b=N/10;
        c=b%10;
        d=b/10;
        e=d%10;
        f=d/10;
        System.out.println("Остача от деления N:"+a+","+c+","+e+","+f+".");
    }
    public void logika(double d1, double d2, double d3)
    {
        int y=0;
        if(d1>0)y++;
        if(d2>0)y++;
        if(d3>0)y++;
        System.out.println("Кол-во положительных чисел:"+y);
    }

    public void massivy(double[] A, double D)
    {
        double b;
        int h=0;
        double min=A[0];
        for(int i=0; i<A.length;i++)
        {
            b=Math.abs(A[i]-D);
            if(b<min)
            {
                min=b;
                h=i;
            }

        }
        System.out.println("Элемент массива А, модуль разницы которого с D минимален:"+A[h]);
    }
}