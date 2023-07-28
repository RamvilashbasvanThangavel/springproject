package com.example5.TransactionalProject.Ba02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example5.TransactionalProject.Ba01.Entity.Sender;

public interface SenderRepository extends JpaRepository<Sender, Integer> {

}
