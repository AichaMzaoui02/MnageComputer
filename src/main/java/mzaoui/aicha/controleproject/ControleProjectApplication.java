package mzaoui.aicha.controleproject;

import mzaoui.aicha.controleproject.dto.ComputerDTO;
import mzaoui.aicha.controleproject.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleProjectApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.saveComputers(
                    List.of(
                            ComputerDTO.builder().proce("proce1").ram("ram1").price(123.00).hardDrive("hardDrive1").macAddress("macAddress1").build(),
                            ComputerDTO.builder().proce("proce2").ram("ram2").price(123.00).hardDrive("hardDrive2").macAddress("macAddress2").build(),
                            ComputerDTO.builder().proce("proce3").ram("ram3").price(123.00).hardDrive("hardDrive3").macAddress("macAddress3").build(),
                            ComputerDTO.builder().proce("proce4").ram("ram4").price(123.00).hardDrive("hardDrive4").macAddress("macAddress4").build()
                    )

            );

        };
    }


}
