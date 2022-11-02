public class Flying extends Bird{

    public Flying(String name, Integer age, String residence, String movementType) {
        super(name, age, residence, movementType);
    }

    @Override
    public void go() {
        System.out.println(getName() + " умеет летать и ходить");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест все, что найдет");
    }

    public void fly() {
        System.out.println(getName() + " летает");
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getName() + " лет, среда проживания - " + getResidence() +
                ", тип перемещения - " + getMovementType() + ", к какому классу относится - " + Flying.getClass();
    }
}
