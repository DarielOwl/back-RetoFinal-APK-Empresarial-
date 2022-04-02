package co.com.sofka.back.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "inventario")
public class Inventario {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);

    private String nombreInventario;

    private Long stockMinimo;

    private Long stockMaximo;

    private List<Producto> productos;

    //Constructor por defecto
    public Inventario() {}

    //Constructor definido
    public Inventario(String id, String nombreInventario, Long stockMinimo, Long stockMaximo, List<Producto> productos) {
        this.id = id;
        this.nombreInventario = nombreInventario;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.productos = productos;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getNombreInventario() {
        return nombreInventario;
    }

    public Long getStock() {
        return stock;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombreInventario(String nombreInventario) {
        this.nombreInventario = nombreInventario;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    //Other Methods
    @Override
    public String toString() {
        return "Inventario{" +
                "id='" + id + '\'' +
                ", nombreInventario='" + nombreInventario + '\'' +
                ", stock=" + stock +
                ", productos=" + productos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventario that = (Inventario) o;
        return Objects.equals(id, that.id) && Objects.equals(nombreInventario, that.nombreInventario) && Objects.equals(stock, that.stock) && Objects.equals(productos, that.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreInventario, stock, productos);
    }

}
