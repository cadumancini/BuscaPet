package com.cadumancini.buscapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPerdiMeuPet, btnEncontreiUmPet, btnAcompanharMeuPetPerdido,
        btnVerPetsPerdidosRegiao, btnVerPetsEncontradosRegiao, btnCadastrarMeuPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Localizando views
        btnPerdiMeuPet = findViewById(R.id.btnPerdiMeuPet);
        btnEncontreiUmPet = findViewById(R.id.btnEncontreiUmPet);
        btnAcompanharMeuPetPerdido = findViewById(R.id.btnAcompanharMeuPetPerdido);
        btnVerPetsPerdidosRegiao = findViewById(R.id.btnVerPetsPerdidosRegiao);
        btnVerPetsEncontradosRegiao = findViewById(R.id.btnVerPetsEncontradosRegiao);
        btnCadastrarMeuPet = findViewById(R.id.btnCadastrarMeuPet);

        // Lidando com clique nos botões
        btnPerdiMeuPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPerdiMeuPet();
            }
        });
        btnEncontreiUmPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEncontreiUmPet();
            }
        });
        btnAcompanharMeuPetPerdido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAcompanharMeuPetPerdido();
            }
        });
        btnVerPetsPerdidosRegiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startVerPetsPerdidosRegiao();
            }
        });
        btnVerPetsEncontradosRegiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startVerPetsEcontradosRegiao();
            }
        });
        btnCadastrarMeuPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCadastrarMeuPet();
            }
        });
    }

    // Inflando menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.main_menu_configuracoes) {
            startActivity(new Intent(this, Configuracoes.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Chamando telas
    protected void startPerdiMeuPet(){
        Intent intent = new Intent(this, PerdiMeuPet.class);
        startActivity(intent);
    }
    protected void startEncontreiUmPet(){
        Intent intent = new Intent(this, EncontreiUmPet.class);
        startActivity(intent);
    }
    protected void startAcompanharMeuPetPerdido(){
        Intent intent = new Intent(this, AcompanharMeuPetPerdido.class);
        startActivity(intent);
    }
    protected void startVerPetsPerdidosRegiao(){
        Intent intent = new Intent(this, VerPetsPerdidosRegiao.class);
        startActivity(intent);
    }
    protected void startVerPetsEcontradosRegiao(){
        Intent intent = new Intent(this, VerPetsEncontradosRegiao.class);
        startActivity(intent);
    }
    protected void startCadastrarMeuPet(){
        Intent intent = new Intent(this, CadastrarMeuPet.class);
        startActivity(intent);
    }
}
