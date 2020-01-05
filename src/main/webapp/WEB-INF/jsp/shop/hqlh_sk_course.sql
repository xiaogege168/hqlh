INSERT INTO hqlh.sk_course (courseID, courseTime, coursePrice, courseContent) VALUES (1, '15课时', 1998, '装备穿戴,V型站立,V型原地踏步,原地起立蹲起,踏步S过桩.踏步绕圈.踏步连续转向,安全跌倒,安全起立');
INSERT INTO hqlh.sk_course (courseID, courseTime, coursePrice, courseContent) VALUES (2, '35课时', 3298, '装备穿戴,V型站立,V型原地踏步,原地起立蹲起,踏步S过桩.踏步绕圈.踏步连续转向,安全跌倒,安全起立');
INSERT INTO hqlh.sk_course (courseID, courseTime, coursePrice, courseContent) VALUES (3, '一个月不限次数', 2398, '装备穿戴,V型站立,V型原地踏步,原地起立蹲起,踏步S过桩.踏步绕圈.踏步连续转向,安全跌倒,安全起立');
INSERT INTO hqlh.sk_course (courseID, courseTime, coursePrice, courseContent) VALUES (4, '二个月不限次数', 2999, '装备穿戴,V型站立,V型原地踏步,原地起立蹲起,踏步S过桩.踏步绕圈.踏步连续转向,安全跌倒,安全起立');
INSERT INTO hqlh.sk_course (courseID, courseTime, coursePrice, courseContent) VALUES (5, '半年不限次数', 4998, '装备穿戴,V型站立,V型原地踏步,原地起立蹲起,踏步S过桩.踏步绕圈.踏步连续转向,安全跌倒,安全起立');
INSERT INTO hqlh.sk_course (courseID, courseTime, coursePrice, courseContent) VALUES (6, '一年不限次数', 7999, '装备穿戴,V型站立,V型原地踏步,原地起立蹲起,踏步S过桩.踏步绕圈.踏步连续转向,安全跌倒,安全起立');


create table hqlh.sk_course
(
	courseID int auto_increment
		primary key,
	courseTime varchar(45) null,
	coursePrice int null,
	courseContent varchar(100) null
);

create table hqlh.sk_student
(
	stu_id int not null
		primary key,
	stuName varchar(45) null,
	stuPassword varchar(45) null,
	age varchar(45) null,
	gender varchar(45) null,
	parentNum varchar(45) null,
	orderId varchar(45) null,
	realPrice varchar(45) null,
	shopId varchar(45) null,
	others varchar(45) null,
	createTime varchar(45) null,
	courseId varchar(45) null
);

create table hqlh.sk_stu_order
(
	orderId int auto_increment
		primary key,
	stuId int not null,
	orderTime varchar(22) not null,
	teachComment varchar(120) null,
	ampm varchar(11) default '上午' null,
	today varchar(22) null,
	constraint order_stu
		foreign key (stuId) references hqlh.sk_student (stu_id)
);

create index 课时表_idx
	on hqlh.sk_stu_order (stuId);

create table hqlh.sk_user
(
	userId int not null
		primary key,
	userName varchar(45) null,
	userPassword varchar(45) null,
	sfzName varchar(45) null,
	shopId varchar(45) null,
	phoneNum varchar(45) null,
	job varchar(45) null
);

create table hqlh.sk_shop
(
	shopId int auto_increment
		primary key,
	address varchar(45) null,
	leaderId int null,
	monthIncome int null,
	constraint shop_user
		foreign key (leaderId) references hqlh.sk_user (userId)
			on update cascade on delete cascade
);

create table hqlh.sk_repository
(
	repositoryId int auto_increment
		primary key,
	name varchar(22) null,
	amount int(22) null,
	shopId int(2) null,
	constraint repository_shop
		foreign key (shopId) references hqlh.sk_shop (shopId)
			on update cascade
);

create table hqlh.sk_records
(
	recordsId int auto_increment
		primary key,
	goodsId int(2) null,
	createTime date null,
	plusMount int(3) null,
	subMount int(3) null,
	constraint goods_records
		foreign key (goodsId) references hqlh.sk_repository (repositoryId)
			on update cascade
);

create index goods_records_idx
	on hqlh.sk_records (goodsId);

create index repository_shop_idx
	on hqlh.sk_repository (shopId);

create index shop_user_idx
	on hqlh.sk_shop (leaderId);

