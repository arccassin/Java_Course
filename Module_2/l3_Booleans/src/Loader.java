
public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 200; // ml
        Integer powderAmount = 5; // g
        Integer eggsCount = 3; // items
        Integer sugarAmount = 5; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 8;

        System.out.println(powderAmount >= 400 && sugarAmount >= 10
                && milkAmount >= 1000 && oilAmount >= 30 ?
                "You can create Pancakes" : "You can't create Pancakes");
        System.out.println(milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5 ?
                "You can create Omelette" : "You can't create Omelette");
        System.out.println(appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 ?
                "You can create Apple pie" : "You can't create Apple pie");
    }
}