package com.htc.centralservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htc.centralservice.entity.Centre_Service;



@Repository
public interface Centre_Interface extends  JpaRepository<Centre_Service,Long> {
	
	@Query(value="SELECT centre_id,centre_address,pin_code,scheduled_date_time FROM Centre_Service WHERE pin_code=?1",nativeQuery = true)
	public List<Centre_Service> findByPin_code(Long pin_code);

}
