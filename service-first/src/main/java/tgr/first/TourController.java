package tgr.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TourController {
    private TourRepository tourRepository;

    public TourController(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
    
    @GetMapping(value = "/hotel")
    public List<Tours> getHotels(){
        return this.tourRepository.findAll();
    }
    
}
