//Class of Stack with characters 
class SC
{
    //Array and size of characters
    private char[] elements;
    private int size;

    //Default Contructor of SC
    public SC() 
    {
        size = 0;
        //array of 12 elements at beggining
        elements = new char[12];
    }

    //Checking if stack empty
    public boolean EmptyStack()
    {
        if(size == 0)
            return true;
        else
            return false;
    }
//Cheking if stack full
    public boolean FullStack()
    {
        if(size == elements.length)
            return true;
        else
            return false;
    }
 //Adding characters method to stack
    public void push(char item) 
    {
        //Resize(size + 1);
        if(!FullStack())
        {
            System.out.println("Character " + item + " inserted succesfully! ");
            elements[size] = item;
            size++;
        }
        else
        {
            System.out.println("stack error, Cannot add more elements, STACK IS FULL! ");
        }
    }
//Peeking top of Stack
    public char peek() 
    {
        if (EmptyStack()) 
        {
           System.out.println("Empty stack!");
           return 0;
        }
        else
        {

            return elements[size - 1];
        }
    }
  //Popping character from Stack
    public char pop() 
    {
        if (EmptyStack()) 
        {
            System.out.println("STACK ERROR, Empty stack cannot pop!");
           return 0;
        }
        else
        {
            System.out.println("Character " + elements[size-1] + " popped! ");
            return elements[--size];
        }
    }

}
public class SCtest
{
    public static void main(String[] args)
    {
        SC stack1 = new SC();
        stack1.peek();
        stack1.pop();


        stack1.push('q');
        stack1.push('w');
        System.out.println(stack1.peek());

        stack1.pop();
        System.out.println(stack1.peek());
  	stack1.push('m');
        stack1.push('n');
        stack1.push('b');
        stack1.push('v');
        stack1.push('c');
        stack1.push('x');
        stack1.push('z');
        stack1.push('l');
        stack1.push('k');
        stack1.push('j');
        stack1.push('h');
        stack1.push('g'); //the stack is full and you cannot add more elements


    }
}
