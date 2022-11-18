package kemile.larissa.pi.model;

import android.graphics.Bitmap;

public class Aluno {
    public String nome;
    public String matricula;
    public String email;
    public int telefone;
    public Boolean assistencia;


    // Construtor do item da lista
    public Aluno(String nome, String matricula, String email, int telefone, Boolean assistencia) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
        this.assistencia = assistencia;
    }
}
