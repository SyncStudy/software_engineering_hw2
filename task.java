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
public class task {

    /**
     * @return the taskID
     */
    public int getTaskID() {
        return taskID;
    }

    /**
     * @param taskID the taskID to set
     */
    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    /**
     * @return the taskType1
     */
    public taskType getTaskType1() {
        return taskType1;
    }

    /**
     * @param taskType1 the taskType1 to set
     */
    public void setTaskType1(taskType taskType1) {
        this.taskType1 = taskType1;
    }

    /**
     * @return the status
     */
    public status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(status status) {
        this.status = status;
    }
    private int taskID;
    private taskType taskType1;
    private status status;
}
