package mzaoui.aicha.controleproject.service;

import mzaoui.aicha.controleproject.dao.entities.Computer;
import mzaoui.aicha.controleproject.dao.repositories.ComputerRepository;
import mzaoui.aicha.controleproject.dto.ComputerDTO;
import mzaoui.aicha.controleproject.mapper.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    public ComputerMapper computerMapper;
    public ComputerRepository computerRepository;

    @Override
    public ComputerDTO SaveComputer(ComputerDTO computerDTO){
     Computer computer = new Computer();
     computer = computerMapper.fromDTOToEntity(computerDTO);
     computer = computerRepository.save(computer);
     return computerMapper.fromEntityToDTO(computer);
    }

    @Override
    public List<ComputerDTO> GetComputerByProce(String proce){
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for(Computer computer : computers){
            computerDTOS.add(computerMapper.fromEntityToDTO(computer));
        }
        return computerDTOS;

    }

    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS){
        List<ComputerDTO> computerDTOS1 = new ArrayList<>();
        for(ComputerDTO computerDTO : computerDTOS){
            computerDTOS1.add(SaveComputer(computerDTO));

        }
        return computerDTOS1;

    }







}
