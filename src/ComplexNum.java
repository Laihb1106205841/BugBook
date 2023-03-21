public class ComplexNum {
    public double real;
    public double imag;


    public ComplexNum(double real ,double imag){
        this.real=real;
        this.imag=imag;

    }
    public String toString(){
        return real+"+"+imag+"i";
    }
    public ComplexNum plus(ComplexNum b){
        double cReal =this.real+b.real;
        double cImag =this.imag+ b.imag;
        return new ComplexNum(cReal,cImag);
    }
    public ComplexNum times(ComplexNum b){
        double f1 =this.real*b.real;
        double i1 =this.imag*b.real+this.real*b.imag;
        double f2 =-this.imag*b.imag;
        double f =f1+f2;
        return new ComplexNum(f,i1);
    }
    public double abs(){
        return Math.sqrt(real*real+imag*imag);
    }
    public double re(){return real;}
    public double im(){return imag;}

    public static void main(String[] args)
    {
        ComplexNum z0 = new ComplexNum(1.0, 1.0);
        ComplexNum z = z0;
        z = z.times(z).plus(z0);
        z = z.times(z).plus(z0);
        System.out.println(z.toString());
        //StdOut.println(z);
    }
}

