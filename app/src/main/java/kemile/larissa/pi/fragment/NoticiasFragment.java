package kemile.larissa.pi.fragment;

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

import java.util.List;

import kemile.larissa.pi.R;
import kemile.larissa.pi.activity.HomeActivity;
import kemile.larissa.pi.adapter.NoticiasAdapter;
import kemile.larissa.pi.model.HomeViewModel;
import kemile.larissa.pi.model.Evento;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoticiasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoticiasFragment extends Fragment {

    public NoticiasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.

     */
    public static NoticiasFragment newInstance() {
        NoticiasFragment fragment = new NoticiasFragment();
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
        return inflater.inflate(R.layout.fragment_noticias, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        HomeViewModel homeViewModel = new ViewModelProvider(getActivity()).get(HomeViewModel.class);

        List<Evento> noticias = homeViewModel.pegarListaEvento();

        HomeActivity homeActivity = (HomeActivity) getActivity().getParent();

        NoticiasAdapter noticiasAdapter = new NoticiasAdapter(homeActivity,noticias);

        RecyclerView rvNoticias = view.findViewById(R.id.rvNoticias);
        rvNoticias.setLayoutManager(new LinearLayoutManager(getContext()));
        rvNoticias.setAdapter(noticiasAdapter);

    }
}