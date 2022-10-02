import java.util.Scanner;

public class Chapter2_28_ArrayBounded_PatriciaAntlitz extends ArrayBoundedStack
{
    Scanner scnr = new Scanner(System.in);
    public int arrayMax, userInt, popCount;
    public String userSelection = "";
    public boolean keepGoing = true;

    public void printMenu()
    {
        System.out.println("What operation would you like to perform? (Enter The Corresponding Number.)");
        System.out.println("1)   |---- Push (push();) ---------------| ");
        System.out.println("2)   |---- Pop (pop();) -----------------| ");
        System.out.println("3)   |---- Show Top Element (top();) ----| ");
        System.out.println("4)   |---- Print Stack (toString();) ----| ");
        System.out.println("5)   |---- Print Size (size();) ---------| ");
        System.out.println("6)   |---- Swap Start (swapStart();) ----| ");
        System.out.println("7)   |---- Pop Some (popSome();) --------| ");
        System.out.println("8)   |---- Print MENU -------------------| ");
        System.out.println("9)   |---- EXIT -------------------------| ");
    }

    public void userSelection()
    {
        System.out.println("ArrayBoundedStack(maxCount) example:");
        System.out.println("\nEnter Stack size: ");
        arrayMax = scnr.nextInt();
        printMenu();

        StackInterface<String> testDriverLimit = new ArrayBoundedStack<>(arrayMax);

        while(keepGoing)
        {
            userInt = scnr.nextInt();

            switch (userInt)
            {
                case 1:
                    System.out.println("Push:");
                    System.out.println("Enter " + arrayMax + " elements:");
                    //index 0
                    userSelection = scnr.nextLine();
                    elements[0] = userSelection;
                    //remaining indexes
                    for(int j = 0; j < arrayMax; j++)
                    {
                        userSelection = scnr.nextLine();
                        testDriverLimit.push(userSelection);
                    }
                    break;
                case 2:
                    System.out.println("Top Popped: " + testDriverLimit.top());
                    testDriverLimit.pop();
                    break;
                case 3:
                    System.out.println("Top Element = " + testDriverLimit.top());
                    break;
                case 4:
                    if(testDriverLimit.isEmpty())
                    {
                        System.out.println("Stack is Empty, Please Enter 1 to Push:");
                        break;
                    }
                    else {

                        System.out.println("Print Stack:");
                        System.out.println(testDriverLimit.toString());
                    }
                    break;
                case 5:
                    System.out.println("Size of Stack:");
                    System.out.println(((ArrayBoundedStack<String>) testDriverLimit).size());
                    break;
                case 6:
                    ((ArrayBoundedStack<String>) testDriverLimit).swapStart();
                    System.out.println("Swapped!");
                    break;
                case 7:
                    System.out.println("Enter Amount To Pop:");
                    popCount = scnr.nextInt();
                    System.out.println(popCount + " Elements Popped.");
                    ((ArrayBoundedStack<String>) testDriverLimit).popSome(popCount);
                    break;
                case 8:
                    printMenu();
                    break;
                case 9:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Select The Next Operation, or Enter 9 to See The Menu:");
            }
            System.out.println("Select The Next Operation, or Enter 9 to See The Menu:");
        }
    }

    public static void main(String[] args)
    {

        Chapter2_28_ArrayBounded_PatriciaAntlitz runMethods = new Chapter2_28_ArrayBounded_PatriciaAntlitz();
        runMethods.userSelection();
    }
}