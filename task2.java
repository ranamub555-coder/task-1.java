import java.util.Scanner;

public class array {

    static Scanner sc = new Scanner(System.in);

    static int[][] arr = new int[3][3];

    static void addValue() {
    	int row,col;
    do {
        System.out.print("Enter row (0-2): ");
         row = sc.nextInt();

    	if(row>=3) {
    		System.out.println("this is doesnot exist");
    	}	
    	}while(row>=3);
    do {
        System.out.print("Enter column (0-2): ");
         col = sc.nextInt();
    	if(col>=3) {
    		System.out.println("this is doesnot exist");
    	}
    	}while(col>=3);
    	
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        arr[row][col] = value;

        System.out.println("Value added successfully.");
    }
    static void deleteValue() {

        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();

        arr[row][col] = 0;

        System.out.println("Value deleted successfully.");
    }
    static void searchValue() {

        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (arr[i][j] == value) {

                    System.out.println(
                        "Value found at row " + i +
                        " and column " + j
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }
    }
    static void display() {

        System.out.println("\n2D Array:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Value");
            System.out.println("2. Delete Value");
            System.out.println("3. Search Value");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addValue();
                    break;

                case 2:
                    deleteValue();
                    break;

                case 3:
                    searchValue();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
import java.util.Scanner;
class queue1 {
    int f = -1, r = -1;
    int n = 10;
    int q[] = new int[n];

    void enqueue(Scanner sc) {
        if (f == (r + 1) % n) {
            System.out.println("Overflow Condition");
        } else {
            System.out.println("Enter data");
            int i = sc.nextInt();
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                q[r] = i;
            } else {
                r = (r + 1) % n;
                q[r] = i;
            }
        }
    }

    void dequeue() {
        if (f == -1 && r == -1) {
            System.out.println("Underflow");
        } else if (f == r) {
            System.out.println("Underflow"); 
            f = -1;
            r = -1;
        } else {
            f = (f + 1) % n;
        }
    }

    void display() {
        int i;
        if (f == -1 && r == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Items are");
            for (i = f; i != r; i = (i + 1) % n) {
                System.out.println(q[i]);
            }
            System.out.println(q[r]);
        }
    }
}

public class cqueue {
    public static void main(String args[]) {
        int d;
        Scanner sc = new Scanner(System.in);
        queue1 s = new queue1();
        int l = 1;

        do {
            System.out.println("press 1 to  enqueue");
            System.out.println("press 1 to dequeue");
            System.out.println("press 1 to  display");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            
            switch (d) {
                case 1:
                    {
                        s.enqueue(sc);
                        break;
                    }
                case 2:
                    {
                        s.dequeue();
                        break;
                    }
                case 3:
                    {
                        s.display();
                        break;
                    }
            }
            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("Enter any key to exit");
          
        } while (l == 1);
        
        System.out.println("Exit successfully");
    }
}
import java.util.Scanner;

class queue3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node f = null; 
    Node r = null; 

    
    public void enqueue(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        if (f == null) {
            f = new_node;
            r = new_node;
        } else {
            r.next = new_node;
            r = new_node;
        }
    }

  
    public void dequeue() {
        if (f == null) {
            System.out.print("underflow");
        } else {
            f = f.next;
        }
    }

  
    public void display() {
        Node temp = f;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        queue3 s = new queue3();
        int l;

        do {
            System.out.println("press 1 to enqueue");
            System.out.println("press 2 to  dequeue");
            System.out.println("press 3 to  display");
            System.out.println("Enter your choice ");
            d = sc.nextInt();

            switch (d) {
                case 1: {
                    s.enqueue(sc);
                    break;
                }
                case 2: {
                    s.dequeue();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }

            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("Enter any key to exit");
            l = sc.nextInt();

        } while (l == 0);
        System.out.println("Exit successfully");
    }
}
import java.util.Scanner;
class Stack3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push(Scanner sc) {
        System.out.println("Enter data");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        if (top == null) {
            top = new_node;
        } else {
            Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        else if (top.next == null) {
            top = null;
        } 
        else {
            Node temp = top;
            Node ptr = top.next;

            while (ptr.next != null) {
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = null; 
        }
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Stack3 s = new Stack3();
        int I;

        do {
            System.out.println("press 1 to push");
            System.out.println("press 2 to pop");
            System.out.println("press 3 to display");
            System.out.println("Enter your choice");
            d = sc.nextInt();

            switch (d) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }

            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("Enter any key to exit");
            I = sc.nextInt();

        } while (I == 0);

        System.out.println("Exit successfully");
    }
}
