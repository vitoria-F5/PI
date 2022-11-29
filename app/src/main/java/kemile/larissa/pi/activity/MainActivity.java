package kemile.larissa.pi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean login = false;
        Intent intent;
        if (login) {
            intent = new Intent(MainActivity.this, HomeActivity.class);
        }
        else {
            intent = new Intent(MainActivity.this, LoginActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
