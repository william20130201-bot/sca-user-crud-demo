-- H2用户表，项目启动自动创建
CREATE TABLE t_user (
id INT PRIMARY KEY AUTO_INCREMENT, -- 主键自增ID
username VARCHAR(50) NOT NULL,     -- 用户名
age INT,                            -- 年龄
email VARCHAR(100)                 -- 邮箱
);