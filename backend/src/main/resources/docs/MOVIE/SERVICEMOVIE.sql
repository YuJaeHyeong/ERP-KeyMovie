-- 서비스영상
DROP TABLE IF EXISTS `final`.servicemovie;
CREATE TABLE `final`.servicemovie
(
    `SERVICEMOVIE_ID`            BIGINT       NOT NULL AUTO_INCREMENT COMMENT '서비스영상코드',
    `SERVICEMOVIE_MOVIE_ID`      VARCHAR(255) NOT NULL COMMENT '영상 코드',
    `SERVICEMOVIE_AMOUNT`        INT          NOT NULL COMMENT '판권금액',
    `SERVICEMOVIE_PAYMENTDATE`   DATETIME     NOT NULL COMMENT '판권결제일',
    `SERVICEMOVIE_PAYMENTBANK`   VARCHAR(255) NOT NULL COMMENT '결제은행',
    `SERVICEMOVIE_ACCOUNTNUMBER` VARCHAR(255) NOT NULL COMMENT '결제계좌',
    `SERVICEMOVIE_STARTDATE`     DATE         NOT NULL COMMENT '서비스시작일',
    `SERVICEMOVIE_ENDDATE`       DATE         NOT NULL COMMENT '서비스종료일',
    `SERVICEMOVIE_PRODUCERID`    VARCHAR(255) NOT NULL COMMENT '제작사코드',
    `SERVICEMOVIE_PRODUCER`      VARCHAR(255) NOT NULL COMMENT '제작사',
    PRIMARY KEY (`SERVICEMOVIE_ID`)
) ENGINE = InnoDB COMMENT '서비스영상'
  AUTO_INCREMENT = 1;

ALTER TABLE `final`.servicemovie
    ADD CONSTRAINT `FK_SERVICEMOVIE_MOVIE` FOREIGN KEY (`SERVICEMOVIE_MOVIE_ID`) REFERENCES `final`.movie (`MOVIE_ID`);