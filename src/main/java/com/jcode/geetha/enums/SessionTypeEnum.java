package com.jcode.geetha.enums;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 17:15
 * Project: geetha.
 */

public enum SessionTypeEnum {

    USER_DETAILS("USER_DETAILS");

    String note;

    SessionTypeEnum(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
