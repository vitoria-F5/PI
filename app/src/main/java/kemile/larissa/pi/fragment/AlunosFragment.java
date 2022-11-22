package kemile.larissa.pi.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.List;

import kemile.larissa.pi.R;
import kemile.larissa.pi.activity.CadastroActivity;
import kemile.larissa.pi.activity.CadastroAlunoActivity;
import kemile.larissa.pi.activity.HomeActivity;
import kemile.larissa.pi.activity.LoginActivity;
import kemile.larissa.pi.adapter.AlunosAdapter;
import kemile.larissa.pi.adapter.NoticiasAdapter;
import kemile.larissa.pi.model.Aluno;
import kemile.larissa.pi.model.HomeViewModel;
import kemile.larissa.pi.model.Noticia;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlunosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlunosFragment extends Fragment {

    public AlunosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AlunosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlunosFragment newInstance() {
        AlunosFragment fragment = new AlunosFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alunos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        HomeViewModel homeViewModel = new ViewModelProvider(getActivity()).get(HomeViewModel.class);

        List<Aluno> alunos = homeViewModel.pegarListaAlunos("");

        HomeActivity homeActivity = (HomeActivity) getActivity().getParent();

        AlunosAdapter alunosAdapter = new AlunosAdapter(homeActivity,alunos);

        RecyclerView rvAlunos = view.findViewById(R.id.rvAlunos);
        rvAlunos.setLayoutManager(new LinearLayoutManager(getContext()));
        rvAlunos.setAdapter(alunosAdapter);

        ImageButton imbProcurar = view.findViewById(R.id.imbProcurar);
        imbProcurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etBusca = view.findViewById(R.id.etBusca);
                String aluno = etBusca.getText().toString();
                List<Aluno> alunos = homeViewModel.pegarListaAlunos(aluno);
                AlunosAdapter alunosAdapter = new AlunosAdapter(homeActivity,alunos);
                rvAlunos.setAdapter(alunosAdapter);
            }

        });

        ImageButton fabAdicionarAluno = view.findViewById(R.id.fabAdicionarAluno);
        fabAdicionarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CadastroAlunoActivity.class);
                startActivity(intent);
            }
        });
    }
}