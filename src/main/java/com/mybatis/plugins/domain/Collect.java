package com.mybatis.plugins.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName collect
 */
@Data
public class Collect implements Serializable {
    /**
     * 
     */
    private Integer cId;

    /**
     * 
     */
    private Long uId;

    /**
     * 
     */
    private Integer bId;

    /**
     * 
     */
    private Integer cIsBeenDelete;

    /**
     * 
     */
    private Integer cVersion;

    private static final long serialVersionUID = 1L;
}