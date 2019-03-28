/*create database db_emple;*/
/*create table t_offices( `offc_id` int not null,
`offc_country` varchar(30) not null,
`offc_city` varchar(40),
`offc_description` varchar(100))*/

/*INSERT INTO `db_emple`.`t_offices`
(`offc_id`,
`offc_country`,
`offc_city`,
`offc_description`)
VALUES
( 10,
'España',
'Madrid',
'Oficina central');
INSERT INTO `db_emple`.`t_offices`
(`offc_id`,
`offc_country`,
`offc_city`,
`offc_description`)
VALUES
(11,
'España',
'Barcelona');*/
/*INSERT INTO `db_emple`.`t_offices2`
(`offc_id`,
`offc_country`,
`offc_city`,
`offc_description`)
VALUES
(10,
'España',
'Madrid',
'Oficina Centrar');*/
/*INSERT INTO `db_emple`.`t_offices2`
(`offc_id`,
`offc_country`,
`offc_city`)

VALUES
(11,
'España',
'Barcelona');*/


/*INSERT INTO `db_emple`.`t_offices2`
(`offc_id`,
`offc_country`,
`offc_city`)
VALUES
(30,
'Argentina',
'Buenos aires');*/

/*UPDATE `db_emple`.`t_offices2`
SET
`offc_city` = 'Buenos Aires'

WHERE `offc_id` = 20;*/

/*UPDATE `db_emple`.`t_offices2`
SET
`offc_description` = 'Oficina Central'

WHERE `offc_id` = 10;*/

/*UPDATE `db_emple`.`t_offices2`
SET
`offc_city` = 'Santiago'

WHERE `offc_id` = 20;*/

SELECT `t_offices2`.`offc_id`,
    `t_offices2`.`offc_country`,
    `t_offices2`.`offc_city`,
    `t_offices2`.`offc_description`
FROM `db_emple`.`t_offices2` WHERE `offc_description` like '%Oficina%';





















