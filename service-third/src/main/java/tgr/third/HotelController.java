package tgr.third;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    
    @GetMapping(value = "/hotel")
    public List<Hotel> getHotels(){
        return this.hotelRepository.findAll();
    }
    
}
