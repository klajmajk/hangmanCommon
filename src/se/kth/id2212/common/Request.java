/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.id2212.common;

import java.io.Serializable;

/**
 *
 * @author Lucas
 */
public class Request implements Serializable {
    private RequestStatus status;
    private char letterGuessed;
    private String wordGuessed;
    
    public Request(RequestStatus status) {
        this.status = status;
    }

    public Request(RequestStatus status, char letterGuessed) {
        this.status = status;
        this.letterGuessed = letterGuessed;
    }

    public Request(RequestStatus status, String wordGuessed) {
        this.status = status;
        this.wordGuessed = wordGuessed;
    }

    public char getLetterGuessed() {
        return letterGuessed;
    }

    public String getWordGuessed() {
        return wordGuessed;
    }
    
    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }  
}
