package a_review.week13;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime) {
        super(name, age, gender, ID, jobTitle, hourlyRate, isFullTime);
    }

    public void findBug() {
        System.out.println(jobTitle + " " + name + " found a bug");
    }

    public void testing() {
        System.out.println(jobTitle + " " + name + " is testing application");
    }
}
