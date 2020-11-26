/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 26/11/2020 22:27:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `pid` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '李四', '北京');
INSERT INTO `person` VALUES (2, '赵武', '南京');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '郑成功', '郑州');
INSERT INTO `student` VALUES (2, '程咬金', '新乡');

-- ----------------------------
-- Table structure for test_a
-- ----------------------------
DROP TABLE IF EXISTS `test_a`;
CREATE TABLE `test_a`  (
  `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `WORK` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of test_a
-- ----------------------------
INSERT INTO `test_a` VALUES (1, 'aa', '男', 'aa1');
INSERT INTO `test_a` VALUES (3, 'cc', '男', '332211');
INSERT INTO `test_a` VALUES (4, 'BBB', 'nv', '2233');

-- ----------------------------
-- Table structure for test_b
-- ----------------------------
DROP TABLE IF EXISTS `test_b`;
CREATE TABLE `test_b`  (
  `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `IPHONE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EMAIL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `HOBBY` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `WORK` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of test_b
-- ----------------------------
INSERT INTO `test_b` VALUES (2, 'aa', '111', 'aa11@qq.com', '篮球', ' qqq ');

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hobby` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO `work` VALUES (1, '返回发');
INSERT INTO `work` VALUES (2, '人体宴 ');
INSERT INTO `work` VALUES (3, '有人提议');

SET FOREIGN_KEY_CHECKS = 1;
