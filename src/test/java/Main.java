public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate("male", 30, "Bogdan", "Software Engineer", 5);
        Vacancy vacancy = new Vacancy("Senior Software Engineer",5, 6000);

        if (checkRequirements(vacancy,candidate)){
            System.out.println("Candidate could apply to a position of " + vacancy.getTitle() + " with salary " + vacancy.getSalary() + " USD");
        }
        else {
            System.out.println("Candidate doesn't match to requirements");
        }
    }

    public static boolean checkRequirements(Vacancy vacancy, Candidate candidate) {
        if (candidate.getExperience() >= vacancy.getExperience()) {
            return true;
        }
        else {
            return false;
        }
    }
}

