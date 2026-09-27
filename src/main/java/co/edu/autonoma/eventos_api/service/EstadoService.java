package co.edu.autonoma.eventos_api.service;

import org.springframework.stereotype.Service;
import co.edu.autonoma.eventos_api.dto.EstadoResponse;

@Service
public class EstadoService {

    public EstadoResponse consultarEstado() {
        return new EstadoResponse(
                "eventos-api",
                "disponible"
        );
    }
}
