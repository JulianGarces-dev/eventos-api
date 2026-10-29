package co.edu.autonoma.eventos_api.dto;

import java.time.LocalDateTime;

public class AsistenciaResponse {

    private Long id;
    private String codigoRegistro;
    private String nombreAsistente;
    private LocalDateTime fechaCheckIn;
    private String registradoPor;

    public AsistenciaResponse() {}

    public AsistenciaResponse(Long id, String codigoRegistro, String nombreAsistente, LocalDateTime fechaCheckIn, String registradoPor) {
        this.id = id;
        this.codigoRegistro = codigoRegistro;
        this.nombreAsistente = nombreAsistente;
        this.fechaCheckIn = fechaCheckIn;
        this.registradoPor = registradoPor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigoRegistro() { return codigoRegistro; }
    public void setCodigoRegistro(String codigoRegistro) { this.codigoRegistro = codigoRegistro; }
    public String getNombreAsistente() { return nombreAsistente; }
    public void setNombreAsistente(String nombreAsistente) { this.nombreAsistente = nombreAsistente; }
    public LocalDateTime getFechaCheckIn() { return fechaCheckIn; }
    public void setFechaCheckIn(LocalDateTime fechaCheckIn) { this.fechaCheckIn = fechaCheckIn; }
    public String getRegistradoPor() { return registradoPor; }
    public void setRegistradoPor(String registradoPor) { this.registradoPor = registradoPor; }
}
