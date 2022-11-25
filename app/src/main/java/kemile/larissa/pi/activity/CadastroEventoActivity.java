package kemile.larissa.pi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import kemile.larissa.pi.R;

public class CadastroEventoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_evento);


        Button btnCadastrarEvento = findViewById(R.id.btnCadastrarEvento);
        btnCadastrarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Aqui nós desabilitamos o botão adicionar. Fazemos isso para impedir o usuário de
                // apertar esse botão várias vezes e, assim, cadastrar o mesmo produto de forma
                // repetida.
                v.setEnabled(false);

                // Abaixo, verificamos se o usuário preencheu todos os campos necessários. Caso não
                // exibimos uma mensagem toast para o usuário indicando qual campo ele precisa
                // preencher, habilitamos novamente o botão de adicionar e retornamos.
                EditText etTipoCadastroEvento = findViewById(R.id.etNomeCadastrarAluno);
                String tipo = etTipoCadastroEvento.getText().toString();
                if (tipo.isEmpty()) {
                    Toast.makeText(CadastroEventoActivity.this, "O campo tipo do evento não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                EditText etDataCadastroEvento = findViewById(R.id.etDataCadastroEvento);
                String data = etDataCadastroEvento.getText().toString();
                if (data.isEmpty()) {
                    Toast.makeText(CadastroEventoActivity.this, "O campo data do evento não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                EditText etDescricaoEvento = findViewById(R.id.etEmailCadastro);
                String descricao = etDescricaoEvento.getText().toString();
                if (descricao.isEmpty()) {
                    Toast.makeText(CadastroEventoActivity.this, "O campo descricao do evento não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                CheckBox cbPublicoCadastroEvento = findViewById(R.id.cbPublicoCadastroEvento);
                String publico = cbPublicoCadastroEvento.getText().toString();
                if (publico.isEmpty()) {
                    Toast.makeText(CadastroEventoActivity.this, "O campo publico do evento não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                v.setEnabled(true);
                finish();
            }
        });

    }
}