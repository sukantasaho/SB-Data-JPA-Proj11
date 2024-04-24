package com.main.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Book 
{
	 @SequenceGenerator(name = "gen1", sequenceName = "JPA_BOOK_SEQ1", initialValue = 10000, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	 @Id
	 @Column(name="BOOK_ID")
     private Integer bookId;
	 
	 @Column(name="BOOK_NAME")
	 @NonNull
     private String bookName;
	 
	 @NonNull
	 @Column(name="BOOK_AUTHOR")
     private String bookAuthor;
	 
	 @NonNull
	 @Column(name="BOOK_PRICE")
     private Double bookPrice;
	 
	 @NonNull
	 @Column(name="PUBLISH_YEAR")
     private Integer publishYear;
     
     @Version
     @Column(name="UPDATE_COUNT")
     private int count_update;
     
     @Column(name="CREATED_DATE")
     @CreationTimestamp
     private LocalDateTime createdDate;
     
     @Column(name="LAST_MODIFIED")
     @UpdateTimestamp
     private LocalDateTime lastModifiedDate;
}
