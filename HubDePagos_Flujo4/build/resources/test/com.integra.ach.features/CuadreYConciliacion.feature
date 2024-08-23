@CuadreYConciliacion
Feature: Prueba cuadre y consolidacion

  @ConsultarPorFechaYCicloCuadreYConciliacion
  Scenario Outline: Consultar por fecha y ciclo y exportar los archivos
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cuadre y conciliacion y diligenciar formulario de consulta <fecha> <ciclo>
    Then Valido la consulta y descarga de los export

    Examples:
      | tipoDeEntidad | usuario                              | clave            | fecha        | ciclo |
    ##@externaldata@./src/test/resources/Data/Data_CuadreYConciliacion.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2023-11-01"|"2"|

  @ValidacionDeMontosCuadreYConciliacion
  Scenario Outline: validacion de monto a favor y monto en contra de un banco
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a cuadre y conciliacion y diligenciar formulario de consulta <fecha> <ciclo> <entidad>
    Then Valido el monto a favor y el monto en contra

    Examples:
      | tipoDeEntidad | usuario                              | clave            | fecha        | ciclo | entidad    |
    ##@externaldata@./src/test/resources/Data/Data_CuadreYConciliacion.xlsx@ValidacionDeMontos
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2022-10-25"|"4"|"BANCOLOMBIA"|
