package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.Company;
import com.maxyar.kurs.repository.CompanyCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyService {
    @Autowired
    private CompanyCrudRepository companyCrudRepository;

    @Transactional
    public void testRep(){

    }

    @Transactional
    public void addCompany(Company  company){
        Company savedCompany = companyCrudRepository.save(company);
    }

    @Transactional
    public void deleteCompany(Company company){
        companyCrudRepository.delete(company);
    }

    @Transactional
    public void editCompany(Company company){
        Company editedCompany = companyCrudRepository.save(company);
    }
}
