public class Vacancy {
    private String title;
    private int experience;
    private int salary;

    public Vacancy(String title, int experience, int salary) {
        this.title = title;
        this.experience = experience;
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }
}

