package es.ujaen.git.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link *AuthFragment.*OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AuthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AuthFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";

    // TODO: Rename and change types of parameters
    private String mUser="";
    private String mPass="";
    private String mIP="";
    private String mPort="";

    private EditText mEditUser=null;
    private EditText mEditPass=null;
    private EditText mEditIP=null;
    private EditText mEditPort=null;

    public AuthFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param *param1 Parameter 1.
     * @param *param2 Parameter 2.
     * @return A new instance of fragment AuthFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AuthFragment newInstance(String user, String pass, String ip, String port) {
        AuthFragment fragment = new AuthFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, user);
        args.putString(ARG_PARAM2, pass);
        args.putString(ARG_PARAM3, ip);
        args.putString(ARG_PARAM4, port);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mUser = getArguments().getString(ARG_PARAM1);
            mPass = getArguments().getString(ARG_PARAM2);
            mIP   = getArguments().getString(ARG_PARAM3);
            mPort = getArguments().getString(ARG_PARAM4);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View fragmento = inflater.inflate(R.layout.fragment_auth, container, false);

        mEditUser = (EditText)fragmento.findViewById(R.id.auth_edit_user);
        mEditPass = (EditText)fragmento.findViewById(R.id.auth_edit_pass);
        mEditIP   = (EditText)fragmento.findViewById(R.id.auth_edit_ip);
        mEditPort = (EditText)fragmento.findViewById(R.id.auth_edit_port);

        mEditUser.setText(mUser);
        mEditPass.setText(mPass);
        mEditIP.setText(mIP);
        mEditPort.setText(mPort);

        Button boton = (Button)fragmento.findViewById(R.id.auth_button_send);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user   = mEditUser.getText().toString();
                String pass   = mEditPass.getText().toString();
                String ip     = mEditIP.getText().toString();
                String port1  = mEditPort.getText().toString();
                int port      = Integer.parseInt(port1);
                Autenticacion datos = new Autenticacion(user,pass,ip,port);

                Toast.makeText(getActivity(), "Nombre: "+datos.getUser(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "Contraseña: "+datos.getPass(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "IP: "+datos.getIP(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "Puerto: "+datos.getPort(), Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getActivity(), ConexActivity.class);
                i.putExtra("usuario",user);
                i.putExtra("password",pass);
                i.putExtra("direccionIp",ip);
                i.putExtra("puerto",port);
                startActivity(i);
            }
        });

        return fragmento;

    }






}
