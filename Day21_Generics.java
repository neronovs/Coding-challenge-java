import java.lang.reflect.Method;

class Solution {
    public static <E> void printArray(E[] a) {
        for (E element : a) {
            System.out.println(element);
        }
    }
    
        public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
