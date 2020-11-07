package com.sms.services;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sms.beans.Address;
import com.sms.beans.BankDetails;
import com.sms.beans.StudentDetails;

public class JsonUtil {
	
	private static final Logger LOG = LoggerFactory.getLogger(JsonUtil.class);
	
	public static JSONObject getStudentJson(StudentDetails studentDetails) {
		LOG.info("getStudentJson(-) Called.");
		JSONObject jsonObj = new JSONObject();
		Address address = studentDetails.getAddress();
		BankDetails bankDetails = studentDetails.getBankDetails();

		jsonObj.put("studGeneralNo", studentDetails.getStudGeneralNo());
		jsonObj.put("saralId", studentDetails.getSaralId());
		jsonObj.put("admissionDate", studentDetails.getAdmissionDate());
		jsonObj.put("firstName", studentDetails.getFirstName());
		jsonObj.put("middleName", studentDetails.getMiddleName());
		jsonObj.put("lastName", studentDetails.getLastName());
		jsonObj.put("motherName", studentDetails.getMotherName());
		jsonObj.put("birthDate", studentDetails.getBirthDate());
		jsonObj.put("dobInWords", studentDetails.getDobInWords());
		jsonObj.put("birthPlace", studentDetails.getBirthPlace());
		jsonObj.put("gender", studentDetails.getGender());
		jsonObj.put("religion", studentDetails.getReligion());
		jsonObj.put("castCategory", studentDetails.getCastCategory());
		jsonObj.put("nationality", studentDetails.getNationality());
		jsonObj.put("mobileNumber1", studentDetails.getMobileNumber1());
		jsonObj.put("mobileNumber2", studentDetails.getMobileNumber2());
		jsonObj.put("aadhaarNumber", studentDetails.getAadhaarNumber());
		jsonObj.put("admissionClass", studentDetails.getAdmissionClass());
		jsonObj.put("classDivision", studentDetails.getClassDivision());
		jsonObj.put("address", getAddressJson(address));
		jsonObj.put("bankDetails", getBankDetailsJson(bankDetails));

		return jsonObj;
	}

	public static JSONObject getAddressJson(Address address) {
		LOG.info("getAddressJson(-) Called.");
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("addressId", address.getAddressId());
		jsonObj.put("address1", address.getAddress1());
		jsonObj.put("address2", address.getAddress2());
		jsonObj.put("city", address.getCity());
		jsonObj.put("pinCode", address.getPinCode());

		return jsonObj;
	}

	public static JSONObject getBankDetailsJson(BankDetails bankDetails) {
		LOG.info("getBankDetailsJson(-) Called.");
		JSONObject jsonObj = new JSONObject();

		jsonObj.put("bankId", bankDetails.getBankId());
		jsonObj.put("accHolder", bankDetails.getAccHolder());
		jsonObj.put("bankAccNo", bankDetails.getBankAccNo());
		jsonObj.put("bankBranch", bankDetails.getBankBranch());

		return jsonObj;

	}
}
