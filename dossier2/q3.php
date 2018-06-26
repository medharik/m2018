<?php 
$file="q1.xml";
if (file_exists($file)) {
	$xml=simplexml_load_file($file);

$nom=$xml[0]->nom;
$prenom=$xml[0]->prenom;
$connexion = oci_connect('user', 'motdepasse', 'localhost/XE');
$stm = oci_parse($conn, "insert into etudiants (nom,prenom) values ('".$nom."','".$prenom."')");

oci_execute($stm);


}else {
	echo "fichier $file introuvable";
}




 ?>