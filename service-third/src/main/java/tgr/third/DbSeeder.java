package tgr.third;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DbSeeder implements CommandLineRunner {
    
    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot" , 5 ,true);    
        Hotel ibis    = new Hotel("Ibis" , 3 ,false);
        
        this.hotelRepository.save(marriot);
        this.hotelRepository.save(ibis);
        
    }
}
