import java.util.ArrayList;

public class Zestaw5 {
    public static void append(ArrayList<Integer> tab1,ArrayList<Integer> tab2){
        tab1.addAll(tab2);
    }
    public static void merge(ArrayList<Integer> tab1,ArrayList<Integer> tab2){
        //jak potem wyswietlic ta tab3??
        ArrayList<Integer>tab3=new ArrayList<>();
        if(tab1.size()>=tab2.size()) {
            for (int i = 0; i < tab1.size(); i++) {
                tab3.add(tab1.get(i));
                if (tab2.size() > i) {
                    tab3.add(tab2.get(i));
                }
            }
        }
        else{
            for (int i = 0; i < tab2.size(); i++) {
                if (tab1.size() > i) {
                    tab3.add(tab1.get(i));
                }
                tab3.add(tab2.get(i));
            }
        }
        tab1.clear();
        tab1.addAll(tab3);
    }
    public static void mergeSorted(ArrayList<Integer> tab1,ArrayList<Integer> tab2){
        tab1.addAll(tab2);
        tab1.sort(null);
    }
    public static ArrayList<Character> toArrayList(String napis){
        ArrayList<Character> arrayList=new ArrayList<>();
        for(int i=0;i<napis.length();i++){
            arrayList.add(napis.charAt(i));
        }
        arrayList.sort(null);
        return arrayList;
    }
    public static ArrayList<Integer> toArrayList(int liczba){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=liczba;i>0;i/=10){
            if (i>=10) {
                arrayList.add(i % 10);
            }
            else{
                arrayList.add(i);
            }
        }
        arrayList.sort(null);
        return arrayList;
    }
    public static boolean checkChar(ArrayList<Character> arrayList,char c){
        return arrayList.contains(c);
    }
    public static boolean checkDigit(ArrayList<Integer> arrayList,int number){
        return arrayList.contains(number);
    }
    public static int countChar(ArrayList<Character> arrayList,char c){
        int count=0;
        for (Character character : arrayList) {
            if (character == c) {
                count++;
            }
        }
        return count;
    }
    public static int countDigit(ArrayList<Integer> arrayList,int number){
        int count=0;
        for (Integer integer : arrayList) {
            if (integer == number) {
                count++;
            }
        }
        return count;
    }
    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<String> tab){
        //nie dziala - nie skonczona
        ArrayList<ArrayList<Integer>> ArrayList=new ArrayList<>();
        for(int i=0;i<tab.size();i++){
            for(int j=0;j<tab.size();j++) {
                if (tab.get(i) == tab.get(j)) {
                    tab.remove(j);
                }
            }
        }
        for(int i=0;i<tab.size();i++) {
            ArrayList.add(new ArrayList<>());
        }
        for(int i=0;i<tab.size();i++) {
            ArrayList.get(i).add(0);

        }
        return ArrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        ArrayList<Integer> tab2 = new ArrayList<>();
        ArrayList<String> tab3 = new ArrayList<>();
        tab3.add("kotek");
        tab1.add(1);
        tab1.add(2);
        tab2.add(3);
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);
        append(tab1,tab2);
        System.out.println(tab1);
        System.out.println(tab2);
        merge(tab1,tab2);
        System.out.println(tab1);
        mergeSorted(tab1,tab2);
        System.out.println(tab1);
        System.out.println(toArrayList("kotek"));
        System.out.println(toArrayList(986));
        System.out.println(checkChar(toArrayList("kotek"),'z'));
        System.out.println(checkDigit(toArrayList(986),9));
        System.out.println(countChar(toArrayList("myszka"),('n')));
        System.out.println(countDigit(toArrayList(9896),0));
        // nie dziala jeszcze System.out.println(uniqueArrayList(tab3));
    }
}
