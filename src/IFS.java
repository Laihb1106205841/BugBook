public class IFS
{
    public static void main(String[] args)
    { // Plot trials iterations of IFS on StdIn. trials iterations
        int trials = 100000;//Integer.parseInt(args[0]); //dist[] probabilities

        double[] cx = { 0.000, 1.000, 0.500 };
        double[] cy = { 0.000, 0.000, 0.866 };
        double x = 0.0, y = 0.0;
        for (int t = 0; t < trials; t++)
        {
            int r = StdRandom.uniform(3);
            x = (x + cx[r]) / 2.0;
            y = (y + cy[r]) / 2.0;
            StdDraw.point(x, y);
        }
    }
}
/*
* % more barnsley.txt % java IFS 20000 < barnsley.txt
4
 .01 .85 .07 .07
4 3
 .00 .00 .500
 .85 .04 .075
 .20 -.26 .400
 -.15 .28 .575
4 3
 .00 .16 .000
 -.04 .85 .180
 .23 .22 .045
 .26 .24 -.086
% more tree.txt
6 % java IFS 20000 < tree.txt .1 .1 .2 .2 .2 .2
6 3
 .00 .00 .550
 -.05 .00 .525
 .46 -.15 .270
 .47 -.15 .265
 .43 .26 .290
 .42 .26 .290
6 3
 .00 .60 .000
 -.50 .00 .750
 .39 .38 .105
 .17 .42 .465
 -.25 .45 .625
 -.35 .31 .525
% java IFS 20000 < coral.txt
% more coral.txt
3
 .40 .15 .45
3 3
 .3077 -.5315 .8863
 .3077 -.0769 .2166
 .0000 .5455 .0106
3 3
 -.4615 -.2937 1.0962
 .1538 -.4476 .3384
 .6923 -.1958 .3808
* */