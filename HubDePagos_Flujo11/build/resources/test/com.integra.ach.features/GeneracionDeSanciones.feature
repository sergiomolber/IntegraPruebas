@GeneracionDeSanciones
Feature: Prueba de consulta de una sancion

  @AdjuntarDocumentoOrigenSancion7-9-10
  Scenario Outline: Subir un archivo Nacham Sancion7, Sancion9 y Sancion10 en el ciclo 1
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Subir archivo y diligenciar formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Segundo archivo y diligenciar formulario <entidad2> <servicio> <formato> <urlArchivo2>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>
    When Subir Tercer archivo y diligenciar formulario <entidad3> <servicio> <formato> <urlArchivo3>
    Then Validar autorización y estado del archivo exitoso <usuario> <clave> <tipoDeEntidad>

    Examples:
      | tipoDeEntidad | usuario                  | clave          | entidad            | entidad2                  | entidad3                | servicio                               | formato  | urlArchivo                                                                                           | urlArchivo2                                                                                          | urlArchivo3                                                                                          |
      | "EF"          | "useradminapp@gmail.com" | "Ach.2022*$AU" | "POPULAR(BANPOPULAR)" | "CITIBANK(BANCITIBAN)" | "OCCIDENTE(BANOCCIDEN)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001051.002.1" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001009.005.1" | "C:\\Users\\danielpinilla\\Documents\\como quiera\\apis-fsfb-creacion-data\\ACH\\ACH\\0001023.002.1" |

  @CierreDe2CicloExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca los ciclos a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |

  @AdjuntarDocumentoDevolucionSancion9
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001023.002.1" | "0001023.002.1" |

  @CierreDeCicloTRESExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |



  @AdjuntarDocumentoDevolucionSancion10
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001023.002.1" | "0001023.002.1" |

  @CierreDeCicloCUATROExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |


  @AdjuntarDocumentoOrigenSancion500
  Scenario Outline: Subir un archivo Nacham y validar si es exitoso
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a subir archivo exitoso y diligenciar el formulario <entidad> <servicio> <formato> <urlArchivo>
    Then Valido el cargue y el estado del archivo exitoso <nombreArchivo> <usuario> <clave>
    Examples:
      | tipoDeEntidad | usuario                   | clave            | entidad                | servicio                               | formato | urlArchivo                                                                          | nombreArchivo   |
      | "EF"          | "useradminapp@gmail.com"  | "Ach.2022*$AU"   | "POPULAR(BANPOPULAR)" | "Compensación de Pagos Interbancarios" | "Nacham" | "C:\Users\danielpinilla\Documents\como quiera\apis-fsfb-creacion-data\ACH\ACH\0001023.002.1" | "0001023.002.1" |

  @CierreDeCicloCincoExitoso
  Scenario Outline: Hacer un cierre de ciclo exitoso
    Given Login exitoso para cierre de ciclo <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cierre de ciclo y busca el ciclo a cerrar
    Then Valido mensaje de cierre exitoso
    Examples:
      | tipoDeEntidad | usuario                    | clave             |
      | "EF"          | "operadorachaut@gmail.com" | "ColombiaAch.2023*" |