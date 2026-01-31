package com.apolokll.appnotes;

import java.util.ArrayList;
import java.util.Scanner;

public class NotesServices {

    public static void listarNotas(ArrayList<Notes> notes){
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(i + " - " + notes.get(i).title);
        }
    }


    public static void deleteNote(ArrayList<Notes> notes, int deleteNote){
        if (deleteNote >= 0 && deleteNote < notes.size()){
            notes.remove(deleteNote);
            System.out.println("Nota deletada com sucesso!");

        }else {
            System.out.println("Essa nota não existe, selecione uma opção válida.");
        }
    }


    public static void viewNote(ArrayList<Notes> notes, int viewNote){
        if (viewNote >= 0 && viewNote < notes.size()){
            System.out.println(notes.get(viewNote).text);

        }else {
            System.out.println("A nota digitada não existe.");
        }
    }


    public static void editarTitulo(ArrayList<Notes> note, Scanner sc, int editNote){
        System.out.println("Digite o novo título: ");
        note.get(editNote).title = sc.nextLine();
    }


    public static void editarTexto(ArrayList<Notes> note, Scanner sc, int editNote){
        System.out.println("Digite o novo texto: ");
        note.get(editNote).text = sc.nextLine();
    }


    public static void editarTituloETexto(ArrayList<Notes> note, Scanner sc, int editNote){
        System.out.println("Digite o novo título: ");
        note.get(editNote).title = sc.nextLine();

        System.out.println("Digite o novo texto: ");
        note.get(editNote).text = sc.nextLine();
    }
}