package desafio01;

public class Main
{
    public static void main(String args[]){

        Lista lista = new Lista();

        lista.addContact( new Contact("João", 111111111));
        lista.addContact( new Contact("Maria", 22222222));
        lista.addContact( new Contact("Rafael", 33333333));
        lista.addContact( new Contact( "Fernando", 44444444));
        lista.addContact( new Contact("Reginaldo", 55555555));
        lista.addContact( new Contact("Lucas", 66666666));

        System.out.println(lista.getPersonByInicial("r"));

    }
}
