create table Entry (
	uuid_ VARCHAR(75) null,
	entryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	message VARCHAR(75) null,
	email VARCHAR(75) null,
	guestbookId LONG
);

create table Event (
	eventId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	locationId LONG
);

create table Guestbook (
	uuid_ VARCHAR(75) null,
	guestbookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null
);

create table Location (
	locationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	locationName VARCHAR(75) null,
	country VARCHAR(75) null
);