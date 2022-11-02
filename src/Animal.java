import java.util.Objects;

public abstract class Animal {
    private final String name;
    private final Integer age;
    private String residence;

    public Animal(String name, Integer age, String residence) {
        this.name = name;
        this.age = age <= 0 ? 1 : age;
        setResidence(residence);
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        if (residence == null || residence.isBlank()) {
            this.residence = "Неизвестно";
        } else {
            this.residence = residence;
        }
    }

    public void sleep() {
        System.out.println(getName() + "Спит крепко и долго");
    }

    public abstract void eat();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name) && residence.equals(animal.residence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, residence);
    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}