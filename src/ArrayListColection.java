import java.util.ArrayList;

//Arry list generica

public class ArrayListColection {

    public static void main(String[] args) {
        // cria um arraylist de string
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");// acrecsenta um item á lista
        items.add(0, "yellow");// insere o valor 0

        // cabeçalho

        System.out.print(
                "Display list contents whit counter-controlled loop:");

        // exiba as cores da lista
        for (int i = 0; i < items.size(); i++)
            System.out.printf("%s", items.get(i));

        // exibe as cores utilizando foreach no metodo display

        display(items, "\nDisplay list contents with enchanged for statement:");

        items.add("green");// adiciona "green" ao final da lista
        items.add("yellow");// adiciona "yellow" ao final da lista
        display(items, "List whit two new elements:");

        items.remove("yellow");// remove o rpimeiro yellow
        display(items, "Remove first instance of yellow:");

        items.remove(1);// remove o indice 1
        display(items, "Remove second list element (geen):");

        // verifica se um valor esta em list
        System.out.printf("\" red\" is %sin the list\n",
                items.contains("red") ? "" : "not ");
        // exibe o numero de elementos em list
        System.out.printf("size: %s\n", items.size());

    }

    // exibe arraylist no console
    private static void display(ArrayList<String> items, String header) {
        System.out.print(header);// exibe o cabeçalho

        // exibe cada elemeneto nos items
        for (String item : items)
            System.out.printf("%s", item);

        System.out.println();// exibe o fim de linha
    }
}