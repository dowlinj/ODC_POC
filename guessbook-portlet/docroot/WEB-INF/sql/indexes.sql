create index IX_8BE0181A on Entry (groupId, guestbookId);
create index IX_5CB49F1C on Entry (uuid_);
create index IX_756A1B8C on Entry (uuid_, companyId);
create unique index IX_A59C150E on Entry (uuid_, groupId);

create index IX_BB5C4F7F on Event (name);

create index IX_A395F463 on Guestbook (groupId);
create index IX_235343AD on Guestbook (uuid_);
create index IX_299BA25B on Guestbook (uuid_, companyId);
create unique index IX_DACF039D on Guestbook (uuid_, groupId);

create index IX_2104894B on Location (country);