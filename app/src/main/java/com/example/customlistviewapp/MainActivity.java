package com.example.customlistviewapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    MyCharacter[] data = new MyCharacter[] {
            new MyCharacter("luffy", "Monkey D. Luffy", "Capitaine des Mugiwras"),
            new MyCharacter("zoro", "Roronoa Zoro", "Vice capitaine des Mugiwras"),
            new MyCharacter("nami", "Nami", "Navigatrice des Mugiwras"),
            new MyCharacter("usopp", "Usopp", "Tireur d'élite des Mugiwras"),
            new MyCharacter("sanji", "Vinsmoke Sanji", "Cuisinier des Mugiwras"),
            new MyCharacter("chopper", "Tony Tony Chopper", "Medecin des Mugiwras"),
            new MyCharacter("robin", "Nico Robin", "Archéologue des Mugiwras"),
            new MyCharacter("franky", "Franky", "Charpentier des Mugiwras"),
            new MyCharacter("brook", "Brook", "Musicien des Mugiwras"),
            new MyCharacter("jimbe", "Jinbe", "Timonier des Mugiwras"),
            new MyCharacter("luffy", "Monkey D. Luffy", "Capitaine des Mugiwras"),
            new MyCharacter("zoro", "Roronoa Zoro", "Vice capitaine des Mugiwras"),
            new MyCharacter("nami", "Nami", "Navigatrice des Mugiwras"),
            new MyCharacter("usopp", "Usopp", "Tireur d'élite des Mugiwras"),
            new MyCharacter("sanji", "Vinsmoke Sanji", "Cuisinier des Mugiwras"),
            new MyCharacter("chopper", "Tony Tony Chopper", "Medecin des Mugiwras"),
            new MyCharacter("robin", "Nico Robin", "Archéologue des Mugiwras"),
            new MyCharacter("franky", "Franky", "Charpentier des Mugiwras"),
            new MyCharacter("brook", "Brook", "Musicien des Mugiwras"),
            new MyCharacter("jimbe", "Jinbe", "Timonier des Mugiwras"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        MyCharacterAdapter myCharacterAdapter = new MyCharacterAdapter(this, R.layout.item_row, data);

        listView.setAdapter(myCharacterAdapter);
    }
}