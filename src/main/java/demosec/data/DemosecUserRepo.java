package demosec.data;

import org.springframework.data.jpa.repository.JpaRepository;

import demosec.domain.DemosecUser;

public interface DemosecUserRepo extends JpaRepository<DemosecUser, Long> {
    
    DemosecUser getByUsername(String username);
}
