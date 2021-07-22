-- 如果存在数据库，就删除数据库，如果不想删除数据库请注释下面两句
DROP DATABASE IF EXISTS `ssmbuild`;
CREATE DATABASE IF NOT EXISTS `ssmbuild`;


USE `ssmbuild`;
-- 创建books表,如果已经存在请手动删除表之后再创建
CREATE TABLE IF NOT EXISTS `books`(
	`bookID` INT(10) NOT NULL AUTO_INCREMENT COMMENT '书号',
	`bookName` VARCHAR(30) NOT NULL DEFAULT 'yangou' COMMENT '书名',
	`bookCounts` INT(10) NOT NULL DEFAULT '10' COMMENT '书籍数量',
	`detail` VARCHAR(100) COMMENT '书籍描述',
	PRIMARY KEY(`bookID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `books`(`bookName`,`bookCounts`)
VALUES
('python',12),
('java',13),
('php',99);
