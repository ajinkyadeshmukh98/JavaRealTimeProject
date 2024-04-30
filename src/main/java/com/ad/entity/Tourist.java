package com.ad.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="Rest_Tourist")

public class Tourist {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
 private Integer tid;
 
 @Column(length = 20)
 @Nonnull
 private String name;
 
 @Column(length = 20)
 @Nonnull
 private String city;
 
 @Column(length = 20)
 @Nonnull
 private String packagetype;
 
 
 @Nonnull
 private Double budget;
}
