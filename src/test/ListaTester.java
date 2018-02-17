package test;

import desafio01.Lista;
import desafio01.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ListaTester {

    Lista lista = new Lista();

    private void populate(){
        lista.addContact( new Contact("João", 111111111));
        lista.addContact( new Contact("Maria", 22222222));
        lista.addContact( new Contact("Rafael", 33333333));
        lista.addContact( new Contact( "Fernando", 44444444));
        lista.addContact( new Contact("Reginaldo", 55555555));
        lista.addContact( new Contact("Lucas", 66666666));
    }

    @Test
    public void emptyValue(){
       try {
           lista.getPersonByInicial("");
       } catch (RuntimeException e) {
           System.out.println("Test Passed");
       }
    }

    @Test
    public void upperCase(){
        populate();
        String expectedOutput = "[Nome: Lucas\nTelefone: 66666666]";
        String output = lista.getPersonByInicial("L");
        Assertions.assertEquals(expectedOutput,output);
    }

    @Test
    public void lowerCase(){
        populate();
        String expectedOutput = "[Nome: Lucas\nTelefone: 66666666]";
        String output = lista.getPersonByInicial("l");
        if (output.equals(expectedOutput)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    @Test
    public void notFound(){
        populate();
        String expectedOutput = "Sorry, there's nothing here";
        String output = lista.getPersonByInicial("x");
        Assertions.assertEquals(expectedOutput,output);
    }

}
