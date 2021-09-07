package personal.app.segundoejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import personal.app.segundoejemplo.modelo.SuperHeroe;

import static personal.app.segundoejemplo.RegistrarActivity.superHeroe;

public class MainActivity extends AppCompatActivity {

    Button btnAgregar, btnListar, btnMostrarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregar = findViewById(R.id.btnAgregar);
        btnListar = findViewById(R.id.btnVerlista);
        btnMostrarDatos = findViewById(R.id.btnMostrarDatos);

    }

    public void agregarHeroes(View view){

        startActivity(new Intent(MainActivity.this, RegistrarActivity.class));
    }

    public void verLista(View view){
        if(superHeroe.isEmpty()){
            Toast.makeText(MainActivity.this, "Lista vacia", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(new Intent(MainActivity.this, ListarActivity.class));
        }
    }
}