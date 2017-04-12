import java.io.*;

/**
 *
 * @author Scott
 */
public class Main {

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
                System.out.printf("FB ");
            else if(i % firstDivider == 0)
                System.out.printf("F ");
            else if(i % secondDivider == 0)
                System.out.printf("B ");
            else
                System.out.printf(i + " ");            
        }
        System.out.printf("%n");
        
    }
}
