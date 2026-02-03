package com.apolokll.appnotes.service;

import com.apolokll.appnotes.model.Notes;

import java.util.ArrayList;

public class NotesServices {

    public static void listarNotas(ArrayList<Notes> notes){
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(i + " - " + notes.get(i).getTitle());
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
            System.out.println(notes.get(viewNote).getText());

        }else {
            System.out.println("A nota digitada não existe.");
        }
    }


    public static void editarTitulo(ArrayList<Notes> note, String newTitle, int editNote){
        if (editNote >= 0 && editNote < note.size()) {
            note.get(editNote).setTitle(newTitle);
            System.out.println("Título atualizado com sucesso!");
        } else {
            System.out.println("Nota inválida.");
        }
    }


    public static void editarTexto(ArrayList<Notes> note, String newText, int editNote){
        if (editNote >= 0 && editNote < note.size()) {
            note.get(editNote).setText(newText);
            System.out.println("Texto atualizado com sucesso!");
        } else {
            System.out.println("Nota inválida.");
        }
    }


    public static void editarTituloETexto(ArrayList<Notes> note, String newTitle, String newText, int editNote){
        if (editNote >= 0 && editNote < note.size()) {
            note.get(editNote).setTitle(newTitle);
            System.out.println("Título atualizado com sucesso!");
        } else {
            System.out.println("Nota inválida.");
        }

        if (editNote >= 0 && editNote < note.size()) {
            note.get(editNote).setText(newText);
            System.out.println("Texto atualizado com sucesso!");
        } else {
            System.out.println("Nota inválida.");
        }
    }
}