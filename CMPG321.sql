set echo on;

create table USERDETAILS (
    USERID VARCHAR2(255 BYTE) not null,
    USERIDNUMBER VARCHAR(13) not null,
    USERNAME VARCHAR2(255 BYTE) not null,
    USERLNAME VARCHAR2(255 BYTE) not null,
    USERCELLNUM VARCHAR(10) not null,
    USERAGE NUMBER(2),
    USERGENDER VARCHAR(10),
    PRIMARY KEY (USERID)
);

create table ACCOUNTTYPE (
    TYPEOFACCOUNT VARCHAR2(255 BYTE) not null,
    REWARDSKEY NUMBER not null,
    PRIMARY KEY (TYPEOFACCOUNT)
);

create table REWARDSTORE (
    AMTGAINED NUMBER,
    MULTIPLIER NUMBER,
    POINTSPENT NUMBER,
    CURRENTAMT NUMBER
);

commit;

drop table p_owner;
drop table accounttype;
drop table building;
drop table countries;
drop table damage_assessment;
drop table departments;
drop table employees;
commit;

ALTER TABLE USERDETAILS
    ADD USERID VARCHAR2(255 BYTE) not null;
ALTER TABLE USERDETAILS
    ADD USERIDNUMBER VARCHAR(13) not null;
ALTER TABLE USERDETAILS
    DROP PRIMARY KEY ;
ALTER TABLE USERDETAILS
    ADD PRIMARY KEY (USERID);