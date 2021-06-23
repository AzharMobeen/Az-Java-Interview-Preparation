### Comparable  VS Comparator
Comparable | Comparator |
---  |  ---       |
Default sorting order|Customizable sorting order
package java.lang| package java.util
Interface contain only one method `compareTo()` | Interface contain two methods `compare()` & `equale()`
We have to implement Comparable interface | We no need to implement Comparator interface
By Default primitive data types implemented comparable|

### Cloneable interface
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

### String Vs StringBuffer Vs StringBuilder
String | StringBuffer | StringBuilder |
  ---  |   ---        |        ---    |
It's Immutable / not changeable object|It's mutable object| It's mutable object|
It's not thread safe|It's synchronized / thread safe|it's not thread safe|
`Use When:` we no need to change/update String value|`Use When:` In Multi threading|`Use When:` we need to change/update String value in none threading app|
`Version 1.0`|`Version 1.0`|`Version 1.5`|

### Interface Vs Abstract Class Vs Concrete Class
Interface | Abstract Class | Concrete Class|
---|---|---|
`Use When:` If we don't know anything about implementation|`Use When:` If we know partial implementation|`Use When:` If we know completely implementation|
`Example:` Servlet Interface|`Example:` HTTP Servlet|`Example:` Custom Servlet|
`By Default` all methods are public abstract| it can have abstract & concrete methods as well|---|
We have to implement interfaces| We have to extend abstract class|---|
`Can't use:` private & protected modifier| `Can't use:` final, static, synchronized, native & strictfp|---|
`Variables:` by default public static final|`Variables:` no need to be public static final.|---|
Can't declare constructor| Can declare constructor which will executed at the time of child object creation|---|

### OverLoading Vs OverRiding
OverLoading|OverRiding|
---|---|
In single class if we have two methods with same name but different no of arguments or different type of arguments| In parent child classes if we have same method name with same method arguments| 
Compile time Polymorphism|Run time Polymorphism|
Return type no restriction| it must be same or co-variant object type like String, StringBuffer|
Private, Static & final can be overloading| private, Static and Final methods not possible to override|  
