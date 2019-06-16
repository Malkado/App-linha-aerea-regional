package br.com.projeto20.View;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import br.com.projeto20.R;

public class Activity_App extends MainActivity  {
    Fragment fragment_ida_valta;
    Fragment fragment_ida;
    Fragment fragment;
    private ActionBar toolbar;
    Button btnIdaVolta;
    Button btnIda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // Para o layout preencher toda tela do cel (remover a barra de tit.)

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        btnIdaVolta = findViewById(R.id.btn_ida_volta);
        btnIda = findViewById(R.id.btn_ida);

        toolbar.setTitle("Home");

        fragment_ida_valta = new Fragment_ida_volta_compra();
        fragment_ida = new Fragment_ida_compra();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navegation_home:
                    toolbar.setTitle("Home");
                    fragment= new FragmentHome();
                    loadFragment(fragment);
                    return true;
                case R.id.navegation_comprar:
                    toolbar.setTitle("Vai viajar?");
                    fragment= new FragmentComprar();
                    loadFragment(fragment);
                    Fragment fragment2 = new Fragment_ida_volta_compra();
                    addFragment(fragment2);



                    return true;
                case R.id.navegation_check:
                    toolbar.setTitle("Check-in");
                    fragment= new FragmentCheckin();
                    loadFragment(fragment);
                    return true;
                case R.id.navegation_menu:
                    toolbar.setTitle("Menu");
                    fragment= new FragmentMenu();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };
    public void frag_ida_volta(View view){
        Button buttonida=findViewById(R.id.btn_ida);
        Button buttonidavolta = findViewById(R.id.btn_ida_volta);
        buttonida.setBackground(getResources().getDrawable(R.drawable.btn_fragment_trans_compra_gray));
        buttonida.setTextColor(Color.WHITE);
        buttonidavolta.setBackground(getResources().getDrawable(R.drawable.btn_fragment_trans_compra));
        buttonidavolta.setTextColor(Color.CYAN);
        LoadCosult(fragment_ida_valta);




    }public void frag_ida(View view){
    Button buttonida=findViewById(R.id.btn_ida);
    Button buttonidavolta = findViewById(R.id.btn_ida_volta);
        buttonidavolta.setBackground(getResources().getDrawable(R.drawable.btn_fragment_trans_compra_gray));
        buttonidavolta.setTextColor(Color.WHITE);
        buttonida.setBackground(getResources().getDrawable(R.drawable.btn_fragment_trans_compra));
        buttonida.setTextColor(Color.CYAN);
        LoadCosult(fragment_ida);
        //btnIdaVolta.setBackground(ContextCompat.getDrawable(this, R.drawable.btn_fragment_trans_compra_gray));



    }
    private void addFragment (Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.view_consulta,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void loadFragment(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container , fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
    private void LoadCosult(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.view_consulta , fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
    public void btn2MudaCorGray(View view){
       btnIda.setBackgroundResource(R.drawable.btn_fragment_trans_compra_gray);
    }
    public void btn2MudaCorWhite(View view){
        btnIda.setBackgroundResource(R.drawable.btn_fragment_trans_compra);
    }
    public void btn1MudaCorGray(View view){
        btnIdaVolta.setBackgroundResource(R.drawable.btn_fragment_trans_compra_gray);
    }
    public void btn1MudaCorWhite(View view){
        btnIdaVolta.setBackgroundResource(R.drawable.btn_fragment_trans_compra);
    }
}

