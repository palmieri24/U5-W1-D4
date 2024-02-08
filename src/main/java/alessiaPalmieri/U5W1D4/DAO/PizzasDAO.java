package alessiaPalmieri.U5W1D4.DAO;

import alessiaPalmieri.U5W1D4.entities.Drink;
import alessiaPalmieri.U5W1D4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzasDAO extends JpaRepository<Pizza, Long> {
}
