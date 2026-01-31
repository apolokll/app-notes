package com.apolokll.appnotes;

import java.util.Scanner;
import java.util.ArrayList;

//FUNÇÃO DO MAIN:
//Mostrar o menu; ler a opção do usuário; chamar a ação correta; repetir até o usuário sair.
public class Main{
    public static void main(String[] args) {
        ArrayList<Notes> notes = new ArrayList<>();
        int answer;
        int viewNote;
        int editNote;
        int editChosenNote;
        int deleteNote;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Olá, o que você gostaria de fazer?");
            System.out.println("Opção 1: Criar nota. \nOpção 2: Listar notas. \nOpção 3: Visualizar notas. \nOpção 4: Editar nota. \nOpção 5: Deletar nota. \nOpção 6: Sair.");
            System.out.print("Eu quero: ");
            answer = sc.nextInt();
            sc.nextLine(); //Limpar o buffer

            if (answer == 1){
                System.out.print("Digite um nome para sua nota: ");
                String title = sc.nextLine();

                System.out.println("Digite o conteúdo da sua nota: ");
                String text = sc.nextLine();

                Notes note = new Notes(title, text);
                notes.add(note);

            } else if (answer == 2) {
                if (!notes.isEmpty()){
                    NotesServices.listarNotas(notes);

                }else {
                    System.out.println("Você não possui notas.");
                }

            } else if (answer == 3) {
                System.out.println("Qual nota você gostaria de abrir?");
                NotesServices.listarNotas(notes);
                viewNote = sc.nextInt();
                sc.nextLine(); //Limpa o buffer.
                NotesServices.viewNote(notes, viewNote);


            } else if (answer == 4) {
                if (notes.isEmpty()){
                    System.out.println("Você não possui notas para serem editadas.");
                }
                else {
                    System.out.println("Qual nota você gostaria de editar?");
                    NotesServices.listarNotas(notes);
                    editNote = sc.nextInt();
                    sc.nextLine(); //Limpa o buffer.
                    if (editNote >= 0 && editNote < notes.size()){
                        System.out.println("O que você quer editar? \nOpção 1: Editar título. \nOpção 2: Editar texto. \nOpção 3: Editar ambos. \nOpção 4: Cancelar.");
                        editChosenNote = sc.nextInt();
                        sc.nextLine();

                        if (editChosenNote == 1){
                            NotesServices.editarTitulo(notes, sc, editNote);

                        } else if (editChosenNote == 2) {
                            NotesServices.editarTexto(notes, sc, editNote);

                        } else if (editChosenNote == 3) {
                            NotesServices.editarTituloETexto(notes, sc, editNote);

                        } else if (editChosenNote == 4) {
                            System.out.println("Cancelando...");

                        }else {
                            System.out.println("Nota inexistente ou inválida.");
                        }

                    }

                }

            } else if (answer == 5) {
                if (notes.isEmpty()){
                    System.out.println("Você não possui notas para serem deletadas.");

                }else {
                    System.out.println("Qual nota você gostaria de deletar?");
                    NotesServices.listarNotas(notes);
                    deleteNote = sc.nextInt();
                    sc.nextLine(); //Limpar o buffer.
                    NotesServices.deleteNote(notes, deleteNote);
                }

            } else if (answer == 6) {
                System.out.println("Até logo!");

            } else {
                System.out.println("OPÇÃO INVÁLIDA! \nPor favor digite um valor válido.");
            }
        }while(answer != 6);
        sc.close();
    }
}