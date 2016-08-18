/*
MySQL Data Transfer
Source Host: localhost
Source Database: hibernate
Target Host: localhost
Target Database: hibernate
Date: 2016/8/18 20:40:24
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for course
-- ----------------------------
CREATE TABLE `course` (
  `cid` int(11) NOT NULL,
  `cname` varchar(255) NOT NULL,
  `ccredit` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `hiredate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for studcourse
-- ----------------------------
CREATE TABLE `studcourse` (
  `stuCourseId` int(11) NOT NULL,
  `sid` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `grade` int(11) NOT NULL,
  PRIMARY KEY (`stuCourseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
CREATE TABLE `student` (
  `sid` int(11) NOT NULL,
  `sname` varchar(255) NOT NULL,
  `ssex` varchar(255) NOT NULL,
  `sdept` varchar(255) NOT NULL,
  `sage` int(11) DEFAULT NULL,
  `saddress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `course` VALUES ('11', 'java编程', '6');
INSERT INTO `course` VALUES ('21', 'c++课程', '4');
INSERT INTO `course` VALUES ('31', 'oracle', '3');
INSERT INTO `course` VALUES ('41', 'javaEE', '100');
INSERT INTO `course` VALUES ('51', 'linux', '1');
INSERT INTO `employee` VALUES ('1', 'qm1', 'qm1@126.com', '2016-08-16 14:49:20');
INSERT INTO `employee` VALUES ('3', 'qm3', 'qm1@126.com', '2016-08-16 14:53:58');
INSERT INTO `employee` VALUES ('4', 'qm4', 'qm1@126.com', '2016-08-16 14:59:06');
INSERT INTO `employee` VALUES ('5', 'qm5', 'qm1@126.com', '2016-08-16 17:01:56');
INSERT INTO `employee` VALUES ('6', 'qm6', 'qm6@126.com', '2016-08-17 16:06:14');
INSERT INTO `employee` VALUES ('7', 'qm1', 'qm1@126.com', '2016-08-18 17:14:13');
INSERT INTO `employee` VALUES ('8', 'qm1', 'qm1@126.com', '2016-08-18 17:20:11');
INSERT INTO `studcourse` VALUES ('1', '20040001', '11', '90');
INSERT INTO `studcourse` VALUES ('2', '20040001', '21', '19');
INSERT INTO `studcourse` VALUES ('3', '20050003', '21', '45');
INSERT INTO `studcourse` VALUES ('4', '20050004', '41', '99');
INSERT INTO `studcourse` VALUES ('5', '20050006', '11', '39');
INSERT INTO `student` VALUES ('20040001', '林青霞', 'F', '计算机系', '22', '上海');
INSERT INTO `student` VALUES ('20040002', '刘德华', 'M', '外语系', '23', '南京');
INSERT INTO `student` VALUES ('20050003', '成龙', 'M', '化学系', '21', '山东');
INSERT INTO `student` VALUES ('20050004', '林可欣', 'F', '计算机系', '22', '北京');
INSERT INTO `student` VALUES ('20050005', '周华健', 'M', '生物系', '24', '山东');
INSERT INTO `student` VALUES ('20050006', '周润发', 'M', '数学系', '20', '湖北');
