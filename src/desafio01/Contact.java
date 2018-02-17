package desafio01;

public class Contact {
    final private String name;
    private Number phoneNumber;

    public Contact(
            String name,
            Number phoneNumber
    ) {
        this.name = name;
        this.phoneNumber = phoneNumber;
//        this.cpf = cpf;
    }

    public String toString() {
        return ("Nome: " + name
                + "\nTelefone: " + phoneNumber
        );
    }

    public String getName() {
        return name;
    }

    public boolean startsWith(String inicial){
        String firstLetter = String.valueOf(name.charAt(0));
        if(firstLetter.contains(inicial.toUpperCase()))
            return true;
        return false;
    }
}
