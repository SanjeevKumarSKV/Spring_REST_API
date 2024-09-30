package com.example.Bank.web;


import com.example.Bank.model.Bank;
import com.example.Bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    BankService bankService;

    @GetMapping
    public List<Bank> getAllBank(){
        return bankService.getAllBank();
    }

    @GetMapping("{id}")
    public Bank getAllBank(@PathVariable Long id){
        return  bankService.getAllBank(id);
    }


    @PostMapping
    public Bank createBank(@RequestBody Bank bank){
        return bankService.createBank(bank);
    }


    @PutMapping("{id}")
    public Bank updateBank(@PathVariable Long id, @RequestBody Bank bank){
        return bankService.updateBank(id, bank);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBank(@PathVariable Long id){
        bankService.deleteBank(id);
        return ResponseEntity.ok("delete success");
    }
}
