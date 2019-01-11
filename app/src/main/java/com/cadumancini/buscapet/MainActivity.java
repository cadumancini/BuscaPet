package com.cadumancini.buscapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPerdiMeuPet, btnEncontreiUmPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Localizando views
        btnPerdiMeuPet = findViewById(R.id.btnPerdiMeuPet);
        btnEncontreiUmPet = findViewById(R.id.btnEncontreiUmPet);

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
    }

    // Inflando menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
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
}
