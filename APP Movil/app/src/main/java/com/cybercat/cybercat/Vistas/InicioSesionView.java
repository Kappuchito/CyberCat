package com.cybercat.cybercat.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.cybercat.cybercat.InicioSesion;
import com.cybercat.cybercat.Presentador.InicioSesionPresenter;
import com.cybercat.cybercat.R;

public class InicioSesionView extends AppCompatActivity
implements InicioSesion.View
{
    private EditText etCorreo;
    private EditText etClave;
    private TextView tvEstadoSesion;
    private InicioSesion.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        etCorreo=findViewById(R.id.etCorreo);
        etClave=findViewById(R.id.etClave);
        tvEstadoSesion=findViewById(R.id.tvEstadoSesion);
        presenter = new InicioSesionPresenter(this);
    }

    public void ingresar(View view)
    {
        presenter.iniciarSesion(etCorreo.getText().toString(),
                etClave.getText().toString());
    }
    @Override
    public void showResult(String resultado, String titulo)
    {
        tvEstadoSesion.setText(resultado);
    }
}
