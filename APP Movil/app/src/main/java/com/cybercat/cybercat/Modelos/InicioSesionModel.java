package com.cybercat.cybercat.Modelos;

import com.cybercat.cybercat.InicioSesion;

public class InicioSesionModel          //Se crea la clase del modelo de InicioSesion,
           implements InicioSesion.Model//implementando la interface del modelo en base
{                                       //al patrón Modelo - Vista - Presentador
    private InicioSesion.Presenter presenter;
    private String resultado;
    public InicioSesionModel(InicioSesion.Presenter presenter)//Se crea un método público del modelo que
    {                                                         //instancia la interface del presentador
        this.presenter = presenter;
    }

    @Override
    public void iniciarSesion(String Correo, String Clave)//Se crea el método iniciarSesion con
    {                                                     //los parámetros de correo y clave, estos
        if(Correo!=null && Clave != null )                //se encargaran de las validaciones.
        {
            if(Correo.equals("sinkfz@gmail.com")
                    && Clave.equals("1234"))
            {
                resultado = "Inicio de sesión exitoso.";       //El resultado de este método se basa
                presenter.showResult(resultado, "Éxito");//en comparar los datos ingresados por
            }                                                  //el usuario con las validaciones,
            else                                               //dependiendo de cada caso, el mensaje
            {                                                  //que es envíado cambiará
                resultado = "Error al iniciar sesión.";
                presenter.showResult(resultado, "Error");
            }
        }
        else
        {
            resultado = "Debe ingresar datos.";
            presenter.showResult(resultado, "Error");
        }
    }
}
