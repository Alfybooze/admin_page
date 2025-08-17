package com.example.demo.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "bank_assets")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String Category_ID;

    public String Assets_Name;

    public int Assets_Amount;

    public int Duration_months;

    public LocalDateTime Purchased_Date;

    public String Branch;

    public String Last_Dep_Date;

    public String Status;
}
