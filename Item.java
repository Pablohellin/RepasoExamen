public class Item {
    public String nombre;
    public double precio;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Item(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio; 
}
}