public class StockManager {

    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }

    public int calculerQuantite(int quantite, int stock)
    {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
    return quantite;
}
/**
 * @param calculerQuantite
 */
