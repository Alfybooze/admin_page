package com.example.demo.Repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.demo.Models.Users;

@Repository
public interface UserRepository extends PagingAndSortingRepository<Users, Long> {
    // PagingAndSortingRepository gives you built-in pagination support
}
