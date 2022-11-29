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

public class EventosAdapter extends RecyclerView.Adapter {

    HomeActivity homeActivity;
    List<Evento> eventos;

    public EventosAdapter(HomeActivity homeActivity, List<Evento> noticias) {
            this.homeActivity = homeActivity;
            this.eventos = noticias;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflador = cria um elemento de interface referente a um objeto
        LayoutInflater inflater = LayoutInflater.from(homeActivity);
        //constrói o item a partir do layout (.xml) definido
        View v = inflater.inflate(R.layout.eventos_item_list, parent, false);
        return new MeuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Evento item = eventos.get(position);

        View v = holder.itemView;
        TextView tvNoticiaItem = v.findViewById(R.id.tvNoticiaItem);
        TextView tvDescNoticia = v.findViewById(R.id.tvDescNoticia);
        TextView tvPostadaNoticia = v.findViewById(R.id.tvPostadaNoticia);
        TextView tvQuandoNoticia = v.findViewById(R.id.tvQuandoNoticia);

        tvNoticiaItem.setText(item.titulo);
        tvDescNoticia.setText(item.descricao);
        tvPostadaNoticia.setText(item.postagem);
        tvQuandoNoticia.setText(item.data);

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
        return eventos.size();
    }
}
