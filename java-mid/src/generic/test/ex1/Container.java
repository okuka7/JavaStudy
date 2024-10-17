package generic.test.ex1;

public class Container <T> {

    private T item;

   public boolean isEmpty(){
       return item == null;
   }
   public void setItem(T item){
    this.item = item;
   }
   public T getItem(){
       return item;
   }
}
