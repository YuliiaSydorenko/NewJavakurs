package homeworksss.homework38.sportsmans;

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Sportsman other) {
        return this.name.compareTo(other.name); // Естественная сортировка по имени
    }

    @Override
    public String toString() {
        return "Sportsman{name='" + name + "', age=" + age + ", score=" + score + "}";
    }
}
