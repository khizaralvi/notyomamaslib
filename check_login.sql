CREATE PROCEDURE `check_login` (IN username varchar(20))
BEGIN
select *from people.student where id=username;
END
