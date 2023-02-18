package com.myomi.seller.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.myomi.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
@Entity(name = "seller")
@Table(name = "seller_info")
@DynamicInsert
@DynamicUpdate
public class Seller {
	@Id
	@Column(name = "seller_id")
	private String id;
	
	@MapsId
	@OneToOne(cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
	@JoinColumn(name = "seller_id", insertable = false)
	private User sellerId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "company_num")
	private String companyNum;
	
	@Column(name = "internet_num")
	private String internetNum;
	
	@Column(name = "addr")
	private String addr;
	
	@Column(name = "manager")
	private String manager;
	
	@Column(name = "bank_account")
	private String bank_account;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "follow_cnt")
	private Integer followCnt;
}
