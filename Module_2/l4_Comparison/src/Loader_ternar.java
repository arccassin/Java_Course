/**
 * Created by Emessar_WinPC on 19 Апр., 2019
 */
public class Loader_ternar
{
    public static void main(String[] args)
    {
        int x = 18;//y
        int y = 1;//z
        int z = 35;//x
        int max = (x>y?(x>z?x:z):(y>z?y:z));
        int min = (x<y?(x<z?x:z):(y<z?y:z));
        int mid = (x==max?(y==min?z:y):(y==max?(x==min?z:x):(x==min?y:x)));
        System.out.println(min + " " + mid + " " + max);
    }
}
