package mr.buddies.projects.ScrutinyGlobal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "DocumentDetails")
public class DocumentDetails {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String mappingId;
	    private String fileName;
	    private String fileType;
	    private long size;
	    @Lob
	    private byte[] data;
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMappingId() {
			return mappingId;
		}
		public void setMappingId(String mappingId) {
			this.mappingId = mappingId;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileType() {
			return fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public long getSize() {
			return size;
		}
		public void setSize(long size) {
			this.size = size;
		}
		public byte[] getData() {
			return data;
		}
		public void setData(byte[] data) {
			this.data = data;
		}
		public DocumentDetails(Long id, String mappingId, String fileName, String fileType, long size, byte[] data) {
			super();
			this.id = id;
			this.mappingId = mappingId;
			this.fileName = fileName;
			this.fileType = fileType;
			this.size = size;
			this.data = data;
		}
		public DocumentDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    
}
