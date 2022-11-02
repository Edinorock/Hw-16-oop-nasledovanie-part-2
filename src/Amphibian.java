public class Amphibian extends Animal {

    public Amphibian(String name, Integer age, String residence) {
        super(name, age, residence);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает все (всеядный)");
    }

    @Override
    public void go() {
        System.out.println(getName() + " умеет плавать и ходить");
    }

    public void hunt() {
        System.out.println(getName() + " охотится на суше, вдоль берегов водоёмов");
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge() + " года, среда проживания - " + getResidence() + ", к какому классу относится - " + Amphibian.getClass();
    }
}