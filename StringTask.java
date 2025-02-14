import java.util.Scanner;

public class StringTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        

        char vowels[] = {'a', 'o', 'y', 'e', 'u', 'i'};
        for ( int i = 0; i < sb.length();){
            boolean isVowel = false;

            for ( int j = 0; j < vowels.length; j++) {
                if ( sb.charAt(i) == vowels[j]) {
                    isVowel = true;
                    break;
                }    
            } 
            
            if ( isVowel) {
                sb.deleteCharAt(i);
            }
            else {
                sb.insert(i,'.');
                i+=2;
            }
        }

        System.out.println(sb);
        sc.close();
    }
}