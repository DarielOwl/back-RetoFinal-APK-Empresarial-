package co.com.sofka.back.DTO;

import java.util.Date;
import java.util.List;

public class FacturaDTO {

    private Long consecutivoFactura;

    private Date Fecha;

    private String nombreCliente;

    private String nombreEmpleado; //El empleado de la ferreteria atiende al cliente

    private List<ProductoDTO> productoDTOS;

    private Long totalPagar;

    //Constructor por defecto
    public FacturaDTO() {}

    //Constructor definido
    public FacturaDTO(Long consecutivoFactura, Date fecha, String nombreCliente, String nombreEmpleado, List<ProductoDTO> productoDTOS, Long totalPagar) {
        this.consecutivoFactura = consecutivoFactura;
        Fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.nombreEmpleado = nombreEmpleado;
        this.productoDTOS = productoDTOS;
        this.totalPagar = totalPagar;
    }

    //Getters
    public Long getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public List<ProductoDTO> getProductos() {
        return productoDTOS;
    }

    public Long getTotalPagar() {
        return totalPagar;
    }

    //Setters
    public void setConsecutivoFactura(Long consecutivoFactura) {
        this.consecutivoFactura = consecutivoFactura;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setProductos(List<ProductoDTO> productoDTOS) {
        this.productoDTOS = productoDTOS;
    }

    public void setTotalPagar(Long totalPagar) {
        this.totalPagar = totalPagar;
    }

    //Other methods


}
