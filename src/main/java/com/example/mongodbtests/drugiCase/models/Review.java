package com.example.mongodbtests.drugiCase.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Document
@Data
@NoArgsConstructor
public class Review {
    private String  userName;
    private int rating;
    private boolean approved;
}
