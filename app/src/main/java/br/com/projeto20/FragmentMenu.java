package br.com.projeto20;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class FragmentMenu extends Fragment {
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_menu ,container,false);
    }
    public static FragmentHome newInstance(){
        return new FragmentHome();
    }
}
