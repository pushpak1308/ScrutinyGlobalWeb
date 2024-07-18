package mr.buddies.projects.ScrutinyGlobal.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mr.buddies.projects.ScrutinyGlobal.model.ProjectDetails;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectDetails, Integer> {

	@Query(value = "SELECT * FROM project_details pd"
			+ " join client_details cd  on pd.client_mapping_id=cd.client_id join register_user ru on pd.client_mapping_id=ru.user_id ", nativeQuery = true)
	public List<Map<String,Object>> findAllProject();

	 @Query(value = "SELECT * FROM project_details pd"
	 		+ " join client_details cd  on pd.client_mapping_id=cd.client_id join register_user ru on pd.client_mapping_id=ru.user_id ", nativeQuery = true)
	 	public List<Map<String,Object>> getProjectsList();
	 
	 @Query(value = "SELECT vender_mapping_id FROM project_details where project_id=:projectId", nativeQuery = true)
		 	public String getVenderMappingId(@Param("projectId") Integer projectId);
	 
	 @Modifying
	  @Transactional
	 @Query("UPDATE ProjectDetails pd SET pd.venderMappingId= :venderMappingId WHERE pd.projectId = :projectId")
	 public Integer setVenderId(@Param("venderMappingId") String venderMappingId,@Param("projectId") Integer projectId);
	 
	 @Modifying
	  @Transactional
	 @Query("UPDATE ProjectDetails pd SET pd.docMappingId= :documentMappingId WHERE pd.projectId = :projectId")
	 public Integer setDocumentId(@Param("documentMappingId") String documentMappingId,@Param("projectId") Integer projectId);

}
