package com.quocnhat.customersmanagement.repository;

import com.quocnhat.customersmanagement.entity.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {

}
