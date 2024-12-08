import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los botones
        Button btnContinuar = findViewById(R.id.btnContinuar);
        Button btnSalir = findViewById(R.id.btnSalir);

        // Acción del botón Continuar
        btnContinuar.setOnClickListener(v -> 
            Toast.makeText(MainActivity.this, "Has presionado Continuar", Toast.LENGTH_SHORT).show()
        );

        // Acción del botón Salir
        btnSalir.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Has presionado Salir", Toast.LENGTH_SHORT).show();
            finish(); // Cierra la actividad
        });
    }
}
