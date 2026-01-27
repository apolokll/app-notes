package appnotes;

import java.util.Scanner;

public class Functions {
    public static void listarNotas(Notes[] notes, int numNotes){
        for (int i = 0; i < numNotes; i++) {
            System.out.println(i + " - " + notes[i].title); //imprime o índice do array mais o nome da nota.
        }
    }


    public static void editarTitulo(Notes note, Scanner sc){
        System.out.println("Digite o novo título: ");
        note.title = sc.nextLine();
    }


    public static void editarTexto(Notes note, Scanner sc){
        System.out.println("Digite o novo texto: ");
        note.text = sc.nextLine();
    }


    public static void editarTituloETexto(Notes note, Scanner sc){
        System.out.println("Digite o novo título: ");
        note.title = sc.nextLine();

        System.out.println("Digite o novo texto: ");
        note.text = sc.nextLine();
    }
}