public class Human {
    private String sex;
    private int age;

    public Human(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
