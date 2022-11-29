package kemile.larissa.pi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
//import android.widget.TextView;

import kemile.larissa.pi.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button avancoLogin = findViewById(R.id.btnLoginLogin);
        avancoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        Button avancoCadastrese = findViewById(R.id.btnCadastreseLogin);
        avancoCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        ImageView iconeSobre = findViewById(R.id.ivIconeLogin);
        iconeSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SobreActivity.class);
                startActivity(intent);
            }
        });
        /*
        TextView sigaiSobre = findViewById(R.id.etSigaiLogin);
        sigaiSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SobreActivity.class);
                startActivity(intent);
            }
        });
         */

    }
}