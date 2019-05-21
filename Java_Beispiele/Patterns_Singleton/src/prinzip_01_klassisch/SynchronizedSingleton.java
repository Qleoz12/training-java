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
package prinzip_01_klassisch;

/**
 * Idee: Nur eine Instanz einer Klasse soll erzeugt werden können - auch bei
 * nebenläufigem Zugriff, wobei man berücksichtigen muss: trotz
 * Synchroniesierung bei der Singleton-Initialisierung ist dieses Singleton nur
 * bezogen auf einen Classloader singulär! Kommen in der Anwendung mehrere
 * Classloader zum Einsatz, wird die statische Singleton-Variable auch ggf.
 * mehrfach initialisiert.
 *
 */
public class SynchronizedSingleton {

  private static SynchronizedSingleton instance;

  /**
   * Einzige Methode zur Instanz-Erzeugung
   *
   * @return
   */
  public static synchronized SynchronizedSingleton getInstance() {
    if (instance == null) {
      instance = new SynchronizedSingleton();
    }
    return instance;
  }

  /**
   * Konstruktor private!
   */
  private SynchronizedSingleton() {

  }
}
