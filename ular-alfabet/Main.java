import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int turn = in.nextInt();
        char currChar = 'a'; 

        if (length <= 0 || turn <= 0) {
            System.out.println("Input tidak boleh kurang dari atau sama dengan 0");
            return;
        }

        for (int i = 0; i < turn; i++) {
            String body = ""; 

            for (int j = 0; j < length; j++) {
                if (currChar > 'z') currChar = 'a'; 
                if (i % 2 == 0)            
                    body += currChar;       
                else                        
                    body = currChar + body; 
                System.out.println(currChar);    
                currChar++;
            }

            System.out.println(body); 

        }

    }
}