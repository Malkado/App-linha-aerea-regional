package br.com.projeto20.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.projeto20.R;

class FragmentUser extends Fragment {
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fagment_user ,container,false);
    }
    public static FragmentHome newInstance() {
        return new FragmentHome();
    }
}