// Month.java
void main() {
    String monthName = IO.readln("What month is it? ");
    int monthNumber = parseMonth(monthName);
    if (monthNumber == -1) {
        IO.println("That's not a valid month!");
    } else {
        IO.println(monthName + " is month number " + monthNumber + ".");
        IO.println("There are less than " + (13 - monthNumber) + " months remaining this year.");
    }
}

int parseMonth(String month) {
    return switch (month.toLowerCase()) {
        case "january", "jan" -> 1;
        case "february", "feb" -> 2;
        case "march", "mar" -> 3;
        case "april", "apr" -> 4;
        case "may" -> 5;
        case "june", "jun" -> 6;
        case "july", "jul" -> 7;
        case "august", "aug" -> 8;
        case "september", "sep" -> 9;
        case "october", "oct" -> 10;
        case "november", "nov" -> 11;
        case "december", "dec" -> 12;
        default -> -1;
    };
    // else-if is much longer and less readable
    // if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("jon")) {
    //     return 1;
    // } else ...
}

