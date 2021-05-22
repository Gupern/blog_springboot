CREATE TABLE `posts` (
  `ID` bigint unsigned NOT NULL DEFAULT '0' COMMENT '文章的id',
  `post_author` bigint unsigned NOT NULL DEFAULT '0' COMMENT '文章作者',
  `post_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '发布时间',
  `post_date_gmt` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '发布时间GMT',
  `post_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '文章内容',
  `post_title` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '文章标题',
  `post_excerpt` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL COMMENT '文章摘要',
  `post_status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'publish' COMMENT '文章状态',
  `comment_status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'open' COMMENT '评论状态',
  `ping_status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'open' COMMENT '是否可被访问',
  `post_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '文章密码',
  `post_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '文章来源',
  `post_modified` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '文章修改时间',
  `post_modified_gmt` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '文章修改时间GMT',
  `guid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT '' COMMENT '全局唯一id，如图片的url和文章链接',
  `post_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL DEFAULT 'post' COMMENT '文章类型：文章revision、附件attachment',
  `comment_count` bigint NOT NULL DEFAULT '0' COMMENT '评论数量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci