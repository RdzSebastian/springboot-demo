CREATE TABLE public.persona
(
    id serial NOT NULL PRIMARY KEY,
    nombre character varying(20),
    apellido character varying(20),
    direccion character varying(20)
);