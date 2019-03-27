# GEN_lab02

### Élèves : Crüll Loris, Lagier Elodie

#### Lien wiki
https://github.com/CosmicElodie/GEN_lab02/wiki

#### Erreurs et incohérence dans le livre

Nous nous permettons de répertorier les fautes vues dans le livre, afin de (peut-être) expliquer certaines incohérences.

###### Page 60
Ajouter -> public Money reduce(String to) ne rend pas le code compilable, contrairement à ce que dit le livre. 
1. Il faut ajouter la méthode : void addRate(String from, String to, int rate), pour que la méthode reduce fonctionne. En effet, celle-ci utilise addRate et ne peut fonctionner que si cette dernière est implémentée. 
