<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 2 - Exercise 28 - a - e </h5>

####variables used:

```java
    public int arrayMax, userInt, popCount;     //user inputs
    public String userSelection = "";           //user input
    //variable for loop
    public boolean keepGoing = true;
    //a simple menu to direct the user to the methods
```
####Program also uses the Scan function from `java.util.*` library to take the user's input.

###Methods added to `ArrayBoundedStack.java` as required:

a. `String toString()` creates and returns a string that correctly represents
the current stack. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```
b. `int size()` returns a count of how many items are currently on the stack. Do
not add any instance variables to the `ArrayBoundedStack` class in order to
implement this method.
```java
    public int size();           //will print the array size
```
c. `void popSome(int count`) removes the top count elements from the
stack; throws `StackUnderflowException` if there are less than count elements
on the stack .
```java
    public void popSome(int count);      //user can select how many elements to pop
```

d. `boolean swapStart()` if there are less than two elements on the stack returns
false; otherwise it reverses the order of the top two elements on the
stack and returns true.
```java
  public boolean swapStart()        //To swap the top 2 elements
```
e. `T poptop( )` — the “classic” pop operation, if the stack is empty it throws
`StackUnderflowException`; otherwise it both removes and returns the top
element of the stack.
```java
  public T poptop();        //this method is supposed to pop the very top elements. 
```

####***I did not add this method, because pop() already pops the top element and my solution for popTop would have been very similiar, causing unecessary code.

###Main class: Chapter2_28_ArrayBounded_PatriciaAntlitz.java

####***this program is an example of how the ArrayBoundedStack.java class works, it uses the second constructor passing a value as a parameter. It implements the ArrayBoundedStack to allow the program to use some elements that are placed outside a method (array)

- Specs, used inside <br>
  ```java
      Initiates the scanner
        passes the variables previously mentioned
  //first method:
    public void printMenu();
   ```
  
- 
  ```java
  public void userSelection();      //this method holds all the calls to the methods in ArrayBoundedStack.java, user inputs and conditional statements
  ```

<hr>
<h5>Problems:</h5>

I wanted to create a class called `partialPush()`. It would allow to push more items into the stack that is partially full. Right now you can push again after popping, if you pop all items.
I was stuck on that one and decided to drop it since it is not required. This is something I would like to implement at some point.
I also had problems with `toString()` method. I was using a loop to increment, and it would print as long as the last element was null. I fixed this by decrementing instead.

I used this source for the method `swapStart();`<br>
https://www.educative.io/answers/how-to-swap-two-elements-in-1d-array-in-cpp

I used the example of the code in `pop()` to code `popSome()`

<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter2_28_ArrayBounded_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter2_28_ArrayBounded_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter2_28_ArrayBounded_PatriciaAntlitz.java => compile
    * java Chapter2_28_ArrayBounded_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)