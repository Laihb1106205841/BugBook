//import StdDraw.java;
//import edu.princeton.cs.introcs.StdRandom;
public class mantuoluo {

    public static class Turtle
    {
        private double x, y;
        private double angle;
        public Turtle(double x0, double y0, double a0)
        { x = x0; y = y0; angle = a0; }
        public void turnLeft(double delta)
        { angle += delta; }
        public void goForward(double step)
        { // Compute new position; move and draw line to it.
            double oldx = x, oldy = y;
            x += step * Math.cos(Math.toRadians(angle));
            y += step * Math.sin(Math.toRadians(angle));
            StdDraw.line(oldx, oldy, x, y);
        }
        public static void main(String[] args)
        { // Draw a regular polygon with n sides.
            int n = 400;//Integer.parseInt(args[0]);
            double angle = 360.0 / n;
            double step = Math.sin(Math.toRadians(angle/2));
            Turtle turtle = new Turtle(0.5, 0.0, angle/2);
            for (int i = 0; i < n; i++)
            {
                turtle.goForward(step);
                turtle.turnLeft(angle);
            }
        }
    }
            public static void koch(int n, double step, Turtle turtle)
            {
                if (n == 0)
                {
                    turtle.goForward(step);
                    return;
                }
                koch(n-1, step, turtle);
                turtle.turnLeft(60.0);
                koch(n-1, step, turtle);
                turtle.turnLeft(-120.0);
                koch(n-1, step, turtle);
                turtle.turnLeft(60.0);
                koch(n-1, step, turtle);
            }
            public static void main(String[] args)
            {
                int n = 50;
                double step = 1.0 / Math.pow(3.0, n);
                Turtle turtle = new Turtle(0.0, 0.0, 0.0);
                koch(n, step, turtle);
            }

    public static class Spiral
    {
        public static void main(String[] args)
        {
            int n = 3;//Integer.parseInt(args[0]);
            double decay = 1.2;//Double.parseDouble(args[1]);
            double angle = 360.0 / n;
            double step = Math.sin(Math.toRadians(angle/2));
            Turtle turtle = new Turtle(0.5, 0, angle/2);
            for (int i = 0; i < 10 * 360 / angle; i++)
            {
                step /= decay;
                turtle.goForward(step);
                turtle.turnLeft(angle);
            }
        }
    }


//    public class DrunkenTurtles
//    {
//        public static void main(String[] args)
//        {
//            int n = 50; // number of turtles
//            int trials = 100; // number of steps
//            double step = 3; // step size
//            Turtle[] turtles = new Turtle[n];
//            for (int i = 0; i < n; i++)
//            {
//                double x = StdRandom.uniform(0.0, 1.0);
//                double y = StdRandom.uniform(0.0, 1.0);
//                turtles[i] = new Turtle(x, y, 0.0);
//            }
//            for (int t = 0; t < trials; t++)
//            { // All turtles take one step.
//                for (int i = 0; i < n; i++)
//                { // Turtle i takes one step in a random direction.
//                    turtles[i].turnLeft(StdRandom.uniform(0.0, 360.0));
//                    turtles[i].goForward(step);
//                }
//            }
//        }
//    }
}
