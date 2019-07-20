import java.util.HashMap;

public class CustomerStorage {
    private static String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private HashMap<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Error adding customer: wrong format. " +
                    "Correct format:\n" + addCommand);
        }
        String name = components[0] + " " + components[1];

        String phone = components[3];
        if (!((phone.length() == 12 && phone.indexOf("+7") == 0 || (phone.length() == 11 && phone.charAt(0) == '8')))) {
            throw new IllegalArgumentException("Phone \"" + phone + "\" not correct!");
        }

        String email = components[2];
        if (!(email.matches("^.+@.+"))) {
            throw new IllegalArgumentException("E-mail \"" + email + "\" not correct!");
        }

        storage.put(name, new Customer(name, phone, email));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public int getCount() {
        return storage.size();
    }
}