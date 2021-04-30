import java.io.*;
import java.util.Scanner;


public class main2 {
public static void main(String args[]) throws IOException
{

Scanner myObj = new Scanner(System.in);  // Create a Scanner object
System.out.println("Enter Character");

char input_char = myObj.nextLine().charAt(0);  // Read user input

FileReader in = null;
in = new FileReader("text.txt");



int c;
int counter = 0;

while ((c = in.read()) != -1) {
//System.out.print((char)c);

if((char)c == input_char){
    counter++;
}

}

System.out.println("character exists " + counter + " times");


}
}


