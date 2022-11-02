public class Flightless extends Bird {

    public Flightless(String name, Integer age, String residence, String movementType) {
        super(name, age, residence, movementType);
    }
    @Override
    public void go() {
        System.out.println(getName() + " умеет плавать и ходить");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " любит покушац");
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + " лет, среда проживания - " + getResidence()
                + ", тип перемещения - " + getMovementType() + ", к какому классу относится - " + Flightless.getClass();
    }
}