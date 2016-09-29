package es.ujaen.git.practica1;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_aut);
    }

    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }
}
