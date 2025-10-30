// Rock, Paper, Scissors
//
// Features:
// - User plays against a computer that chooses randomly
// - User can play until they or the computer win (replay automatically on draws)
// - User can play multiple rounds of RPS

// final marks these as constants, which means we can never reassign them
// we use named constants to avoid arbitrary "magic numbers" in the middle of
// our code
final int DRAW = 0;
final int USER_WINS = 1;
final int COMP_WINS = -1;

void main() {
    // print some kind of welcome message
    IO.println("Welcome to Rock, Paper, Scissors!");
    // play rounds until user decides to quit
    boolean playAgain;
    do {
        // play a round
        playRound();
        // ask user whether to play another round
        String answer = IO.readln("Play again? Type y for yes or anything else for no: ");
        // repeat if user says yes
        playAgain = answer.equalsIgnoreCase("y");
    } while (playAgain);
    // asking whether a boolean == true is rendundant
    // } while (playAgain == true);
}

// arbitrary definitions we're using:
// a round is where we play until somebody wins
// a game is where we play once and it could end in a draw
// a round therefore may consist of many games
void playRound() {
    int winner;
    // play a game: if there's a draw, repeat until no draw
    do {
        winner = playGame();
    } while (winner == DRAW);
}

int playGame() {
    // prompt user for their choice
    String userChoice = promptUser();
    // generate random choice for computer
    String compChoice = promptComp();
    // determine winner
    int winner = whoWon(userChoice, compChoice);

    // print choices
    IO.println(String.format("You chose %s, computer chose %s.", userChoice, compChoice));

    // print winner message
    switch (winner) {
        case USER_WINS -> IO.println("You win!");
        case COMP_WINS -> IO.println("The computer wins!");
        case DRAW -> IO.println("It's a draw!");
        default -> IO.println("ERROR");
    };

    return winner;
}

String promptUser() {
    String choice = IO.readln("Choose rock, paper, or scissors: ").toLowerCase();
    while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
        IO.println("ERROR: that's not a valid choice.");
        choice = IO.readln("Choose rock, paper, or scissors: ").toLowerCase();
    }
    return choice;
}

String promptComp() {
    return switch ((int)(Math.random() * 3)) {
        case 0 -> "rock";
        case 1 -> "scissors";
        case 2 -> "paper";
        // should never happen because of how we generated the random number
        // compiler needs us to return something because it can't verify
        // that the number will always be 0-2
        default -> null;
    };
}

int whoWon(String user, String comp) {
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




