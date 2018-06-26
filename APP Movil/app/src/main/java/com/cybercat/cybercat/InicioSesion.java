package com.cybercat.cybercat;


public interface InicioSesion
{
    interface View
    {
        void showResult(String resultado, String titulo);
    }
    interface Presenter
    {
        void showResult(String resultado, String titulo);
        void iniciarSesion(String correo, String clave);
    }
    interface Model
    {
        void iniciarSesion(String correo, String clave);
    }
}
