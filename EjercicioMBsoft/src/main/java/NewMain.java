
import java.util.ArrayList;
import java.util.Collections;

/*Resolver el siguiente problema, usando cualquier lenguaje de programación (indicar cuál):
Tengo una lista de códigos de producto, el formato de estos códigos son: "XXX-NNNNN-Y"
Donde:
XXX son letras (A-Z) ---> código alfabético del producto
NNNNN son números (0-9) ---> código numérico de la región geográfica
Y es un dígito verificador (0-9)

Se pide:
a) Realizar la función:
boolean esPrioritario(codigo), donde devuelve true o false si el código de producto comienza con las letras 'P' o 'W'
b) Realizar la función:
boolean verificar(codigo), donde chequea si el dígito verificador es correcto. Y devuelve true o false si el dígito
verificador es correcto. El dígito verificador se calcula de la siguiente manera: se suma cada cifra del código de la
región geográfica => si obtengo un número de más de 2 dígitos, repito (vuelvo a sumar cada dígito) así, hasta llegar
a 1 sola cifra, ese será mi dígito verificador. Ejemplo: prodcuto "DCR-88578-9", se realiza la suma 8+8+5+7+8 = 36.
Luego se suma 3+6 = 9. Paro. 9 es mi dígito verificador.
c) Realizar una función que recibe una lista de productos (lista/array de los códigos), y las ordena alfabéticamente
según su código alfabético (XXX), de menor a mayor.*/
public class NewMain {

    
    public static void main(String[] args) {
        
        //Creo nuevos productos y lista para probar que las funciones estén ok
        Producto producto1 = new Producto();
        producto1.setCodigo("whC-12345-6");
        
        Producto producto2 = new Producto();
        producto2.setCodigo("ABC-12645-1");
        
        Producto producto3 = new Producto("pvr-12112-7");
        
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(new Producto("vZt-54789-3"));
        
       
        
        //Probando funcion esPrioritario()
        for(int i=0; i<listaProductos.size(); i++){
            Producto producto  = listaProductos.get(i);
            if(producto.esPrioritario(producto.getCodigo())){
                System.out.println(producto.getCodigo());
                System.out.println("Producto prioritario.");
            }
            else{
                System.out.println(producto.getCodigo());
                System.out.println("Producto no prioritario.");
            }
        }
        
        
        //Probando función verificarCodigo()
        for (int i=0; i<listaProductos.size(); i++){
            Producto producto = listaProductos.get(i);
        if(producto.verificarCodigo(producto.getCodigo())){
            System.out.println(producto.getCodigo());
            System.out.println("Digito verificador correcto.");
        }
        else{
            System.out.println(producto.getCodigo());
            System.out.println("Digito verificador incorrecto.");
        }
    }
        
   
         //Probando función que ordena alfabéticamente.
        listaProductos = Producto.ordenarProductos(listaProductos);
        
        for(int i=0; i<listaProductos.size(); i++){
            System.out.println(listaProductos.get(i).getCodigo());
        }
        
        
        
       
    }
    
}
