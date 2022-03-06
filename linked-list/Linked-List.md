# Linked List

Create a Linked List class in addition to a Node class, head, insert, includes, and toString method.

## Challenge
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.

## API
The insert method takes in a value.  It creates a new Node with the provided value and adds the new Node to the list.

The includes method takes in a value as an argument and return true if a node in the list contains the value or false if it does not.

The toString method returns a string representation of the list and any nodes.

## Approach & Efficiency
Create a LinkedList class with a head and empty constructor.  Create a Node class within the LinkedList class.  The insert method should utilize an O(1) time complexity.
