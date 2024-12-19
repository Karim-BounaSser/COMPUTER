package ma.emsi.bounasser.compds.dao.repositories;

import ma.emsi.bounasser.compds.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProce(String proce);
}
