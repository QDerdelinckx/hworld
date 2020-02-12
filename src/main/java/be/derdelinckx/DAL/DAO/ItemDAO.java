package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<Item, Long> {
}
