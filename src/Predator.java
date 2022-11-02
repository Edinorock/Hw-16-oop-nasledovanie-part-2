public class Predator extends Mammal {
    public Predator(String name, Integer age, String residence, Integer speed, String typeOfFood) {
        super(name, age, residence, speed, typeOfFood);
    }

    @Override
    public void go() {
        System.out.println(getName() + " бегает быстро");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест мясо");
    }

    public void hunt() {
        System.out.println(getName() + " охотится на других животных и птиц");
    }
    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + " лет, среда проживания - " + getResidence() + ", скорость - "
                + getSpeed() + " км/час, тип пищи - " + getTypeOfFood() + ", к какому классу относится - " + Predator.getClass();
    }
}