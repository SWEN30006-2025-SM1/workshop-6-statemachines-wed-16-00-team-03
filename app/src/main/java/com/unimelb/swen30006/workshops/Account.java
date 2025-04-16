package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Account {
    private State current_state = State.PENDING;
    private String accNum;
    private String name;
    private Double amount = 0.0;
    private Date startDate;
    private Date lastDateUsed;

    public Account(String accNum, String name, Date startDate) {
        this.accNum = accNum;
        this.name = name;
        this.startDate = startDate;
    }

    public void updateRecentlyUsed(Date lastDateUsed) {
        this.lastDateUsed = lastDateUsed;
    }


    public void onboard() {

    }


}
