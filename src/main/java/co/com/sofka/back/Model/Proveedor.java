package co.com.sofka.back.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "proveedor")
public class Proveedor {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);

    private String documentoIdentidad;

    private String nombre;

    private String celular;

    //Constructor por defecto
    public Proveedor() {}

    //Constructor definido
    public Proveedor(String id, String documentoIdentidad, String nombre, String celular) {
        this.id = id;
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.celular = celular;
    }


    //Getters
    public String getId() {
        return id;
    }

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
    public void setId(String id) {
        this.id = id;
    }

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
        return "Proveedor{" +
                "id='" + id + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(id, proveedor.id) && Objects.equals(documentoIdentidad, proveedor.documentoIdentidad) && Objects.equals(nombre, proveedor.nombre) && Objects.equals(celular, proveedor.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentoIdentidad, nombre, celular);
    }
}
