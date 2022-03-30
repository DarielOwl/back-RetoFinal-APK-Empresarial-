package co.com.sofka.back.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "cliente")
public class Cliente {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);

    private String documentoIdentidad;

    private String nombre;

    private String celular;

    //Constructor por defecto
    public Cliente() {}

    //Constructor definido
    public Cliente(String id, String documentoIdentidad, String nombre, String celular) {
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
        return "Cliente{" +
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
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(documentoIdentidad, cliente.documentoIdentidad) && Objects.equals(nombre, cliente.nombre) && Objects.equals(celular, cliente.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentoIdentidad, nombre, celular);
    }

}
