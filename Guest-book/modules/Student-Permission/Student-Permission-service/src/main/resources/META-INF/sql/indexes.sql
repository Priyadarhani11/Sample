create index IX_3CD91375 on DEMO_Student (studentDesignation[$COLUMN_LENGTH:75$]);
create index IX_40E72E79 on DEMO_Student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_192AFF3B on DEMO_Student (uuid_[$COLUMN_LENGTH:75$], groupId);