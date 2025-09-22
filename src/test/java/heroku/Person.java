package heroku;

public class Person {
    String firstname, lastname, due;
    String from, to, departure_date,return_date;

    public Person(String firstname, String lastname, String due) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.due = due;
    }
    public Person(String from, String to, String departure_date, String return_date) {
        this.from = from;
        this.to = to;
        this.departure_date = departure_date;
        this.return_date = return_date;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstname, this.lastname);
    }

    public double getDue() {
        return Double.parseDouble(this.due.replace("$", ""));

    }
    public double departure_date() {

        return Double.parseDouble(this.departure_date.replace("$", ""));

    }
}
