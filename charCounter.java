import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class charCounter {
public File file;
public Scanner scan;
public String message;
public int newLines;
public charCounter(String programFileSrc) {
    file = new File(programFileSrc);
    try {
        scan = new Scanner(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }  
    newLines=1;
	message="";
        
}
/**
 * Goes through any valid file to check if any lines have more characters than the length limit.
 * The method will print out the number of any line which exceeds the length limit
 **/
public void charCounts(int lengthLimit){
    int numOfFixes=0;
    while(scan.hasNext()) {
        message=scan.nextLine();
        if(message.length()>lengthLimit){
            System.out.println(message);
            System.out.println("LINE "+ newLines+" has more than "+lengthLimit+" characters");
            numOfFixes++;
        }
        newLines++;
    }
    if(numOfFixes==0){
        System.out.println("All lines have valid length");
    }
}
}
