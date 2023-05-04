package com.tts.weatherapp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tts.weatherapp.domain.ZipCode;

public interface ZipcodeRepository extends CrudRepository<ZipCode, Long>{
    @Query("select top 10 * FROM zip_code order by id desc");
    List<ZipCode>findFirst10ByIdDesc();
}