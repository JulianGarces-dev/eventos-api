package co.edu.autonoma.eventos_api.dto;

import co.edu.autonoma.eventos_api.model.TipoEntrada;

public class RegistroRequest {

    private Long eventoId;
    private TipoEntrada tipoEntrada;
    private String nombreAsistente;
    private String emailAsistente;

    public RegistroRequest() {}

    public Long getEventoId() { return eventoId; }
    public void setEventoId(Long eventoId) { this.eventoId = eventoId; }
    public TipoEntrada getTipoEntrada() { return tipoEntrada; }
    public void setTipoEntrada(TipoEntrada tipoEntrada) { this.tipoEntrada = tipoEntrada; }
    public String getNombreAsistente() { return nombreAsistente; }
    public void setNombreAsistente(String nombreAsistente) { this.nombreAsistente = nombreAsistente; }
    public String getEmailAsistente() { return emailAsistente; }
    public void setEmailAsistente(String emailAsistente) { this.emailAsistente = emailAsistente; }
}
