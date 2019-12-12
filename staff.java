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
public class staff {

    /**
     * @return the staffType1
     */
    public staffType getStaffType1() {
        return staffType1;
    }

    /**
     * @param staffType1 the staffType1 to set
     */
    public void setStaffType1(staffType staffType1) {
        this.staffType1 = staffType1;
    }

    /**
     * @return the staffPassword
     */
    public String getStaffPassword() {
        return staffPassword;
    }

    /**
     * @param staffPassword the staffPassword to set
     */
    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }
    
    public Boolean authenticateStaff(int ID, String password)
    {
        return Boolean.TRUE;
    }
    private staffType staffType1;
    private String staffPassword;
}
