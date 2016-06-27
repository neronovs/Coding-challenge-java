import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> contacts = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int number = scanner.nextInt();
            contacts.put(name, number);
        }
        
        while (scanner.hasNext()) {
            String name = scanner.next();
            if (contacts.get(name) != null) {
                System.out.println(name + "=" + contacts.get(name));
            } else {System.out.println("Not found");}
        } 
        
        scanner.close();
    }
}
