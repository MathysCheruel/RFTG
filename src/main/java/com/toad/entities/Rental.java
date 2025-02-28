package com.toad.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class.
public class Rental {
    @Id
    @Column(name = "rental_id")
    private Integer rental_id; // BIGINT

    @Column(name = "rental_date")
    private String rental_date;

    @Column(name = "inventory_id")
    private Integer inventory_id;

    @Column(name = "customer_id")
    private Integer customer_id;

    @Column(name = "return_date")
    private String return_date; // Year is typically handled as Integer

    @Column(name = "staff_id")
    private Integer staff_id; // TINYINT

    @Column(name = "last_update")
    private String last_update;

    public interface RentalFilmTitle {
        String getTitle();
        String getRentalDate();
        String getReturnDate(); 
        String getFirstName();
        String getLastName();
    }

    // Getters and Setters
    public Integer getRentalId() {
        return rental_id;
    }

    public void setRentalId(Integer rental_id) {
        this.rental_id = rental_id;
    }

    public String getRentalDate() {
        return rental_date;
    }

    public void setRentalDate(String rental_date) {
        this.rental_date = rental_date;
    }

    public Integer getInventoryId() {
        return inventory_id;
    }

    public void setInventoryId(Integer inventory_id) {
        this.inventory_id = inventory_id;
    }

    public Integer getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getReturnDate() {
        return return_date;
    }

    public void setReturnDate(String return_date) {
        this.return_date = return_date;
    }

    public Integer getStaffId() {
        return staff_id;
    }

    public void setStaffId(Integer staff_id) {
        this.staff_id = staff_id;
    }
    
    public String getLastUpdate() {
        return last_update;
    }

    public void setLastUpdate(String last_update) {
        this.last_update = last_update;
    }
}
