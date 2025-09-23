Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.40 MySQL Community Server - GPL

Copyright (c) 2000, 2024, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE escola;
Query OK, 1 row affected (0.04 sec)

mysql>
mysql> USE escola;
Database changed
mysql>
mysql> CREATE TABLE aluno (
    ->     id INT AUTO_INCREMENT PRIMARY KEY,
    ->     nome VARCHAR(50),
    ->     idade INT,
    ->     curso VARCHAR(50)
    ->      );
Query OK, 0 rows affected (0.11 sec)

mysql>
mysql> INSERT INTO aluno (nome, idade, curso)
    ->     VALUES
    ->      ('Gabriel', 26, 'Ciência Computação'),
    ->      ('Joselaine', 47, 'Psicologia'),
    ->      ('Alenxandre', 50, 'Zootecnia'),
    ->      ('Matheus', 30, 'Engenharia Mecânica'),
    ->      ('Leonardo', 19, 'Med. Veterinária');
Query OK, 5 rows affected (0.03 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql>
mysql> CREATE TABLE professor (
    ->      id INT AUTO_INCREMENT PRIMARY KEY,
    ->      nome VARCHAR(50),
    ->      idade INT,
    ->      disciplina VARCHAR(50)
    ->      );
Query OK, 0 rows affected (0.10 sec)

mysql>
mysql> INSERT INTO professor (nome, idade, disciplina)
    ->      VALUES
    ->       ('Nicola', 72, 'Direito do consumidor'),
    ->       ('Ricardo', 42, 'Desenvolvimento de Software'),
    ->       ('Veronica', 70, 'Psicanalise');
Query OK, 3 rows affected (0.02 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql>
mysql> CREATE TABLE matricula (
    ->      id INT AUTO_INCREMENT PRIMARY KEY,
    ->      id_aluno INT,
    ->      id_professor INT,
    ->      data_matricula DATE,
    ->      FOREIGN KEY (id_aluno) REFERENCES aluno(id),
    ->      FOREIGN KEY (id_professor) REFERENCES professor(id)
    ->      );
Query OK, 0 rows affected (0.18 sec)

mysql>
mysql> INSERT INTO matricula (id_aluno, id_professor, data_matricula)
    ->      VALUES
    ->       (2, 3, '2004-02-20'),
    ->       (1, 1, '1301-05-10'),
    ->       (3, 2, '1709-07-19'),
    ->       (4, 2, '1205-09-09'),
    ->       (5, 1, '1954-09-18');
Query OK, 5 rows affected (0.02 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> CREATE TABLE pessoa (
    ->      id INT AUTO_INCREMENT PRIMARY KEY,
    ->      nome VARCHAR(50),
    ->      sexo VARCHAR(50),
    ->      idioma VARCHAR(30)
    ->      );
Query OK, 0 rows affected (0.09 sec)

mysql> CREATE TABLE veiculo(
    -> id int AUTO_INCREMENT PRIMARY KEY,
    -> modelo VARCHAR(30),
    -> PLACA VARCHAR (7),
    -> id_pessoa int NOT NULL,
    -> foreing key(id_pessoa) references pessoa(id)
    -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'key(id_pessoa) references pessoa(id)
)' at line 6
mysql>  CREATE TABLE veiculo(
    ->     -> id int AUTO_INCREMENT PRIMARY KEY,
    ->     -> modelo VARCHAR(30),
    ->     -> PLACA VARCHAR (7),
    ->     -> id_pessoa int NOT NULL,
    ->     -> foreign key(id_pessoa) references pessoa(id)
    ->     -> );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '-> id int AUTO_INCREMENT PRIMARY KEY,
    -> modelo VARCHAR(30),
    -> PLACA VA' at line 2
mysql>  CREATE TABLE veiculo(
    -> id int AUTO_INCREMENT PRIMARY KEY,
    -> modelo VARCHAR(30),
    -> placa VARCHAR (7),
    -> id_pessoa int NOT NULL,
    -> foreign key(id_pessoa) references pessoa(id)
    ->    );
Query OK, 0 rows affected (0.13 sec)

mysql> Select * from veiculo;
Empty set (0.01 sec)

mysql> select * from pessoa;
Empty set (0.00 sec)

mysql>




