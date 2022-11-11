package kemile.larissa.pi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class AlunosAdapter extends RecyclerView.Adapter {


    MainActivity mainActivity;
    List<Aluno> alunos;

    public AlunosAdapter(MainActivity mainActivity, List<Aluno> alunos) {
        this.mainActivity = mainActivity;
        this.alunos = alunos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflador = cria um elemento de interface referente a um objeto
        LayoutInflater inflater = LayoutInflater.from(mainActivity);
        //constrói o item a partir do layout (.xml) definido
        View v = inflater.inflate(R.layout.aluno_item_list, parent, false);
        return new MeuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        //dados do item a ser preenchido
        Aluno item = alunos.get(position);

        //view que estava guardada
        View v = holder.itemView;
        //pegando os elementos de dentro da View v guardada pelo holder
        TextView tvAlunoDetalheAluno = v.findViewById(R.id.tvAlunoDetalheAluno);
        TextView tvMatriculaDetalheAluno = v.findViewById(R.id.tvMatriculaDetalheAluno);
        //apagar e adicionar o certo que é aluno item
        TextView tvEmailDetalheAluno = v.findViewById(R.id.tvEmailDetalheAluno);
        TextView tvTelefoneDetalheAluno = v.findViewById(R.id.tvPhoneDetalheAluno);
        TextView tvAssistenciaDetalheAluno = v.findViewById(R.id.tvAssistenciaDetalheAluno);

        //setando os elementos do item a ser criado com os dados de dentro da view
        tvAlunoDetalheAluno.setText(item.nome);
        tvMatriculaDetalheAluno.setText(item.matricula);
        tvEmailDetalheAluno.setText(item.email);
        tvTelefoneDetalheAluno.setInt(item.telefone); //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah
        tvAssistenciaDetalheAluno.setBoolean(item.assistencia); //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhh

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    //retorna o total de itens atual
    public int getItemCount() {
        return alunos.size();
    }
}