# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table principal (
  id                            bigint not null,
  fechai                        timestamp not null,
  fechaf                        timestamp not null,
  responsable                   varchar(255) not null,
  nombre_proyecto               varchar(255) not null,
  codigo_proyecto               varchar(255) not null,
  tec                           varchar(255),
  actividad                     varchar(255),
  promedio_dias                 bigint,
  constraint pk_principal primary key (id)
);
create sequence principal_seq;

create table historico (
  id                            bigint not null,
  sitio                         varchar(255),
  responsable                   varchar(255),
  linea                         varchar(255),
  scoreo                        float,
  codigo_item                   varchar(255),
  porc_item                     varchar(255),
  ifs                           varchar(255),
  no_fallidos                   integer,
  no_total                      integer,
  fechareg                      timestamp,
  causa                         varchar(255),
  constraint pk_historico primary key (id)
);
create sequence historico_seq;

create table items (
  id                            bigint not null,
  descripcion                   text,
  score                         float,
  porcentaje                    float,
  score_real                    float,
  seleccionado                  boolean,
  encabezado                    varchar(255),
  tecn                          varchar(255),
  code                          varchar(255),
  constraint pk_items primary key (id)
);
create sequence items_seq;


# --- !Downs

drop table if exists principal cascade;
drop sequence if exists principal_seq;

drop table if exists historico cascade;
drop sequence if exists historico_seq;

drop table if exists items cascade;
drop sequence if exists items_seq;

