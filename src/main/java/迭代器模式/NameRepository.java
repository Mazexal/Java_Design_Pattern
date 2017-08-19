package 迭代器模式;

/**
 * Created by 10235 on 2017/8/19.
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};


    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;


        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }


        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
