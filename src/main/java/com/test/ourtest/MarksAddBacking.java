/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ourtest;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import service.MarksService;

/**
 *
 * @author Narada
 */
@Named(value = "marksAddBacking")
@ViewScoped
public class MarksAddBacking {

    @EJB
    MarksService marksService;

    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    private String entereNumber;

    public String getEntereNumber() {
        return entereNumber;
    }

    public void setEntereNumber(String entereNumber) {
        this.entereNumber = entereNumber;
    }

    public void readNumber() {

        int result = marksService.displayNumber(num1);
        entereNumber = "You have entered " + result;

    }

}
