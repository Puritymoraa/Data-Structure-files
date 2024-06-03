class Gen<T, K>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is"+ ob.getClass().getName());
    }
    }

class GenDemo {

    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<Integer> (88);
        iob.showType();
        int v = iob.getOb();
        System.out.println("Value"+ v);
        System.out.println();
        Gen<Gen> strob = new Gen<> (new Gen(567));
        strob.showType();
        Gen str = strob.getOb();
        System.out.println("Value"+ str);
    }
    
}
