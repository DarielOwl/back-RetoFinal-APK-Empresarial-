package co.com.sofka.back.DTO;

import java.util.Objects;

public class ProductoDTO {

    private String nombreProducto;

    private Long precio;

    //Constructor por defecto
    public ProductoDTO() {}

    //Constructor definido
    public ProductoDTO(String id, String nombreProducto, Long precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    //Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public Long getPrecio() {
        return precio;
    }

    //Setters
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    //Other methods
    @Override
    public String toString() {
        return "ProductoDTO{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoDTO that = (ProductoDTO) o;
        return Objects.equals(nombreProducto, that.nombreProducto) && Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreProducto, precio);
    }
}
