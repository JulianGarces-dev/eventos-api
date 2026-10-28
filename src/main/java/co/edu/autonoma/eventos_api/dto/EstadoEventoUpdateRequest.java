package co.edu.autonoma.eventos_api.dto;

import co.edu.autonoma.eventos_api.model.EstadoEvento;

public class EstadoEventoUpdateRequest {

    private EstadoEvento estado;

    public EstadoEventoUpdateRequest() {}

    public EstadoEvento getEstado() { return estado; }
    public void setEstado(EstadoEvento estado) { this.estado = estado; }
}
