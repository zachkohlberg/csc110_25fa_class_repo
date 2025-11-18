public class Wordle {
    public static void main(String[] args) {
        // if we want to print all program arguments
        // System.out.print("Program args: ");
        // for (int i = 0; i < args.length; i++) {
        //     System.out.print(args[i] + ", ");
        // }
        // System.out.println();

        // choose a secret word for user to guess
        String secret;
        if (args.length > 0) {
            secret = args[0];
        } else {
            secret = "joust";
        }
        System.out.println("The secret word is " + secret);

        // need a scanner to read user input
        java.util.Scanner input = new java.util.Scanner(System.in);

        // let the user make 6 guesses
        int guesses = 6;
        for (int i = 0; i < guesses; i++) {
            // make one guess and quit if user guessed correctly
            if (userGuess(secret, input)) {
                break;
            }
        }

        input.close();
    }

    static boolean userGuess(String secret, java.util.Scanner input) {
        // prompt user for a guess
        System.out.println("Enter a five-letter word.");
        String guess = input.nextLine();
        // TODO: validate input

        // print feedback
        printFeedback(secret, guess);

        // return whether user was correct
        return secret.equalsIgnoreCase(guess);
    }

    static void printFeedback(String secret, String guess) {
        // convert to lowercase before comparing
        secret = secret.toLowerCase();
        guess = guess.toLowerCase();

        // TODO: use ANSI escapes to make this look nicer
        System.out.println("Feedback:");
        for (int i = 0; i < secret.length(); i++) {
            System.out.print("\t" + guess.charAt(i) + " is ");
            if (secret.charAt(i) == guess.charAt(i)) {
                // letter is correct
                System.out.println("correct");
            } else if (secret.indexOf(guess.charAt(i)) != -1) {
                // letter is correct but in the wrong spot
                System.out.println("in the wrong spot");
            } else {
                // letter is not in the word
                System.out.println("incorrect");
            }
        }
    }
}
