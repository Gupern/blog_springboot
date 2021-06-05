CREATE TABLE `permission` (
  `ID` bigint unsigned NOT NULL DEFAULT '0' COMMENT '权限的id',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `create_time_gmt` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间GMT',
  `modified_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `modified_time_gmt` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间GMT',
  `permission_name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '权限名称',
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci