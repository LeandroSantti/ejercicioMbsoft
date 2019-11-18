
import java.util.ArrayList;
import java.util.Collections;


public class Producto {

    private String codigo;
    
     public Producto(String codigo) {
        this.codigo = codigo;
    }
     
     public Producto() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     
    public boolean esPrioritario(String codigo){
        
        this.codigo = codigo.toUpperCase();
        
        if(this.codigo.substring(0, 1).equalsIgnoreCase("P") || this.codigo.substring(0, 1).equalsIgnoreCase("W")){
            return true;
        }
        else{
            return false;
        }

    }
    
    public boolean verificarCodigo(String codigo){
        
        int cifra1 = Integer.parseInt(codigo.substring(4, 5));
        int cifra2 = Integer.parseInt(codigo.substring(5, 6));
        int cifra3 = Integer.parseInt(codigo.substring(6, 7));
        int cifra4 = Integer.parseInt(codigo.substring(7, 8));
        int cifra5 = Integer.parseInt(codigo.substring(8, 9));
        int digitoVerificador = Integer.parseInt(codigo.substring(10, 11));
        
        int total = cifra1 + cifra2 + cifra3 + cifra4 + cifra5;
        
        if(total > 9){
            int a = total / 10;
            int b = total % 10;
            
            total= a+b;
            
            if(total == digitoVerificador){
                return true;
            }
            else{
                return false;
            }
            
        }
        else{
            if(total == digitoVerificador){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static ArrayList <Producto> ordenarProductos(ArrayList <Producto> listaProductos){
        Collections.sort(listaProductos, (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo()));
    
        return listaProductos;
    }
    
}
