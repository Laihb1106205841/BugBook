public class RandomPoints
{ //tions often produces a pattern that
    public static void main(String[] args) //gives direct insight into the impor-
    { //tant properties of the distribution.
        int n = 100000;//Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++)// More important, a bug in the random
        { //number generation code is likely to
            double x = StdRandom.gaussian(.5, .2);// show up immediately in such a plot.
            double y = StdRandom.gaussian(.5, .2);
            StdDraw.point(x, y);
        }
    }
   // Stress testing. An extensively used library such as StdRandom should also
}