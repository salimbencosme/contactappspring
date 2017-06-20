package com.salimsoftwaredeveloper.repositories;

import com.salimsoftwaredeveloper.model.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by salim on 6/18/2017.
 */
public interface ContactRepository extends CrudRepository<Contact,Integer> {
}
