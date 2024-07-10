create table BANK_Bank (
	uuid_ VARCHAR(75) null,
	bankId LONG not null primary key,
	bankName VARCHAR(75) null,
	bankAddress VARCHAR(75) null
);

create table BANK_Department (
	uuid_ VARCHAR(75) null,
	departmentId LONG not null primary key,
	departmentNo VARCHAR(75) null,
	departmentName VARCHAR(75) null,
	departmentAddress VARCHAR(75) null,
	departmentPin INTEGER,
	employeeId LONG,
	bankId LONG
);

create table BANK_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	employeeName VARCHAR(75) null,
	employeeAddress VARCHAR(75) null,
	employeePhoneNo LONG,
	employeePinNo INTEGER,
	bankId LONG
);

create table BANK_Salary (
	uuid_ VARCHAR(75) null,
	salaryId LONG not null primary key,
	employeeId LONG,
	amount DOUBLE,
	currency_ VARCHAR(75) null,
	paymentDate DATE null
);