package kemile.larissa.pi.model;

public class ItemHistoricoAluno {
    String id;
    String titulo;
    String descricao;
    String criador;
    String data;

    public ItemHistoricoAluno(String id, String titulo, String descricao, String criador, String data) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.criador = criador;
        this.data = data;
    }
}
