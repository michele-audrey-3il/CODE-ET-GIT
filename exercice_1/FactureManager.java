public class FactureManager {
  


    public double reduction (String typeProduit )
    {     
        switch (typeProduit) {

            case "Alimentaire":
                return 0.05;
                break;

            case "Electronique":
                return 0.1;
                break;

            case "Luxe":
                return 0.15;
                break;

            default :
            return 0;
        }
    }
    /**
     * 
     * @param typeProduit
     * @return
     */

    public double calculerReduction()
    {
        double total = total(int quantite , double prixUnitaire);
        return total -= total * reduction(String typeProduit );

    }
    /**
     * 
     * @return
     */



    public double reductionQuantite()
    {
        double total = total(int quantite , double prixUnitaire);
        if(total >1000){
            total -=total * 0.05;
        }
        return total;
    }
    
}
/**
 * @return
 */
