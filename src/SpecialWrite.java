import java.util.ArrayList;

public class SpecialWrite<T> {
    public int j ;
    public ArrayList<T> elements;
    public class Niu {
        int i=0;

    }
    public int Hello(){
        j+=1;
        if(j<10) j+=1 ;
        return j;
    }
    public static <T> void printArray(T[] array) {
        for (T element : array) System.out.printf("%s ", element);
        System.out.println();
    }
    public static void printArray1(Object[] array) {
        for (Object element : array) System.out.printf("%s ", element);
        System.out.println();
    }
    public  T  pop(T e){
        if(elements.isEmpty())throw new RuntimeException();
        return e;
    }
    public <T> T printrray(T e){
        Integer J =0;
        return e;
    }

    public static void main(String[] args) {
        int m=0;
        Integer[] hey =new Integer[5];
        hey[0]=1;
        hey[1]=2;
        hey[2]=3;
        hey[3]=4;
        hey[4]=5;
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        printArray(integerArray);
        printArray(hey);
        SpecialWrite a =new SpecialWrite();
        a.pop(1);

    }


}
