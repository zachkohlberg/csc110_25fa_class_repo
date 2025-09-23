// week 4 practice exercise

void main() {
    // input

    // ask for birthdate as y, m, d
    int bYear = Integer.parseInt(IO.readln("What year were you born? "));
    int bMonth = Integer.parseInt(IO.readln("What month were you born? "));
    int bDay = Integer.parseInt(IO.readln("What day were you born? "));

    // hard-code current date (we're lazy)
    int cYear = 2025;
    int cMonth = 9;
    int cDay = 23;

    // work

    // subtract the years
    int age = cYear - bYear;

    // use condition from problem 1
    boolean celebratedBirthday = bMonth < cMonth || (bMonth == cMonth && bDay <= cDay);

    // account for birthday later this year
    if (!celebratedBirthday) {
        age = age - 1;
    }

    // output

    IO.println("You are " + age + " years old.");
}
