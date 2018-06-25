package com.cybercat.cybercat.Presentador;

import com.cybercat.cybercat.InicioSesion;
import com.cybercat.cybercat.Modelos.InicioSesionModel;

public class InicioSesionPresenter implements InicioSesion.Presenter
{
    private InicioSesion.View view;
    private InicioSesion.Model model;
    public InicioSesionPresenter(InicioSesion.View view)
    {
        this.view = view;
        model = new InicioSesionModel(this);
    }

    @Override
    public void showResult(String resultado, String titulo)
    {
        if(view != null)
        {
            view.showResult(resultado,titulo);
        }
    }

    @Override
    public void iniciarSesion(String Correo, String Clave)
    {
        if(view != null)
        {
            model.iniciarSesion(Correo,Clave);
        }
    }
}
