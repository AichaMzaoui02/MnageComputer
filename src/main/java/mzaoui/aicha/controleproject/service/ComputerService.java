package mzaoui.aicha.controleproject.service;

import mzaoui.aicha.controleproject.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO SaveComputer(ComputerDTO computerDTO);
    public List<ComputerDTO> GetComputerByProce(String proce);
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS);
}
