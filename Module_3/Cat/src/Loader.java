
public class Loader
{
    public static void main(String[] args)
    {
        Cat nuasha = new Cat();
        Cat tisha = new Cat();
        Cat sima = new Cat();
        Cat yarsik = new Cat();
        Cat asya = new Cat();
        Cat begemot = new Cat();

        while (nuasha.getStatus() != "Exploded")
        {
            nuasha.feed(2.0);
        }

        while (tisha.getStatus() != "Dead")
        {
            tisha.meow();
        }

        while (nuasha.getStatus() != "Exploded")
        {
            nuasha.feed(2.0);
        }

        sima.drink(1.0);
        asya.goToilet();

        yarsik.feed(350.0);
        asya.drink(100.0);

        System.out.println(nuasha.getStatus());
        System.out.println(tisha.getStatus());
        System.out.println(sima.getStatus());
        System.out.println(yarsik.getStatus());
        System.out.println(asya.getStatus());
        System.out.println(begemot.getStatus());

        System.out.println("Cat Count: " + Cat.getCount());

        Cat kitCat = getKitten();
        System.out.println("kitCat weight: " + kitCat.getWeight());
        System.out.println("nuasha eaten mass: " + nuasha.getEatenMass());

        sima = begemot.createTwin();
        System.out.println(sima.getStatus());
        System.out.println(begemot.getStatus());
    }

    public static Cat getKitten()
    {
        Double catWeight = 100. + 100. * Math.random();
        return new Cat(catWeight);
    }
}