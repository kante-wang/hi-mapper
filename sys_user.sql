/*
Navicat MySQL Data Transfer

Source Server         : bld-dev
Source Server Version : 50631
Source Host           : 10.10.40.61:3306
Source Database       : zito_bld_dev

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2018-09-13 15:07:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_account` varchar(50) NOT NULL COMMENT '账号',
  `user_password` varchar(50) NOT NULL COMMENT '密码',
  `user_role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `user_status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '用户状态：0有效，1无效；默认0',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '1', '0', '2018-09-18 14:02:38', null);
INSERT INTO `sys_user` VALUES ('2', 'zj', 'e10adc3949ba59abbe56e057f20f883e', '2', '0', '2018-09-10 10:13:38', null);
INSERT INTO `sys_user` VALUES ('3', 'gg', '4297f44b13955235245b2497399d7a93', '3', '0', '2018-09-18 10:13:44', null);
