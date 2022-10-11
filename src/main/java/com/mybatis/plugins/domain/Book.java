package com.mybatis.plugins.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName book
 */
@Data
public class Book implements Serializable {
    /**
     * 
     */
    private Integer bId;

    /**
     * 
     */
    private String bName;

    /**
     * 
     */
    private String bType;

    /**
     * 
     */
    private String bDes;

    /**
     * 
     */
    private String bAuthor;

    /**
     * 
     */
    private Integer bVersion;

    /**
     * 
     */
    private Integer bIsBeenDeleted;

    /**
     * 
     */
    private String bUri;

    /**
     * 
     */
    private String bFiletype;

    /**
     * 
     */
    private String isbn;

    private static final long serialVersionUID = 1L;
}