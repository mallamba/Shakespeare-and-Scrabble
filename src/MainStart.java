/**
 * author: Louay Khalil
 */

import java.util.*;

public class MainStart{
    private static  String fileName1 = "./files/w.txt";
    private static String fileName2 = "./files/ospd.txt";

    /**
     *
     * @param args
     * A program that reads the Scrabble dictionary "ospd" and the Shakespeare wordlist "w"
     * Score the words from the Shakespeare play you are allowed to use
     * and sort them after the highest score.
     *
     * Find out which 3 allowed words from the Shakespeare play that individually
     * would make the best play in scrabble
     *
     */
    public static void main(String[] args) {
            TextFile tf = new TextFile();
            //Shakespeare wordlist
            ArrayList<String> arr1 = tf.readFile( fileName1 );
            //Scrabble dictionary
            ArrayList<String> arr2 = tf.readFile( fileName2 );
            //Score the words
            Map<String, Integer> map1 = tf.fill_h_Map( arr1 );
            //Sort after the highest score
            map1 = tf.sortByValue(map1);

            System.out.println("************************************************************");
            System.out.println("********* START ********************************************");
            System.out.println("Printing the 3 words with highest sums of points");
            System.out.println("************************************************************");
            System.out.println( tf.sortByValue(   tf.highest_3_SumWords(map1)  ).toString() );
            System.out.println("************************************************************");
            System.out.println("Printing the 3 common words with highest sums of points");
            System.out.println(tf.sortByValue(   tf.highest_common_3_SumWords(map1, arr2)  ).toString());
            System.out.println("************************************************************");
            System.out.println("********* END **********************************************");
            System.out.println("************************************************************");
        }





}
