package kemile.larissa.pi;

import android.graphics.Bitmap;

public class Aluno {
    String nome;
    String matricula;
    String email;
    int telefone;
    Boolean assistencia;


    // Construtor do item da lista
    public Aluno(String nome, String matricula, String email, int telefone, Boolean assistencia) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
        this.assistencia = assistencia;
    }
}
