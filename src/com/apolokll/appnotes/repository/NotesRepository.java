package com.apolokll.appnotes.repository;

import com.apolokll.appnotes.model.Notes;

import java.io.*;
import java.util.ArrayList;

public class NotesRepository {
    private static final String FILE_PATH = "notes.txt";

    public static void save(ArrayList<Notes> notes) {
        try {
            FileWriter escritorArquivo = new FileWriter(FILE_PATH);
            BufferedWriter escritor = new BufferedWriter(escritorArquivo);

            for (Notes nota : notes) {
                escritor.write(nota.getTitle() + ";" + nota.getText());
                escritor.newLine();
            }

            escritor.close();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    public static ArrayList<Notes> load(){
        ArrayList<Notes> notes = new ArrayList<>();
        try {
            File arquivo = new File(FILE_PATH);

            //caso o arquivo ainda não exista, retornar a lista vazia
            if (!arquivo.exists()){
                return notes;
            }

            FileReader leitorArquivo = new FileReader(FILE_PATH);
            BufferedReader leitor = new BufferedReader(leitorArquivo);

            String line;

            while ((line = leitor.readLine()) != null){
                String[] partes = line.split(";");

                if (partes.length == 2){
                    String title = partes[0];
                    String text = partes[1];

                    notes.add(new Notes(title, text));
                }
            }

            leitor.close();
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        return notes;
    }
}
