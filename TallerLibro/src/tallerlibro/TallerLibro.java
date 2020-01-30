/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlibro;
import java.util.Scanner;
/**
 *
 * @author PC-01
 */
public class TallerLibro {

    /**
     * @param args the command line arguments
     */
    //Atributos
    String titulo;
    String[] autores;
    Boolean color;
    int nPaginas;
    int nFiguras;
    float precioFinal;
    public static final float VPAGINA = 0.10f;
    //Constructores
    public TallerLibro(){
        titulo ="";
        autores = new String[2];
        color = true;
        nPaginas = 0;
        nFiguras =0;
    }
    
    public TallerLibro(String titulo,int i, boolean color, int nPaginas, int nFiguras ){
        this.titulo = titulo;
        this.autores = new String [i];
        this.color = color;
        this.nPaginas = nPaginas;
        this.nFiguras = nFiguras;
    }
    
    //Metodos
    public void ingresarDatosLibro(){
         Scanner input = new Scanner(System.in);
         System.out.println("Titulo: ");
         this.titulo= input.nextLine();
         //Autores
         int i=0;
         System.out.println("¿Cuantos autores?");
         int numAutores= input.nextInt();
         input.nextLine();
         autores = new String[numAutores];
         do{
             System.out.println("Autor" + (i+1) + " ");
             autores[i]= input.nextLine();
             i++;
         }while(i<autores.length);
          //  i++;
         System.out.println("Color: ");
         this.color = input.nextBoolean();
         System.out.println("Numero de paginas: ");
         this.nPaginas = input.nextInt();
         System.out.println("Numero de figuras: ");
         this.nFiguras= input.nextInt();
    }
    
    
    
    public void calcularPrecio(){
        float precioImpresionPaginas;
        float vFigura;
        float precioImpresionFigura;
        
        precioImpresionPaginas = nPaginas*VPAGINA;
        if(color=true){
            vFigura = 0.20f;
            precioImpresionFigura= nFiguras * vFigura;
        }else{
            vFigura=0.15f;
            precioImpresionFigura = nFiguras * vFigura;
        }
        precioFinal =precioImpresionPaginas + precioImpresionFigura;
    }
    
    public void mostrarDatosLibro(){
        System.out.println("----------------------------------Datos del Libro-----------------------------");
        System.out.println("Titulo: " + titulo);
          for( int i=0; i<autores.length; i++){
            System.out.println("Autor" + (i+1) +" " + autores[i]);
        }
        if (color){
        System.out.println("Esta a Color: Si ");
        }else{
            System.out.println("Esta a Color: No");
        }
        System.out.println("Numero de paginas " + nPaginas);
        System.out.println("Numero de figuras " + nFiguras);
        System.out.println("Precio: $" + precioFinal);
      
    }
     

}