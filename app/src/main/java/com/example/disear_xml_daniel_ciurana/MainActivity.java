package com.example.disear_xml_daniel_ciurana;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Mamá", "¿Vienes a comer?", "10:42"));
        chats.add(new Chat("Grupo DAM", "Ya está subida la práctica", "09:15"));
        chats.add(new Chat("Carlos", "Luego te llamo", "Ayer"));
        chats.add(new Chat("Trabajo", "Reunión a las 5", "Ayer"));
        chats.add(new Chat("Ana", "Jajaja vale", "Lunes"));
        chats.add(new Chat("Papá", "Ok", "Lunes"));
        chats.add(new Chat("Gym", "Hoy toca pierna", "Domingo"));
        chats.add(new Chat("Pedro", "Pásame los apuntes", "Sábado"));
        chats.add(new Chat("Laura", "Nos vemos mañana", "Viernes"));
        chats.add(new Chat("Equipo fútbol", "Partido el sábado", "Jueves"));

        RecyclerView rv = findViewById(R.id.rvChats);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ChatAdapter(chats));
    }
}