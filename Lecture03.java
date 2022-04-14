//Rithy Sophorn
//Date: 4/12/2022

class Lecture03 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 03");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 21. Consider the following variable declarations:
        // Integer n1 = 15;
        // Integer n2 = 7;
        // Integer n3 = 15;
        // String s1 = "computer";
        // String s2 = "soda";
        // String s3 = "pencil";

        // Indicate whether the result of each of the following comparisons is positive,
        // negative, or 0:

        // A: positive
        // n1.compareTo(n2)
        // B: 0
        // n3.compareTo(n1)
        // C: negative
        // n2.compareTo(n1)
        // D: negative
        // s1.compareTo(s2)
        // E: positive
        // s3.compareTo(s1)
        // F: 0
        // s2.compareTo(s2)

        // 22. Use the compareTo method to write code that reads two names from the
        // console and prints the one that comes first in alphabetical order. For
        // example, the program’s output might look like the following:

        // Type a name: Tyler Durden
        // Type a name: Marla Singer
        // Marla Singer goes before Tyler Durden

        /*
        import java.util.*;

        public class name {
            public static void main (String [] args) {
                Scanner console = new Scanner (System.in);

                System.out.print("Type a name: ");
                String name1 = console.nextLine();
                System.out.print("Type a name: ");
                String name2 = console.nextLine();

                if (name1.compareTo(name2) > 0) {
                    System.out.println(name2 + " goes before " + name1);
                }
                if (name1.compareTo(name2) < 0) {
                    System.out.println(name1 + " goes before " + name2);
                }
            }
        }
        */

        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:

        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to

        /* 
        import java.util.*;

        public class messageSort {
            public static void main (String [] args) {
                Scanner console = new Scanner(System.in);

                System.out.print("Type a message to sort: ");
                String message = console.nextLine();
                String [] spacingMessage = message.split(" ");
                Arrays.sort(spacingMessage);

                System.out.print("Your message sorted: ");
                for (String msg : spacingMessage) {
                    System.out.print( msg + " ");
                }
            }
        }
        */

        // EXERCISES:

        // None
    }
}
