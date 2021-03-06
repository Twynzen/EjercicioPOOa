
package ejercicio_apoo;


public class Libro {
    //creamos atributos
    public int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    
        
    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    Libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//Creamos metodos   get debuelve y set modifica

    public int getISBN() { 
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
 
    @Override //significa que es de una clase heredada
    public String toString(){
        return "El libro "+titulo+" no ISBN "+ISBN
                + " creado por el autor "+autor
                + " tiene "+numPaginas+ " paginas";
    }
    
    
}
