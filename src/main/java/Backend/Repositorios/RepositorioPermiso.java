package Backend.Repositorios;

import Backend.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso, String> {
}
