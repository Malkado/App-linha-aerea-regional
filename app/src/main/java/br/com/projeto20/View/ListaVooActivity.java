package br.com.projeto20.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto20.Contoler.AdapterListVoo;
import br.com.projeto20.Model.ModelVoo;
import br.com.projeto20.R;

public class ListaVooActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ModelVoo> ListaVoos= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // Para o layout preencher toda tela do cel (remover a barra de tit.)

        getSupportActionBar().hide();

        setContentView(R.layout.activity_lista_voo);
        recyclerView=findViewById(R.id.VooList);
        this.criarVoo();

        AdapterListVoo adapterListVoo = new AdapterListVoo(ListaVoos);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterListVoo);

    }
    public void criarVoo(){
        ModelVoo modelVoo = new ModelVoo("001","0:25","75,00","REC","CAU","9:00","9:25");
        ListaVoos.add(modelVoo);

        modelVoo = new ModelVoo("003","0:30","65,00","REC","CAU","11:00","11:30");
        ListaVoos.add(modelVoo);

        modelVoo = new ModelVoo("011","0:25","85,00","REC","CAU","18:30","18:55");
        ListaVoos.add(modelVoo);

    }
}
