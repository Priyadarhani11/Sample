create table FOO_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	studentName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	mobileNumber VARCHAR(75) null,
	email VARCHAR(75) null
);