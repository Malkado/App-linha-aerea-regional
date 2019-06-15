package br.com.projeto20;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.WindowManager;

public class Activity_App extends MainActivity  {
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // Para o layout preencher toda tela do cel (remover a barra de tit.)

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Home");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
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
    private void loadFragment(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container , fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}

