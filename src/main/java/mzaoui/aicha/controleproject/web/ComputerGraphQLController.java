package mzaoui.aicha.controleproject.web;


import mzaoui.aicha.controleproject.dto.ComputerDTO;
import mzaoui.aicha.controleproject.service.ComputerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor

public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO Computer){
        return computerService.SaveComputer(Computer);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        return computerService.GetComputerByProce(proce);
    }
}
