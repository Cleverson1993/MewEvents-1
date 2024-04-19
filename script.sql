-- Active: 1712273957933@@pg-33ad0904-professorbossini.a.aivencloud.com@12956@defaultdb@public

CREATE TABLE tb_usuario_mew_events(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
--cadastrar um usuário
SELECT * FROM tb_usuario_mew_events;
--cadastrar um usuário
INSERT INTO tb_usuario_mew_events
(login, senha) VALUES
('comum', 'comum');

SELECT  *
FROM tb_usuario_mew_events;

UPDATE tb_usuario_mew_events SET
login='Admin',senha='Admin'
WHERE cod_usuario = 1;

DELETE FROM tb_usuario_mew_events
WHERE cod_usuario = 2;

UPDATE tb_usuario_mew_events SET
senha='' WHERE cod_usuario = 1;