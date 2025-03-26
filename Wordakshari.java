/* Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. 
The first player has to recite a word. The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning 
team is decided by a process of elimination. The person or the team that cannot come up with a word with the right consonant is eliminated. - The following rules need to
be followed while playing this game. - (i) All other words except the first word have to begin with the last letter of the previous word - (ii) No words can be repeated.
write a program to print the wordakshari chain. */

CODE :

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b = "",c = "####";
        do{
            a = sc.nextLine();
            if(b.isEmpty() || a.charAt(0) == b.charAt(b.length()-1)){
                System.out.println(a);
                b = a;
            }
        }while(!a.equals(c));
    }
}
