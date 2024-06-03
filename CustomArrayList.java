class CustomArrayList {
    private Object[] elements;
    private int size;

    // Constructor with a default initial capacity of 15
    public CustomArrayList() {
        this(15); 
    }

    // Constructor with specified initial size. It throws an exeption when the capacity is exceeded
    public CustomArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    // In this method, we add elements into the ArrayList until the size is met.
    public void add(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // This method removes a method by element instead of by index and returns null when the element is not found
    public Object remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return remove(i);
            }
        }
        return null; 
    }
    
    // This method removes method by index. It throws an exeption if the index given is less that
    // one or greater than the size of the ArrayList(when the index is out of bound). It as well clears the last element
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; 
        return removedElement;
    }

    
    // This getter gets the method and throws an exeption if the index given is out of bounds
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    // It returns the size of the ArrayList
    public int size() {
        return size;
    }

    // This returns True if the ArrayList is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // This method displays the content in the ArrayList and appends them in  square brackets
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // This is a setter method and throws an expetion when the index is out of bounds
    public void set(int index, Object element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elements[index] = element;
    }

    // This is a helper method to that resizes the internal array
    private void resize() {
        int newSize = elements.length * 2;
        Object[] newElements = new Object[newSize];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Displaying the list
        System.out.println("Original List: " + list.display());

        // Removing an element
        Object removedElement = list.remove("Banana");
        System.out.println("Removed Element: " + removedElement);
        System.out.println("List after removing 'Banana': " + list.display());

        // Removing an element by index
        removedElement = list.remove(1);
        System.out.println("Removed Element at index 1: " + removedElement);
        System.out.println("List after removing element at index 1: " + list.display());

        // Getting element by index
        System.out.println("Element at index 1: " + list.get(1));

        // Setting element by index
        list.set(1, "Pineapple");
        System.out.println("List after setting 'Pineapple' at index 1: " + list.display());
    }
}
