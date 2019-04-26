
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());

        cat.feed(100.0);
        System.out.println("Cat eaten " + cat.getEatenFood());
        System.out.println("Weight " + cat.getWeight());
        cat.doSomeShit();
        System.out.println("Weight " + cat.getWeight());
        //Урок 1
        CatActivities.SevenCatActivities();
        System.out.println("Количество котов " + Cat.getCount());

        Cat cat1 = generateCat("Albert", 1000.0);
        var cloneCat = cat1.getClone();

        System.out.println("Количество котов " + Cat.getCount());
    }

    public static Cat generateCat(String name, double weight)
    {
        var cat = new Cat(name, weight);
        return cat;
    }
}