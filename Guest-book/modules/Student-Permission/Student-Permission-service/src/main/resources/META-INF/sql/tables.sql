create table DEMO_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	studentName VARCHAR(75) null,
	studentMobileNumber VARCHAR(75) null,
	studentDesignation VARCHAR(75) null,
	studentphoto VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);