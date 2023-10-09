package com.cydeo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter     //jackson using @Getter @Setter when converting JSON to Java obj
@Setter
@NoArgsConstructor
public class ResponseWrapper {
//customizing response.

    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    //constructor
    public ResponseWrapper(String message, Object data) {
        this.success = true;
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.data = data;
    }

    //constructor that we can use for delete
    public ResponseWrapper(String message) {
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }
}