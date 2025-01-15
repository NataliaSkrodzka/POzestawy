import java.util.ArrayList;
import java.util.List;

public class Counter <T>{
    List<T> lista;
    public Counter(){
        lista = new ArrayList<T>();
    }
    public void add(T element){
        lista.add(element);
    }
    public int getCount(){
        return lista.size();
    }
}
