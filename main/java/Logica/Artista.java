package Logica;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Artista extends Usuario{
    private String biografia;
    private String webSite;
    private boolean activo;
    private String fechaEliminacion;
    
    @OneToMany(mappedBy = "artista")
    protected Collection<Album> publicados; 
    
    public  Artista(){
    }

    public Artista(String nickname, String nombre, String apellido, String email, String imagen, String fechaNac, Collection<Usuario> siguiendo, Collection<Usuario> seguidores, String biografia, String webSite,String contraseña,boolean activo) {
        super(nickname, nombre, apellido, email, imagen, fechaNac, siguiendo, seguidores, contraseña);
        this.biografia = biografia;
        this.webSite = webSite;
        this.activo = activo;
        this.fechaEliminacion = null;
    }

    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public String getBiografia() {
        return biografia;
    }
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    public String getWebSite() {
        return webSite;
    }
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
    public Collection<Album> getPublicados() {
        return publicados;
    }
}