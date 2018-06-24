package com.cybercat.cybercat;

public interface InicioSesion
{
    interface View
    {
        void showResult(String resultado);
    }
    interface Presenter
    {
        void showResult(String resultado);
        void iniciarSesion(String Correo, String Clave);
    }
    interface Model
    {
        void iniciarSesion(String Correo, String Clave);
    }
}
