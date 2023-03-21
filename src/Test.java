public class Test {
//    public class DrunkenTurtles
//    {//布朗运动！！！！！！！！！！！！！！！
        public static void main(String[] args)
        {
            int n = 50; // number of turtles
            int trials = 10000; // number of steps
            double step = 0.01; // step size
            mantuoluo.Turtle[] turtles = new mantuoluo.Turtle[n];
            for (int i = 0; i < n; i++)
            {
                double x = StdRandom.uniform(0.0, 1.0);
                double y = StdRandom.uniform(0.0, 1.0);
                turtles[i] = new mantuoluo.Turtle(x, y, 0.0);
            }
            for (int t = 0; t < trials; t++)
            { // All turtles take one step.
                for (int i = 0; i < n; i++)
                { // Turtle i takes one step in a random direction.
                    turtles[i].turnLeft(StdRandom.uniform(0.0, 360.0));
                    turtles[i].goForward(step);
                }
            }
        }
//    public class DrunkenTurtle
//    {
//        public static void main(String[] args)
//        {
//            int trials = Integer.parseInt(args[0]);
//            double step = Double.parseDouble(args[1]);
//            mantuoluo.Turtle turtle = new mantuoluo.Turtle(0.5, 0.5, 0.0);
//            for (int t = 0; t < trials; t++)
//            {
//                turtle.turnLeft(StdRandom.uniform(0.0, 360.0));
//                turtle.goForward(step);
//            }
//        }
//    }
   // }
}
