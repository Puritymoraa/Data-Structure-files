import java.util.ArrayList;
import java.util.List;

class Dup {
    
    //Implement the following method that returns a newArrayList. The new
    //list contains the non-duplicate elements from the original list
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> result = new ArrayList<>()
        for(E item: list){
            if(!result.contains(item)){
                result.add(item);
        }
    }
    
}

class impl(){
    public static void main(String[] args) {

        Dup dup = new Dup();
        ArrayList<int> list = 
}
}

