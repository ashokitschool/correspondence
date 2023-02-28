package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.DcEducationEntity;

public interface DcEducationRepository extends JpaRepository<DcEducationEntity, Serializable> {

	public DcEducationEntity findByCaseNum(Long caseNum);

}
