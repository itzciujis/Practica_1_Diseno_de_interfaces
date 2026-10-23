package com.example.disear_xml_daniel_ciurana;

public class Chat {
    private final String nombre;
    private final String mensaje;
    private final String hora;

    public Chat(String nombre, String mensaje, String hora) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.hora = hora;
    }

    public String getNombre() { return nombre; }
    public String getMensaje() { return mensaje; }
    public String getHora() { return hora; }
}