package com.cybercat.cybercat;


public interface InicioSesion
{
    interface View
    {
        void showResult(String resultado, String título);
    }
    interface Presenter
    {
        void showResult(String resultado, String título);
        void iniciarSesion(String Correo, String Clave);
    }
    interface Model
    {
        void iniciarSesion(String Correo, String Clave);
    }
}
