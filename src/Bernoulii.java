public class Bernoulii
{
    public static int binomial(int n)
    { // Simulate flipping a coin n times; return # heads.
        int heads = 0;
        for (int i = 0; i < n; i++)
            if (StdRandom.bernoulli(0.5)) heads++;
        return heads;
    }
    public static void main(String[] args)
    { // Perform Bernoulli trials, plot results and model.
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] freq = new int[n+1];
        for (int t = 0; t < trials; t++)
            freq[binomial(n)]++;
        double[] norm = new double[n+1];
//        for (int i = 0; i <= n; i++)
//            norm[i] = (double) freq[i] / trials;
//        StdStats.plotBars(norm);
//        double mean = n / 2.0;
//        double stddev = Math.sqrt(n) / 2.0;
//        double[] phi = new double[n+1];
//        for (int i = 0; i <= n; i++)
//            phi[i] = Gaussian.pdf(i, mean, stddev);
//        StdStats.plotLines(phi);
    }
}
