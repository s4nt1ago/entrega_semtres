package com.s4nt1ag0.entregasemanatres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private ImageButton boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actBar = (Toolbar) findViewById(R.id.actBar);
        setSupportActionBar(actBar);
        listaMascotas = (RecyclerView) findViewById(R.id.recyc);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicilizarAdaptador();


        boton = (ImageButton) findViewById(R.id.boton_liked);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MascotasLiked.class);
                startActivity(intent);
            }


        });

    }
    public void  inicilizarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Mascota 1",R.mipmap.ic_banner,6));
        mascotas.add(new Mascota("Mascota 2",R.mipmap.perro_2,6));
        mascotas.add(new Mascota("Mascota 3",R.mipmap.gato,6));

    }
}