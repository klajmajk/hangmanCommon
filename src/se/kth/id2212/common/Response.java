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
public class Response implements Serializable {
    
    private ResponseStatus status;
    private String hiddenWord;
    private int leftTries;
    private int score;

    public Response(ResponseStatus status, String hiddenWord, int tries, int score) {
        this.status = status;
        this.hiddenWord = hiddenWord;
        this.leftTries = tries;
        this.score = score;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public int getLeftTries() {
        return leftTries;
    }

    public int getScore() {
        return score;
    }
    
    public ResponseStatus getStatus() {
        return status;
    }
    
    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
