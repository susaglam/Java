package a_review.week13;

import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Hamdullah", 25, 'M', "A01", "QA", 55, true);
        Tester tester2 = new Tester("Aynur", 25, 'F', "A02", "SDET", 50, true);
        Tester tester3 = new Tester("Berkay", 25, 'M', "A03", "QA", 58, true);
        Developer developer1 = new Developer("Sukru", 42, 'M', "B01", "Java Developer", 65, true);
        Developer developer2 = new Developer("Baha", 25, 'M', "B02", "Frontend Developer", 66, true);
        Developer developer3 = new Developer("Ayse", 25, 'F', "B03", "Backend Developer", 59, true);
        Developer developer4 = new Developer("Leyla", 29, 'F', "B04", "Backend Developer", 50, true);

        ScrumTeam scrum1 = new ScrumTeam("Fatih", "Ali", "Osman");
        scrum1.hireTester(tester1);
        System.out.println(scrum1);

        Developer[] developers = {developer2, developer3, developer4};
        scrum1.hireDeveloper(developers);
        System.out.println(scrum1);

        System.out.println("===================================================");
        double budget = 0;

        // display the developers of the scrum team:
        for (Developer each : scrum1.developers) {
            System.out.println(each.name + " : " + each.calculateSalary());
            budget += each.calculateSalary();
        }

        System.out.println("=================================================");
        // display the testers of the scrum team:
        for (Tester each : scrum1.testers) {
            System.out.println(each.name + " : " + each.calculateSalary());
            budget += each.calculateSalary();
        }

        System.out.println("====================================================");
        // display the budget for developers and testers:

        System.out.println("budget = " + budget);

        System.out.println("=====================================================");
        ScrumTeam scrum2 = new ScrumTeam("Yakup", "Ilyas", "Baky");
        ScrumTeam scrum3 = new ScrumTeam("Yakup", "Ilyas", "Baky");

        ScrumTeam[] scrums = {scrum1, scrum2, scrum3};

        for (ScrumTeam eachScrum : scrums) {
            System.out.println(eachScrum);
        }


        System.out.println(Arrays.toString(scrums));


        System.out.println("========================================================");
        scrum1.terminateTester("A01");
        scrum1.terminateDeveloper("B04");
        System.out.println(scrum1);


    }
}
