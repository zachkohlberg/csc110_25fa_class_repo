public class Wordle {
    public static void main(String[] args) {
        // If we want to see everything in the args array
        // System.out.print("Program arguments (length = " + args.length + "): ");
        // for (int i = 0; i < args.length; i++) {
        //     System.out.print(args[i] + ", ");
        // }
        // System.out.println();

        // choose a secret word
        String secret;
        if (args.length > 0) {
            secret = args[0];
        } else {
            secret = "hello";
        }
        System.out.println("The word is " + secret);

        java.util.Scanner input = new java.util.Scanner(System.in);

        // let the user make up to six guesses
        for (int i = 0; i < 6; i++) {
            // user guess should return true when the user guesses correctly
            if (userGuess(secret, input)) {
                // exit loop early on a correct guess
                break;
            }
        }

        input.close();
    }

    static boolean userGuess(String secret, java.util.Scanner input) {
        // ask user for guess
        System.out.println("What is your guess?");
        String guess = input.nextLine();
        // TODO: input validation

        // print feedback
        printFeedback(secret, guess);

        // decide whether user won and return
        return secret.equalsIgnoreCase(guess);
    }

    static void printFeedback(String secret, String guess) {
        System.out.println("Feedback:");

        // TODO: use ANSI escapes to make feedback look nicer
        // TODO: handle edge cases involving double letters

        // for each character in the words, print its feedback
        for (int i = 0; i < secret.length(); i++) {
            char secretLetter = secret.charAt(i);
            char guessLetter = guess.charAt(i);
            if (secretLetter == guessLetter) {
                // correct
                System.out.println("\t" + guessLetter + " is correct");
            } else if (secret.indexOf(guessLetter) != -1) {
                // correct but in the wrong place
                System.out.println("\t" + guessLetter + " is correct but in the wrong place");
            } else {
                // incorrect
                System.out.println("\t" + guessLetter + " is incorrect");
            }
        }
    }
}
