package kemile.larissa.pi.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.ArrayList;
import java.util.List;

import kemile.larissa.pi.R;

public class HomeViewModel extends AndroidViewModel {

    int navigationOpSelected = R.id.noticiasOp;

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }

    public List<Aluno> pegarListaAlunos(String aluno) {
        Aluno aluno1 = new Aluno("Jocelina", "202015546", "jojo@gmail.com", 55356753, true);
        Aluno aluno2 = new Aluno("Joao", "202015548", "jo@gmail.com", 553567543, false);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        return alunos;
    }

    public List<Evento> pegarListaEvento() {
        Evento noticia1 = new Evento("Crânio decepado", "Aluno foi atingido por um meteoro", "Renata", "12/12/2012");
        Evento noticia2 = new Evento("Virou um cavalo marinho", "Aluno se transformou em um cavalo marinho durante uma aula de geometria analítica", "Scopel", "12/12/2012");

        List<Evento> noticias = new ArrayList<>();
        noticias.add(noticia1);
        noticias.add(noticia2);

        return noticias;
    }

}
