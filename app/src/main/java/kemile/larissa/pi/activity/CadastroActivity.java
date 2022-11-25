package kemile.larissa.pi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import kemile.larissa.pi.R;

public class CadastroActivity extends AppCompatActivity {

    private Button avancoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        avancoCadastro = findViewById(R.id.btnCadastrarCadastro);

        avancoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui nós desabilitamos o botão adicionar. Fazemos isso para impedir o usuário de
                // apertar esse botão várias vezes e, assim, cadastrar o mesmo produto de forma
                // repetida.
                view.setEnabled(false);

                // Abaixo, verificamos se o usuário preencheu todos os campos necessários. Caso não
                // exibimos uma mensagem toast para o usuário indicando qual campo ele precisa
                // preencher, habilitamos novamente o botão de adicionar e retornamos.
                EditText etNomeCadastro = findViewById(R.id.etNomeCadastro);
                String nome = etNomeCadastro.getText().toString();
                if (nome.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "O campo Nome do Cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    view.setEnabled(true);
                    return;
                }

                EditText etEmailCadastro = findViewById(R.id.etEmailCadastro);
                String email = etEmailCadastro.getText().toString();
                if (email.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "O campo Email do Cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    view.setEnabled(true);
                    return;
                }

                EditText etSiapeCadastro = findViewById(R.id.etEmailCadastro);
                String siape = etSiapeCadastro.getText().toString();
                if (siape.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "O campo siape do cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    view.setEnabled(true);
                    return;
                }

                EditText etSenhaCadastro = findViewById(R.id.etSenhaCadastro);
                String senha = etSenhaCadastro.getText().toString();
                if (senha.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "O campo senha do cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    view.setEnabled(true);
                    return;
                }

                EditText etSenhaNovamenteCadastro = findViewById(R.id.etSenhaNovamenteCadastro);
                String senhaNovamente = etSenhaNovamenteCadastro.getText().toString();
                if (senhaNovamente.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "O campo senhaNovamente do cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    view.setEnabled(true);
                    return;
                }

                view.setEnabled(true);
                finish();
            }
        });
    }
}