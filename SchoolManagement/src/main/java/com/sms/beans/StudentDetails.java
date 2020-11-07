package com.sms.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class StudentDetails {

	@Id
	@Column(name = "stud_general_no")
	private Long studGeneralNo;

	@Column(name = "saral_id")
	private String saralId;

	@Column(name = "admission_date")
	private String admissionDate;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "birth_date")
	private String birthDate;

	@Column(name = "dob_in_words")
	private String dobInWords;

	@Column(name = "birth_place")
	private String birthPlace;

	@Column(name = "gender")
	private String gender;

	@Column(name = "religion")
	private String religion;

	@Column(name = "cast_category")
	private String castCategory;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "aadhaar_number")
	private String aadhaarNumber;

	@Column(name = "mobile_number1")
	private String mobileNumber1;

	@Column(name = "mobile_number2")
	private String mobileNumber2;

	@Column(name = "ration_card")
	private String rationCard;

	@Column(name = "admission_class")
	private String admissionClass;

	@Column(name = "class_division")
	private String classDivision;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id_fk")
	Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bank_id_fk")
	BankDetails bankDetails;

	public StudentDetails() {	}

	public StudentDetails(Long studGeneralNo, String saralId, String admissionDate, String firstName, String middleName,
			String lastName, String motherName, String birthDate, String dobInWords, String birthPlace, String gender,
			String religion, String castCategory, String nationality, String aadhaarNumber, String mobileNumber1,
			String mobileNumber2, String rationCard, String admissionClass, String classDivision, Address address,
			BankDetails bankDetails) {
		this.studGeneralNo = studGeneralNo;
		this.saralId = saralId;
		this.admissionDate = admissionDate;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.birthDate = birthDate;
		this.dobInWords = dobInWords;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.religion = religion;
		this.castCategory = castCategory;
		this.nationality = nationality;
		this.aadhaarNumber = aadhaarNumber;
		this.mobileNumber1 = mobileNumber1;
		this.mobileNumber2 = mobileNumber2;
		this.rationCard = rationCard;
		this.admissionClass = admissionClass;
		this.classDivision = classDivision;
		this.address = address;
		this.bankDetails = bankDetails;
	}

	public Long getStudGeneralNo() {
		return studGeneralNo;
	}

	public void setStudGeneralNo(Long studGeneralNo) {
		this.studGeneralNo = studGeneralNo;
	}

	public String getSaralId() {
		return saralId;
	}

	public void setSaralId(String saralId) {
		this.saralId = saralId;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getDobInWords() {
		return dobInWords;
	}

	public void setDobInWords(String dobInWords) {
		this.dobInWords = dobInWords;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCastCategory() {
		return castCategory;
	}

	public void setCastCategory(String castCategory) {
		this.castCategory = castCategory;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getMobileNumber1() {
		return mobileNumber1;
	}

	public void setMobileNumber1(String mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}

	public String getMobileNumber2() {
		return mobileNumber2;
	}

	public void setMobileNumber2(String mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}

	public String getRationCard() {
		return rationCard;
	}

	public void setRationCard(String rationCard) {
		this.rationCard = rationCard;
	}

	public String getAdmissionClass() {
		return admissionClass;
	}

	public void setAdmissionClass(String admissionClass) {
		this.admissionClass = admissionClass;
	}

	public String getClassDivision() {
		return classDivision;
	}

	public void setClassDivision(String classDivision) {
		this.classDivision = classDivision;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "StudentDetails [studGeneralNo=" + studGeneralNo + ", saralId=" + saralId + ", admissionDate="
				+ admissionDate + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", motherName=" + motherName + ", birthDate=" + birthDate + ", dobInWords=" + dobInWords
				+ ", birthPlace=" + birthPlace + ", gender=" + gender + ", religion=" + religion + ", castCategory="
				+ castCategory + ", nationality=" + nationality + ", aadhaarNumber=" + aadhaarNumber
				+ ", mobileNumber1=" + mobileNumber1 + ", mobileNumber2=" + mobileNumber2 + ", rationCard=" + rationCard
				+ ", admissionClass=" + admissionClass + ", classDivision=" + classDivision + ", address=" + address
				+ ", bankDetails=" + bankDetails + "]";
	}
	
}
