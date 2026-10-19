package co.edu.autonoma.eventos_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estados")
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String servicio;

    @Column(nullable = false)
    private String estado;

    public Long getId() { return id; }
    public String getServicio() { return servicio; }
    public void setServicio(String servicio) { this.servicio = servicio; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
