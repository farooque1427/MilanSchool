package com.sms.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_details")
public class BankDetails {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_id")
	private Long bankId;
	
	@Column(name = "acc_holder")
	private String accHolder;
	
	@Column(name = "bank_acc_no")
	private String bankAccNo;
	
	@Column(name = "bank_branch")
	private String bankBranch;

	public BankDetails() {	}

	public BankDetails(Long bankId, String accHolder, String bankAccNo, String bankBranch) {
		this.bankId = bankId;
		this.accHolder = accHolder;
		this.bankAccNo = bankAccNo;
		this.bankBranch = bankBranch;
	}

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public String getBankAccNo() {
		return bankAccNo;
	}

	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", accHolder=" + accHolder + ", bankAccNo=" + bankAccNo
				+ ", bankBranch=" + bankBranch + "]";
	}
	
}
