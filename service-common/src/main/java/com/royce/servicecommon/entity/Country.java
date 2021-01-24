package com.royce.servicecommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Country实体类
 *
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country implements Serializable {

    private Long id;

    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }



}