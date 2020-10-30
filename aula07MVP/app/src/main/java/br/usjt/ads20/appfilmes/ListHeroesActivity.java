package br.usjt.ads20.appfilmes;

import androidx.appcompat.app.AppCompatActivity;
import br.usjt.ads20.appfilmes.model.Dados;
import br.usjt.ads20.appfilmes.model.Hero;
import br.usjt.ads20.appfilmes.view.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListHeroesActivity extends AppCompatActivity {
    public static final String DESCRICAO = "br.usjt.ads20.appfilmes.descricao";
    Hero[] lista;
    Activity atividade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hero);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.NOME);

        ArrayList<Hero> heroes = (ArrayList<Hero>) intent.getSerializableExtra(MainActivity.HEROES);

        Dados.setHerois(heroes);

        lista = Dados.callHeroes(chave);

        BaseAdapter adapter = new Adapter(this, lista);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(atividade, InfoHeroActivity.class);
                intent1.putExtra(DESCRICAO, lista[i]);
                startActivity(intent1);
            }
        });

    }
}