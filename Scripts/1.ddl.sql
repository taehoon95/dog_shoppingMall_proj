-- 개
DROP TABLE IF EXISTS dog_shoppingmall.Dog RESTRICT;

-- 쇼핑몰
DROP SCHEMA IF EXISTS dog_shoppingmall;

-- 쇼핑몰
CREATE SCHEMA dog_shoppingmall;

-- 개
CREATE TABLE dog_shoppingmall.Dog (
	id        INT          NOT NULL COMMENT '아이디', -- 아이디
	kind      VARCHAR(12)  NOT NULL COMMENT '품종', -- 품종
	price     INT          NOT NULL COMMENT '가격', -- 가격
	image     VARCHAR(20)  NOT NULL COMMENT '이미지', -- 이미지
	country   VARCHAR(12)  NOT NULL COMMENT '원산지', -- 원산지
	height    INT          NULL     COMMENT '신장', -- 신장
	weight    INT          NULL     COMMENT '체중', -- 체중
	content   VARCHAR(400) NULL     COMMENT '설명', -- 설명
	readcount INT          NULL     COMMENT '조회수' -- 조회수
)
COMMENT '개';

-- 개
ALTER TABLE dog_shoppingmall.Dog
	ADD CONSTRAINT PK_Dog -- 개 기본키
		PRIMARY KEY (
			id -- 아이디
		);

ALTER TABLE dog_shoppingmall.Dog
	MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT COMMENT '아이디';