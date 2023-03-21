import java.util.Scanner;
public class POLAR {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //String function =scan.next();
        double n =1000;


        for(int i=0; i < n ; i++){
            double xita = i/n * Math.PI * 2;
            double r = Math.cos( 0.5 * xita );


            double x = r * Math.cos(xita);
            double y = r * Math.sin(xita);
            StdDraw.point(x,y);

        }

    }
}
