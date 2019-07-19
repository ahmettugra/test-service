package tgr.third;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

    @Override
    Optional<Hotel> findById(Long aLong);
}
