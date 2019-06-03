package br.com.projeto20;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;

public class Activity_App extends MainActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView navigationView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        navigationView= findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navegation_home:{
                getSupportActionBar().setTitle("Home");
                Fragment FragmentHome= br.com.projeto20.FragmentHome.newInstance();
                openFragment(FragmentHome);
                break;
            }case R.id.navegation_check:{
                getSupportActionBar().setTitle("Comprar");
                Fragment FragmentComprar= br.com.projeto20.FragmentComprar.newInstance();
                openFragment(FragmentComprar);
                break;
            }case R.id.navegation_comprar:{
                getSupportActionBar().setTitle("Comprar");
                Fragment FragmentCheckin= br.com.projeto20.FragmentCheckin.newInstance();
                openFragment(FragmentCheckin);
                break;
            }
        }
        return false;
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
