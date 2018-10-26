
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


        for (int i = 0; i < 3400; i++)
        {
            nuasha.feed(2.0);
            tisha.meow();
            sima.drink(1.0);
        }

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
    }

    public static Cat getKitten()
    {
        Double catWeight = 100. + 100. * Math.random();
        return new Cat(catWeight);
    }
}