public class Wordle {
    public static void main(String[] args) {
        // If we want to see all the program arguments
        // System.out.print("Program args (length = " + args.length + "): ");
        // for (int i = 0; i < args.length; i++) {
        //     System.out.print(args[i] + ", ");
        // }
        // System.out.println();

        // select a secret word
        String secret;
        if (args.length > 0) {
            secret = args[0];
        } else {
            secret = "tinge";
        }
        System.out.println("The secret is " + secret);

        // we need a scanner to read user input
        java.util.Scanner input = new java.util.Scanner(System.in);

        // give the user up to 6 guesses
        for (int i = 0; i < 6; i++) {
            // user guess will return whether the user's guess was right
            if (userGuess(secret, input)) {
                // if user guessed correctly, then we exit early
                break;
            }
        }

        input.close();
    }

    static boolean userGuess(String secret, java.util.Scanner input) {
        // prompt user for a guess
        System.out.println("Guess a word:");
        String guess = input.nextLine();
        // TODO: validate input

        // print feedback
        printFeedback(secret, guess);

        // decide whether user wins and return answer
        return secret.equalsIgnoreCase(guess);
    }

    static void printFeedback(String secret, String guess) {
        secret = secret.toLowerCase();
        guess = guess.toLowerCase();

        // TODO: correctly handle edge cases involving multiple letters
        // TODO: use ANSI escapes to make the feedback look better

        System.out.println("Feedback");
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                // letter is correct and in the right spot
                System.out.println("\t" + guess.charAt(i) + " is correct");
            } else if (secret.indexOf(guess.charAt(i)) != -1) {
                // letter is correct but in the wrong spot
                System.out.println("\t" + guess.charAt(i) + " is in the wrong position");
            } else {
                // letter is not in the word
                System.out.println("\t" + guess.charAt(i) + " is incorrect");
            }
        }
    }
}
