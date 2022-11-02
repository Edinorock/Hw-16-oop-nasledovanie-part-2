public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Газель", 2, "пустыня", 97, "трава");
        Herbivore giraffe = new Herbivore("Жираф", 3, "саванна", 60, "трава");
        Herbivore horse = new Herbivore("Лошадь", 5, "степь", 88, "овес");
        Predator hyena = new Predator("Гиена", 6, "пустыня", 64, "падаль");
        Predator tiger = new Predator("Тигр", 2, "джунгли", 65, "животные");
        Predator bear = new Predator("Медведь", 7, "Арктика", 40, "рыба и мед");
        Amphibian frog = new Amphibian("Лягушка", 1, "болото");
        Amphibian already = new Amphibian("Уж", 2, "лес");
        Flightless peacock = new Flightless("Павлин", 3, "джунгли","ходит");
        Flightless penguin = new Flightless("Пингвин", 4, "Арктика", "ходит и плавает");
        Flightless dodo = new Flightless("Птица Додо", 3, "лес", "ходит");
        Flying gull = new Flying("Чайка", 2, "морские просторы", "летает");
        Flying falcon = new Flying("Сокол", 5, "степь", "летает");
        Flying albatross = new Flying("Альбатрос", 6, "Южный океан", "летает");
        System.out.println(gazelle);
        gazelle.graze();
        gazelle.eat();
        gazelle.go();

        System.out.println(giraffe);
        giraffe.graze();
        giraffe.eat();
        giraffe.go();

        System.out.println(horse);
        horse.graze();
        horse.eat();
        horse.go();

        System.out.println(hyena);
        hyena.hunt();
        hyena.go();
        System.out.println(tiger);
        tiger.hunt();
        tiger.go();
        System.out.println(bear);
        bear.hunt();
        bear.go();

        System.out.println(already);
        already.hunt();
        System.out.println(frog);
        frog.hunt();

        System.out.println(peacock);
        peacock.eat();
        peacock.hunt();
        System.out.println(penguin);
        penguin.eat();
        penguin.hunt();
        System.out.println(dodo);
        dodo.eat();
        dodo.hunt();


        System.out.println(falcon);
        falcon.go();
        albatross.fly();
        System.out.println(gull);
        gull.go();
        gull.fly();
        System.out.println(albatross);
        albatross.go();
        albatross.fly();
    }
}
