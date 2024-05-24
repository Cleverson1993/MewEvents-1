-- Active: 1712273957933@@pg-33ad0904-professorbossini.a.aivencloud.com@12956@defaultdb@public

CREATE TABLE tb_usuario_mew_events(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL,
  tipo INT
);
INSERT INTO tb_usuario_mew_events (login, senha, tipo)
VALUES
('admin', 'admin', 1),
('comum', 'comum', 2);

SELECT * FROM tb_usuario_mew_events;

CREATE TABLE tb_evento_mew_events(
  cod_evento SERIAL PRIMARY KEY,
  nome VARCHAR(200) NOT NULL,
  descricao VARCHAR(1000) NOT NULL,
  data_inicio TIMESTAMP NOT NULL,
  data_fim TIMESTAMP NOT NULL
);

INSERT INTO tb_evento_mew_events
(nome, descricao, data_inicio, data_fim)
VALUES
(
  'Evento1', 
  'Esse é o evento 1', 
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
),
(
  'Evento 2',
  'Esse é o evento 2',
  CURRENT_TIMESTAMP,
  CURRENT_TIMESTAMP
);

SELECT * FROM tb_evento_mew_events;