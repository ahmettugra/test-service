package tgr.second;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DbSeeder implements CommandLineRunner {
    
    private CarsRepository hotelRepository;

    public DbSeeder(CarsRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        Cars ferrari = new Cars("Ferrari",1500);
        Cars fiat    = new Cars("Fiat",100);
        
        this.hotelRepository.save(ferrari);
        this.hotelRepository.save(fiat);
        
    }
}
