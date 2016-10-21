package es.ujaen.git.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ConexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conex);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            String user = bundle.getString("usuario");
            String pass = bundle.getString("password");
            String ip   = bundle.getString("direccionIp");
            int port    = bundle.getInt("puerto");

            //Toast.makeText(this, "Nombre: "+user, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, "Contraseña: "+pass, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, "Dirección IP: "+ip, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, "Puerto: "+port, Toast.LENGTH_SHORT).show();

        }
    }
}
