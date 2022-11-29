package kemile.larissa.pi.model;

public class Evento {
    public String id;
    public String titulo;
    public String descricao;
    public String postagem;
    public String data;

    public Evento(String id, String titulo, String descricao, String postagem, String data) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.postagem = postagem;
        this.data = data;
    }
}
