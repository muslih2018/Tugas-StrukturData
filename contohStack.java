import java.util.Stack;

public class contohStack {
    public static void main(String[] args) {

        // Buat Objek Stack
        Stack<String> animals= new Stack<>();
    
        // push elemen ke stack (memasukkan elemen)
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
    
        // pop elemen stack -> memunculkan elemen stack
        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
}
