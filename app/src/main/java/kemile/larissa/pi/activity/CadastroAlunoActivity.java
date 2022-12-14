package kemile.larissa.pi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import kemile.larissa.pi.R;

public class CadastroAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        Button btnCadastrarAluno = findViewById(R.id.btnCadastrarAluno);
        btnCadastrarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Aqui nós desabilitamos o botão adicionar. Fazemos isso para impedir o usuário de
                // apertar esse botão várias vezes e, assim, cadastrar o mesmo produto de forma
                // repetida.
                v.setEnabled(false);

                // Abaixo, verificamos se o usuário preencheu todos os campos necessários. Caso não
                // exibimos uma mensagem toast para o usuário indicando qual campo ele precisa
                // preencher, habilitamos novamente o botão de adicionar e retornamos.
                EditText etNomeCadastrar = findViewById(R.id.etNomeCadastrarAluno);
                String nome = etNomeCadastrar.getText().toString();
                if (nome.isEmpty()) {
                    Toast.makeText(CadastroAlunoActivity.this, "O campo Nome do Aluno não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                EditText etMatriculaCadastrarAluno = findViewById(R.id.etMatriculaCadastrarAluno);
                String matricula = etMatriculaCadastrarAluno.getText().toString();
                if (matricula.isEmpty()) {
                    Toast.makeText(CadastroAlunoActivity.this, "O campo Matricula do Aluno não foi preenchido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                Spinner spEtnia = findViewById(R.id.spEtniaCadastroAluno);
                int etnia = spEtnia.getSelectedItemPosition();
                if (etnia == 0) {
                    Toast.makeText(CadastroAlunoActivity.this, "O campo etnia do Aluno não foi escolhido", Toast.LENGTH_LONG).show();
                    v.setEnabled(true);
                    return;
                }

                CheckBox assistencia = findViewById(R.id.cbBolsaCadastrarAluno);
                Boolean estudantil = assistencia.isChecked();

                v.setEnabled(true);
                finish();
            }
        });
    }
}