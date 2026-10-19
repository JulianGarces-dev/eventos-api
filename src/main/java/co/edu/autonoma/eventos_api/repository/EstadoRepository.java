package co.edu.autonoma.eventos_api.repository;

import co.edu.autonoma.eventos_api.model.EstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<EstadoEntity, Long> {
}

