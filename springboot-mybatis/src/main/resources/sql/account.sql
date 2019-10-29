/*
 Navicat MySQL Data Transfer

 Source Server         : tenct
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : cdb-1yzvsfly.bj.tencentcdb.com:10006
 Source Schema         : spring

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 23/10/2019 21:12:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
