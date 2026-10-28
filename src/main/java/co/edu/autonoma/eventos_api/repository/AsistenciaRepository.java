package co.edu.autonoma.eventos_api.repository;

import co.edu.autonoma.eventos_api.model.AsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AsistenciaRepository extends JpaRepository<AsistenciaEntity, Long> {

    boolean existsByRegistroId(Long registroId);

    Optional<AsistenciaEntity> findByRegistroId(Long registroId);

    @Query("SELECT COUNT(a) FROM AsistenciaEntity a WHERE a.registro.evento.id = :eventoId")
    long countAsistenciasByEventoId(@Param("eventoId") Long eventoId);
}
