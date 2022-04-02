# Stacks and Queues
Learning 2 new data structures: stacks and queues.  

# Challenge
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.  

- Create a Stack class that has a top property and creates an empty Stack when instantiated.
1- Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack.  
2- Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node.  
3- Define a method called peek that does not take an argument and returns the node located on the top of the stack.

- Create a Queue class that has front and back property and creates an empty queue when instantiated  

1- Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue.  
2- Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node.  
3- Define a method called peek that does not take an argument and returns the node located in the front of the queue.  

# Approach & Efficiency
Per the instructions I took the approaches that use O(1) Time, reassigning the nodes to what their next property should be instead of looping.  
