package com.s4nt1ag0.entregasemanatres;

public class Mascota {
    private String nombre;
    private int cantidad_likes;
    private int imagen;


    public Mascota(String nombre, int imagen, int cantidad_likes){
        this.nombre = nombre;
        this.imagen = imagen;
        this.cantidad_likes = cantidad_likes;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad_likes() {
        return cantidad_likes;
    }

    public void setCantidad_likes(int cantidad_likes) {
        this.cantidad_likes = cantidad_likes;
    }
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
