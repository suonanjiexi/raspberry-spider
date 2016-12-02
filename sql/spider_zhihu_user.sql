/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : raspberry_db

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-12-01 18:40:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `spider_zhihu_user`
-- ----------------------------
DROP TABLE IF EXISTS `spider_zhihu_user`;
CREATE TABLE `spider_zhihu_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `key` varchar(30) DEFAULT NULL COMMENT 'keyword',
  `name` varchar(30) DEFAULT NULL COMMENT '用户名',
  `identity` varchar(100) DEFAULT NULL COMMENT '身份',
  `location` varchar(20) DEFAULT NULL COMMENT '所在地',
  `profession` varchar(30) DEFAULT NULL COMMENT '行业',
  `sex` int(2) DEFAULT NULL COMMENT '性别',
  `school` varchar(30) DEFAULT NULL COMMENT '学校',
  `major` varchar(30) DEFAULT NULL COMMENT '专业',
  `recommend` varchar(100) DEFAULT NULL COMMENT '个人简介',
  `picUrl` varchar(255) DEFAULT NULL COMMENT '头像url',
  `agree` int(11) DEFAULT '0' COMMENT '赞同数',
  `thanks` int(11) DEFAULT '0' COMMENT '感谢数',
  `ask` int(11) DEFAULT '0' COMMENT '提问数',
  `answer` int(11) DEFAULT '0' COMMENT '回答数',
  `article` int(11) DEFAULT '0' COMMENT '文章数',
  `collection` int(11) DEFAULT '0' COMMENT '收藏数',
  `follow` int(11) DEFAULT '0' COMMENT '关注了',
  `follow_person` int(11) DEFAULT '0' COMMENT '关注者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_index` (`name`) USING BTREE,
  UNIQUE KEY `location_index` (`location`) USING BTREE,
  UNIQUE KEY `profession_index` (`profession`) USING BTREE,
  UNIQUE KEY `sex_index` (`sex`) USING BTREE,
  KEY `identity_index` (`identity`) USING BTREE,
  KEY `school_index` (`school`) USING BTREE,
  KEY `major_index` (`major`) USING BTREE,
  KEY `agree_index` (`agree`) USING BTREE,
  KEY `follow_person_index` (`follow_person`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of spider_zhihu_user
-- ----------------------------
