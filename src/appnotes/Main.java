package appnotes;

import java.util.Scanner;

//FUNÇÃO DO MAIN:
//Mostrar o menu; ler a opção do usuário; chamar a ação correta; repetir até o usuário sair.
public class Main{
    public static void main(String[] args) {
        final Notes[] notes = new Notes[5];
        int numNotes = 0;
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
                if (numNotes < notes.length){
                    notes[numNotes] = new Notes(); //Cria a nota.

                    System.out.print("Dê um nome a sua nota: ");
                    notes[numNotes].title = sc.nextLine();

                    System.out.println("Digite o conteúdo da nota: ");
                    notes[numNotes].text = sc.nextLine();
                    numNotes++; //Adiciona 1 ao contador de notas
                }else {
                    System.out.println("Desculpe, mas não há espaço para mais notas.");
                }

            } else if (answer == 2) {
                if (numNotes > 0){
                    Functions.listarNotas(notes, numNotes);

                }else {
                    System.out.println("Você não possui notas.");
                }

            } else if (answer == 3) {
                System.out.println("Qual nota você gostaria de abrir?");
                Functions.listarNotas(notes, numNotes);
                viewNote = sc.nextInt();
                sc.nextLine(); //Limpa o buffer.

                if (viewNote >= 0 && viewNote < numNotes){
                    System.out.println(notes[viewNote].text);

                }else {
                    System.out.println("A nota digitada não existe.");
                }

            } else if (answer == 4) {
                if (numNotes == 0){
                    System.out.println("Você não possui notas para serem editadas.");
                }
                else {
                    System.out.println("Qual nota você gostaria de editar?");
                    Functions.listarNotas(notes, numNotes);
                    editNote = sc.nextInt();
                    sc.nextLine(); //Limpa o buffer.
                    if (editNote >= 0 && editNote < numNotes){
                        System.out.println("O que você quer editar? \nOpção 1: Editar título. \nOpção 2: Editar texto. \nOpção 3: Editar ambos. \nOpção 4: Cancelar.");
                        editChosenNote = sc.nextInt();
                        sc.nextLine();

                        if (editChosenNote == 1){
                            Functions.editarTitulo(notes[editNote], sc);

                        } else if (editChosenNote == 2) {
                            Functions.editarTexto(notes[editNote], sc);

                        } else if (editChosenNote == 3) {
                            Functions.editarTituloETexto(notes[editNote], sc);

                        } else if (editChosenNote == 4) {
                            System.out.println("Cancelando...");

                        }else {
                            System.out.println("Nota inexistente ou inválida.");
                        }

                    }

                }

            } else if (answer == 5) {
                if (numNotes == 0){
                    System.out.println("Você não possui notas para serem deletadas.");

                }else {
                    System.out.println("Qual nota você gostaria de deletar?");
                    Functions.listarNotas(notes, numNotes);
                    deleteNote = sc.nextInt();
                    sc.nextLine(); //Limpar o buffer.

                    //verifica se o valor digitado condiz com alguma nota existente.
                    if (deleteNote >= 0 && deleteNote < numNotes){
                        for (int i = deleteNote; i < numNotes; i++) {
                            notes[i] = notes[i + 1];
                        }
                        System.out.println("Nota deletada com sucesso!");
                        notes[numNotes - 1] = null;
                        numNotes--;

                    }else {
                        System.out.println("Essa nota não existe, selecione uma opção válida.");
                    }
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