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
 *  2016 Aeonium Software Systems, Robert Rohm.
 */
package org.meins.jni;

/**
 * Beispielklasse mit Methode, deren Ausführung über das Java Native Interface
 * (JNI) an eine DLL-Bibliothek delegiert.
 *
 * @author robert rohm
 */
public class StrLen {

  /**
   * Statisches Laden der DLL-Bibliothek – die Dateiendung ".dll" entfällt, sie
   * wird auf Linux-Systemen auch automatisch als ".so" verarbeitet.
   */
  static {
    System.loadLibrary("strlen");
  }

  /**
   * Deklaration der Methode, als <code>native</code>. 
   * @param s Input-String
   * @return Output, String-Länge.
   */
  public static native int strlen(String s);

}
