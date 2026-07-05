# 🧮 Algo Challenges & Data Structures (Java)

Ce dépôt regroupe mes résolutions de défis algorithmiques et implémentations de structures de données en **Java**. L'objectif est de démontrer ma logique de programmation, ma gestion de la complexité mémoire/temps, et ma rigueur technique.

---

## 🔍 Liste des algorithmes implémentés

### 1. Recherche Binaire (Binary Search)
* **Fichier :** `BinarySearch.java`
* **Principe :** Recherche optimisée dans un tableau obligatoirement **trié** en divisant la zone de recherche par deux à chaque étape.
* **Complexité Temporelle :** $O(\log n)$ (Logarithmique) — Beaucoup plus performant qu'une recherche linéaire $O(n)$ sur de grands volumes de données.
* **Détail technique :** Utilisation de la formule `left + (right - left) / 2` pour prévenir le bug d'**Integer Overflow** (dépassement de capacité mémoire).