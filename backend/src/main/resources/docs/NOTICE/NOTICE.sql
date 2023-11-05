-- 공지사항
DROP TABLE IF EXISTS `final`.notice;
CREATE TABLE `final`.notice
(
    `NOTICE_ID`           BIGINT       NOT NULL AUTO_INCREMENT COMMENT '공지사항코드',
    `NOTICE_EMP_ID`       BIGINT       NOT NULL COMMENT '사원코드',
    `NOTICE_SUBJECT`      VARCHAR(255) NOT NULL COMMENT '공지사항제목',
    `NOTICE_CONTENT`      LONGTEXT     NOT NULL COMMENT '공지사항내용',
    `NOTICE_VIEWS`        INT          NULL COMMENT '공지사항조회수',
    `NOTICE_CREATEDDATE`  DATETIME     NOT NULL COMMENT '공지사항작성일',
    `NOTICE_MODIFIEDDATE` DATETIME     NULL COMMENT '공지사항수정일',
    PRIMARY KEY (`NOTICE_ID`)
) ENGINE = InnoDB COMMENT '공지사항'
  AUTO_INCREMENT = 1;

ALTER TABLE `final`.notice
    ADD CONSTRAINT `FK_NOTICE_EMP` FOREIGN KEY (`NOTICE_EMP_ID`) REFERENCES `final`.emp (`EMP_ID`);