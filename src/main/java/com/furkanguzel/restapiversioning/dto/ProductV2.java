package com.furkanguzel.restapiversioning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductV2 {
    private String name;
    private String modelNo;
}