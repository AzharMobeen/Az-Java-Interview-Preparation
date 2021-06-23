### Java Collections
I will try to explained in very simple words what are Java Collections

* Before Java collections we have `Array` to save series of data but in `Array` we have many limitations like size of array.
* Java Collection Framework Interfaces:
    - Iterable
        - Collection
            - List
            - Set
                - SortedSet
                    - NavigableSet
            - Map
                - SortedMap
                    - NavigableMap
            - Queue
                - Deque

List | SET |
---  | --- |
Ordered collection Interface | Unordered collection Interface
Duplication allow | Duplication not allow

* Now we'll discuss one by one, all the Interfaces and their impl classes.

#### List:
* Ordered collection.
* We can save data by index/position wise.
* we can get/add/delete element from specific index/position.
* Duplication allowed.
* If we don't provide index while adding element then it will add at the end of list.
* Impale classes:
    - Array List
    - Vector
        - Stack
    - LinkedList
##### Array List & Vector Vs LinkedList:

Array List & Vector | Linked List |
---    | ---         |
In both underneath data structure is an `Array`. | Underneath data structure is `LinkedList` (doubly LinkedList).
Faster then `LinkedList` for get element from list. | Slower then `ArrayList` & `Vector` for get element from list.
Slower then `LinkedList` while deletion and insertion into list.| Faster then `ArrayList` & `Vector` while deletion and insertion into list.
`Vector` is thread safe but `Array List` is not Thread safe | Not thread safe.
`Array List` is faster then `Vector`.|
Implement `List` Interface | Implement `List` and `Deque` Interfaces
`Vector` introduced in Java 1.0 & `Array List` in Java 1.2|`Linke List` introduced in 1.2

#### SET:
* Unordered collection.
* Duplication is not allow.
* If we try to add same element it'll not add and return false.
* We should override `equale` & `Hashcode` methods for better performance.
* Child Interfaces:
    - SortedSet
        - NavigableSet
* Impl classes:
    - HashSet
        - LinkedHashSet
    - TreeSet   (implement NavigableSet)

##### HashSet & LinkedHashSet Vs TreeSet:
HashSet & LinkedHashSet | TreeSet |
 ---    | ---     |
Data will be unordered form| Data will be ascending ordered form
Its faster than `TreeSet`| Its slower than `HashSet`
`LinkedHashSet` extends `HashSet` class|
`LinkedHashSet` is the ordered version of `HashSet`|
`LinkeHashSet` maintain only insertion ordered| `TreeSet` elements are by default ascending ordered
it uses `equale()` & `hashCode()` method for comparing| It uses `compare()` and `compareTo()` method for comparing
`HashSet` internally uses `HashMap` for storing data|
`LinkedHashSet` internally uses `LinkedHashMap` for storing data| `TreeSet` internally uses `TreeMap` for storing data
Both allow one `null` object| not allow `null` object (throws NullPointerException)

#### Map
* Map interface doesn't extend Collection Interface.
* Data store in key & value format.
* Value can be duplicate but key can't be duplicate.
* Child Interfaces:
    - SortedMap
        - NavigableMap
* Impl classes:
    - HashMap
        - LinkedHashMap
    - TreeMap   (implement NavigableMap)
    - HashTable

#### Queue
* Child interface:
    - Deque
* Impl classes:
    - Priority Queue
    - Array Queue   (implement Deque)
