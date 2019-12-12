/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.time.LocalDate;
import java.util.zip.Checksum;

/**
 *
 * @author dequn_teng_local
 */
public class ticket {

    /**
     * @param customer the customer to set
     */
    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the taskType
     */
    public taskType getTaskType() {
        return taskType;
    }

    /**
     * @param taskType the taskType to set
     */
    public void setTaskType(taskType taskType) {
        this.taskType = taskType;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the quotedprice
     */
    public double getQuotedprice() {
        return quotedprice;
    }

    /**
     * @param quotedprice the quotedprice to set
     */
    public void setQuotedprice(double quotedprice) {
        this.quotedprice = quotedprice;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the finalPrice
     */
    public double getFinalPrice() {
        return finalPrice;
    }

    /**
     * @param finalPrice the finalPrice to set
     */
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(status status) {
        this.status = status;
    }

    private customer customer;
    private vehicle vehicle;
    private taskType taskType;
    private LocalDate deadline;
    private double quotedprice ;
    private String note ;
    private double finalPrice;
    private status status;
    
    
}
