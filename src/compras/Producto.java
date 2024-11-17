package compras;

public class Producto {
    
    private int codigo; //Se debia eliminar el "final" ya que en el metodo setCodigo() se esta modificando y el final no nos lo permitía
    private String nombre;
    String tipo;
    static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}