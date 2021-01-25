
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getNumeroPaginas() {
        return paginas;
    }
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public void setNumeroReferencia(String numeroReferencia) {
        if(numeroReferencia.length() >= 3) { 
            this.numeroReferencia = numeroReferencia;
        }
        else if (numeroReferencia.length()  < 3){
            System.out.println("El numero de referencia no es valido");  
        }
    }
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    public void imprimeDetalles() {
        if (numeroReferencia!= "") {
            System.out.println("Titulo: " + titulo + ", autor: " + autor + ", Paginas: " + paginas + ", Numero de referencia: " + numeroReferencia + ", Prestado: " + vecesPrestado);
        }
        else {
            numeroReferencia = "zzz";
            System.out.println("Titulo: " + titulo + ", autor: " + autor + ", Paginas: " + paginas + ", Numero de referencia: " + numeroReferencia + ", Prestado: " + vecesPrestado);
        }
    }
    
    public String getDetalles(){
        String detalles; 
        if (numeroReferencia!= "") {
            detalles = ("Titulo: " + titulo + ", autor: " + autor + ", Paginas: " + paginas + ", Numero de referencia: " + numeroReferencia + ", Prestado: " + vecesPrestado);
        }
        else {
            numeroReferencia = "zzz";
            detalles = ("Titulo: " + titulo + ", autor: " + autor + ", Paginas: " + paginas + ", Numero de referencia: " + numeroReferencia + ", Prestado: " + vecesPrestado);
        }
        return detalles;
    }
}
