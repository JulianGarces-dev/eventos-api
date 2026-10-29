package co.edu.autonoma.eventos_api.dto;

public class EstadisticasResponse {

    private Long eventoId;
    private Integer aforoMaximo;
    private Long registrosConfirmados;
    private Long asistencias;
    private Double porcentajeOcupacion;

    public EstadisticasResponse() {}

    public EstadisticasResponse(Long eventoId, Integer aforoMaximo, Long registrosConfirmados, Long asistencias) {
        this.eventoId = eventoId;
        this.aforoMaximo = aforoMaximo;
        this.registrosConfirmados = registrosConfirmados;
        this.asistencias = asistencias;
        this.porcentajeOcupacion = (aforoMaximo != null && aforoMaximo > 0)
                ? ((double) registrosConfirmados / aforoMaximo) * 100.0
                : 0.0;
    }

    public Long getEventoId() { return eventoId; }
    public void setEventoId(Long eventoId) { this.eventoId = eventoId; }
    public Integer getAforoMaximo() { return aforoMaximo; }
    public void setAforoMaximo(Integer aforoMaximo) { this.aforoMaximo = aforoMaximo; }
    public Long getRegistrosConfirmados() { return registrosConfirmados; }
    public void setRegistrosConfirmados(Long registrosConfirmados) { this.registrosConfirmados = registrosConfirmados; }
    public Long getAsistencias() { return asistencias; }
    public void setAsistencias(Long asistencias) { this.asistencias = asistencias; }
    public Double getPorcentajeOcupacion() { return porcentajeOcupacion; }
    public void setPorcentajeOcupacion(Double porcentajeOcupacion) { this.porcentajeOcupacion = porcentajeOcupacion; }
}
