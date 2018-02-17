package desafio01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {

    private final List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public String getPersonByInicial(String inicial) {
        List matchedPeople = searchList(inicial);
        if (matchedPeople.isEmpty())
            return "Sorry, there's nothing here";
        return matchedPeople.toString();
    }

    private List searchList(String inicial) {
        List matchingPessoas = new LinkedList();
            for (final Contact contact : contactList) {
                if (contact.startsWith(inicial)) {
                    matchingPessoas.add(contact);
                }
            }
        return matchingPessoas;
    }
}
