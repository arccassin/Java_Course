import Clients.IndividualEntrepreneurClient;
import Clients.LegalPersonClient;
import Clients.NaturalPersonClient;

public class Loader
{

    public static void main(String[] args) {
	// write your code here
        var naturalPersonClient = new NaturalPersonClient();
        naturalPersonClient.topUp(10000);
        naturalPersonClient.withDraw(1000);
        naturalPersonClient.showBalance();

        var legalPersonClient = new LegalPersonClient();
        legalPersonClient.topUp(10000);
        legalPersonClient.withDraw(1000);
        legalPersonClient.showBalance();

        var individualEntrepreneurClientonClient = new IndividualEntrepreneurClient();
        individualEntrepreneurClientonClient.topUp(900);
        individualEntrepreneurClientonClient.withDraw(100);
        individualEntrepreneurClientonClient.showBalance();

    }
}
