# Programming II

## Lab 7: Scanners, Reading and Writing Files

In this lab, you will implement additional operations to do with stacks and queues.

This lab is used in CS 222 at Saint Mary's College of California. Written by Dr. Sarah Roscoe in 2024.

## Instructions

1. Clone the lab from Github. Use this link: <https://github.com/sroscoe2/CS222-Lab-07.git>

### MinMaxStack.java

2. Open the file `MinMaxStack.java` in the `main` package. Implement the method `minStack()`, which takes a Stack `s` as parameter. Find the minimum element in the provided Stack. **Important:** In your method, you may use at most one extra stack. When you finish the method, the original stack must not have changed. Only use Stack operations (push, pop, peek). Do not use Java-provided methods or interfaces.

3. Implement `maxStack()` to find the maximum element in the provided Stack. Same rules apply.

4. Run `MinMaxStackTests.java` and ensure all test cases pass.

### ReverseQueue.java

5. Open the file `ReverseQueue.java` in the `main` package. Implement the method `reverseQueue()`, which takes a Queue `q` as a parameter. You should use only Queue operations (enqueue, dequeue, peekFront/peekBack). Do not use Java-provided methods or interfaces.

6. Run `ReverseQueueTests.java` and ensure all test cases pass.

### Finishing Up

7. Create a new text file in the root of the lab directory, named `examples.txt`. Brainstorm with your partner, and in this file, write down three examples for a real-life Stack, and three examples for a real-life Queue. Be creative! Do not use examples we have discussed in class.

8. Ensure your project folder is named `firstNameLI-CS222-Lab-07`. Then zip the project folder and turn it in to Canvas.

## Explanations/Hints

Not too many hints for this one. Ask the instructor if you need help, but try to solve it in your groups first!

1. Make sure you draw on paper the goal you are trying to achieve.
2. What data structures, if any, would you need to hold elements while you are doing the operation? Do you need any additional variables?

### Min/Max

You will be returning the minimum or maximum element of the provided data structure. Briefly review the process you would take to find the minimum of a list or array.

For Stacks, you cannot use indexing such as `arr[i]`. You can only use `push()` or `pop()`.

### Reversal

You are trying to return a data structure, such that any contents it held before have been completely reversed.

Stacks and Queues are *ordered* data structures, which means the elements in them have some order to them. That is, a queue containing elements (back to front) `[A, B, C, D]` will be reversed to be (back to front) `[D, C, B, A]`.

Similarly, a Stack containing elements (bottom to top) `[A, B, C, D` will be reversed to be `[D, C, B, A`.
