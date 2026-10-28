package co.edu.autonoma.eventos_api.dto;

import co.edu.autonoma.eventos_api.model.EstadoEvento;
import java.time.LocalDateTime;

public class EventoResponse {

    private Long id;
    private String titulo;
    private String descripcion;
    private Integer aforoMaximo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private EstadoEvento estado;

    public EventoResponse() {}

    public EventoResponse(Long id, String titulo, String descripcion, Integer aforoMaximo, LocalDateTime fechaInicio, LocalDateTime fechaFin, EstadoEvento estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.aforoMaximo = aforoMaximo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Integer getAforoMaximo() { return aforoMaximo; }
    public void setAforoMaximo(Integer aforoMaximo) { this.aforoMaximo = aforoMaximo; }
    public LocalDateTime getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDateTime fechaInicio) { this.fechaInicio = fechaInicio; }
    public LocalDateTime getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDateTime fechaFin) { this.fechaFin = fechaFin; }
    public EstadoEvento getEstado() { return estado; }
    public void setEstado(EstadoEvento estado) { this.estado = estado; }
}
