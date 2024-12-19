package ma.emsi.bounasser.compds.service;

import ma.emsi.bounasser.compds.dto.ComputerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ComputerService {

    ComputerDTO saveComputer(ComputerDTO computerDto);

    List<ComputerDTO> getComputersByProce(String proce);
}
