package kemile.larissa.pi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import kemile.larissa.pi.R;

public class CadastroItemHistoricoAlunoActivity extends AppCompatActivity {

    private Button cadastrarHistorico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_item_historico_aluno);

        cadastrarHistorico = findViewById(R.id.btnCadastrarHistorico);

        cadastrarHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Aqui nós desabilitamos o botão adicionar. Fazemos isso para impedir o usuário de
                // apertar esse botão várias vezes e, assim, cadastrar o mesmo produto de forma
                // repetida.
                v.setEnabled(false);

                // Abaixo, verificamos se o usuário preencheu todos os campos necessários. Caso não
                // exibimos uma mensagem toast para o usuário indicando qual campo ele precisa
                // preencher, habilitamos novamente o botão de adicionar e retornamos.
                TextView etHistoricoAlunoCadastroItem = findViewById(R.id.etHistoricoAlunoCadastroItem);
                String historico = etHistoricoAlunoCadastroItem.getText().toString();
                if (historico.isEmpty()) {
                    Toast.makeText(CadastroItemHistoricoAlunoActivity.this, "O campo historico do cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                TextView etDescricaoCadastroItem = findViewById(R.id.etDescricaoCadastroItem);
                String descricao = etDescricaoCadastroItem.getText().toString();
                if (descricao.isEmpty()) {
                    Toast.makeText(CadastroItemHistoricoAlunoActivity.this, "O campo descrição do cadastro não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                TextView etDetalheCadastroItem = findViewById(R.id.etDescricaoCadastroItem);
                String detalhe = etDetalheCadastroItem.getText().toString();
                if (detalhe.isEmpty()) {
                    Toast.makeText(CadastroItemHistoricoAlunoActivity.this, "O campo Matricula do Aluno não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                v.setEnabled(true);
                finish();
            }
        });
    }
}