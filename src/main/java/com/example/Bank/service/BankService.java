package com.example.Bank.service;


import com.example.Bank.dao.BankRepository;
import com.example.Bank.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;


    public List<Bank> getAllBank()
    {
        return bankRepository.findAll();

    }
    public Bank getAllBank(Long id){
        Optional<Bank> maybeBank = bankRepository.findById(id);
        return maybeBank.orElse(null);
    }
    public Bank createBank(Bank bank){

        return bankRepository.save(bank);

    }

    public Bank updateBank(Long id, Bank bank){

        boolean BankExist = bankRepository.existsById(id);

        if(BankExist){
            return bankRepository.save(bank);
        }

       return null;

    }

    public void deleteBank(Long id){

        boolean BankExist = bankRepository.existsById(id);

        if(BankExist){
            bankRepository.deleteById(id);
        }

    }

}
