package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGERS")
@Data
public class CoTriggerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trgId;

	private Long caseNum;

	@Lob
	private byte[] coPdf;

	private String trgStatus;

}
