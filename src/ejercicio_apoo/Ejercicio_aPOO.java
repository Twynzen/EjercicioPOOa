
package ejercicio_apoo;

public class Ejercicio_aPOO {

    public static void main(String[] args) {
      
      Libro libro1 = new Libro(5555, "titulo1","autor1",100);  
      Libro libro2 = new Libro(5544, "titulo2","autor2",200); 
      
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        libro1.setNumPaginas(70);
        
        if (libro1.getNumPaginas()>libro2.getNumPaginas()) {
            System.out.println(libro1.getTitulo()+" tiene más paginas");
        }else{
            System.out.println(libro2.getTitulo()+" tiene más paginas");
        }
            
      
    }
    
}
