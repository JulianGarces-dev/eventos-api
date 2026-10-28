package co.edu.autonoma.eventos_api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "asistencias")
public class AsistenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "registro_id", nullable = false, unique = true)
    private RegistroEntity registro;

    @Column(name = "fecha_check_in", nullable = false, updatable = false)
    private LocalDateTime fechaCheckIn;

    @Column(name = "registrado_por", length = 80)
    private String registradoPor;

    public AsistenciaEntity() {}

    public AsistenciaEntity(RegistroEntity registro, String registradoPor) {
        this.registro = registro;
        this.registradoPor = registradoPor;
    }

    @PrePersist
    protected void onCreate() {
        this.fechaCheckIn = LocalDateTime.now();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public RegistroEntity getRegistro() { return registro; }
    public void setRegistro(RegistroEntity registro) { this.registro = registro; }
    public LocalDateTime getFechaCheckIn() { return fechaCheckIn; }
    public String getRegistradoPor() { return registradoPor; }
    public void setRegistradoPor(String registradoPor) { this.registradoPor = registradoPor; }
}