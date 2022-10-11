package com.mybatis.plugins.domain;

import java.io.Serializable;

import com.mybatis.plugins.Annotations.PasswordField;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@Data
@PasswordField("uPassword")
public class User implements Serializable {
    /**
     * 
     */
    private Long uId;

    /**
     * 
     */
    private String uName;

    /**
     * 
     */
    private String uEmail;

    /**
     * 
     */
    private Integer uIsBeenDeleted;

    /**
     * 
     */
    private Integer uVersion;

    /**
     * 
     */
    private String uPassword;

    /**
     * 
     */
    private Integer admin;

    private static final long serialVersionUID = 1L;
}