// Rock, Paper, Scissors
//
// Features:
// - user vs computer, computer chooses randomly
// - play until there's a winner
// - after there's a winner, let user choose to play again

final int DRAW = 0;
final int USER_WINS = 1;
final int COMP_WINS = -1;

void main() {
    // welcome message
    IO.println("Welcome to Rock, Paper, Scissors!");
    // play until user says to stop
    boolean playAgain;
    do {
        // play a round
        playRound();
        // ask user if they want to play another round
        String answer = IO.readln("Play again? Enter y for yes, anything else for no: ");
        // repeat while user says yes
        playAgain = answer.equalsIgnoreCase("y");
    } while (playAgain);
    // this is redundant:
    // } while (playAgain == true);
}

// arbitrary definitions for our program:
// - round = playing until one side wins
// - game = playing once, can end in a draw
// - a round can therefore involve multiple games
void playRound() {
    // play a game
    // repeat if draw
    int outcome;
    do {
        outcome = playGame();
    } while (outcome == DRAW);
}

int playGame() {
    // prompt user
    String userChoice = promptUser();
    // prompt comp
    String compChoice = promptComp();
    // determine outcome
    int outcome = getOutcome(userChoice, compChoice);
    // print choices, outcome
    IO.println(String.format("You chose %s, computer chose %s.", userChoice, compChoice));
    switch (outcome) {
        case DRAW -> IO.println("It's a draw!");
        case USER_WINS -> IO.println("You win!");
        case COMP_WINS -> IO.println("You lost :(");
    }
    // return outcome
    return outcome;
}

String promptUser() {
    String choice = IO.readln("Choose rock, paper, or scissors: ");
    while (!(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"))) {
        IO.println("Not a valid choice, try again.");
        choice = IO.readln("Choose rock, paper, or scissors: ");
    }
    return choice;
}

String promptComp() {
    return switch ((int)(Math.random() * 3)) {
        case 0 -> "rock";
        case 1 -> "paper";
        case 2 -> "scissors";
        // need this so the compiler understands our switch is exhaustive and always
        // returns a string
        default -> null;
    };
}

int getOutcome(String user, String comp) {
    if (user.equals(comp)) {
        return DRAW;
    } else if (user.equals("rock") && comp.equals("scissors")) {
        return USER_WIN;
    } else if (user.equals("paper") && comp.equals("rock")) {
        return USER_WIN;
    } else if (user.equals("scissors") && comp.equals("paper")) {
        return USER_WIN;
    } else {
        return COMP_WIN;
    }
}
