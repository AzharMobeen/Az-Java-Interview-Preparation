# Java Collections
I will try to explained in very simple words what are Java Collections 

* Before Java collections we have `Array` to save series of data but in `Array` we have many limitation like size of array.
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

### List:
* Ordered collection.
* We can save data by index/position wise.
* we can get/add/delete element from specific index/position. 
* Duplication is allow.
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

### SET:
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

### Map
* Map interface doesn't extends Collection Interface.
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

### Queue
* Child interface:
    - Deque
* Impl classes:
    - Priority Queue
    - Array Queue   (implement Deque)


## Comparable  VS Comparator
Comparable | Comparator |
---  |  ---       |
Default sorting order|Customizable sorting order
package java.lang| package java.util
Interface contain only one method `compareTo()` | Interface contain two methods `compare()` & `equale()`
We have to implement Comparable interface | We no need to implement Comparator interface
By Default primitive data types implemented comparable|


## Cloneable interface
* In Java, we can copy any object properties value to an other object in three ways
    - Shallow Copy
    
    - Deep Copy
    - Cloning

###### Shallow Copy:
* By creating another reference of some object called shallow copy
* In memory both object reference are pointing same object.
```
class A{
    int x=0;
    int y=0;
}
A objectA = new A();
A objectB = objectA;
```
###### Deep Copy:
* Create two objects and copy all the values one by one
* If we have many properties of class A then it's very bad to do Deep copy.
```
class A{
    int x=0;
    int y=0;
}
A objectA = new A();
A objectB = new A();
objectB.setX(objectA.getX());
objectB.setY(objectA.getY());
```

###### Cloning
* Cloning is the combination of shallow copy and Deep Copy.
* For this we need implement Cloneable Interface.
```
class A{
    int x=0;
    int y=0;
}
A objectA = new A();
A objectB = objectA.clone();
```

## String Vs StringBuffer Vs StringBuilder
String | StringBuffer | StringBuilder |
  ---  |   ---        |        ---    |
It's Immutable / not changeable object|It's mutable object| It's mutable object|
It's not thread safe|It's synchronized / thread safe|it's not thread safe|
`Use When:` we no need to change/update String value|`Use When:` In Multi threading|`Use When:` we need to change/update String value in none threading app|
`Version 1.0`|`Version 1.0`|`Version 1.5`|

## Interface Vs Abstract Class Vs Concrete Class 
Interface | Abstract Class | Concrete Class|
---|---|---|
`Use When:` If we don't know anything about implementation|`Use When:` If we know partial implementation|`Use When:` If we know completely implementation|
`Example:` Servlet Interface|`Example:` HTTP Servlet|`Example:` Custom Servlet|
`By Default` all methods are public abstract| it can have abstract & concrete methods as well|---|
We have to implement interfaces| We have to extend abstract class|---|
`Can't use:` private & protected modifier| `Can't use:` final, static, synchronized, native & strictfp|---|
`Variables:` by default public static final|`Variables:` no need to be public static final.|---|
Can't declare constructor| Can declare constructor which will executed at the time of child object creation|---|

## OverLoading Vs OverRiding
OverLoading|OverRiding|
---|---|
In single class if we have two methods with same name but different no of arguments or different type of arguments| In parent child classes if we have same method name with same method arguments| 
Compile time Polymorphism|Run time Polymorphism|
Return type no restriction| it must be same or co-variant object type like String, StringBuffer|
Private, Static & final can be overloading| private, Static and Final methods not possible to override|  

## Concurrency / MultiThreading 

##### Synchronized
* We can use `synchronized` keyword with method or block level to execute synchronously.
* We can't use this keyword with variable or class.
* `synchronized` Method or block will be lock for others if some thread is executing.
##### Volatile
* We should use this with boolean or single statement variables because `Volatile` keyword usage for visibility.
* We can use `volatile` keyword with variables to get updated value in different threads.
* If we have compound statements like `x++` then volatile will not work out.
##### Atomic
* We can use `Atomic` classes variables for compound statements:
```
    like x++ (it will fetch updated value then add one into)
```
* Some of Atomic Variable classes:
 - AtomicInteger
 - AtomicLong
 - AtomicBoolean
 - AtomicReference
