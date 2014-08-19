package morse_code;
import java.util.Scanner;

/**
 *
 * @author todyertuz @ plainintricacy.wordpress.com
 * 
 * Java code that simulates a simple Morse Code reader.
 * 
 * Input: your message.
 * Output: Morse code version of your message
 * 
 */

public class Morse_Code {

    public static void main(String[] args) {
        
        String[] Morsephalbet = new String[36];
        Morsephalbet[0] = ". ---";
        Morsephalbet[1] = "--- . . .";
        Morsephalbet[2] = "--- . --- .";
        Morsephalbet[3] = "--- . .";
        Morsephalbet[4] = ".";
        Morsephalbet[5] = ". . --- .";
        Morsephalbet[6] = "--- --- .";
        Morsephalbet[7] = ". . . .";
        Morsephalbet[8] = ". .";
        Morsephalbet[9] = ". --- --- ---";
        Morsephalbet[10] = "--- . ---";
        Morsephalbet[11] = ". --- . .";
        Morsephalbet[12] = "--- ---";
        Morsephalbet[13] = "--- .";
        Morsephalbet[14] = "--- --- ---";
        Morsephalbet[15] = ". --- --- .";
        Morsephalbet[16] = "--- --- . ---";
        Morsephalbet[17] = ". --- .";
        Morsephalbet[18] = ". . .";
        Morsephalbet[19] = "---";
        Morsephalbet[20] = ". . ---";
        Morsephalbet[21] = ". . . ---";
        Morsephalbet[22] = ". --- ---";
        Morsephalbet[23] = "--- . . ---";
        Morsephalbet[24] = "--- . --- ---";
        Morsephalbet[25] = "--- --- . .";
        Morsephalbet[26] = ". --- --- --- ---";
        Morsephalbet[27] = ". . --- --- ---";
        Morsephalbet[28] = ". . . --- ---";
        Morsephalbet[29] = ". . . . ---";
        Morsephalbet[30] = ". . . . .";
        Morsephalbet[31] = "--- . . . .";
        Morsephalbet[32] = "--- --- . . .";        
        Morsephalbet[33] = "--- --- --- . .";
        Morsephalbet[34] = "--- --- --- --- .";
        Morsephalbet[35] = "--- --- --- --- ---";
        
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Scanner input = new Scanner(System.in);
        String question, answer = "";
        String[] arr = new String[alphanumeric.length()];
        for(int i=0; i<alphanumeric.length(); i++){
            arr[i] = alphanumeric.substring(i,i+1);
        }
        System.out.println("Please enter your message:");
        String in = input.nextLine().toUpperCase();
        input.close();
        System.out.println("Morse Code version of your message:");
        if(in.contains(" ")){
            String[] words = in.split(" ");
            for(int i=0; i<words.length; i++){
                for(int j=0; j<words[i].length(); j++){
                    for(int q=0; q<alphanumeric.length(); q++){
                        if(words[i].charAt(j)==alphanumeric.charAt(q)){
                            answer+=Morsephalbet[q];
                            answer+="   ";
                        }
                    }
                }
                answer+="       ";
            }
        }else{
            for(int i=0; i<in.length(); i++){
                for(int q=0; q<alphanumeric.length(); q++){
                        if(in.charAt(i)==alphanumeric.charAt(q)){
                            answer+=Morsephalbet[q];
                            answer+="   ";
                        }                    
                }
            }            
        }
        System.out.println(answer);
    }
}