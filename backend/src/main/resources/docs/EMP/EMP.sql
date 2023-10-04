DROP table IF EXISTS `final`.emp;

create table `final`.EMP (

	`EMP_ID`            BIGINT       NOT NULL AUTO_INCREMENT COMMENT '사원코드', -- 사원코드
	`EMP_DEPT_ID`       BIGINT       NOT NULL COMMENT '부서코드', -- 부서코드
	`EMP_NAME`          VARCHAR(255) NOT NULL COMMENT '이름', -- 이름
	`EMP_EMAIL`         VARCHAR(255) NOT NULL COMMENT '이메일', -- 이메일
	`EMP_PASSWORD`      VARCHAR(255) NOT NULL COMMENT '비밀번호', -- 비밀번호
	`EMP_PHONENUMBER`   VARCHAR(255) NOT NULL COMMENT '휴대폰번호', -- 휴대폰번호
	`EMP_POSITION`      VARCHAR(255) NOT NULL COMMENT '직급', -- 직급
	`EMP_ROLES`         VARCHAR(255) NOT NULL COMMENT '권한', -- 권한
	`EMP_BIRTHDAY`      DATE         NOT NULL COMMENT '생년월일', -- 생년월일
	`EMP_STARTDATE`     DATE         NOT NULL COMMENT '입사일', -- 입사일
	`EMP_ENDDATE`       DATE         NULL     COMMENT '퇴사일', -- 퇴사일
	`EMP_STATUS`        VARCHAR(255) NOT NULL COMMENT '재직상태', -- 재직상태
	`EMP_GENDER`        VARCHAR(255) NOT NULL COMMENT '성별', -- 성별
	`EMP_ADDRESS`       VARCHAR(255) NOT NULL COMMENT '주소', -- 주소
	`EMP_DETAILADDRESS` VARCHAR(255) NULL     COMMENT '상세주소', -- 상세주소
	PRIMARY KEY (`EMP_ID`)
) ENGINE = InnoDB COMMENT '사원' AUTO_INCREMENT = 101;

-- EMP_EMAIL 유니크 키 추가
ALTER TABLE `final`.emp
ADD CONSTRAINT `UK_EMP_EMAIL` UNIQUE (`EMP_EMAIL`);

ALTER TABLE `final`.emp
ADD CONSTRAINT `FK_EMP_DEPT` FOREIGN KEY (`EMP_DEPT_ID`) REFERENCES `final`.dept (`DEPT_ID`);