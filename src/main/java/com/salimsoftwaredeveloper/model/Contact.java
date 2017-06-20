package com.salimsoftwaredeveloper.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by salim on 6/16/2017.
 */


@Entity
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="idcontact")
    private int idContact;

    @Column(name="fullname", nullable=false)
    @Size(max = 300)
    private String fullName;

    @Column(name="address", nullable=false)
    @Size(max = 250)
    private String address;


    @Column(name="phone", nullable=false)
    @Size(max = 50)
    private String phone;

    @Column(name="createddate", nullable=false)
    private Date createdDate;


    public Contact(){}


    public Contact(String fullName, String address, Date createdDate, String phone) {
        this.fullName = fullName;
        this.address = address;
        this.createdDate = createdDate;
        this.phone = phone;
    }


    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
