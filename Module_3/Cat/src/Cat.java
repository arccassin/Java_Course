
public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double feedWeigth = 0.0;

    private Double minWeight;
    private Double maxWeight;


    private boolean liveStatus = true;
    private static Integer count = 0;

    public static Integer getCount()
    {
        return count;
    }

    public Cat()
    {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(Double catWeight)
    {
        weight = catWeight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = Cat.count + 1;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        if (weight < minWeight && liveStatus)
        {
            Cat.count = Cat.count - 1;
            liveStatus = false;
        }
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        feedWeigth = feedWeigth + amount;
        if (weight > maxWeight && liveStatus)
        {
            Cat.count = Cat.count - 1;
            liveStatus = false;
        }
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if (weight > maxWeight && liveStatus)
        {
            Cat.count = Cat.count - 1;
            liveStatus = false;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getEatenMass()
    {
        return feedWeigth;

    }

    public void goToilet()
    {
        weight = weight - 100;
        System.out.println("Bomb has been planted!");
    }

    public Double getOriginWeight()
    {
        return originWeight;
    }

    public Double getFeedWeigth()
    {
        return feedWeigth;
    }

    public boolean getLiveStatus()
    {
        return liveStatus;
    }

    public Cat createTwin()
    {
        Cat cat = new Cat();
        cat.originWeight = getOriginWeight();
        cat.feedWeigth = getFeedWeigth();
        cat.weight = getWeight();
        cat.liveStatus = getLiveStatus();
        return cat;
    }
}