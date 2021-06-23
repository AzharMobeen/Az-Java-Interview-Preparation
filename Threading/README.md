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
