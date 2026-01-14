-- © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
-- database: esStorage\esDatabases\esAntCiberDron.sqlite
DROP TABLE IF EXISTS esAntCiberDron;
DROP TABLE IF EXISTS esHormiga;
DROP TABLE IF EXISTS esSexo;
DROP TABLE IF EXISTS esEstado;
DROP TABLE IF EXISTS esHormigaTipo;
DROP TABLE IF EXISTS esAlimentoTipo; 
 
CREATE TABLE esAlimentoTipo(
     esIdAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esHormigaTipo (
     esIdHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esEstado (
     esIdEstado       INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esSexo (
     esIdSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,esNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,esDescripcion    VARCHAR(100) NULL
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esHormiga (
     esIdHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,esIdHormigaTipo  INTEGER NOT NULL REFERENCES esHormigaTipo (esIdHormigaTipo)
    ,esIdSexo         INTEGER NOT NULL REFERENCES esSexo        (esIdSexo)
    ,esIdEstado       INTEGER NOT NULL REFERENCES esEstado      (esIdEstado)
    ,esNombre         VARCHAR(20) NOT NULL  UNIQUE
    ,esDescripcion    VARCHAR(20) NULL

    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE esAntCiberDron (
     esIdAntCiberDron     INTEGER PRIMARY KEY AUTOINCREMENT
    ,esSerie              VARCHAR(10) NOT NULL  UNIQUE
    ,Estado             VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

-- Insert initial data into esSexo table
INSERT INTO esSexo 
 (esNombre, esDescripcion)  VALUES 
 ('Macho'  ,' masculino')
,('Hembra' ,' femenina') 
,('Hibrido',' Hibrido')
,('Asexual',' Asexual');

INSERT INTO esAlimentoTipo
 (esNombre, esDescripcion)  VALUES
 ('Carnivoro'   ,'Azucar')
,('Herbívoro' ,'Proteina')
,('Omnívoro'  ,'Lipidico')
,('Nectarivoro','Vitaminico');

INSERT INTO esHormigaTipo
 (esNombre, esDescripcion)  VALUES 
 ('Larva'     ,' en etapa de larva')
,('Soldado'   ,' encargada de la defensa')
,('Rastreadora',' encargada de buscar alimento')
,('Reina'     ,' encargada de la reproducción')
,('Zángano'   ,' macho para reproducción');

INSERT INTO esEstado
 (esNombre, esDescripcion)  VALUES 
 ('Vive' ,' está viva'),
 ('Muere',' ha muerto'),
 ('Finge',' su muerte');

INSERT INTO esAntCiberDron
(esSerie)     VALUES 
('S001'),
('S002'),
('S003'),
('S004');

INSERT INTO esHormiga
(esIdHormigaTipo, esIdSexo, esIdEstado, esNombre, esDescripcion) values 
(1, 2, 1, 'esHormiga1', 'Primera hormiga'),
(2, 1, 1, 'esHormiga2', 'Segunda hormiga'),
(3, 2, 1, 'esHormiga3', 'Tercera hormiga'),
(4, 1, 1, 'esHormiga4', 'Cuarta hormiga');

select * from esSexo;
select * from esHormigaTipo;
select * from Estado;
select * from esAlimentoTipo;
SELECT * FROM esHormiga;


DROP VIEW IF EXISTS vwesHormiga;

CREATE VIEW vwesHormiga AS
SELECT 
     H.esIdHormiga
    ,HT.esNombre AS esTipo
    ,S.esNombre  AS esSexo
    ,E.esNombre  AS esEstadoHormiga
    ,H.esNombre  AS esNombre
    ,H.esDescripcion
    ,H.Estado
    ,H.FechaCreacion
    ,H.FechaModifica
FROM esHormiga H
JOIN esHormigaTipo    HT ON H.esIdHormigaTipo = HT.esIdHormigaTipo
JOIN esSexo           S  ON H.esIdSexo        = S.esIdSexo
JOIN esEstado         E  ON H.esIdEstado      = E.esIdEstado
WHERE H.Estado = 'A';

SELECT * FROM vwesHormiga;

SELECT * FROM Estado;

SELECT esIdHormiga
,esTipo
,esSexo
,esEstadoHormiga
,esNombre
,esDescripcion
,Estado
,FechaCreacion
,FechaModifica  
FROM vwesHormiga;


SELECT * FROM esHormiga;

UPDATE esEstado SET esNombre = 'VIVA'
WHERE esIdEstado = 1;

UPDATE esEstado   SET esNombre = 'MUERTA'
WHERE esIdEstado = 2;

UPDATE esEstado   SET Estado = 'X'
WHERE esIdEstado = 3;

select * from Estado;