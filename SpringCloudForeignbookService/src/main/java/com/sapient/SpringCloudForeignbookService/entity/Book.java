package com.sapient.SpringCloudForeignbookService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
	private Integer bookId;
    private String bookName;
    private Double bookCost;

}
