import java.util.Scanner;

public class LibraryBookshelf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter bookshelf capacity: ");
        int capacity = input.nextInt();
        int[] bookShelf = new int[capacity];
        int currentSize = 0;

        int choice;

        do {

            System.out.println("----- LIBRARY BOOKSHELF MENU -----");
            System.out.println("1. Add new Book ID");
            System.out.println("2. Insert Book ID at specific index");
            System.out.println("3. Fill bookshelf");
            System.out.println("4. Delete last Book ID");
            System.out.println("5. Delete Book ID by index");
            System.out.println("6. Display all Book IDs");
            System.out.println("7. Search Book ID");
            System.out.println("8. Get Book ID at index");
            System.out.println("9. Replace/Update Book ID at index");
            System.out.println("10. Show current number of books");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

               
                case 1:

                    if (currentSize == capacity) {

                        System.out.println("Bookshelf is full!");

                    } else {

                        System.out.print("Enter Book ID: ");
                        int bookID = input.nextInt();

                        bookShelf[currentSize] = bookID;

                        currentSize++;

                        System.out.println("Book ID added successfully.");
                    }

                    break;


                
                case 2:

                    if (currentSize == capacity) {

                        System.out.println("Bookshelf is full!");

                    } else {

                        System.out.print("Enter index: ");
                        int index = input.nextInt();

                        if (index < 0 || index >=bookShelf.length) {

                            System.out.println("Invalid index!");

                        } else {

                            System.out.print("Enter Book ID: ");
                            int bookID = input.nextInt();

                           
                            for (int i = currentSize; i > index; i--) {

                                bookShelf[i] = bookShelf[i - 1];
                            }

                            
                            bookShelf[index] = bookID;

                            currentSize++;

                            System.out.println("Book ID inserted successfully.");
                        }
                    }

                    break;


               
                case 3:

                    if (currentSize == capacity) {

                        System.out.println("Bookshelf is already full!");

                    } else {

                        while (currentSize < capacity) {

                            System.out.print("Enter Book ID: ");

                            bookShelf[currentSize] = input.nextInt();

                            currentSize++;
                        }

                        System.out.println("Bookshelf is now full.");
                    }

                    break;


                
                case 4:

                    if (currentSize == 0) {

                        System.out.println("Bookshelf is empty!");

                    } else {

                        System.out.println("Deleted Book ID: "
                                + bookShelf[currentSize - 1]);

                        currentSize--;

                        System.out.println("Last Book ID deleted successfully.");
                    }

                    break;


                
                case 5:

                    if (currentSize == 0) {

                        System.out.println("Bookshelf is empty!");

                    } else {

                        System.out.print("Enter index to delete: ");

                        int index = input.nextInt();

                        if (index < 0 || index >= currentSize) {

                            System.out.println("Invalid index!");

                        } else {

                            System.out.println("Deleted Book ID: "
                                    + bookShelf[index]);

                           
                            for (int i = index; i < currentSize - 1; i++) {

                                bookShelf[i] = bookShelf[i + 1];
                            }

                            currentSize--;

                            System.out.println("Book ID deleted successfully.");
                        }
                    }

                    break;


                
                case 6:

                    if (currentSize == 0) {

                        System.out.println("Bookshelf is empty!");

                    } else {

                        System.out.println("\nBook IDs currently on shelf:");

                        for (int i = 0; i < bookShelf.length; i++) {

                            System.out.println(
                                    "Index " + i
                                    + " = Book ID "
                                    + bookShelf[i]
                            );
                        }
                    }

                    break;


               
                case 7:

                    if (currentSize == 0) {

                        System.out.println("Bookshelf is empty!");

                    } else {

                        System.out.print("Enter Book ID to search: ");

                        int searchID = input.nextInt();

                        boolean found = false;

                        for (int i = 0; i < currentSize; i++) {

                            if (bookShelf[i] == searchID) {

                                System.out.println(
                                        "Book ID found at index: " + i
                                );

                                found = true;

                                break;
                            }
                        }

                        if (found == false) {

                            System.out.println("Book ID not found!");
                        }
                    }

                    break;


              
                case 8:

                    System.out.print("Enter index: ");

                    int index = input.nextInt();

                    if (index < 0 || index >= currentSize) {

                        System.out.println("Invalid index!");

                    } else {

                        System.out.println(
                                "Book ID at index "
                                + index
                                + " is: "
                                + bookShelf[index]
                        );
                    }

                    break;


              
                case 9:

                    System.out.print("Enter index: ");

                    index = input.nextInt();

                    if (index < 0 || index >= currentSize) {

                        System.out.println("Invalid index!");

                    } else {

                        System.out.print("Enter new Book ID: ");

                        int newBookID = input.nextInt();

                        bookShelf[index] = newBookID;

                        System.out.println(
                                "Book ID updated successfully."
                        );
                    }

                    break;


             
                case 10:

                    System.out.println(
                            "Current number of books on shelf: "
                            + currentSize
                    );

                    break;


            
                case 11:

                    System.out.println(
                            "Exiting Library Bookshelf System..."
                    );

                    break;


                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 11);
    }
}
import java.util.Scanner;
class tokennumber{
Scanner sc=new Scanner(System.in);
int	fornt=-1;
int rear=-1;
int n;
int i;
int tokennumber[];
tokennumber(){
	System.out.println("Enter the size of Queue");
	
	n= sc.nextInt();
	tokennumber=new int [n];
}
void enqueue() {
	if(rear==(n-1)) {
		System.out.println("Queue is Full");
	}
	else {
		System.out.print("Enter the number");
		 i=sc.nextInt();
		if(fornt==-1 && rear==-1) {
		fornt=0;
		rear=0;	
		tokennumber[rear]=i;
		System.out.println("Values are inserted");
	}
	else {
		rear++;
		tokennumber[rear]=i;
	}
	}
}
void Dequeue(){
	if(fornt==-1 && rear==-1) {
		System.out.println("Queue is Empty");
	}
	else {
		System.out.println("Values are deleted"+tokennumber[fornt]);
		fornt++;
	}
}
void display() {
	for(int a=fornt;a<=rear;a++) {
		System.out.print("Displayed Values"+tokennumber[a]);
	}
}
	 void size() {
		 System.out.println("Size of the Queue"+ (rear-fornt));
		     }
		     void empty(){
		     	if(fornt==-1 && rear==-1) {
		     		System.out.println("queue is Empty");
		     	}
		     	
		     	else	{
		     			System.out.println("queueis not Empty");	
		     		}
		     }
		     void full() {
		     	if(rear==(n-1)) {
		             System.out.println("queue is Full"); 
		     	}
		     	else {
		             System.out.println("queue is not Full"); 
		     	}
}
}

