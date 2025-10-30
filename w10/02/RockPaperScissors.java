// Rock, Paper, Scissors Design
//
// Features
// - User plays against a computer that makes random moves
// - Play until someone wins, replaying when there's a draw
// - If the user wants to play more, they can keep playing after
//   winning or losing

final int DRAW = 0;
final int USER_WINS = 1;
final int COMP_WINS = -1;

void main() {
    // print a welcome message
    IO.println("Welcome to Rock, Paper, Scissors!");
    // play rounds until user says to stop
    boolean playAgain;
    do {
        // play a round
        playRound();
        // ask user whether to continue
        String answer = IO.readln("Do you want to play another round? Enter y for yes, anything else for no: ");
        // if user says yes, then repeat
        playAgain = answer.equals("y");
    } while (playAgain);
}

// arbitrary definitions for our program:
// - round = playing until somebody wins a game
// - game = playing once, possibly ending in a draw
// - a round can therefore consist of more than one game
void playRound() {
    // play a game
    // repeat if the game was a draw
    int outcome;
    do {
        outcome = playGame();
    } while (outcome == DRAW);
}

int playGame() {
    // prompt user
    String userChoice = promptUser();
    // prompt computer
    String compChoice = promptComp();
    // determine outcome
    int outcome = getOutcome(userChoice, compChoice);
    // print outcome and choices
    IO.println(String.format("You chose %s and the computer chose %s.", userChoice, compChoice));
    switch (outcome) {
        case DRAW -> IO.println("It's a draw!");
        case USER_WINS -> IO.println("You win!");
        case COMP_WINS -> IO.println("Computer wins :(");
    }
    // return outcome
    return outcome;
}

String promptUser() {
    String choice = IO.readln("Choose rock, paper, or scissors: ").toLowerCase();

    // how to distribute a negation
    // !(a || b) ---> !a && !b
    // !(a && b) ---> !a || !b
    //
    // This will not work: to be true, we have to be rock, paper, and scissors all at the same time
    // NOT rock OR NOT paper OR NOT scissors
    //
    // These are equivalent because we're distributing the negation correctly
    // NOT (rock or paper or scissors)
    // NOT rock AND NOT paper AND NOT scissors
    //
    // This is equivalent to the loop below, just without distributing the negation
    // while (!(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"))) {
    //
    while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
        IO.println("Invalid choice, try again.");
        choice = IO.readln("Choose rock, paper, or scissors: ").toLowerCase();
    }
    return choice;
}

String promptComp() {
    return switch ((int)(Math.random() * 3)) {
        case 0 -> "rock";
        case 1 -> "paper";
        case 2 -> "scissors";
        // compiler doesn't know 0-2 are exhaustive, so we need a default case to
        // prove that we always return a string
        default -> null;
    };
}

int getOutcome(String user, String comp) {
    if (user.equals(comp)) {
        return DRAW;
    } else if (user.equals("rock") && comp.equals("scissors")) {
        return USER_WINS;
    } else if (user.equals("paper") && comp.equals("rock")) {
        return USER_WINS;
    } else if (user.equals("scissors") && comp.equals("paper")) {
        return USER_WINS;
    } else {
        return COMP_WINS;
    }
}





