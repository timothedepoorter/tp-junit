# Application de gestion de salariés👩‍💼🧑‍💼

---
Diagramme de classe :

```plantuml
@startuml

class Salaire {
  +tauxHoraire
  +payer(heures: int)
}

class Identite {
  +nom
  +prenom
  +adresse: Adresse
}

class Adresse {
  +voie
  +rue
  +cp
  +ville
  +pays
}

class SalarieCdi extends Salarie {
}

abstract class Salarie {
  +salaire: Salaire
  +identite: Identite
  +demenager(adresse: Adresse)
  +travailler(heures = 151)
  +augmenter(pourcentage)
}

Salarie o-- Identite
Salarie o-- Salaire

Identite o-- Adresse

@enduml
```
--- 
## Pour exécuter les tests 🧪 :
1. *clic droit* sur le package `test/java/exercices/tp2`
2. *clic gauche* sur le bouton "▶️ Run Tests in Tp2"

*Les getters et les setters ne sont pas testés*