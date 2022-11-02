public class Herbivore extends Mammal {

    public Herbivore(String name, Integer age, String residence, Integer speed, String typeOfFood) {
        super(name, age, residence, speed, typeOfFood);
    }

    @Override
    public void go() {
        System.out.println(getName() + " передвигается быстро");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест траву и цветы");
    }

    public void graze() {
        System.out.println(getName() + " пасется на лугу");
    }
    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + " лет, среда проживания - " + getResidence() + ", скорость - "
                + getSpeed() + " км/час, тип пищи - " + getTypeOfFood() + ", к какому классу относится - " + Herbivore.getClass();
    }
}
