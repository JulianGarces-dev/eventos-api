package co.edu.autonoma.eventos_api.repository;

import co.edu.autonoma.eventos_api.model.RegistroEntity;
import co.edu.autonoma.eventos_api.model.EstadoRegistro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroEntity, Long> {

    Optional<RegistroEntity> findByCodigo(String codigo);

    boolean existsByCodigo(String codigo);

    @Query("SELECT COUNT(r) FROM RegistroEntity r WHERE r.evento.id = :eventoId AND r.estado = :estado")
    long countByEventoIdAndEstado(@Param("eventoId") Long eventoId, @Param("estado") EstadoRegistro estado);
}
