/**
 * Created by Emessar on 23 Окт., 2018
 */
public class Loader
{
    public static void main(String[] args)
    {
        Integer dimaAge = 35;//x
        Integer mishaAge = 55;//y
        Integer vasyaAge = 18;//z

        Integer oldest;
        Integer youngest;
        Integer middle;

        if (dimaAge >= mishaAge)
        {
            if (vasyaAge <= dimaAge)
            {
                if (vasyaAge >= mishaAge)
                {
                    oldest = dimaAge;
                    middle = vasyaAge;
                    youngest = mishaAge;
                }else
                {
                    oldest = dimaAge;
                    middle = mishaAge;
                    youngest = vasyaAge;
                }
            }else
            {
                oldest = vasyaAge;
                middle = dimaAge;
                youngest = mishaAge;
            }
        }else
        {
            if (vasyaAge >= mishaAge)
            {
                oldest = dimaAge;
                middle = mishaAge;
                youngest = vasyaAge;
            }else if (dimaAge <= vasyaAge)
                {
                    oldest = mishaAge;
                    middle = vasyaAge;
                    youngest = dimaAge;

                }else
                {
                    oldest = mishaAge;
                    middle = dimaAge;
                    youngest = vasyaAge;
                }

        }

        System.out.println("Most old: " + oldest);
        System.out.println("Most young: " + youngest);
        System.out.println("Middle: " + middle);

    }

}
