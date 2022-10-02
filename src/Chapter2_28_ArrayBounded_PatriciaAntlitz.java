import java.util.Scanner;

public class Chapter2_28_ArrayBounded_PatriciaAntlitz extends ArrayBoundedStack
{
    public static int arrayMax, userInt;
    static Scanner scnr = new Scanner(System.in);
    public static String userSelection = "";

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
        System.out.println("8)   |---- Pop Top (popTop();) ----------| ");
        System.out.println("9)   |---- Print MENU -------------------| ");
    }

    public void userSelection()
    {
        System.out.println("\nArrayBoundedStack(maxCount) example:\n");
        System.out.println("\nEnter Stack size: ");
        arrayMax = scnr.nextInt();
        printMenu();

        StackInterface<String> testDriverLimit = new ArrayBoundedStack<>(arrayMax);

        while(arrayMax > 0)
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
                case 9:
                    printMenu();
                    break;
                default:
                    System.out.println("----");
            }
            System.out.println("Select The Next Operation, or Enter 9 to See The Menu:");
        }
    }

    public static void main(String[] args)
    {

        Chapter2_28_ArrayBounded_PatriciaAntlitz runMethods = new Chapter2_28_ArrayBounded_PatriciaAntlitz();
       // StackInterface<String> testDriverLimit = new ArrayBoundedStack<>(arrayMax + 1);

        runMethods.userSelection();
        System.out.println("problem");

//        for(int k = 0; k <= arrayMax; k++)
//        {
//            userSelection = scnr.nextLine();
//            System.out.println("Enter next element:");
//            testDriverLimit.push(userSelection);
//        }

       // System.out.println(" Stack " + testDriverLimit.toString());


    }
}