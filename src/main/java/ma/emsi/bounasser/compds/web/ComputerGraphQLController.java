package ma.emsi.bounasser.compds.web;

import ma.emsi.bounasser.compds.dto.ComputerDTO;
import ma.emsi.bounasser.compds.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {


    private ComputerService computerService ;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer){
        return computerService.saveComputer(computer);
    }

    @QueryMapping
    public List<ComputerDTO> getComputersByProce(@Argument String proce){
        return computerService.getComputersByProce(proce);
    }

}
