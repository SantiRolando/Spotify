package Persistencia;

import Logica.*;
import LogicaDTO.*;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControllerPersistencia {
    private EntityManagerFactory emf;
    private EntityManager em;
    private final AlbumJpaController albJpa;
    private final ArtistaJpaController artJpa;
    private final TemaJpaController temJpa;
    private final ListaJpaController listJpa;
    private final ClienteJpaController cliJpa;

    public ControllerPersistencia(AlbumJpaController albJpa, ArtistaJpaController artJpa,
                                  TemaJpaController temJpa, ListaJpaController listJpa,
                                  ClienteJpaController cliJpa) {
        this.albJpa = albJpa;
        this.artJpa = artJpa;
        this.temJpa = temJpa;
        this.listJpa = listJpa;
        this.cliJpa = cliJpa;
        this.emf = Persistence.createEntityManagerFactory("EspotifyBD");
        this.em = emf.createEntityManager();
    }

    public ControllerPersistencia() {
        emf = Persistence.createEntityManagerFactory("EspotifyBD");
        em = emf.createEntityManager();
        albJpa = new AlbumJpaController();
        artJpa = new ArtistaJpaController();
        temJpa = new TemaJpaController();
        listJpa = new ListaJpaController();
        cliJpa = new ClienteJpaController();
    }

    public void altaAlbum(Album album) throws Exception {
        albJpa.create(album);
    }

    public void editarAlbum(Album album) throws Exception {
        albJpa.edit(album);
    }

    public void eliminarAlbum(Long albumId) throws Exception {
        albJpa.delete(albumId);
    }

    public Album buscarAlbum(Long albumId) {
        return albJpa.findAlbum(albumId);
    }
    
    public List<String> obtenerArtistas(){
        return artJpa.findAllArtistaNicknames();
    }

    public List<String> obtenerAlbumsPorGenero(String generoSeleccionado) {
        return albJpa.findAlbumPorGenero(generoSeleccionado);
    }

    public List<String> obtenerAlbumsPorArtista(String artistaSeleccionado) {
        return albJpa.findAlbumPorArtista(artistaSeleccionado);
    }

    public Album consultaAlbumPorTitulo(String albumSeleccionado) {
        return albJpa.findAlbumPorTitulo(albumSeleccionado);
    }

    public boolean existeAlbum(String nicknameArtista, String titulo) {
        return albJpa.artistaYaTieneAlbum(nicknameArtista, titulo);
    }

    public Tema findTemaPorNombre(String nombrelista){
        return temJpa.findTemaPorNombre(nombrelista);
   }
    public Album BuscoAlbumtemalis(String nombreAlbum){
        return albJpa.BuscoAlbumParaTemaLista(nombreAlbum);
    }
    
    public List<Album> todosLosAlbums(){
        return albJpa.todosLosAlbums();
    }
    
    public List<Tema> ObtengotemaPorAlbum(String NombreAlbum){
        return temJpa.obtenerTemaPorNombredeAlbum(NombreAlbum);
    }

    public List<Tema> findTemitas() {
        return temJpa.obtenerTodosLosTemas();
    }

    public List<String> obtenerClientes(){
        return cliJpa.findAllClienteNicknames();
    }
    
    public void altaLista(Lista list) throws Exception {
        listJpa.create(list);
    }

    public void editarLista(Lista list) throws Exception {
        listJpa.edit(list);
    }

    public void eliminarLista(Long listId) throws Exception {
        listJpa.delete(listId);
    }

    public Lista buscarLista(Long listId) {
        return listJpa.findLista(listId);
    }
    
    public List<DtoLista> obtenerListaPorGeneroDATALISTA(String generoSeleccionado) {
        return listJpa.obtenerListaPorGeneroDATALISTA(generoSeleccionado);
    }
    
    
    
    public List<String> obtenerListaPorGenero(String generoSeleccionado) {
        return listJpa.findListaPorGenero(generoSeleccionado);
    }

    public List<String> obtenerListaPorCliente(String clienteSeleccionado) {
        return listJpa.findListaPorCliente(clienteSeleccionado);
    }
     
    public List<DtoLista> obtenerListaPorClienteDATA(String clienteSeleccionado) {
        return listJpa.findListaPorClienteDATA(clienteSeleccionado);
    }
    public Lista obtenerListaPorCliente2(String clienteSeleccionado) {
        return listJpa.findListaPorCliente2(clienteSeleccionado);
    }
    
    public Lista consultaListaPorTitulo(String listaSeleccionado) {
        return listJpa.findListaPorTitulo(listaSeleccionado);
    }
    
    public Lista consultaListaPorTituloyGenero(String listaSeleccionado, String genero) {
        return listJpa.findListaPorTituloyGenero(listaSeleccionado, genero);
    }   
    
    public List<Lista> findListas(){
        return listJpa.findListas();
    }
    public Tema findTemaPorDatos(String nombreTema, String duracion, String enlace, int posicion){
        return temJpa.findTemaPorDatos(nombreTema, duracion, enlace, posicion);
    }
    
    public Lista findListaPorDatos(String nombrelista,boolean privada){
        return listJpa.findListaPorDatos(nombrelista, privada);
    }
    
    
    public Album findAlbumPorDatos(String artista, String nombreA) {
        return albJpa.findAlbumPorDatos(artista, nombreA);
    }
    
    public Tema findTemaPorTitulo(String temaSeleccionado){
        return temJpa.findTemaPorTitulo(temaSeleccionado);
    }
    
    public List<Tema> obtenerTemasFavoritosDeCliente(String nicknameCliente) {
        return cliJpa.findTemasFavoritosDeCliente(nicknameCliente);
    }

    public List<Lista> obtenerListasFavoritasDeCliente(String nicknameCliente) {
        return cliJpa.findListasFavoritasDeCliente(nicknameCliente);
    }

    public List<Album> obtenerAlbumsFavoritosDeCliente(String nicknameCliente) {
        return cliJpa.findAlbumsFavoritosDeCliente(nicknameCliente);
    }
    
    public List<Artista> obtenerArtistasData(){
        return artJpa.findAllArtistaData();
    }

    public DtoAlbum BuscoAlbumartista(String nombreAlbum,String nombreArtista){
        return albJpa.buscoalbumporArtista(nombreAlbum,nombreArtista);
    }

    public List<Cliente> obtenerClientesData(){
        return cliJpa.findAllClienteData();
    }
    
    public List<Album> obtenerTodosLosAlbumsCompletos(){
        return albJpa.todosLosAlbums();
    }

    public boolean albumEsDeXGenero(String albumTitulo, String artistaNickname, String generoNombre) {
        return albJpa.albumEsDeXGenero(albumTitulo, artistaNickname, generoNombre);
    }

    public List<Tema> temasDelAlbum(String titulo) {
        return albJpa.temasDelAlbum(titulo);
    }
    
    public List<String> findListaPorClientePriv(String clienteSeleccionado) {
        return listJpa.findListaPorClientePriv(clienteSeleccionado);
    }
    
    public List<String> findArtistasBorrados(){
        return artJpa.findArtistasBorrados();
    }

    public void darDeBajaArtista(Artista a) {
        artJpa.darDeBajaArtista(a);
    }
    
    public List<DtoLista> obtenerListaPorClientePRIVADAS(String clienteSeleccionado) {
        return listJpa.findListaPorClientePRIVADAS(clienteSeleccionado);
    }

    public Set<Integer> obtenerTodosLosIDAlbumsDelArtista(String nickname) {
        return albJpa.obtenerTodosLosIDAlbumsDelArtista(nickname);
    }

    public void darDeBajaAlbumsyTemasCliente(Set<Integer> albumIds) {
        if(albumIds != null){
            albJpa.darDeBajaAlbumsCliente(albumIds);
            temJpa.darDeBajaTemasCliente(albumIds);
        }
    }

    public void darDeBajaTemasDeLista(Set<Integer> albumIds) {
        listJpa.darDeBajaTemasDeLista(albumIds);
    }

    public boolean temaValido(Tema t) {
        return temJpa.temaValido(t);
    }

    public boolean sumaDescarga(Tema t){
        return temJpa.sumoDescarga(t);
    }
   
    public boolean sumaReproduccion(Tema tem){
        return temJpa.sumoRepro(tem);
    }
    
    public int findCantidadFavoritosConTema(int temaId){
      return temJpa.CantidadFavoritosConTema(temaId);
    }
    
    public int findCantidadListasConTema(int tamId){
     return temJpa.CantidadListasConTema(tamId);
       }

}
