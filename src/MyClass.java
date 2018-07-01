/**
 * Created by adavi on 01.07.2018.
 */
public class MyClass<E> {
    private E attribute;
    MyClass(E var){
        this.attribute = var;
    }
    public E get(){
        return this.attribute;
    }
    public void set(E value){
        this.attribute = value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
