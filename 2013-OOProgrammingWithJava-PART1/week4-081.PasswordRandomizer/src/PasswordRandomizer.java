import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    
   private int number; 
   private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.number = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        
        
        for(int i = 0; i < number; i++){
        int randomNum = random.nextInt((characters.length()));
        char symbol = characters.charAt(randomNum);
        
        password += symbol;
        }
        
        return password;
    }
}
