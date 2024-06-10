
class ArrayListADT {
    private int[] list;
    private int size;
    private int capacity;

    public ArrayListADT(int capacity) {
        this.capacity = capacity;
        list = new int[capacity];
        size = 0;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int get(int pos) {
        if (pos - 1 >= 0 && pos - 1 < size) {
            return list[pos - 1];
        } else {
            System.out.println("Wrong Position");
            return -1; 
        }
    }

    
    public int listSize() {
        return size;
    }

    
    public int positionOf(int e) {
        for (int i = 0; i < size; i++) {
            if (list[i] == e) {
                return i + 1;
            }
        }
        return -1; 
    }

    
    public void delete(int pos) {
        if (pos - 1 >= 0 && pos - 1 < size) {
            for (int i = pos - 1; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            list[size - 1] = 0;
            size--;
        } else {
            System.out.println("Wrong Position");
        }
    }

   
    public void insert(int pos, int e) {
        if (pos - 1 >= 0 && pos - 1 <= size) {
            for (int i = size; i > pos - 1; i--) {
                list[i] = list[i - 1];
            }
            list[pos - 1] = e;
            size++;
        } else {
            System.out.println("Wrong Position");
        }
    }

   
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayListADT list = new ArrayListADT(10);

        System.out.println("Is list empty? " + list.isEmpty());

        list.insert(1, 10);
        list.insert(2, 20);
        list.insert(3, 30);
        list.display();

        System.out.println("Element at position 2: " + list.get(2));
        System.out.println("Size of the list: " + list.listSize());
        System.out.println("Position of element 20: " + list.positionOf(20));

        list.delete(2);
        list.display();

        list.insert(2, 25);
        list.display();

        System.out.println("Is list empty? " + list.isEmpty());
    }
}
