/*
Your program should accept a file as its first argument. The file contains
multiple separated lines; each line contains 3 numbers that are space delimited.
The first number is the first divider (X), the second number is the second
divider (Y), and the third number is how far you should count (N). You may 
assume that the input file is formatted correctly and the numbers are valid 
positive integers.

Print out the series 1 through N replacing numbers divisible by X with “F”,
numbers divisible by Y with “B” and numbers divisible by both with “FB”. Since
the input file contains multiple sets of values, your output should print 
out one line per set. Ensure that there are no trailing empty spaces in each 
line you print.
 */
package fizzbuzz;

import java.io.*;

/**
 *
 * @author Scott
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        File file = new File(args[0]);

        // Read file
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        
        String line;

        while((line = buffer.readLine()) != null) {
            line = line.trim();
            fizzBuzz(line);
        }   

        // Always close files.
        buffer.close();         
    }
    
    public static void fizzBuzz(String line) {
        // variables
        int firstDivider;
        int secondDivider;
        int inputLength;
        
        String[] tokens = line.split(" ");
        
        firstDivider = Integer.parseInt(tokens[0]);
        secondDivider = Integer.parseInt(tokens[1]);
        inputLength = Integer.parseInt(tokens[2]);
        
        // Output
        for(int i = 1; i <= inputLength; i++) {
            if((i % firstDivider == 0) && (i % secondDivider == 0))
                System.out.print("FB ");
            else if(i % firstDivider == 0)
                System.out.print("F ");
            else if(i % secondDivider == 0)
                System.out.print("B ");
            else
                System.out.print(i + " ");            
        }
        System.out.printf("%n");
        
    }
}
