package com.salimsoftwaredeveloper.controller;

import com.salimsoftwaredeveloper.model.Contact;
import com.salimsoftwaredeveloper.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;

/**
 * Created by salim on 6/16/2017.
 */


@RestController
public class contactController {


    @Autowired
    private ContactService contactService;



    @RequestMapping("/contacts")
    public List<Contact> getAllContacts(){
        return contactService.getAllContact();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addcontact")
    public Contact addContact(@RequestBody Contact contact){

        contact.setCreatedDate(new Date());
       return  contactService.addContact(contact);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updatecontact")
    public Contact updateContact(@RequestBody Contact contact){

        return contactService.uptateContact(contact);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletecontact/{id}")
    public void deleteContact(@PathVariable int id){

        contactService.deleleteContact(id);
    }








}
