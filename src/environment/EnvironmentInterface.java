package environment;

import errors.CustomError;
import node.NodeId;

public interface EnvironmentInterface
{
    /**
     * Permet de débugguer les noeuds d'un ou des environnements enregistré à un
     * instant donné.
     */
    void backtrace();
    
    /**
     * Permet de récupérer le noeud correspondant à une variable enregistre dans
     * l'environnement.
     * Doit etre préalablement initialisé dedans.
     *
     * @param variable
     *        Le nom du noeud à récupérer.
     * @return Le noeud correspondant.
     * @throws Exception
     *         Si la variable n'a pas été initialisé.
     */
    NodeId getVariable(String variable) throws CustomError;
    
    /**
     * Permet de mettre le noeud correspondant à une variable àenregistrer dans
     * l'environnement.
     * Ne doit pas etre déjà enregistré.
     *
     * @param var
     *        Le nom de la variable à mettre.
     * @param value
     *        Le noeud correspondant.
     * @throws Exception
     *         Si la variable a déjà été initialisé.
     */
    void putVariable(String var, NodeId value) throws CustomError;
    
    /**
     * Permet de remplacer le noeud correspondant à une variable à enregistrer dans
     * l'environnement.
     * putVariable doit d'abord étre utilisé.
     *
     * @param var
     *        Le nom de la variable à mettre.
     * @param value
     *        Le noeud correspondant.
     * @throws Exception
     *         Si la variable n'a pas été initialisé.
     */
    void replaceVariable(String var, NodeId value) throws CustomError;
}
