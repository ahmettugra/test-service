package tgr.second;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarsController {
    private CarsRepository carsRepository;

    public CarsController(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }


    @GetMapping(value = "/cars")
    public List<Cars> getHotels(){
        return this.carsRepository.findAll();
    }
    
}
