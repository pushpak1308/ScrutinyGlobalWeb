package mr.buddies.projects.ScrutinyGlobal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mr.buddies.projects.ScrutinyGlobal.model.ClientDetails;

@Repository
public interface ClientRepository extends JpaRepository<ClientDetails, Integer> {

}
