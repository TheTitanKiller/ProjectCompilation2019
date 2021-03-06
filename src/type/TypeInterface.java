package type;

public interface TypeInterface
{
    // Atteste que le type est bien formé
    public boolean attestWellFormed();

    // teste l'égalité entre deux types
    @Override public boolean equals(Object obj);

    // Affiche le type dans un format lisible
    @Override public String toString();

    // Réalise l'unification d'un type avec un autre.
    // La valeur de retour est fausse si l'unification échoue
    // et dans le cas contraire, le résultat se trouve dans result.
    // Cette méthode n'est pas utilisée dans le projet, mais peut l'être
    // par la suite
    public boolean unifyWith(Subst result, Type obj);

}
