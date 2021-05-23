
import java.util.*;

public class Phonebook {

    public static void main(String[] args) {

        ListPhoneNumber listPhoneNumber = new ListPhoneNumber();

        listPhoneNumber.add("Petrov", "+79151350565");
        listPhoneNumber.add("Ivanov", "+79161355465");
        listPhoneNumber.add("Suvorov", "+79113557699");
        listPhoneNumber.add("Deripaska", "+79121212412");
        listPhoneNumber.add("Prohorov", "+79170989387");
        listPhoneNumber.add("Medvedev", "+79190004568");
        listPhoneNumber.add("Ivanov", "+79247638977");
        listPhoneNumber.add("Suvorov", "+79144587699");
        listPhoneNumber.add("Mihalkov", "+79165420038");
        listPhoneNumber.add("Orjonihidze", "+79777333555");
        listPhoneNumber.add("Suslov", "+79757484919");

        System.out.println(listPhoneNumber.get("Ivanov"));
        System.out.println(listPhoneNumber.get("Suvorov"));
        System.out.println(listPhoneNumber.get("Deripaska"));

    }

}

class ListPhoneNumber{
    private Map<String, List<String>> contacts = new HashMap<>();
    private List<String> listPhoneNumbers;

    public void add(String lastName, String phoneNumber){
        if (contacts.containsKey(lastName)){
            listPhoneNumbers = contacts.get(lastName);
            listPhoneNumbers.add(phoneNumber);
            contacts.put(lastName, listPhoneNumbers);
        }
        else {
            listPhoneNumbers = new ArrayList<>();
            listPhoneNumbers.add(phoneNumber);
            contacts.put(lastName, listPhoneNumbers);
        }

    }

    public List<String> get(String lastName){
        return contacts.get(lastName);
    }

}
