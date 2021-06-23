#### Stack
* Implementation of Vector
* Introduce in Java 1.0
* Vector is a Thread-safe collection.
* Last in first out (LIFO)
* Underlying Array data structure.
* It's very much useful when we want result in reverse order of input.
* Example:
  ```
  Input: Helow
  Output: woleH
  ```
* Main methods :
    - push    [for Adding value]
    - pop     [for retrieving and deleting value]
    - isEmpty [for checking stack have some value or not]
    - peek    [check the last value]
    - search  [for searching specific value]
#### Queue
* It's an interface
* Introduce in Java 1.5
* First in First out (FIFO)
* Deque is a child interface of Queue
* It's very much useful when we want to process collection first come, first served basis.
* Example: printers always print on the basis of FIFO.
* Classes :
    - PriorityQueue is implementation of Queue
    - ArrayQueue is implementation of Deque
* Main methods :
    - add     [for adding value]
    - offer   [for adding value but it will not through exception if capacity is full]
    - isEmpty [for checking stack have some value or not]
    - peek    [check the Peek value]

#### Linked List
* Implementation class of List collection
* Java have only doubly linked list but before that we should understand singly linked list.
    - SinglyLinkedList :
        - Every node have data and reference of next element/node.
        - Add new-node at the last will, it's not efficient because we need to iterate all nodes.
        - For improving add Node at the end we need maintain lastNode status called `CircularLinkedList`
    - CircularLinkedList :
        - We can add Node at the start as well as last efficiently.
        - Similarly, deletion of Node also can be possible at the start and last.
    - DoublyLinkedList :
        - In this every node have information of his next and previous node information.
        - We need to maintain first and last node information as we did in `CircularLinkedList`
        - In this LinkedList we can easily add in middle or after/before of specific node.
*