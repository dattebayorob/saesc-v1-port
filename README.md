# saesc-v1-port
Projeto criado para auxiliar na migração de um banco de dados com ORM feiosão

# migração
ALTER TABLE escola ADD COLUMN cod_endereco BIGINT;
UPDATE escola SET cod_endereco = escola.cod_escola;
alter table escola_endereco add COLUMN cod_endereco BIGSERIAL;
delete from escola_endereco where cod_escola is null;
update escola_endereco set cod_endereco = escola_endereco.cod_escola;
ALTER TABLE escola_endereco ADD CONSTRAINT escola_endereco_pk PRIMARY KEY (cod_endereco);
ALTER TABLE escola ADD CONSTRAINT escola_escola_endereco_fk foreign key (cod_endereco) references escola_endereco(cod_endereco);
ALTER TABLE escola_ip ADD COLUMN cod_ip BIGINT;
update escola_ip set cod_ip = cod_escola;