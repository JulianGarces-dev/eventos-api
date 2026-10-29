package co.edu.autonoma.eventos_api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "registros")
public class RegistroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 64)
    private String codigo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "evento_id", nullable = false)
    private EventoEntity evento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entrada", nullable = false, length = 20)
    private TipoEntrada tipoEntrada;

    @Column(name = "nombre_asistente", nullable = false, length = 120)
    private String nombreAsistente;

    @Column(name = "email_asistente", nullable = false, length = 150)
    private String emailAsistente;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EstadoRegistro estado;

    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDateTime fechaRegistro;

    public RegistroEntity() {}

    public RegistroEntity(String codigo, EventoEntity evento, TipoEntrada tipoEntrada, String nombreAsistente, String emailAsistente) {
        this.codigo = codigo;
        this.evento = evento;
        this.tipoEntrada = tipoEntrada;
        this.nombreAsistente = nombreAsistente;
        this.emailAsistente = emailAsistente;
        this.estado = EstadoRegistro.CONFIRMADO;
    }

    @PrePersist
    protected void onCreate() {
        this.fechaRegistro = LocalDateTime.now();
        if (this.estado == null) {
            this.estado = EstadoRegistro.CONFIRMADO;
        }
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public EventoEntity getEvento() { return evento; }
    public void setEvento(EventoEntity evento) { this.evento = evento; }
    public TipoEntrada getTipoEntrada() { return tipoEntrada; }
    public void setTipoEntrada(TipoEntrada tipoEntrada) { this.tipoEntrada = tipoEntrada; }
    public String getNombreAsistente() { return nombreAsistente; }
    public void setNombreAsistente(String nombreAsistente) { this.nombreAsistente = nombreAsistente; }
    public String getEmailAsistente() { return emailAsistente; }
    public void setEmailAsistente(String emailAsistente) { this.emailAsistente = emailAsistente; }
    public EstadoRegistro getEstado() { return estado; }
    public void setEstado(EstadoRegistro estado) { this.estado = estado; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
}
