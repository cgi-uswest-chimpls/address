package com.cgi.uswest.chimpls.address;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends CrudRepository<Address, BigDecimal> {
	@Query("select a from Address a where a.id_grp = ?1 and a.cd_grp = 'C' and a.dt_end is null")
	Address getCaseAddress(@Param("id_case") BigDecimal id_case);
	
	@Query("select a from Address a where a.id_grp = ?1 and a.cd_grp = 'P' and a.dt_end is null")
	Address getPersonAddress(@Param("id_prsn") BigDecimal id_prsn);
	
	@Query("select a from Address a where a.id_grp = ?1 and a.cd_grp = 'F' and a.dt_end is null")
	Address getProviderAddress(@Param("id_prvd") BigDecimal id_prvd);
}
