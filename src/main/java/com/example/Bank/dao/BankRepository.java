package com.example.Bank.dao;

import com.example.Bank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BankRepository extends JpaRepository<Bank, Long> {

}
