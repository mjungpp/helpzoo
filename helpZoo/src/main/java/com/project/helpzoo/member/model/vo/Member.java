package com.project.helpzoo.member.model.vo;

import java.sql.Timestamp;

public class Member {
	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberPhone;
	private String memberEmail;
	private String memberAddress;
	private String memberPetType;
	private String memberPetName;
	private Timestamp memberEnrollDate;
	private String memberStatus;
	private String memberGrade;
	
	// 펀딩을 가져오기 위한 펀딩 멤버변수 추가
	private String projectNo;
	private String projectTitle;
	private String projectSummary;
	private String filePath;
	private String fileChangeName;
	private int parentProjectNo;
	private int fundingFileCategoryId;
	
	// (1) 기본 생성자 작성
	public Member() {
		
	}
	

	
	public Member(int memberNo, String memberId, String memberPwd, String memberName, String memberPhone,
			String memberEmail, String memberAddress, String memberPetType, String memberPetName,
			Timestamp memberEnrollDate, String memberStatus, String memberGrade, String projectNo, String projectTitle,
			String projectSummary, String filePath, String fileChangeName, int parentProjectNo,
			int fundingFileCategoryId) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberPetType = memberPetType;
		this.memberPetName = memberPetName;
		this.memberEnrollDate = memberEnrollDate;
		this.memberStatus = memberStatus;
		this.memberGrade = memberGrade;
		this.projectNo = projectNo;
		this.projectTitle = projectTitle;
		this.projectSummary = projectSummary;
		this.filePath = filePath;
		this.fileChangeName = fileChangeName;
		this.parentProjectNo = parentProjectNo;
		this.fundingFileCategoryId = fundingFileCategoryId;
	}



	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberPetType() {
		return memberPetType;
	}

	public void setMemberPetType(String memberPetType) {
		this.memberPetType = memberPetType;
	}

	public String getMemberPetName() {
		return memberPetName;
	}

	public void setMemberPetName(String memberPetName) {
		this.memberPetName = memberPetName;
	}

	public Timestamp getMemberEnrollDate() {
		return memberEnrollDate;
	}

	public void setMemberEnrollDate(Timestamp memberEnrollDate) {
		this.memberEnrollDate = memberEnrollDate;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectSummary() {
		return projectSummary;
	}

	public void setProjectSummary(String projectSummary) {
		this.projectSummary = projectSummary;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}


	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileChangeName() {
		return fileChangeName;
	}

	public void setFileChangeName(String fileChangeName) {
		this.fileChangeName = fileChangeName;
	}
	public int getparentProjectNo() {
		return parentProjectNo;
	}

	public void setparentProjectNo(int parentProjectNo) {
		this.parentProjectNo = parentProjectNo;
	}
	
	public int getParentProjectNo() {
		return parentProjectNo;
	}

	public void setParentProjectNo(int parentProjectNo) {
		this.parentProjectNo = parentProjectNo;
	}

	public int getFundingFileCategoryId() {
		return fundingFileCategoryId;
	}

	public void setFundingFileCategoryId(int fundingFileCategoryId) {
		this.fundingFileCategoryId = fundingFileCategoryId;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName="
				+ memberName + ", memberPhone=" + memberPhone + ", memberEmail=" + memberEmail + ", memberAddress="
				+ memberAddress + ", memberPetType=" + memberPetType + ", memberPetName=" + memberPetName
				+ ", memberEnrollDate=" + memberEnrollDate + ", memberStatus=" + memberStatus + ", memberGrade="
				+ memberGrade + ", projectNo=" + projectNo + ", projectTitle=" + projectTitle + ", projectSummary="
				+ projectSummary + ", filePath=" + filePath + ", fileChangeName=" + fileChangeName
				+ ", parentProjectNo=" + parentProjectNo + ", fundingFileCategoryId=" + fundingFileCategoryId + "]";
	}

	
	
}
