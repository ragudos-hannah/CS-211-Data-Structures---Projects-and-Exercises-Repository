/*
 Name: Ragudos, Hannah T.
 Date: 08/18/2022

Notes:
The one-dimensional array is a static linear data structure.  The one-dimensional array is an implementation of the List ADT. The one-dimensional array may be used to hold values/objects that are logically arranged in a linear fashion.  Populating the array(i.e. Putting elements in the array), sorting the elements of the array, searching an element from the array based on a key,  and displaying the elements of the array are some of the operations that may be performed on the list.

Objective.
Create a simple application that uses the one-dimensional array as a data Structure.   In order to have an exercise on creating implementations of operations,  a code/program for the method that implements each  operation  should be written rather than using predefined methods of the array (i.e. Do not use pre-defined methods for sorting and displaying elements that are predefined in Java).

Activity:
Create an executable class that applies a Sort Algorithm and a Search algorithm on an array of Strings (i.e. names)
- In the code( e.g. in the main method), declare a one-dimensional array of String such that the array will be populated out of data that are read from a datafile(i.e. textfile).

- The class should have a method that populates an array of String out of data that are read from a data file.  The formal parameters of the method is an array of String and a String that represents a filename.

- The class should have a method that implements a sort Algorithm(e.g. Selection Sort Algorithm). The method for sorting should have a one-dimensional array of String as formal parameter.

- The class should have a method that implements a search algorithm(e.g. Linear Search algorithm).  The method for searching should have a one-dimensional array of String and a search key of type String as formal parameters.

- The class should have a method that displays the elements of a one-dimensional array.

 - Let the program show the elements of the array before the sorting happens

 - Let the program show the elements of the array after sorting

- Let the computer accept a string to be searched from the array then let the computer specify whether the string is found in the array or not.

 - Show that sample output/run of the program through multiple line comments in the source file
( i.e. After running the programming, copy and paste the output within a comment section of the source code).



 Main Algorithm:
(Sample only)
 1. Declare an array of String.
 2.  Populate the array of String using the method for populating the array with data that are read from a datafile.
 3. Display the elements of the array using the method for showing the elements of an array
 4. Sort the elements of the array using the method for sorting the elements of the array.
 5. Display the elements of the sorted array using the method for showing the elements of an array
 6. Display a prompt message for the user to enter a search key ( depending on your program design)
 7. Let the computer check if the item being searched is in the array and display an informative message regarding the result of the search.


Additional Notes:
Using the Java programming language, the norm for creating a program that is illustrative of dealing with Data Structures are as follows***:
1. Create a java interface as a way to specify an Abstract Data Type(ADT) or Create an Abstract Class as a way to an abstract data type
2. Create a concrete class that implements the interface as a way to have a code for the Data Structure (Recall: A Data Structure is based on an ADT).
3. Create an application ( an executable program, hence, a class with the main method) that uses the concrete class.

***For this Warm up exercise, however, you do not need to create an interface or an Abstract class.  Instead, create a concrete class with the main method and other relevant methods.  Below is the general form of the expected program.

Deliverable:
The source code (i.e. Upload the *.java in this Submission Bin)

 */

package prelim.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RagudosHannahProgrammingExercise1 {

    public static void main(String[] args) {
        // Declare an array of String with space for 10 names
        String[] names = new String[10];
        String filename = "D:\\RagudosHannah\\src\\prelim\\exercises\\participants.txt";

        // Populate the array of String using the method for populating the array with data that are read from a datafile
        populateArray(names, filename);

        // Display a description before showing the elements of the array
        System.out.println("These are the names of filmmakers who participated in FDCP Film Writing Lab");

        // Display the elements of the array using the method for showing the elements of an array
        System.out.println("\nOriginal Order of Data:");
        showElements(names);

        // Sort the elements of the array using the method for sorting the elements of the array
        sortArray(names);

        // Display the elements of the sorted array using the method for showing the elements of an array
        System.out.println("\nSorted Data:");
        showElements(names);

        // Display a prompt message for the user to enter a search key
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a name to search: ");
        String searchKey = scanner.nextLine();
        scanner.close(); // end of scanner

        // Let the computer check if the item being searched is in the array and display a message of the result
        int searchResult = searchElement(names, searchKey);
        if (searchResult != -1) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found.");
        } // end of if-else statement
    } // end of main method

    public static void populateArray(String[] array, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null && i < array.length) {
                array[i++] = line;
            } // end of while loop
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } // end of try-catch block
    } // end of populateArray method

    public static void sortArray(String[] array) {
        String temp;
        int minIndex = 0;
        for (int x = 0; x < array.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < array.length; y++) {
                if (array[minIndex].split("\\s+")[1].compareToIgnoreCase(array[y].split("\\s+")[1]) > 0) {
                    minIndex = y;
                }
            } // end of inner for loop
            if (minIndex != x) {
                temp = array[x];
                array[x] = array[minIndex];
                array[minIndex] = temp;
            } // end of if statement
        } // end of outer for loop
    } // end of sortArray method

    public static void showElements(String[] array) {
        for (String element : array) {
            if (element != null) {
                System.out.println(element);
            } // end of if statement
        } // end of for-each loop
    } // end of showElements method

    public static int searchElement(String[] array, String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(key)) {
                return i;
            } // end of if statement
        } // end of for loop
        return -1;
    } // end of searchElement method
} // end of class

/*
Sample output:
These are the names of filmmakers who participated in FDCP Film Writing Lab

Original Order of Data:
Hannah Ragudos
Jezreel Necesito
Mark Giddel Liwanag
Marianne Mae Soliman
Raquel Rivera
Francis Pimentel
Arvin Belarmino
Tim Villanueva
Zig Dulay
Carlo Obispo

Sorted Data:
Arvin Belarmino
Zig Dulay
Mark Giddel Liwanag
Marianne Mae Soliman
Jezreel Necesito
Carlo Obispo
Francis Pimentel
Hannah Ragudos
Raquel Rivera
Tim Villanueva

Enter a name to search: hannah ragudos
Name found

Process finished with exit code 0

*/
