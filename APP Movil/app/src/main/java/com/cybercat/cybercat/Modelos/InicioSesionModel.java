package com.cybercat.cybercat.Modelos;

import com.cybercat.cybercat.InicioSesion;

/*Se crea la clase del modelo de InicioSesion, implementando la interface del modelo en base al patrón Modelo - Vista - Presentador (MVP)*/

public class InicioSesionModel                       
           implements InicioSesion.Model

    private InicioSesion.Presenter presenter;
    private String resultado;

/*Se crea un método público del modelo que instancia la interface del presentador*/

    public InicioSesionModel(InicioSesion.Presenter presenter)
    {
        this.presenter = presenter;
    }

    @Override

/*Se crea el método iniciarSesion con los parámetros de correo y clave, estos se encargaran de las validaciones.*/
/*El resultado de este método se basa en comparar los datos ingresados por el usuario con las validaciones, dependiendo de cada caso, el mensaje que es envíado cambiará.*/
    public void iniciarSesion(String correo, String clave)
    {
        if(correo!=null && clave != null )
        {
            if(correo.equals("sinkfz@gmail.com")
                    && clave.equals("1234"))
            {
                resultado = "Inicio de sesión exitoso.";
                presenter.showResult(resultado, "Éxito");
            }
            else
            {
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
