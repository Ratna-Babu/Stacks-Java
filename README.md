# Stack in Data Structures

## Introduction

A **stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle. This means that the last element added to the stack is the first one to be removed. The stack supports two main operations:

- **Push**: Adds an element to the top of the stack.
- **Pop**: Removes the top element from the stack.

Other common operations include:
- **Peek**: Returns the top element without removing it from the stack.
- **isEmpty**: Checks whether the stack is empty.
- **Search**: Searches for an element in the stack and returns its position.

Stacks are commonly used in scenarios such as function calls, undo operations in software, and expression evaluation.

## Stack Operations

1. **Push**: Adds an element to the top of the stack.
2. **Pop**: Removes the top element from the stack.
3. **Peek**: Returns the top element without removing it.
4. **isEmpty**: Returns true if the stack is empty.
5. **Search**: Returns the position of an element in the stack.

## Example Code in Java

```java
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
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
        System.out.println("\nPosition of 10 in the stack: " + stack.search(10)); // Returns 1 based position
    }
}
```
## Output
```
Stack: [10, 20, 30]

Popping an element from the stack: 30
Updated Stack: [10, 20]

Peeking at the top element: 20

Is the stack empty? false

Position of 10 in the stack: 1
```
