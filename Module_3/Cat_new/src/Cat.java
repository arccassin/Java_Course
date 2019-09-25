
public class Cat
{
    private static final double MAX_WEIGHT = 9000.0;
    private static final double MIN_WEIGHT = 1000.0;
    private static final int EYES_COUNT = 2;

    private static int count;
    private double originWeight;
    private double weight;
    private double eatenFood;
    private String name;
    private CatColor color;

    public Cat(String name, double weight)
    {
        this(name);
        this.weight = weight;
    }

    public Cat(String name)
    {
        this();
        this.name = name;
    }

    public Cat(double weight)
    {
        this();
        this.weight = weight;
        if(isDead()){
            Cat.count--;
        }
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        Cat.count++;
    }
    public Cat getClone()
    {
        if (isDead())
            return null;
        var targetCat = new Cat(name, weight);
        targetCat.color = color;
        targetCat.eatenFood = eatenFood;
        targetCat.originWeight = originWeight;
        return targetCat;
    }

    public CatColor getColor()
    {
        return color;
    }

    public void setColor(CatColor color)
    {
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public static int getCount()
    {
        return count;
    }

    public double getEatenFood()
    {
        return eatenFood;
    }

    public void meow()
    {
        if (isDead())
            return;
        weight = weight - 1;
        checkDeadStatus();
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (isDead())
            return;
        weight = weight + amount;
        eatenFood += amount;
        checkDeadStatus();
    }

    public void drink(Double amount)
    {
        if (isDead())
            return;
        weight = weight + amount;
        checkDeadStatus();
    }

    public Double getWeight()
    {
        return weight;
    }


    private boolean isDead()
    {
        return (weight < MIN_WEIGHT)||(weight > MAX_WEIGHT);
    }

    private void checkDeadStatus()
    {
        if (isDead())
        {
            Cat.count -= 1;
        }
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void doSomeShit()
    {
        weight-=10*Math.random();
        System.out.println("Cat say: I did some shit");
    }
}