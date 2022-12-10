package com.phbookapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="contact_info")
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	@Column(name="contact_name")
	private String contactName;
	@Column(name="contact_email")
	private String contactEmail;
    @Column(name="contact_num")	
	private Long contactNum;
    
    
    
}
