/**
 * Created by Emessar_WinPC on 23 Апр., 2019
 */
public class CatActivities
{
    public static void SevenCatActivities()
    {
        var cat1 = new Cat();
        System.out.println(cat1.getWeight());
        cat1.feed(300.0);
        System.out.println(cat1.getWeight());

        var cat2 = new Cat();
        System.out.println(cat2.getWeight());
        cat2.drink(100500.0);
        cat2.getStatus();

        var cat3 = new Cat();
        System.out.println(cat3.getWeight());
        while (cat3.getStatus() != "Dead")
        {
            cat3.meow();
        }
        System.out.println(cat3.getStatus());

        var catDead = cat3.getClone();
        if(catDead != null)
          System.out.println(catDead.getStatus());

    }
}
