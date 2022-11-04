package Backend.Repositorios;

import Backend.Modelos.PermisosRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles, String> {
}
