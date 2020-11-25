/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : marking

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 07/11/2020 21:59:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_authority
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority`  (
  `id` int(20) NOT NULL,
  `authority` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES (1, 'ROLE_1');
INSERT INTO `t_authority` VALUES (2, 'ROLE_2');
INSERT INTO `t_authority` VALUES (3, 'ROLE_1');

-- ----------------------------
-- Table structure for t_authority_user
-- ----------------------------
DROP TABLE IF EXISTS `t_authority_user`;
CREATE TABLE `t_authority_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `authority_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_authority_user
-- ----------------------------
INSERT INTO `t_authority_user` VALUES (1, 1, 1);
INSERT INTO `t_authority_user` VALUES (2, 2, 2);
INSERT INTO `t_authority_user` VALUES (3, 3, 3);

-- ----------------------------
-- Table structure for t_index
-- ----------------------------
DROP TABLE IF EXISTS `t_index`;
CREATE TABLE `t_index`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `index_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_index
-- ----------------------------
INSERT INTO `t_index` VALUES (1, '全部评分', '01.png');
INSERT INTO `t_index` VALUES (2, '进行中', '02.png');
INSERT INTO `t_index` VALUES (3, '已结束', '03.png');

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `grade` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES (1, '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5G 速度、迄今最快的芯片 A14 仿生、\r\nOLED 全面屏、将抗跌落能力提升至四倍的超瓷晶面板，以及遍布每个摄像头的夜间模式。这两款尺寸称手的 iPhone 12，该有的都有了。', '华为1', 0);
INSERT INTO `t_product` VALUES (5, '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;第十代智能英特尔® 酷睿™ i7，i9 全系列产品，睿频频率可高达 5.0 GHz 以上\r\n睿频频率是指通过英特尔® 睿频加速技术可实现的至高单核处理器频率。\r\n改动时钟频率或电压可能损坏处理器及其他系统组件，或缩短其使用寿命，也可能降低系统稳定性和性能。如处理器使用超出其规范，则不适用产品质保。请从系统和组件制造商处获得更多详细信息', 'Redia游戏本1', 0);

-- ----------------------------
-- Table structure for t_score
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `score` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 409 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_score
-- ----------------------------
INSERT INTO `t_score` VALUES (386, '华为1', '3', '李一');
INSERT INTO `t_score` VALUES (400, 'Redia游戏本1', '2', '李二');
INSERT INTO `t_score` VALUES (408, '华为1', '2', '李小阳');

-- ----------------------------
-- Table structure for t_time
-- ----------------------------
DROP TABLE IF EXISTS `t_time`;
CREATE TABLE `t_time`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `end_time` date NULL DEFAULT NULL,
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `start_time` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_time
-- ----------------------------
INSERT INTO `t_time` VALUES (4, '2020-10-14', '华为1', '2020-10-24');
INSERT INTO `t_time` VALUES (5, '2020-10-27', 'Redia游戏本1', '2020-10-07');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `tou_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '1.jpg',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `vaild` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, '2307205467@qq.com', '$2a$10$5ooQI8dir8jv0/gCa1Six.GpzAdIPf6pMqdminZ/3ijYzivCyPlfK', '1.jpg', '李一', '1');
INSERT INTO `t_user` VALUES (2, '2307205467@qq.com', '$2a$10$5ooQI8dir8jv0/gCa1Six.GpzAdIPf6pMqdminZ/3ijYzivCyPlfK', '2.jpg', '李二', '1');
INSERT INTO `t_user` VALUES (3, '2307205467@qq.com', '$2a$10$5ooQI8dir8jv0/gCa1Six.GpzAdIPf6pMqdminZ/3ijYzivCyPlfK', '3.jpg', '李三', '1');
INSERT INTO `t_user` VALUES (31, 'li11d03@yeah.com', '$2a$10$dtqWivLkJ.U4ZAmmy9kAle0TMe7ca4TXTgI.G8Ird0Gcbd0YM8T5W', 'toplogo.png', '李小阳', '1');

SET FOREIGN_KEY_CHECKS = 1;
