/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author dequn_teng_local
 */
public class vehicle {

    /**
     * @return the vehicleID
     */
    public int getVehicleID() {
        return vehicleID;
    }

    /**
     * @param vehicleID the vehicleID to set
     */
    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    /**
     * @return the vehicleName
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * @param vehicleName the vehicleName to set
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * @return the vehicleType1
     */
    public vehicleType getVehicleType1() {
        return vehicleType1;
    }

    /**
     * @param vehicleType1 the vehicleType1 to set
     */
    public void setVehicleType1(vehicleType vehicleType1) {
        this.vehicleType1 = vehicleType1;
    }
    private int vehicleID;
    private String vehicleName;
    private vehicleType vehicleType1;
}
