package com.salimsoftwaredeveloper.service;

import com.salimsoftwaredeveloper.model.Contact;
import com.salimsoftwaredeveloper.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salim on 6/18/2017.
 */
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;


    public List<Contact> getAllContact(){
        List<Contact> temp = new ArrayList<>();
        for(Contact c : contactRepository.findAll())
            temp.add(c);
        return temp;
    }

    public Contact getOneContact(int id){

        return contactRepository.findOne(id);
    }

    public void deleleteContact(int id){
        contactRepository.delete(id);
    }

    public Contact uptateContact(Contact contactTemp){
            return contactRepository.save(contactTemp);
    }

    public Contact addContact(Contact contact){

       return  contactRepository.save(contact);
    }
}

