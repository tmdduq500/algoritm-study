import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String[] splitWord = word.split("");

        int time=0;
        for(int i = 0; i < splitWord.length; i++) {
            if(splitWord[i].equals ("A") || splitWord[i].equals ("B") || splitWord[i].equals ("C")) {
                time+=3;
            }
            else if (splitWord[i].equals ("D") || splitWord[i].equals ("E") || splitWord[i].equals ("F")) {
                time+=4;
            }
            else if (splitWord[i].equals ("G") || splitWord[i].equals ("H") || splitWord[i].equals ("I")) {
                time+=5;
            }
            else if (splitWord[i].equals ("J") || splitWord[i].equals ("K") || splitWord[i].equals ("L")) {
                time+=6;
            }
            else if (splitWord[i].equals ("M") || splitWord[i].equals ("N") || splitWord[i].equals ("O")) {
                time+=7;
            }
            else if (splitWord[i].equals ("P") || splitWord[i].equals ("Q") || splitWord[i].equals ("R") || splitWord[i].equals ("S")) {
                time+=8;
            }
            else if (splitWord[i].equals ("T") || splitWord[i].equals ("U") || splitWord[i].equals ("V")) {
                time+=9;
            }
            else if (splitWord[i].equals ("W") || splitWord[i].equals ("X") || splitWord[i].equals ("Y") || splitWord[i].equals ("Z")) {
                time += 10;
            }
        }

        System.out.println(time);

    }
}
