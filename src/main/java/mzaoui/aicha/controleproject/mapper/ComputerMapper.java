package mzaoui.aicha.controleproject.mapper;


import mzaoui.aicha.controleproject.dao.entities.Computer;
import mzaoui.aicha.controleproject.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();

public ComputerDTO fromEntityToDTO(Computer computer) {
    return mapper.map(computer, ComputerDTO.class);
}

public Computer fromDTOToEntity(ComputerDTO computerDTO) {
    return mapper.map(computerDTO, Computer.class);
}


}
