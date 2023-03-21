public class plotPoints {

public static void plotPoints(double[] a)
        { // Plot points at (i, a[i]).
        int n = a.length;
        StdDraw.setXscale(-1, n);
        StdDraw.setPenRadius(1/(3.0*n));
        for (int i = 0; i < n; i++)
        StdDraw.point(i, a[i]);
        }
public static void plotLines(double[] a)
        { // Plot lines through points at (i, a[i]).
        int n = a.length;
        StdDraw.setXscale(-1, n);
        StdDraw.setPenRadius();
        for (int i = 1; i < n; i++)
        StdDraw.line(i-1, a[i-1], i, a[i]);
        }
public static void plotBars(double[] a)
        { // Plot bars from (0, a[i]) to (i, a[i]).
        int n = a.length;
        StdDraw.setXscale(-1, n);
        for (int i = 0; i < n; i++)
        StdDraw.filledRectangle(i, a[i]/2, 0.25, a[i]/2);
        }
}