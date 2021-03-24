package com.example.easynotes.repository;

import com.example.easynotes.model.MerchantDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface merchantRepository extends JpaRepository<MerchantDetails,Integer> {


}
