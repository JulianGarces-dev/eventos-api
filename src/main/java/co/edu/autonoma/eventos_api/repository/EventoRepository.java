package co.edu.autonoma.eventos_api.repository;

import co.edu.autonoma.eventos_api.model.EventoEntity;
import co.edu.autonoma.eventos_api.model.EstadoEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Long> {
    List<EventoEntity> findByEstado(EstadoEvento estado);
}
