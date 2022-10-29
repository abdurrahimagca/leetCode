import java.util.*;
public class App {

    public static boolean canConstruct(String ransomNote, String magazine){
        char [] firstWord = ransomNote.toCharArray();
        char [] secondWord = magazine.toCharArray();
        int i = 0;

        for(char c : firstWord)
        {
            for(char d : secondWord )
            {
                if( c == d)
                {

                  i++;
                  //System.out.println("found " + c + " " + d + " " + i);
                  break;  
                }
            }
        }
        //int c = firstWord.length;
        if(i == firstWord.length){
            return true;
        }
        else
            return false;
       

    }
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String ransomNote = sc.nextLine();
            String magazine = sc.nextLine();
         
            
            if(canConstruct(ransomNote, magazine)){
                System.out.println("true");
            }
            else
                System.out.println("false");



        }
    }
}
