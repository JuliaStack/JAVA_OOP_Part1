public class Candidate extends Human{
    private String name;
    private String profession;
    private int experience;

    public Candidate(String sex, int age, String name, String profession, int experience) {
        super(sex, age);
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Candidate1{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getExperience() {
        return experience;
    }
}
