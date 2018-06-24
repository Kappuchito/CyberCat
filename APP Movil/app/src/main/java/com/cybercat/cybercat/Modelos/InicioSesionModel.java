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
    {                                                     //los parámetros de correo y clave, con el
        if(Correo.equals("sinkfz@gmail.com") &&           //fin de comprobar si la información
                                    Clave.equals("1234")) //ingresada por el usuario concuerda con
        {                                                 //las validaciones dentro del método
            resultado = "Inicio de sesion exitoso";       //El resultado de este método se basa
            presenter.showResult(resultado);              //en comparar los datos ingresados por el
        }                                                 //usuario con las validaciones, depende de
        else{                                             //cada caso, el mensaje que se envía
            resultado = "Error al iniciar sesion";        //variará
            presenter.showResult(resultado);
        }
    }
}
