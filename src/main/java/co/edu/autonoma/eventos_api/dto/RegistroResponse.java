package co.edu.autonoma.eventos_api.dto;

import co.edu.autonoma.eventos_api.model.EstadoRegistro;
import co.edu.autonoma.eventos_api.model.TipoEntrada;
import java.time.LocalDateTime;

public class RegistroResponse {

    private Long id;
    private String codigo;
    private Long eventoId;
    private TipoEntrada tipoEntrada;
    private String nombreAsistente;
    private String emailAsistente;
    private EstadoRegistro estado;
    private LocalDateTime fechaRegistro;

    public RegistroResponse() {}

    public RegistroResponse(Long id, String codigo, Long eventoId, TipoEntrada tipoEntrada, String nombreAsistente, String emailAsistente, EstadoRegistro estado, LocalDateTime fechaRegistro) {
        this.id = id;
        this.codigo = codigo;
        this.eventoId = eventoId;
        this.tipoEntrada = tipoEntrada;
        this.nombreAsistente = nombreAsistente;
        this.emailAsistente = emailAsistente;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Long getEventoId() { return eventoId; }
    public void setEventoId(Long eventoId) { this.eventoId = eventoId; }
    public TipoEntrada getTipoEntrada() { return tipoEntrada; }
    public void setTipoEntrada(TipoEntrada tipoEntrada) { this.tipoEntrada = tipoEntrada; }
    public String getNombreAsistente() { return nombreAsistente; }
    public void setNombreAsistente(String nombreAsistente) { this.nombreAsistente = nombreAsistente; }
    public String getEmailAsistente() { return emailAsistente; }
    public void setEmailAsistente(String emailAsistente) { this.emailAsistente = emailAsistente; }
    public EstadoRegistro getEstado() { return estado; }
    public void setEstado(EstadoRegistro estado) { this.estado = estado; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}