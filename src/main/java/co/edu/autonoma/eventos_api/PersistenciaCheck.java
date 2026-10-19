package co.edu.autonoma.eventos_api;

import co.edu.autonoma.eventos_api.repository.EstadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersistenciaCheck implements CommandLineRunner {

    private final EstadoRepository repository;

    public PersistenciaCheck(EstadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        System.out.println("Total: " + repository.count());
    }
}
