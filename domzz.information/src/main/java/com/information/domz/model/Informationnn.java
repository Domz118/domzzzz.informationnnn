package com.information.domz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "information")

public class Informationnn implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name")
	private String firstNamee;
	@Column(name = "last_name")
	private String lastNamee;
	@Column(name = "email_add")
	private String emailAdd;
	@Column(name = "birth_day")
	private String birthDay;
	@Column(name = "age")
	private String  age;
	@Column(name = "city")
	private String city;
	@Column(name = "skills")
	private String skills;
	@Column(name = "height")
	private String height;
	@Column(name = "weight")
	private String weight;
	@Column(name = "gender")
	private String gender;
	@Column(name = "martial_status")
	private String martialStatus;
	@Column(name = "intership")
	private String intership;
	@Column(name = "certificatee")
	private String certificate;
	@Column(name = "reference")
	private String reference;
	@Column(name = "elementary")
	private String elementary;
	@Column(name = "high_school")
	private String highSchool;
	@Column(name = "college")
	private String college;
	@Column(name = "college_year")
	private String collegeYear;
	@Column(name = "college_graduate")
	private String collegeGraduate;
	@Column(name = "elem_year")
	private String elemYear;
	@Column(name = "high_school_year")
	private String highSchoolYear;
	

	/**TODO
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Informationnn() {
	}

	public long getId() {
		return id;
	}

	public String getFirstNamee() {
		return firstNamee;
	}

	public String getLastNamee() {
		return lastNamee;
	}

	public String getEmailAdd() {
		return emailAdd;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getSkills() {
		return skills;
	}

	public String getHeight() {
		return height;
	}

	public String getWeight() {
		return weight;
	}

	public String getGender() {
		return gender;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public String getIntership() {
		return intership;
	}

	public String getCertificate() {
		return certificate;
	}

	public String getReference() {
		return reference;
	}

	public String getElementary() {
		return elementary;
	}

	public String getHighSchool() {
		return highSchool;
	}

	public String getCollege() {
		return college;
	}

	public String getCollegeYear() {
		return collegeYear;
	}

	public String getCollegeGraduate() {
		return collegeGraduate;
	}

	public String getElemYear() {
		return elemYear;
	}

	public String getHighSchoolYear() {
		return highSchoolYear;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstNamee(String firstNamee) {
		this.firstNamee = firstNamee;
	}

	public void setLastNamee(String lastNamee) {
		this.lastNamee = lastNamee;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public void setIntership(String intership) {
		this.intership = intership;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setElementary(String elementary) {
		this.elementary = elementary;
	}

	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void setCollegeYear(String collegeYear) {
		this.collegeYear = collegeYear;
	}

	public void setCollegeGraduate(String collegeGraduate) {
		this.collegeGraduate = collegeGraduate;
	}

	public void setElemYear(String elemYear) {
		this.elemYear = elemYear;
	}

	public void setHighSchoolYear(String highSchoolYear) {
		this.highSchoolYear = highSchoolYear;
	}

	@Override
	public String toString() {
		return "Informationnn [id=" + id + ", firstNamee=" + firstNamee + ", lastNamee=" + lastNamee + ", emailAdd="
				+ emailAdd + ", birthDay=" + birthDay + ", age=" + age + ", city=" + city + ", skills=" + skills
				+ ", height=" + height + ", weight=" + weight + ", gender=" + gender + ", martialStatus="
				+ martialStatus + ", intership=" + intership + ", certificate=" + certificate + ", reference="
				+ reference + ", elementary=" + elementary + ", highSchool=" + highSchool + ", college=" + college
				+ ", collegeYear=" + collegeYear + ", collegeGraduate=" + collegeGraduate + ", elemYear=" + elemYear
				+ ", highSchoolYear=" + highSchoolYear + "]";
	}
	
	

	
	}
	
	


