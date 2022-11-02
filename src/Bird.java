import java.util.Objects;

public class Bird extends Animal {
    private final String movementType;

    public Bird(String name, Integer age, String residence, String movementType) {
        super (name, age, residence);
        if (movementType == null || movementType.isBlank()) {
            this.movementType = "Неизвестно";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {

        return movementType;
    }


    @Override
    public void eat() {
        System.out.println(getName() + " ест тех, кого поймает");
    }

    @Override
    public void go() {
        System.out.println(getName() + " - умеет летать и ходить");
    }

    public void hunt() {
        System.out.println(getName() + " - охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird birds = (Bird) o;
        return movementType.equals(birds.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + " года, среда проживания - " + getResidence()
                + ", тип передвижения - " + movementType + ", к какому классу относится - " + Bird.getClass();
    }
}
