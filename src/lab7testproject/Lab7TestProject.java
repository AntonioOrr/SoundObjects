
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7testproject;
import BookClasses.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Antonio
 */
public class Lab7TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // set up path to where sound files are
     try {
     String path = "C:\\Users\\Antonio\\Documents\\NetBeansP\\mediasources\\";
     // specify filename of sound to test with
     String filename = "preamble.wav";
     // open the sound 
     Sound sound1 = new Sound(path + filename);
     /*Scanner sc = new Scanner(System.in);
     sound1.explore();
     while(true) {
     try {
     System.out.println("Please ender a number between -2 and 2, but not 0:");
     int num = sc.nextInt();
     sound1.soundDivision(num);
     sound1.explore();
     break;
     } catch (ArithmeticException ae){
         System.out.println("You entered a zero, which is not valid");
     } catch (InputMismatchException ime) {
         System.out.println("You must enter a number");
         sc.next();
     }*/
     FileChooser.setMediaPath(path);
     Sound sound2 = new Sound(FileChooser.getMediaPath("bassoon-c4.wav"));
     sound2.explore();
     sound2 = null;
     sound1.add(sound2);
     sound1.explore();
     } catch (NullPointerException ai){
      System.out.println("Entered source is empty");
     }
     
     
    
    
    }
    
    
}
