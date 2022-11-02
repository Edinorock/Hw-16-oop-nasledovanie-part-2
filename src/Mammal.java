public class Mammal extends Animal {
    private Integer speed;
    private String typeOfFood;


    public Mammal(String name, Integer age, String residence, Integer speed, String typeOfFood) {
        super(name, age, residence); setResidence(residence);
        setSpeed(speed);
        setTypeOfFood(typeOfFood);
    }



    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed <= 0 ? 5 : speed;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isBlank()) {
            this.typeOfFood = "Неизвестно";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }

    @Override
    public void go() {
        System.out.println(getName() + " ходит");
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + " лет, среда проживания - " + getResidence() + ", скорость - "
                + speed + " км/час, тип пищи - " + typeOfFood + ", к какому классу относится - " + Mammal.getClass();
    }
}