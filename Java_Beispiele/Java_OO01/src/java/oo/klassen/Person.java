/*
 *  This code is released under Creative Commons Attribution 4.0 International
 *  (CC BY 4.0) license, http://creativecommons.org/licenses/by/4.0/legalcode .
 *  That means:
 *
 *  You are free to:
 *
 *      Share — copy and redistribute the material in any medium or format
 *      Adapt — remix, transform, and build upon the material
 *               for any purpose, even commercially.
 *
 *      The licensor cannot revoke these freedoms as long as you follow the
 *      license terms.
 *
 *  Under the following terms:
 *
 *      Attribution — You must give appropriate credit, provide a link to the
 *      license, and indicate if changes were made. You may do so in any
 *      reasonable manner, but not in any way that suggests the licensor endorses
 *      you or your use.
 *
 *  No additional restrictions — You may not apply legal terms or technological
 *  measures that legally restrict others from doing anything the license
 *  permits.
 *
 *
 *  2019 Aeonium Software Systems, Robert Rohm.
 */
package java.oo.klassen;

/**
 * Beispiel einer einfachen Datenklasse, die hier als Basis-Klasse für
 * spezialisierte abgeleitete Klassen dient. Eventuell in diesen abgeleiteten
 * Klassen benötige Felder müssen hier schon als protected deklariert werden.
 * Ansonsten sind private Felder und Methoden in den abgeleiteten Klassen nicht
 * sichtbar, das heißt: nicht benutzbar.
 *
 * @author Robert Rohm&lt;r.rohm@aeonium-systems.de&gt;
 */
public class Person {

  /**
   * Sichtbarkeit protected:
   * wie private, aber auch
   * in abgeleiteten Klassen.
   */
  protected String name;
  protected String vorname;

  /**
   * Der Standard-Konstruktor bleibt in diesem Fall leer, er ist jedoch nicht
   * unnötig: sobald ein überladener “Bequemlichkeits“-Konstruktor definiert
   * wird, muss auch der parameterlose Standard-Konstruktor explizit deklariert
   * werden, sonst ist die Klasse nicht mehr ohne Parameterübergabe
   * instanzierbar.
   */
  public Person() {
  }

  /**
   * Methoden-Überladung auch beim Konstruktor: dieser “Bequemlichkeits“-
   * Konstruktor ermöglicht bequeme Instanzierung mit allen für die
   * Initialisierung notwendigen Parametern.
   *
   * @param name
   * @param vorname
   */
  public Person(String name, String vorname) {
    this.name = name;
    this.vorname = vorname;
  }


  /**
   * Getter-Methode: vgl. Java Bean Specification,
   * Prefix get (/set) + Feld-Name in Camel-Case
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the vorname
   */
  public String getVorname() {
    return vorname;
  }

  /**
   * @param vorname the vorname to set
   */
  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

}
