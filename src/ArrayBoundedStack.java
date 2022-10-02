public class ArrayBoundedStack<T> implements StackInterface<T>
{
    protected final int DEFCAP = 100; // default capacity
    protected T[] elements;           // holds stack elements
    protected int topIndex = -1;      // index of top element in stack

    public ArrayBoundedStack()
    {
        elements = (T[]) new Object[DEFCAP];
    }

    public ArrayBoundedStack(int maxSize)
    {
        elements = (T[]) new Object[maxSize];
    }

    public void push(T element)
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    {
        if (isFull())
            throw new StackOverflowException("Push attempted on a full stack.");
        else
        {
            topIndex++;
            elements[topIndex] = element;
        }
    }

    public void pop()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        else
        {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    public T top()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    {
        T topOfStack = null;
        if (isEmpty())
            throw new StackUnderflowException("Top attempted on an empty stack.");
        else
            topOfStack = elements[topIndex];
        return topOfStack;
    }

    public boolean isEmpty()
    // Returns true if this stack is empty, otherwise returns false.
    {
        return (topIndex == -1);
    }

    public boolean isFull()
    // Returns true if this stack is full, otherwise returns false.
    {
        return (topIndex == (elements.length - 1));
    }

    public String toString()
    {
       String currStackRep = "";
       for (int i = topIndex; i >= 0; i--)
          currStackRep = currStackRep + elements[i].toString() + " ";
       return currStackRep;
    }

    public int size()
    {
        topIndex = elements.length;
        return topIndex;
    }

    public void popSome(int count)
    {
        for(int i = 0; i < count; i++)
        {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    public boolean swapStart()
    {
        T firstElement;
        T sndElement;
        System.out.println(elements.length);
        if(elements.length < 1)
            return false;
        else
            firstElement = elements[topIndex];
            sndElement= elements[topIndex -1];
            elements[topIndex] = sndElement;
            elements[topIndex -1] = firstElement;
        return true;
    }
}