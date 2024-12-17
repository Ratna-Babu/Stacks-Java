import java.util.Stack; 

public class StackDemo  
{ 
    public static void main(String[] args)  
     { 
        // Create a Stack using Java's Collection Framework 
        Stack<Integer> stack = new Stack<>(); 
        // Push elements onto the stack 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        // Display the stack 
        System.out.println("Stack: " + stack); 
        // Pop an element from the stack 
        System.out.println("\nPopping an element from the stack: " + stack.pop()); 
        System.out.println("Updated Stack: " + stack); 
 
        // Peek at the top element of the stack 
        System.out.println("\nPeeking at the top element: " + stack.peek()); 
        // Check if the stack is empty 
        System.out.println("\nIs the stack empty? " + stack.isEmpty()); 
        // Search for an element in the stack 
        System.out.println("\nPosition of 10 in the stack: " + stack.search(10)); // Returns 1
// based position 
    } 
}