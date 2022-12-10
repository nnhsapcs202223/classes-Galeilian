import java.lang.Math;
public class Annuity
{
    public static double calcPresentValue(double pmt, double i, int n)
    {
        double Whatever = Math.pow(1+i,n-1);
        Whatever = ((Whatever - 1)/i/Whatever + 1)*pmt;
       

        return Whatever;
    }
}
