package co.com.sofka.back.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "volanteproveedor")
public class VolanteProveedor {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);

    private String nombreProveedor;

    private List<Producto> productos;

    private Date Fecha;

    private String documentoIdentidadProveedor;

    //Constructor por defecto
    public VolanteProveedor() {}

    //Constructor definido
    public VolanteProveedor(String id, String nombreProveedor, List<Producto> productos, Date fecha, String documentoIdentidadProveedor) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
        this.productos = productos;
        Fecha = fecha;
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }


    //Getters
    public String getId() {
        return id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getDocumentoIdentidadProveedor() {
        return documentoIdentidadProveedor;
    }


    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public void setDocumentoIdentidadProveedor(String documentoIdentidadProveedor) {
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }


    //Other methods
    @Override
    public String toString() {
        return "VolanteProveedor{" +
                "id='" + id + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", productos=" + productos +
                ", Fecha=" + Fecha +
                ", documentoIdentidadProveedor='" + documentoIdentidadProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VolanteProveedor that = (VolanteProveedor) o;
        return Objects.equals(id, that.id) && Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(productos, that.productos) && Objects.equals(Fecha, that.Fecha) && Objects.equals(documentoIdentidadProveedor, that.documentoIdentidadProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreProveedor, productos, Fecha, documentoIdentidadProveedor);
    }

}
