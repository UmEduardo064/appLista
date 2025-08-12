package com.example.listguitarsplus;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listOfGuitars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfGuitars = findViewById(R.id.listGuitars);

        ArrayList<GuitarItem> guitars = new ArrayList<>();
        guitars.add(new GuitarItem("Stratocaster", R.drawable.stratocaster, "A Stratocaster é conhecida pelo som brilhante e versátil."));
        guitars.add(new GuitarItem("Telecaster", R.drawable.telecaster, "A Telecaster tem timbre limpo e é ótima para country e rock."));
        guitars.add(new GuitarItem("Les Paul", R.drawable.les_paul, "A Les Paul tem som encorpado e sustain longo, ótima para rock e blues."));
        guitars.add(new GuitarItem("Warlock", R.drawable.warlock, "A Warlock possui um design agressivo e angular, muito popular no heavy metal. Seu som é potente e distorcido, ideal para riffs pesados e solos rápidos."));
        guitars.add(new GuitarItem("Flying V", R.drawable.flying_v, "A Flying V tem um formato em 'V' icônico, criado para chamar atenção. Seu som é equilibrado entre agudos e graves, perfeita para rock clássico e metal."));

        CustomAdapter adapter = new CustomAdapter(this, guitars);
        listOfGuitars.setAdapter(adapter);

    }
}
