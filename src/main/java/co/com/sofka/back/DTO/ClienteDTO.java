package co.com.sofka.back.DTO;

import java.util.Objects;

public class ClienteDTO {

    private String documentoIdentidad;

    private String nombre;

    private String celular;

    //Constructor por defecto
    public ClienteDTO() {}

    //Constructor definido
    public ClienteDTO(String documentoIdentidad, String nombre, String celular) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.celular = celular;
    }


    //Getters
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }


    //Setters
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    //Other methods
    @Override
    public String toString() {
        return "ClienteDTO{" +
                "documentoIdentidad='" + documentoIdentidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDTO that = (ClienteDTO) o;
        return Objects.equals(documentoIdentidad, that.documentoIdentidad) && Objects.equals(nombre, that.nombre) && Objects.equals(celular, that.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentoIdentidad, nombre, celular);
    }
}
