package LogicaDTO;

import Logica.Genero;
import java.util.List;

public class DTOLista {
    private String nombre;
    private String rutaImagen;
    private Boolean  esPrivada;
    private DTOGenero genero;
    private DTOUsuario duenio;
    private List<DTOTema> temas;
    private String duenioString;
    private String nombregenero;
    
    //nombre ruta gene duenio

    public DTOLista(String nombre, String rutaImagen, Boolean esPrivada, String genero, String duenioString) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.esPrivada = esPrivada;
        this.nombregenero = genero;
        this.duenioString = duenioString;
    }

   
    
    
    
    
    public DTOLista(String nombre, String rutaImagen, String artista) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.duenioString = artista;
    }
    
    

    public DTOLista(String nombre, String rutaImagen) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }
    public DTOLista(String nombre, String rutaImagen, Genero genero, List<DTOTema> temas) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.temas = temas;
    }

     public DTOLista(String nombre, String rutaImagen, String genero, List<DTOTema> temas) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.temas = temas;
    }

    public DTOLista(String nombre, String rutaImagen, List<DTOTema> temas) {
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.temas = temas;
    }
    public DTOLista(String nombre) {
        this.nombre = nombre;
    }
    public DTOLista(String nombre,DTOUsuario denio){
        this.nombre = nombre;
        this.duenio = denio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Boolean getEsPrivada() {
        return esPrivada;
    }

    public void setEsPrivada(Boolean esPrivada) {
        this.esPrivada = esPrivada;
    }

    public DTOGenero getGenero() {
        return genero;
    }

    public void setGenero(DTOGenero genero) {
        this.genero = genero;
    }

    public DTOUsuario getDuenio() {
        return duenio;
    }

    public void setDuenio(DTOUsuario duenio) {
        this.duenio = duenio;
    }

    public List<DTOTema> getTemas() {
        return temas;
    }

    public void setTemas(List<DTOTema> temas) {
        this.temas = temas;
    }
    
     public String getDuenioString() {
        return duenioString;
    }

    public void setDuenioString(String duenioString) {
        this.duenioString = duenioString;
    }

    public String getNombregenero() {
        return nombregenero;
    }

    public void setNombregenero(String nombregenero) {
        this.nombregenero = nombregenero;
    }
}