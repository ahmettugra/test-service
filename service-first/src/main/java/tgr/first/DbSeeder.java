package tgr.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DbSeeder implements CommandLineRunner {
    
    private TourRepository tourRepository;

    public DbSeeder(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        Tours paris = new Tours("Paris",300); 
        Tours roma  = new Tours("Roma",100); 
        
        
        this.tourRepository.save(paris);
        this.tourRepository.save(roma);
        
    }
}
