package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class House {
    private long id;
    private int price;
    private String area;
    private int room;

}
