
public class TestGeneryczne {
    public static <T> boolean isEqual(T b,T  a){
        return b.equals(a);
    }
    public static<T extends Comparable<T>> T max(T[] t){
        if (t == null || t.length == 0) {
            return null;
        }
        T max=t[0];
        for (int i = 1; i < t.length; i++) {
            if(max.compareTo(t[i])>0){
                max=t[i];
            }
        }
        return max;
    }
    public static<T> void printArray(T[] t){
        for (T value : t) {
            System.out.println(value);
        }
    }
    public static <T> void swap(T[] t, int i, int j){
        if(i<0||i>=t.length||j<0||j>=t.length){
            throw new ArrayIndexOutOfBoundsException("Indeksy muszą być od 0 do rozmiaru tablicy");
        }
        T temp=t[i];
        t[i]=t[j];
        t[j]=temp;
    }
    public static void main(String[] args) {
        Box<String>box1=new Box<>();
        Box<Integer>box2=new Box<>();
        Box<Integer>box22=new Box<>();
        Box<Double>box3=new Box<>();

        box1.setT("slowo");
        System.out.println(box1.getT());
        box2.setT(123);
        System.out.println(box2.getT());
        box22.setT(123);
        System.out.println(box22.getT());
        box3.setT(123.);
        System.out.println(box3.getT());

        System.out.println(isEqual(box22.getT(),box2.getT()));
        System.out.println(isEqual(box2.getT(),box3.getT()));
        String[] t=new String[3];
        t[0]="zlowo";
        t[1]="s23";
        t[2]="slowo";
        System.out.println(max(t));

    }
}
