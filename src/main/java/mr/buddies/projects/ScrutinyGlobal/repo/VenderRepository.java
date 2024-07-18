package mr.buddies.projects.ScrutinyGlobal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mr.buddies.projects.ScrutinyGlobal.model.VenderDetails;

@Repository
public interface VenderRepository extends JpaRepository<VenderDetails,Integer> {
	
	@Modifying
	  @Transactional
	 @Query("UPDATE VenderDetails vd SET vd.docMappingId= :documentMappingId WHERE vd.venderId = :venderId")
	 public Integer setDocumentId(@Param("documentMappingId") String documentMappingId,@Param("venderId") Integer venderId);

}
