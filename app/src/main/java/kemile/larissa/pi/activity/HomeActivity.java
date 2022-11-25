package kemile.larissa.pi.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import kemile.larissa.pi.R;
import kemile.larissa.pi.fragment.EventosFragment;
import kemile.larissa.pi.model.HomeViewModel;

public class HomeActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final HomeViewModel vm = new ViewModelProvider(this).get(HomeViewModel.class);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                vm.setNavigationOpSelected(item.getItemId());
                switch (item.getItemId()) {
                    case R.id.noticiasOp:
                        EventosFragment noticiasFragment = EventosFragment.newInstance();
                        setFragment(noticiasFragment);
                        vm.setNavigationOpSelected(R.id.noticiasOp);
                        break;

                    case R.id.historicoOp:
                        break;

                    case R.id.perfilOp:
                        break;
                }
                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(vm.getNavigationOpSelected());
    }

    void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flHome, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}