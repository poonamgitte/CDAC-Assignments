package com.pankaj.boot.firstjpaapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pankaj.boot.firstjpaapp.entity.Contacts;

@Repository
public interface ContactsRepository extends CrudRepository<Contacts, Integer> {

}
