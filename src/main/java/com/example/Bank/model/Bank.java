package com.example.Bank.model;

import jakarta.persistence.*;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="AccName")
    private String AccName;

    @Column
    private int AccNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int AccNo) { this.AccNo=AccNo;}

}
