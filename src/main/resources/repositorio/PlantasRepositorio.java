
package repositorio;

import com.plantas.model.Orquideas;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repository interface for managing Plant entities.
 * Extends JpaRepository to provide CRUD methods for Plant.
 */
public interface PlantasRepositorio extends JpaRepository<Orquideas, Long> {
} 
