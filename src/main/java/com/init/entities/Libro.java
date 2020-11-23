package com.init.entities;

import javax.persistence.*;

@Entity
@Table(name = "prueba")
public class Libro {

    @Id
    @Column(name = "IdLibros")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "Titulo", nullable=false, length=45)
    private String Titulo;

    @Column(name= "Anio", nullable=false, length=4)
    private Long anio;

    @Column(name= "Sinopsis", nullable=false, length=2000)
    private String Sipnosis;

    @Column(name= "Resena", nullable=false, length=2000)
    private String Resena;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public Long getAnio() {
        return anio;
    }
    public void setAnio(Long anio) {
        this.anio = anio;
    }
    public String getSipnosis() {
        return Sipnosis;
    }
    public void setSipnosis(String sipnosis) {
        Sipnosis = sipnosis;
    }
    public String getResena() {
        return Resena;
    }
    public void setResena(String resena) {
        Resena = resena;
    }

}
