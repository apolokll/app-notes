//CRIAR UM MENU QUE POSSIBILITE:
//Criar uma nota
//Listar notas
//Ver uma nota específica
//Editar uma nota
//Remover uma nota
//Sair
import java.util.Scanner;
class Notes{
    String title;
    String text;
}

//FUNÇÃO DO MAIN:
//Mostrar o menu; ler a opção do usuário; chamar a ação correta; repetir até o usuário sair.
public class Main{
    public static void main(String[] args) {
        final Notes[] notes = new Notes[5];
        int numNotes = 0;
        int answer;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Olá, o que você gostaria de fazer?");
            System.out.println("Opção 1: Criar nota. \nOpção 2: Listar notas. \nOpção 3: Sair.");
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
                    for (int i = 0; i < numNotes; i++) {
                        System.out.println(notes[i].title);
                    }
                }else {
                    System.out.println("Você não possui notas.");
                }
            } else if (answer == 3) {
                System.out.println("Até logo!");
            } else {
                System.out.println("OPÇÃO INVÁLIDA! \nPor favor digite uma opção válida.");
            }
        }while(answer != 3);
        sc.close();
    }
}