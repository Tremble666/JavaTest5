package com.hand.domain.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Short customer_id;

    private Byte store_id;

    private String first_name;

    private String last_name;

    private String email;

    private Short address_id;

    private Boolean active;

    private String create_date;

    private String last_update;

    /**
     * @return customer_id
     */
    public Short getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id
     */
    public void setCustomer_id(Short customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return store_id
     */
    public Byte getStore_id() {
        return store_id;
    }

    /**
     * @param store_id
     */
    public void setStore_id(Byte store_id) {
        this.store_id = store_id;
    }

    /**
     * @return first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return address_id
     */
    public Short getAddress_id() {
        return address_id;
    }

    /**
     * @param address_id
     */
    public void setAddress_id(Short address_id) {
        this.address_id = address_id;
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return create_date
     */
    public String getCreate_date() {
        return create_date;
    }

    /**
     * @param create_date
     */
    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    /**
     * @return last_update
     */
    public String getLast_update() {
        return last_update;
    }

    /**
     * @param last_update
     */
    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}