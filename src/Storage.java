public class Storage <T>{
    private T data;
    public void store(T item){
        this.data=item;
    }
    public T retrieve(){
        return data;
    }
}
