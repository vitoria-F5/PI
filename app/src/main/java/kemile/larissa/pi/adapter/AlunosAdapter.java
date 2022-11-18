package kemile.larissa.pi.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kemile.larissa.pi.activity.HomeActivity;
import kemile.larissa.pi.model.Aluno;
import kemile.larissa.pi.R;
import kemile.larissa.pi.activity.MainActivity;

public class AlunosAdapter extends RecyclerView.Adapter {


    HomeActivity homeActivity;
    List<Aluno> alunos;

    public AlunosAdapter(HomeActivity homeActivity, List<Aluno> alunos) {
        this.homeActivity = homeActivity;
        this.alunos = alunos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflador = cria um elemento de interface referente a um objeto
        LayoutInflater inflater = LayoutInflater.from(homeActivity);
        //constrói o item a partir do layout (.xml) definido
        View v = inflater.inflate(R.layout.aluno_item_list, parent, false);
        return new MeuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Aluno item = alunos.get(position);

        View v = holder.itemView;
        TextView tvAlunoDetalheAluno = v.findViewById(R.id.tvAlunoDetalheAluno);
        TextView tvMatriculaDetalheAluno = v.findViewById(R.id.tvMatriculaDetalheAluno);
        TextView tvEmailDetalheAluno = v.findViewById(R.id.tvEmailDetalheAluno);
        TextView tvTelefoneDetalheAluno = v.findViewById(R.id.tvPhoneDetalheAluno);
        TextView tvAssistenciaDetalheAluno = v.findViewById(R.id.tvAssistenciaDetalheAluno);

        tvAlunoDetalheAluno.setText("Nome: " + item.nome);
        tvMatriculaDetalheAluno.setText("matricula: " + item.matricula);
        tvEmailDetalheAluno.setText("Email: " + item.email);
        tvTelefoneDetalheAluno.setText("Telefone: " + item.telefone);

        if (item.assistencia) {
            tvAssistenciaDetalheAluno.setText("Recebe assistência? Sim");
        }
        else {
            tvAssistenciaDetalheAluno.setText("Recebe assistencia? Não");
        }

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