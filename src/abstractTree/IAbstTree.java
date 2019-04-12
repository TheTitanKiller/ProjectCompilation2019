package abstractTree;

public interface IAbstTree
{
    
    // Cette fonction évalue l'arbre en affichant ce qu'il fait
    // Elle est écrite dans AbstTreeInt et ne devrait normalement pas être touchée
    void eval(IEnvironment environment) throws Exception;
    
    // Cette fonction renvoie une valeur associée au noeud de l'arbre
    Double getValue();
}
