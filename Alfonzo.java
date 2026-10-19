
import java.util.Scanner;

public class Alfonzo {
    public static void main(String[] args)
     {
       //Declaración de variables.
        double costoProducto;
        double cantidadProductos;
        String nombreProducto;
        double total;
        int contCategoriaAlta = 0; 
      System.out.println("Cuantos productos se ingresaran al lote?");
        Scanner loi  =new Scanner(System.in);
        cantidadProductos = loi.nextInt();
        loi.nextLine();
        int contador = 1;
        total =0;

        // Aqui empieza el ciclo.
        while (contador <= cantidadProductos) {
            System.out.println("que producto desea comprar?");
            nombreProducto = loi.nextLine();
            System.out.println(" ");
            System.out.println("ingrese el costo base de el producto");
            costoProducto = loi.nextDouble();
            if(costoProducto<10000) {
                System.out.println("Categoria Baja");
            }else if (costoProducto>=10000 && costoProducto<=50000){
                System.out.println("Categoria Media");
            }else if (costoProducto>50000){
                System.out.println("Categoria Alta");
                contCategoriaAlta++;
                // Aqui se suma el total 
            total += costoProducto;
           contador++; 
           
        }// aqui se saca el porcentaje
        System.out.println("El costo promedio de los productos ingresados en el lote es de: " + total/cantidadProductos);
        System.out.println("Productos de categoria alta: "+ contCategoriaAlta);
    }

    }

}