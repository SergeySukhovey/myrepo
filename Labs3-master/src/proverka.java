public class proverka
{
    public static void main(String[] args)
    {
        int N=4532;
        double[] A={45, 58, 12, 23, 5, 59, -1, -60};
        double D=67;
        double d1=7;
        double d2=-7;
        double d3=-12;
        Labw03 l=new Labw03();
        l.poka(N);
        l.logika(d1,d2,d3);
        l.massivy(A, D);
    }
}