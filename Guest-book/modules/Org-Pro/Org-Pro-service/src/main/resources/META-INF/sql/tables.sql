create table ORG_Bank (
	uuid_ VARCHAR(75) null,
	bankId LONG not null primary key,
	bankName VARCHAR(75) null,
	bankAddress VARCHAR(75) null
);

create table ORG_Department (
	uuid_ VARCHAR(75) null,
	departmentId LONG not null primary key,
	departmentNo VARCHAR(75) null,
	departmentName VARCHAR(75) null,
	departmentAddress VARCHAR(75) null,
	departmentPin INTEGER,
	employeeId LONG,
	bankId LONG
);

create table ORG_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	employeeName VARCHAR(75) null,
	employeeAddress VARCHAR(75) null,
	employeePhoneNo LONG,
	employeePinNo INTEGER,
	bankId LONG
);