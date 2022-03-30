package co.com.sofka.back.DTO;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class VolanteProveedorDTO {

    private String nombreProveedor;

    private List<ProductoDTO> productoDTOS;

    private Date Fecha;

    private String documentoIdentidadProveedor;

    //Constructor por defecto
    public VolanteProveedorDTO() {}

    //Constructor definido
    public VolanteProveedorDTO(String id, String nombreProveedor, List<ProductoDTO> productoDTOS, Date fecha, String documentoIdentidadProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.productoDTOS = productoDTOS;
        Fecha = fecha;
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }

    //Getters
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public List<ProductoDTO> getProductos() {
        return productoDTOS;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getDocumentoIdentidadProveedor() {
        return documentoIdentidadProveedor;
    }

    //Setters
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setProductos(List<ProductoDTO> productoDTOS) {
        this.productoDTOS = productoDTOS;
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
        return "VolanteProveedorDTO{" +
                "nombreProveedor='" + nombreProveedor + '\'' +
                ", productoDTOS=" + productoDTOS +
                ", Fecha=" + Fecha +
                ", documentoIdentidadProveedor='" + documentoIdentidadProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VolanteProveedorDTO that = (VolanteProveedorDTO) o;
        return Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(productoDTOS, that.productoDTOS) && Objects.equals(Fecha, that.Fecha) && Objects.equals(documentoIdentidadProveedor, that.documentoIdentidadProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreProveedor, productoDTOS, Fecha, documentoIdentidadProveedor);
    }

}
