package kemile.larissa.pi.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import kemile.larissa.pi.R;
import kemile.larissa.pi.activity.HomeActivity;
import kemile.larissa.pi.model.Evento;
import kemile.larissa.pi.model.ItemHistoricoAluno;

public class HistoricoAlunoAdapter  extends RecyclerView.Adapter {

    HomeActivity homeActivity;
    List<ItemHistoricoAluno> historico;

    public HistoricoAlunoAdapter(HomeActivity homeActivity, List<ItemHistoricoAluno> noticias) { //
        this.homeActivity = homeActivity;
        this.historico = noticias;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflador = cria um elemento de interface referente a um objeto
        LayoutInflater inflater = LayoutInflater.from(homeActivity);
        //constrói o item a partir do layout (.xml) definido
        View v = inflater.inflate(R.layout.historico_aluno_item_list, parent, false);
        return new MeuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ItemHistoricoAluno item = historico.get(position);

        View v = holder.itemView;
        TextView tvHistoricoItem = v.findViewById(R.id.tvHistoricoItem);
        TextView tvDescHistorico = v.findViewById(R.id.tvDescHistorico);
        TextView tvPostadaHistorico = v.findViewById(R.id.tvPostadaNoticia);
        TextView tvQuandoHistorico = v.findViewById(R.id.tvQuandoHistorico); //

        tvHistoricoItem.setText(item.titulo);
        tvDescHistorico.setText(item.descricao);
        tvPostadaHistorico.setText(item.criador);
        tvQuandoHistorico.setText(item.data);

        v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                homeActivity.navegarDetalhesEvento(item.id);
            }
        });
    }

    @Override
    //retorna o total de itens atual
    public int getItemCount() {
        return historico.size();
    }
}

