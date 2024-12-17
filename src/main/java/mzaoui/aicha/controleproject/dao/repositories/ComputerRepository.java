package mzaoui.aicha.controleproject.dao.repositories;

import mzaoui.aicha.controleproject.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

    public List<Computer> findByProce(String model);

}
