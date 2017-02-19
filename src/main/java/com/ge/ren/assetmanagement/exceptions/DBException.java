/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.ren.assetmanagement.exceptions;

/**
*
* @author Yessesvy
*/
public class DBException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DBException() {
        super("Error while communicating with dPOD database!!");
    }
    
    /**
     * Custom Constructor with Parameter with error message
     */
    public DBException(String errorMessage) {
        super(errorMessage);
    }
    
    /**
     * Custom Constructor with Parameter with error message
     */
    public DBException(Exception e) {
        super(e);
    }

}