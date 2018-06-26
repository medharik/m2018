create table etudiants(
id number , 
nom varchar2(100),
prenom varchar2(100),
constraint pk_etudiant primary key (id)

)
create table notes(
id number , 
note number ,
etudiant_id number ,
cours_id number,
constraint pk_note primary key (id)
constraint fk_note_etudiant foreign key(etudiant_id) references etudiant(id) on delete cascade,
constraint fk_note_cours foreign key(cours_id) references cours(id) on delete cascade

)