public class token { 
	public static void main(String[] args) {
    tokennumber t= new tokennumber();
    Scanner sc = new Scanner(System.in);
    int d, e;

    do {
        System.out.println("Press 1 for EnQueue");
        System.out.println("Press 2 for Dequeeu");
        System.out.println("Press 3 for Display");
        System.out.println("Press 4 for size"); 
        System.out.println("Press 5 for empty"); 
        System.out.println("Press 6 for Full"); 
        System.out.println("Press 7 for Exit:");
        System.out.println("Enter your choice:");
        d = sc.nextInt();

        switch (d) {
            case 1:
                t.enqueue();
                break;
            case 2:
                t.Dequeue();
                break;
            case 3:
                t.display();
                break;
            case 4:
            	t.size();
            	break;
            case 5:
            	t.empty();
            	break;
            case 6:
            	t.full();
            	break;
            
            case 7:

                System.out.println(
                        "Exiting Library Bookshelf System..."
                );
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Press 0 to continue, or any other number to exit:");
        e = sc.nextInt();
    } while (e == 0);
}
} 
import java.util.Scanner;

class StackHelper {
    int top = -1;
    int n;
    int plates[];
    Scanner sc = new Scanner(System.in);

    StackHelper() {
        System.out.println("Enter the size of the stack:");
        n = sc.nextInt();
        plates= new int[n];
    }

    void push() {
    	
        if (top == (n - 1)) {
            System.out.println("Stack Overflow");
        } else {
            System.out.println("Please enter the value:");
            int i = sc.nextInt();
            top++;
            plates[top] = i;
            System.out.println("Value Entered");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Deleted value: " + plates[top]);
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
                       for (int j = top; j >= 0; j--) {
                System.out.println(plates[j]);
            }
        }
    }
    void size() {
System.out.println("Size of the Stack"+top);
    }
    void empty(){
    	if(top==-1) {
    		System.out.println("Stack is Empty");
    	}
    	
    	else	{
    			System.out.println("Stack is not Empty");	
    		}
    }
    void full() {
    	if(top==(n-1)) {
            System.out.println("Stack is Full"); 
    	}
    	else {
            System.out.println("Stack is not Full"); 
    	}
    }
}

public class Stack {
    public static void main(String[] args) {
        StackHelper s = new StackHelper();
        Scanner sc = new Scanner(System.in);
        int d, e;

        do {
            System.out.println("Press 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Display");
            System.out.println("Press 4 for size"); 
            System.out.println("Press 5 for empty"); 
            System.out.println("Press 6 for Full"); 
            System.out.println("Press 7 for Exit:");
            System.out.println("Enter your choice:");
            d = sc.nextInt();

            switch (d) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                	s.size();
                	break;
                case 5:
                	s.empty();
                	break;
                case 6:
                	s.full();
                	break;
                case 7:

                    System.out.println(
                            "Exiting Library Bookshelf System..."
                    );
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println("Press 0 to continue, or any other number to exit:");
            e = sc.nextInt();
        } while (e == 0);
    }
}
