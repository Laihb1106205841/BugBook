import java.util.Objects;
import java.util.Scanner;

public class Bugshow {


    public static void main(String[] args) {
        String problem = "";
        System.out.println("在这里，你将查找出你的bug所在，输入-1结束进程");
        String problemsByNet ="Java Exception：\n" +
                "\n" +
                "1、Error\n" +
                "2、Runtime Exception 运行时异常\n" +
                "3、Exception\n" +
                "4、throw 用户自定义异常\n" +
                "\n" +
                "异常类分两大类型：Error类代表了编译和系统的错误，不允许捕获；Exception类代表了标准Java库方法所激发的异常。Exception类还包含运行异常类Runtime_Exception和非运行异常类Non_RuntimeException这两个直接的子类。\n" +
                "\n" +
                "运行异常类对应于编译错误，它是指Java程序在运行时产生的由解释器引发的各种异常。运行异常可能出现在任何地方，且出现频率很高，因此为了避免巨大的系统资源开销，编译器不对异常进行检查。所以Java语言中的运行异常不一定被捕获。出现运行错误往往表示代码有错误，如：算数异常（如被0除）、下标异常（如数组越界）等。\n" +
                "\n" +
                "非运行异常时Non_RuntimeException类及其子类的实例，又称为可检测异常。Java编译器利用分析方法或构造方法中可能产生的结果来检测Java程序中是否含有检测异常的处理程序，对于每个可能的可检测异常，方法或构造方法的throws子句必须列出该异常对应的类。在Java的标准包java.lang java.util 和 http://java.net 中定义的异常都是非运行异常。\n" +
                "\n" +
                "好，既然我们知道了java异常的种类，那么我们再来看看，平常我们敲代码时，有哪些最常见的报错：\n" +
                "\n" +
                "1、算术异常类：ArithmeticExecption\n" +
                "\n" +
                "2、空指针异常类：NullPointerException\n" +
                "\n" +
                "3、类型强制转换异常：ClassCastException\n" +
                "\n" +
                "4、数组负下标异常：NegativeArrayException\n" +
                "\n" +
                "5、数组下标越界异常：ArrayIndexOutOfBoundsException\n" +
                "\n" +
                "6、违背安全原则异常：SecturityException\n" +
                "\n" +
                "7、文件已结束异常：EOFException\n" +
                "\n" +

                "文件未找到异常：FileNotFoundException\n" +
                "\n" +
                "字符串转换为数字异常：NumberFormatException\n" +
                "操作数据库异常：SQLException\n" +
                "输入输出异常：IOException\n" +
                "方法未找到异常：NoSuchMethodException\n" +
                "\n" +
                "java.lang.AbstractMethodError\n" +
                "\n" +
                "抽象方法错误。当应用试图调用抽象方法时抛出。\n" +
                "\n" +
                "java.lang.AssertionError\n" +
                "\n" +
                "断言错。用来指示一个断言失败的情况。\n" +
                "\n" +
                "java.lang.ClassCircularityError\n" +
                "\n" +
                "类循环依赖错误。在初始化一个类时，若检测到类之间循环依赖则抛出该异常。\n" +
                "\n" +
                "java.lang.ClassFormatError\n" +
                "\n" +
                "类格式错误。当Java虚拟机试图从一个文件中读取Java类，而检测到该文件的内容不符合类的有效格式时抛出。\n" +
                "\n" +
                "java.lang.Error\n" +
                "\n" +
                "错误。是所有错误的基类，用于标识严重的程序运行问题。这些问题通常描述一些不应被应用程序捕获的反常情况。\n" +
                "\n" +
                "java.lang.ExceptionInInitializerError\n" +
                "\n" +
                "初始化程序错误。当执行一个类的静态初始化程序的过程中，发生了异常时抛出。静态初始化程序是指直接包含于类中的static语句段。\n" +
                "\n" +
                "java.lang.IllegalAccessError\n" +
                "\n" +
                "违法访问错误。当一个应用试图访问、修改某个类的域（Field）或者调用其方法，但是又违反域或方法的可见性声明，则抛出该异常。\n" +
                "\n" +
                "java.lang.IncompatibleClassChangeError\n" +
                "\n" +
                "不兼容的类变化错误。当正在执行的方法所依赖的类定义发生了不兼容的改变时，抛出该异常。一般在修改了应用中的某些类的声明定义而没有对整个应用重新编译而直接运行的情况下，容易引发该错误。\n" +
                "\n" +
                "java.lang.InstantiationError\n" +
                "\n" +
                "实例化错误。当一个应用试图通过Java的new操作符构造一个抽象类或者接口时抛出该异常.\n" +
                "\n" +
                "java.lang.InternalError\n" +
                "\n" +
                "内部错误。用于指示Java虚拟机发生了内部错误。\n" +
                "\n" +
                "java.lang.LinkageError\n" +
                "\n" +
                "链接错误。该错误及其所有子类指示某个类依赖于另外一些类，在该类编译之后，被依赖的类改变了其类定义而没有重新编译所有的类，进而引发错误的情况。\n" +
                "\n" +
                "java.lang.NoClassDefFoundError\n" +
                "\n" +
                "未找到类定义错误。当Java虚拟机或者类装载器试图实例化某个类，而找不到该类的定义时抛出该错误。\n" +
                "\n" +
                "java.lang.NoSuchFieldError\n" +
                "\n" +
                "域不存在错误。当应用试图访问或者修改某类的某个域，而该类的定义中没有该域的定义时抛出该错误。\n" +
                "\n" +
                "java.lang.NoSuchMethodError\n" +
                "\n" +
                "方法不存在错误。当应用试图调用某类的某个方法，而该类的定义中没有该方法的定义时抛出该错误。\n" +
                "\n" +
                "java.lang.OutOfMemoryError\n" +
                "\n" +
                "内存不足错误。当可用内存不足以让Java虚拟机分配给一个对象时抛出该错误。\n" +
                "\n" +
                "java.lang.StackOverflowError\n" +
                "\n" +
                "堆栈溢出错误。当一个应用递归调用的层次太深而导致堆栈溢出时抛出该错误。\n" +
                "\n" +
                "java.lang.ThreadDeath\n" +
                "\n" +
                "线程结束。当调用Thread类的stop方法时抛出该错误，用于指示线程结束。\n" +
                "\n" +
                "java.lang.UnknownError\n" +
                "\n" +
                "未知错误。用于指示Java虚拟机发生了未知严重错误的情况。\n" +
                "\n" +
                "java.lang.UnsatisfiedLinkError\n" +
                "\n" +
                "未满足的链接错误。当Java虚拟机未找到某个类的声明为native方法的本机语言定义时抛出。\n" +
                "\n" +
                "java.lang.UnsupportedClassVersionError\n" +
                "\n" +
                "不支持的类版本错误。当Java虚拟机试图从读取某个类文件，但是发现该文件的主、次版本号不被当前Java虚拟机支持的时候，抛出该错误。\n" +
                "\n" +
                "java.lang.VerifyError\n" +
                "\n" +
                "验证错误。当验证器检测到某个类文件中存在内部不兼容或者安全问题时抛出该错误。\n" +
                "\n" +
                "java.lang.VirtualMachineError\n" +
                "\n" +
                "虚拟机错误。用于指示虚拟机被破坏或者继续执行操作所需的资源不足的情况。\n" +
                "\n" +
                "\n ArithmeticException (3/0)\n" +
                "\n ArrayIndexOutOfBoundsException (array[-1])\n" +
                "\n ClassCastException ((String) obj)\n" +
                "\n NullPointerException (obj.foo())\n" +
                "\n FileNotFoundException\n"+
               "在此输入您出现过的bug\n"+
                "\n"



                ;

        String[] problemSet =problemsByNet.split("\n\n");

        while (!problem.equals("-1")){
            boolean IsAnswer =false;
        Scanner scan =new Scanner(System.in);
        problem =scan.next();
      for(int i=0;i<problemSet.length;i++){
          if(problemSet[i].equals(problem)){
              System.out.println(problemSet[i+1]);
              IsAnswer=true;
          }
          else if(problemSet[i].contains(problem)){
              System.out.println(problemSet[i+2]);
              IsAnswer=true;
          }
      }
      if(Objects.equals(problem, "-1")){System.out.println("退出程序！");}
      else if(!IsAnswer){System.out.println("数据库中没有找到Bug原因！");}



    }

    }
}
