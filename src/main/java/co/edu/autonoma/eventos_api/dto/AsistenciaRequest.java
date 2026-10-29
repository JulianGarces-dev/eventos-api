package co.edu.autonoma.eventos_api.dto;

public class AsistenciaRequest {

    private String codigoRegistro;
    private String registradoPor;

    public AsistenciaRequest() {}

    public String getCodigoRegistro() { return codigoRegistro; }
    public void setCodigoRegistro(String codigoRegistro) { this.codigoRegistro = codigoRegistro; }
    public String getRegistradoPor() { return registradoPor; }
    public void setRegistradoPor(String registradoPor) { this.registradoPor = registradoPor; }
}
