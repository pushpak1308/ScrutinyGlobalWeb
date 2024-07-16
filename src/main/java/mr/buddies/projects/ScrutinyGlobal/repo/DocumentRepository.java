package mr.buddies.projects.ScrutinyGlobal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mr.buddies.projects.ScrutinyGlobal.model.DocumentDetails;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentDetails,Long> {

}
