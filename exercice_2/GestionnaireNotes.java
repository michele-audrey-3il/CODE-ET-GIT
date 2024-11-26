public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

    }
}


public  double calclulerNotes(int [] notes)
{
    int somme = 0;
    for (int note : notes ){
        somme +=note;
    }
    double moyenne = (double) somme / notes.length;
    System.out.println("Moyenne :" + moyenne);
}
/**
 * @param calculer notes etudiant
 */

 public void afficherNotes(String nomEtudiant, int[] notes)
 {
    System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
 }

 /**
  * @param afficher notes
  */

